package com.williamwzd.softwarehouse.fragment;


import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.williamwzd.softwarehouse.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VerifyFragment extends Fragment {


    public VerifyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_verify, container, false);

        // Referenciar
        final TextView txtFirstInfo = view.findViewById(R.id.txt_first_info);

        // Poblar
        txtFirstInfo.setText(Html.fromHtml("<b>Your appointment with Dr Jhon Smith on March<br>" +
                "at 2:30 in confirm</b>"));

        return view;
    }
}