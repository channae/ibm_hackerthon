package com.android.squardb.ibmhackathon.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.squardb.ibmhackathon.R;

public class UserLoginActivity extends AppCompatActivity {

    EditText etUserId;
    EditText etPIN;
    Button btLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);

        etUserId = (EditText)findViewById(R.id.etUserID);
        etPIN = (EditText)findViewById(R.id.etPin);
    }

    public void doLogin(View view){


    }

}
