package com.example.chihwan.youtubetest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chihwan.youtubetest.R;
import com.example.chihwan.youtubetest.data.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by chihwan on 15. 7. 2..
 */
public class SearchListAdapter extends BaseAdapter {
    private List<Item> items;
    private Context context;
    private LayoutInflater inflate;

    public SearchListAdapter(Context context, List<Item> items){
        this.context = context;
        inflate = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflate.inflate(R.layout.listview_start, null);
        }

        Item item = items.get(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.img);
        Picasso.with(context).load(item.getSnippet().getThumbnails().getMedium().getUrl()).into(imageView);

        ((TextView) convertView.findViewById(R.id.title)).setText(item.getSnippet().getTitle());
        ((TextView) convertView.findViewById(R.id.date)).setText(item.getId().getVideoId() + "");

        return convertView;
    }

    public void addAll(List<Item> items) {
        this.items = items;
        notifyDataSetChanged();
    }
}
