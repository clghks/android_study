package com.chihwan.bunjangrecyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.Response;
import com.chihwan.bunjangrecyclerview.data.HotItemRequset;
import com.navercorp.volleyextensions.request.Jackson2Request;


public class MyActivity extends Activity {
    private final String HOT_ITME_URL = "http://api.bunjang.co.kr/api/1/list/product/hot.json?n=1&page=0&sex=0&udid=732a386e5ba512e5&device=a&token=07ce649a5de9456ca6a148fc93c793dd&ts=1427184123077&view_type=3";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        layoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        recyclerView.setLayoutManager(layoutManager);

        Jackson2Request<HotItemRequset> hotItemRequsetJackson2Request = new Jackson2Request<HotItemRequset>(HOT_ITME_URL, HotItemRequset.class, new Response.Listener<HotItemRequset>() {
            @Override
            public void onResponse(HotItemRequset response) {
                HotItemAdapter adapter = new HotItemAdapter(response.getList().get(0).getHotProducts());
                recyclerView.setAdapter(adapter);
            }
        });
        VolleyConfig.getRequestQueue().add(hotItemRequsetJackson2Request);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
