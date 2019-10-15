package com.unchartedsoft.cloneistagram.Utiles;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

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
}
