package com.devdnik.coder.client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;

import com.devdnik.coder.client.API.ShopifyClient;
import com.devdnik.coder.client.Adapter.TagListAdapter;
import com.devdnik.coder.client.POJO.ProductsItem;
import com.devdnik.coder.client.POJO.ResponseTags;
import com.devdnik.coder.client.POJO.VariantsItem;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.TreeMultimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    Map<String, List<String>> tagName = new HashMap<String, List<String>>();

    String accessToken = "c32313df0d0ef512ca64d5b336a0d7c6";

    public  static List<ProductsItem> fs;


    public static Multimap<String, String> multiMap = TreeMultimap.create();


    public static Multimap<String, Integer> multiTotal = ArrayListMultimap.create();

    public static Multimap<String, Long> mulyId = ArrayListMultimap.create();

    public  static Multimap<Long, String> mIdTitle = ArrayListMultimap.create();


    public  static Multimap<Long, String> mIdImage = ArrayListMultimap.create();




    public static     Multimap<Long, Integer> mIdQTY = ArrayListMultimap.create();

    List<VariantsItem> lVar;

    RecyclerView rv;

    int total;

    Button btn;

    List<String> tgListArray ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.mRV);

        tgListArray = new ArrayList<>();


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ShopifyClient.base_url)
                .addConverterFactory(GsonConverterFactory.create()).build();


        ShopifyClient api = retrofit.create(ShopifyClient.class);

        Call<ResponseTags> call = api.getProduct("1", accessToken);

        call.enqueue(new Callback<ResponseTags>() {
            @Override
            public void onResponse(Call<ResponseTags> call, Response<ResponseTags> response) {
                ResponseTags tags = response.body();


                if (tags != null) {

                    fs = tags.getProducts();
                }
                // Get The Size
                int sizes = fs.size();


                for (int i = 0; i < sizes; i++) {

                    //First Remove any space in array and then store it in an array

                    String witoutSpaceTags = fs.get(i).getTags().replaceAll(" ", "");

                    long x = fs.get(i).getId();

                    //Store individual tags separately [at different index]

                    String[] splittedV = witoutSpaceTags.split(",");

                    //Get Variants Under Product and store in list

                    lVar = fs.get(i).getVariants();

                    //Find How Many  Variant Are There

                    int varsize = lVar.size();

                    total = 0;

                    for (int j = 0; j < varsize; j++) {

                        //Get Total Avl. Inventory Under All Variants

                        total = total + lVar.get(j).getInventoryQuantity();

                    }

                    //Find Unique Title Of Product

                    multiTotal.put(fs.get(i).getTitle(), total);


                    //This loop will run 3 times because of 3 tags

                    for (String uniqueTags : splittedV) {


                        multiMap.put(uniqueTags, fs.get(i).getTitle());

                        //Storing  tag as key and  id as value

                        mulyId.put(uniqueTags, fs.get(i).getId());

                        //Storing id as key and title as value

                        if ((mIdTitle.get(fs.get(i).getId()).isEmpty())) {

                            mIdTitle.put(fs.get(i).getId(), fs.get(i).getTitle());


                            mIdQTY.put(fs.get(i).getId(), total);

                            mIdImage.put(fs.get(i).getId(),fs.get(i).getImage().getSrc());
                        }
                    }


                }


              //  System.out.println("Fetching Keys and corresponding [Multiple] Values n");

                for (String entry : multiMap.keySet()) {

                    Collection<String> value = multiMap.get(entry);

                    tgListArray.add(entry);


                }

                rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                //   rv.setAdapter(new TagAdapter(multiMap));

                rv.setAdapter(new TagListAdapter(getApplicationContext(),tgListArray));
                Set<String> keys = multiMap.keySet();

            }

            @Override
            public void onFailure(Call<ResponseTags> call, Throwable t) {

            }
        });
    }
}
