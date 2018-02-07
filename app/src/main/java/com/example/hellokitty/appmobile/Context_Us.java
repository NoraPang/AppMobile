package com.example.hellokitty.appmobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HelloKitty on 07-Feb-18.
 */

public class Context_Us extends Fragment {
    public static Context_Us newInstance() {
        Context_Us fragment = new Context_Us();
        return fragment;


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.contect__us, container, false);


        return rootview;

    }


}