package com.android.squardb.ibmhackathon.completion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.android.squardb.ibmhackathon.R;

public class CompletionFragment extends Fragment {

    TextView sourceAccountTextView, destinationAccountTextView, sendingAmountTextView, receivingAmountTextView, referenceNumberTextView;
    Button makeAnotherTransferButton, goToHomeButton, shareDetailsButton;

    public CompletionFragment() {
        // Required empty public constructor
    }

    public static CompletionFragment newInstance() {
        CompletionFragment fragment = new CompletionFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_completion, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        sourceAccountTextView = view.findViewById(R.id.tv_source_account);
        destinationAccountTextView = view.findViewById(R.id.tv_destination_account);
        sendingAmountTextView = view.findViewById(R.id.tv_sending_amount);
        receivingAmountTextView = view.findViewById(R.id.tv_receiving_amount);
        referenceNumberTextView = view.findViewById(R.id.tv_reference_number);

        makeAnotherTransferButton = view.findViewById(R.id.btn_make_another_transfer);
        goToHomeButton = view.findViewById(R.id.btn_go_to_home);
        shareDetailsButton = view.findViewById(R.id.btn_share_details);

    }

    private void shareDetails() {
        /*String shareBody = "Here is the share content body";
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.share_using)));*/
    }

}
