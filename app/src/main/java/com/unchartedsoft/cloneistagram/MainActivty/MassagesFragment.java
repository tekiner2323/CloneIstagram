package com.unchartedsoft.cloneistagram.MainActivty;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.unchartedsoft.cloneistagram.R;

public class MassagesFragment extends Fragment {
    private static final String TAG = "MassagesFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_messages,container,false);


        return  view;



    }
}
