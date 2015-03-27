package com.chihwan.retrofittest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.chihwan.retrofittest.data.GithubUser;
import com.google.gson.Gson;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        new Thread(new Runnable() {
            @Override
            public void run() {
                RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("https://api.github.com").setConverter(new GsonConverter(new Gson())).build();

                GitHub gitHubServer = restAdapter.create(GitHub.class);
                final GithubUser githubUser = gitHubServer.getUser("clghks");

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(githubUser != null){
                            Toast.makeText(getApplicationContext(), "id = " + githubUser.getLogin(), Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(getApplicationContext(), "오류~~~~!!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }).start();
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
