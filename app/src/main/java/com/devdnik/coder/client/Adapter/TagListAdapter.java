package com.devdnik.coder.client.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.devdnik.coder.client.ProductDetails;
import com.devdnik.coder.client.R;

import java.io.Serializable;
import java.util.List;

import static com.devdnik.coder.client.MainActivity.mIdQTY;
import static com.devdnik.coder.client.MainActivity.mIdTitle;
import static com.devdnik.coder.client.MainActivity.multiMap;
import static com.devdnik.coder.client.MainActivity.mulyId;

/**
 * Created by NIKHIL on 23-09-2018.
 */

public class TagListAdapter extends RecyclerView.Adapter<TagListAdapter.TagViewHolder> {


    Context context;

    private List<String> multiMaptag;

    public TagListAdapter(Context context,List<String> multiMaptag) {
        this.multiMaptag = multiMaptag;
        this.context = context;
    }

    @Override
    public TagViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view =  inflater.inflate(R.layout.tags_list,parent,false);

        return new TagViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TagViewHolder holder, int position) {

        final String tagss = multiMaptag.get(position);
        holder.tv.setText(tagss);

        holder.tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, ProductDetails.class);


                Bundle args = new Bundle();
                intent.putExtra("SELECTED",tagss);
                intent.putExtra("BUNDLE", (Serializable) multiMap);
                intent.putExtra("BUNDLES", (Serializable) mulyId);
                intent.putExtra("MID", (Serializable) mIdTitle);
                intent.putExtra("qty", (Serializable) mIdQTY);


                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return multiMaptag.size();
    }

    public class TagViewHolder extends RecyclerView.ViewHolder {

        TextView tv;

        public TagViewHolder(View itemView) {
            super(itemView);

            tv = itemView.findViewById(R.id.tagListTV);

        }
    }
}

