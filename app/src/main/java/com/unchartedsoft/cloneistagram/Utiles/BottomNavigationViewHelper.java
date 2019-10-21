package com.unchartedsoft.cloneistagram.Utiles;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.unchartedsoft.cloneistagram.LikesActivty.LikesActivty;
import com.unchartedsoft.cloneistagram.MainActivty.MainActivity;
import com.unchartedsoft.cloneistagram.ProfilesActivty.ProfilesActivty;
import com.unchartedsoft.cloneistagram.R;
import com.unchartedsoft.cloneistagram.SearchActivty.SearchActivty;
import com.unchartedsoft.cloneistagram.ShareActivty.ShareActivty;

public class BottomNavigationViewHelper
{

    private static final String TAG = "BottomNavigationViewHel";

    public static void settupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx)
    {
        Log.d(TAG, "setuBottomBavigationView= Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){

        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case    R.id.ic_house:
                        Intent intent1=new Intent(context, MainActivity.class);
                        context.startActivity(intent1);
                        break;
                    case    R.id.ic_search:
                        Intent intent2=new Intent(context, SearchActivty.class);
                        context.startActivity(intent2);
                        break;

                    case    R.id.ic_circle:
                        Intent intent3=new Intent(context, ShareActivty.class);
                        context.startActivity(intent3);
                        break;

                    case    R.id.ic_alert:
                        Intent intent4=new Intent(context, LikesActivty.class);
                        context.startActivity(intent4);
                        break;

                    case    R.id.ic_android:
                        Intent intent5=new Intent(context, ProfilesActivty.class);
                        context.startActivity(intent5);
                        break;
                }

                return false;
            }
        });

    }
}
