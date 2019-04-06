package com.android.squardb.ibmhackathon.input;


import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.squardb.ibmhackathon.R;

import java.util.ArrayList;
import java.util.List;


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
        return inflater.inflate(R.layout.fragment_transfer_input, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sourceAccountLayout = (RelativeLayout) view.findViewById(R.id.frag_transfer_input_source_acc_layout);
        DestinAccountLayout = (RelativeLayout) view.findViewById(R.id.frag_transfer_input_destination_acc_layout);
        sendingAmountET = (EditText) view.findViewById(R.id.frag_transfer_input_sending_amount_value);


        receivingAmountTV = (TextView) view.findViewById(R.id.frag_transfer_input_receiving_amount_value);
        sourceAccountTV = (TextView) view.findViewById(R.id.frag_transfer_input_source_acc_value);
        DestinAccountTV = (TextView) view.findViewById(R.id.frag_transfer_input_source_destination_value);
        currenctExRateTV = (TextView) view.findViewById(R.id.frag_transfer__ex_rate_detail_value);
        serviceFeeTV = (TextView) view.findViewById(R.id.frag_transfer_service_fee_detail_amount);


        sourceAccountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataSourceAcc();
                onCreateDialogList(1);
            }
        });

        DestinAccountLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataSenderAcc();
                onCreateDialogList(2);
            }
        });

        sendingAmountET.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                receivingAmountTV.setText("INR " + (Double.valueOf(s.toString()) * exRate));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    ListView dialog_ListView;
    Dialog dialog = null;
    List<String> listContent = new ArrayList<String>();
    double exRate = 50.10;
    double sFee = 0;

    private void dataSourceAcc() {
        listContent.clear();
        listContent.add("My Saving Account ( 1234-344-3229)");
        listContent.add("My Saving Account ( 434-242-24234)");
    }

    private void dataSenderAcc() {
        listContent.clear();
        listContent.add("Arun - Saving Account ( 02653-8263-334)");
        listContent.add("Kumar - Saving Account ( 00-34-4887-322)");
        listContent.add("joo - Saving Account ( 008-3784-3773)");
        listContent.add("xxxx - Saving Account ( 7748399824)");
        listContent.add("YYY - Saving Account ( 868349294284)");
    }
    protected void onCreateDialogList(final int taskIds) {

        if(dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }

        dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.dialoglayout);
        dialog.setTitle("Select Account");
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);

        dialog.setOnCancelListener(new DialogInterface.OnCancelListener(){

            @Override
            public void onCancel(DialogInterface dialog) {
                dialog.dismiss();
            }});

        //Prepare ListView in dialog
        dialog_ListView = (ListView)dialog.findViewById(R.id.dialoglist);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, listContent);
        dialog_ListView.setAdapter(adapter);
        dialog_ListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(taskIds == 1) {
                    sourceAccountTV.setText(listContent.get(position).toString());
                } else if(taskIds == 2) {
                    DestinAccountTV.setText(listContent.get(position).toString());

                    if(position == 0 && position == 1 && position == 3) {
                        exRate = 50.10;
                        sFee = 0;
                        currenctExRateTV.setText("1 SGD = "+exRate + " INR");
                        serviceFeeTV.setText("Service Fee : SGD "+String.format("%,.2f", sFee));

                    } else {
                        exRate = 0.78;
                        sFee = 10;
                        currenctExRateTV.setText("1 SGD = "+exRate+ " USD");
                        serviceFeeTV.setText("Service Fee : SGD "+String.format("%,.2f", sFee));
                    }
                }
                dialog.dismiss();
            }});


        dialog.show();
    }
}
