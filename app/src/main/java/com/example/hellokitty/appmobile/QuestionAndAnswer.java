package com.example.hellokitty.appmobile;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HelloKitty on 07-Feb-18.
 */

public class QuestionAndAnswer extends Fragment {
    public static QuestionAndAnswer newInstanceQ() {
        QuestionAndAnswer fragment = new QuestionAndAnswer();
        return fragment;


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.questionandanswer, container, false);


        return rootview;

    }
}