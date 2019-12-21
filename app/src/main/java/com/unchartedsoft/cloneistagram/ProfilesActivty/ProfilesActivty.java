package com.unchartedsoft.cloneistagram.ProfilesActivty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.unchartedsoft.cloneistagram.R;
import com.unchartedsoft.cloneistagram.Utiles.BottomNavigationViewHelper;

public class ProfilesActivty extends AppCompatActivity {
    private static final String TAG = "ProfilesActivty";
    private static final int Activity_Num =4;

    private Context mContext =  ProfilesActivty.this;

    private ProgressBar mProgressBar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG,"onCreate: started");
        mProgressBar =(ProgressBar) findViewById(R.id.prfileProggressBar);
        mProgressBar.setVisibility((View.GONE));


        setupBottomNavigationView();
        setupToolbar();
    }

    private void setupToolbar(){
        Toolbar toolbar = findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);

        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating to account settings");

                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });
    }

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

