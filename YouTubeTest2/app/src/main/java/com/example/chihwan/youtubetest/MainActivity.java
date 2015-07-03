package com.example.chihwan.youtubetest;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.chihwan.youtubetest.adapter.SearchListAdapter;
import com.example.chihwan.youtubetest.config.DeveloperKey;
import com.example.chihwan.youtubetest.config.RetrofitConfig;
import com.example.chihwan.youtubetest.data.Item;
import com.example.chihwan.youtubetest.data.ResponseSearchResult;
import com.example.chihwan.youtubetest.sevice.YouTubeService;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity implements View.OnClickListener, AdapterView.OnItemClickListener{
    private EditText keywordEditText;
    private ListView listView;
    private SearchListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new SearchListAdapter(MainActivity.this, new ArrayList<Item>());
        listView = (ListView)findViewById(R.id.lv_main);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(MainActivity.this);

        keywordEditText = (EditText)findViewById(R.id.et_keyword);
        findViewById(R.id.bt_search).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bt_search){
            requestYouTube();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Item item = (Item)adapter.getItem(position);
        if(item != null){
            Intent intent = new Intent(this, VidoActivity.class);
            intent.putExtra("id", item.getId().getVideoId());
            startActivity(intent);
        }
    }

    private class searchTask extends AsyncTask<Void, Void, ResponseSearchResult> {
        private String keyword;

        public searchTask(String keyword){
            this.keyword = keyword;
        }

        @Override
        protected ResponseSearchResult doInBackground(Void... params) {
            return RetrofitConfig.getInstance().create(YouTubeService.class).searchResult("snippet", "video", keyword, DeveloperKey.DEVELOPER_KEY);
        }

        @Override
        protected void onPostExecute(ResponseSearchResult responseSearchResult) {
            super.onPostExecute(responseSearchResult);

            if(responseSearchResult != null && responseSearchResult.getItems() != null) {
                adapter.addAll(responseSearchResult.getItems());
            }
        }
    }


    private void requestYouTube() {
        String keyword = keywordEditText.getText().toString();
        new searchTask(keyword).execute();
    }
}
