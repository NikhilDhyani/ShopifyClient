package com.devdnik.coder.client.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.devdnik.coder.client.R;

import java.util.List;

/**
 * Created by NIKHIL on 23-09-2018.
 */

public class ProductDetailAdapter extends RecyclerView.Adapter<ProductDetailAdapter.ProductDetailViewHolder> {

    private List<String> multiMapT;
    private List<Integer> multiMapInventory;
    private List<String> mProductImage;
    Context context;

    public ProductDetailAdapter(Context context,List<Integer> multiMap, List<String> multiMapT, List<String> mProductImage) {
        this.multiMapInventory = multiMap;
        this.multiMapT = multiMapT;
        this.mProductImage=mProductImage;
        this.context = context;

    }

    @Override
    public ProductDetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view =  inflater.inflate(R.layout.product_details_cv,parent,false);

        return new ProductDetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductDetailViewHolder holder, int position) {

        Integer tagss = multiMapInventory.get(position);
        String tagTitless = multiMapT.get(position);
        String url =mProductImage.get(position);


        holder.tvs.setText(tagss.toString());
        holder.titleTVS.setText(tagTitless.toString());

        Glide.with((context)).load(url)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return multiMapInventory.size();

    }

    public class ProductDetailViewHolder extends RecyclerView.ViewHolder
    {

        TextView tvs,titleTVS;
        ImageView imageView;
        public ProductDetailViewHolder(View itemView) {
            super(itemView);

            tvs = itemView.findViewById(R.id.detail_qty_TV);
            titleTVS = itemView.findViewById(R.id.detail_qty_Title);
            imageView = itemView.findViewById(R.id.Product_Image);

        }
    }
}
