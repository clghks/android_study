package com.chihwan.bunjangrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chihwan.bunjangrecyclerview.data.HotProduct;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by ChiHwan on 2015. 3. 26..
 */
public class HotItemAdapter extends RecyclerView.Adapter<HotItemViewHoler>{
    private List<HotProduct> hotItemList;
    private NumberFormat priceFormat;

    public HotItemAdapter(List<HotProduct> listItem){
        this.hotItemList = listItem;
        priceFormat = new DecimalFormat("#,###");
    }

    @Override
    public HotItemViewHoler onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hotitem, null);
        HotItemViewHoler hotItemViewHoler = new HotItemViewHoler(view);
        return hotItemViewHoler;
    }

    @Override
    public void onBindViewHolder(HotItemViewHoler hotItemViewHoler, int i) {
        HotProduct item = hotItemList.get(i);
        hotItemViewHoler.itemImageView.setImageUrl(item.getProductImage().get(0).getThumbnail().getLarge(), VolleyConfig.getImageLoader());
        hotItemViewHoler.itemName.setText(item.getName());
        hotItemViewHoler.itemPrice.setText(priceFormat.format(item.getPrice()));
    }

    @Override
    public int getItemCount() {
        return hotItemList.size();
    }
}
