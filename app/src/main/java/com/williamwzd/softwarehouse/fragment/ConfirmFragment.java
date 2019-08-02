package com.williamwzd.softwarehouse.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williamwzd.softwarehouse.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConfirmFragment extends Fragment {


    public ConfirmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_confirm, container, false);
    }
}