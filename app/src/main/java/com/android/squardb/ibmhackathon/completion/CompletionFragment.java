package com.android.squardb.ibmhackathon.completion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.squardb.ibmhackathon.R;


public class CompletionFragment extends Fragment {

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_completion, container, false);
    }

}
