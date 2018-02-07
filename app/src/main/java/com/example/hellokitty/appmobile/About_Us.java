package com.example.hellokitty.appmobile;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link About_Us.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link About_Us#newInstance} factory method to
 * create an instance of this fragment.
 */
public class About_Us extends Fragment {
    public static About_Us newInstance() {
        About_Us fragment = new About_Us();
        return fragment;


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_ab_class, container, false);


        return rootview;

    }


}