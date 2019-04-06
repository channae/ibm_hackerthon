package com.android.squardb.ibmhackathon.input;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.squardb.ibmhackathon.R;


public class InputFragment extends Fragment {

    RelativeLayout sourceAccountLayout, DestinAccountLayout;
    EditText sendingAmountET;
    TextView receivingAmountTV, sourceAccountTV, DestinAccountTV, currenctExRateTV, serviceFeeTV;

    public InputFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transfer_review, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sourceAccountLayout = (RelativeLayout) view.findViewById(R.id.frag_transfer_input_source_acc_layout);
        DestinAccountLayout = (RelativeLayout) view.findViewById(R.id.frag_transfer_input_destination_acc_layout);
        sendingAmountET = (EditText) view.findViewById(R.id.frag_transfer_input_source_acc_layout);


        receivingAmountTV = (TextView) view.findViewById(R.id.frag_transfer_input_receiving_amount_value);
        sourceAccountTV = (TextView) view.findViewById(R.id.frag_transfer_input_source_acc_value);
        DestinAccountTV = (TextView) view.findViewById(R.id.frag_transfer_input_source_destination_value);
        currenctExRateTV = (TextView) view.findViewById(R.id.frag_transfer__ex_rate_detail_value);
        serviceFeeTV = (TextView) view.findViewById(R.id.frag_transfer_service_fee_detail_amount);


        sourceAccountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
