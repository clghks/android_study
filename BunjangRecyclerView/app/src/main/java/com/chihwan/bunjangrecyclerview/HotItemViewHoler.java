package com.chihwan.bunjangrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by ChiHwan on 2015. 3. 26..
 */
public class HotItemViewHoler extends RecyclerView.ViewHolder {
    public NetworkImageView itemImageView;
    public TextView itemPrice;
    public TextView itemName;

    public HotItemViewHoler(View itemView) {
        super(itemView);
        itemImageView = (NetworkImageView)itemView.findViewById(R.id.ni_hotitem_img);
        itemPrice = (TextView)itemView.findViewById(R.id.tv_hotitem_price);
        itemName = (TextView)itemView.findViewById(R.id.tv_hotitem_name);
    }
}
