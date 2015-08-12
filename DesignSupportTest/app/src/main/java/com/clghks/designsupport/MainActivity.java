package com.clghks.designsupport;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.clghks.designsupport.fragment.FloatingButtonFragment;
import com.clghks.designsupport.fragment.FloatingLabelFragment;
import com.clghks.designsupport.fragment.MainFragment;


public class MainActivity extends AppCompatActivity implements OnNavigationItemSelectedListener{
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout drawerLayout;
    private Toolbar toolBar;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = (Toolbar)findViewById(R.id.main_tool_bar);
        setSupportActionBar(toolBar);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar, R.string.open_title, R.string.close_title);
        mDrawerToggle.setDrawerIndicatorEnabled(true);
        drawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

        navigationView = (NavigationView)findViewById(R.id.main_drawer_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.main_frame, new MainFragment()).commit();
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();

        Fragment fragment = null;
        switch (id) {
            case R.id.navi_group1_item0:
                fragment = new MainFragment();
                break;
            case R.id.navi_group1_item1:
                fragment = new FloatingLabelFragment();
                break;
            case R.id.navi_group1_item2:
                fragment = new FloatingButtonFragment();
                break;
            case R.id.navi_group1_item3:
//                fragment = new TabsFragment();
                break;
            case R.id.navi_group1_item4:
//                startActivity(new Intent(this, AppBarActivity.class));
                break;
        }

        if (fragment != null) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction()
                    .replace(R.id.main_frame, fragment)
                    .commit();

            drawerLayout.closeDrawers();
            menuItem.setChecked(true);
        }
        return true;
    }
}
