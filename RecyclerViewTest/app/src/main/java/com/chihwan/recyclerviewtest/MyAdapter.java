package com.chihwan.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ChiHwan on 2015. 3. 26..
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private ItemData[] itemsData;

    public MyAdapter(ItemData[] itemDatas){
        this.itemsData = itemDatas;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, null);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder viewHolder, int i) {
        viewHolder.textViewTitle.setText(itemsData[i].getTitle());
        viewHolder.imgViewIcon.setImageResource(itemsData[i].getImageUrl());
    }

    @Override
    public int getItemCount() {
        return itemsData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewTitle;
        public ImageView imgViewIcon;

        public ViewHolder(View itemLayout){
            super(itemLayout);
            textViewTitle = (TextView)itemLayout.findViewById(R.id.item_title);
            imgViewIcon = (ImageView)itemLayout.findViewById(R.id.item_icon);
        }
    }
}
