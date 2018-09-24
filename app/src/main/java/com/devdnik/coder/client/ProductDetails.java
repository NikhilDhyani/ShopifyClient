package com.devdnik.coder.client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.devdnik.coder.client.Adapter.ProductDetailAdapter;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.List;
import static com.devdnik.coder.client.MainActivity.mIdImage;



public class ProductDetails extends AppCompatActivity {


    List<Long> tgQty ;
    List<Integer> totalInventory;
    List<String> productTitle;

    List<String> productImage;

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        recyclerView  = findViewById(R.id.DRV);


        tgQty = new ArrayList<Long>();
        totalInventory = new ArrayList<Integer>();

        productTitle = new ArrayList<String>();

        productImage = new ArrayList<String>();

        Multimap<String, String> multiMapx = (Multimap<String, String>) getIntent().getSerializableExtra("BUNDLE");

        Multimap<String, Long> multiMaps = (Multimap<String, Long>) getIntent().getSerializableExtra("BUNDLES");

        Multimap<Long, String> midTitleD = (Multimap<Long, String>) getIntent().getSerializableExtra("MID");
        Multimap<Long, Integer> mQty = (Multimap<Long, Integer>) getIntent().getSerializableExtra("qty");
        String xyz = getIntent().getExtras().getString("SELECTED");

        System.out.println("In Detail");


        for (Long entry :  multiMaps.get(xyz)) {


            tgQty.add(entry);

            for (Integer abc : mQty.get(entry))
            {
                totalInventory.add(abc);


            }

            for (String opo : midTitleD.get(entry))

            {
                productTitle.add(opo);
            }

            for (String image : mIdImage.get(entry))
            {
                productImage.add(image);
            }


        }
        multiMaps.get(xyz);




        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProductDetailAdapter(getApplicationContext(),totalInventory,productTitle,productImage));





    }
}
