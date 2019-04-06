package com.android.squardb.ibmhackathon;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.squardb.ibmhackathon.data.User;
import com.android.squardb.ibmhackathon.data.source.BankRepository;
import com.android.squardb.ibmhackathon.data.source.local.BankLocalDataSource;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
