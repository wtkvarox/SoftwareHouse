package com.williamwzd.softwarehouse.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

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
        final TextView txtSecondInfo = view.findViewById(R.id.txt_second_info);
        final TextView txtThirdInfo = view.findViewById(R.id.txt_third_info);
        final TextView txtInfoAppointment = view.findViewById(R.id.txt_info_appointment);
        final Button btnStartBooking = view.findViewById(R.id.btn_start_booking);

        // Poblar
        txtFirstInfo.setText(Html.fromHtml("<b>Your appointment with Dr Jhon Smith on March<br>" +
                "at 2:30 in confirm</b>"));

        return view;
    }
}