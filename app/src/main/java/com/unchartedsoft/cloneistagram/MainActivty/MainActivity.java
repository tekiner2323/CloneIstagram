package com.unchartedsoft.cloneistagram.MainActivty;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.unchartedsoft.cloneistagram.R;
import com.unchartedsoft.cloneistagram.Utiles.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int Activity_Num =0;


    private Context mContext =  MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: starting");
        setupBottomNavigationView();
        setupViewPager();
    }


    /**
     * Respınsible for adding the 3 tabs: Camera  HOME Massages
     */

    private void setupViewPager(){
        SectionsPagerAdapter adapter = new SectionsPagerAdapter((getSupportFragmentManager()));
        adapter.addFragment(new CameraFragment()); //index 0
        adapter.addFragment(new HomeFragment());    //index 1
        adapter.addFragment(new MassagesFragment());        //index2
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_logo);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);


    }

    /**
     * BottomNavigationView setup
     */
    private void setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavigationBar);
        BottomNavigationViewHelper.settupBottomNavigationView(bottomNavigationViewEx);

        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);

        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(Activity_Num);
        menuItem.setChecked(true);

    }
}
