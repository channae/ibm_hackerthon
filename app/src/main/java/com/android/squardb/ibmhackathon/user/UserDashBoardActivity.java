package com.android.squardb.ibmhackathon.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.squardb.ibmhackathon.R;
import com.android.squardb.ibmhackathon.lib.UserLibrary;

public class UserDashBoardActivity extends AppCompatActivity {

     TextView  tvUsername;
     TextView  tvuserWishing;
     UserLibrary lib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_dashboard);

        tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvuserWishing = (TextView) findViewById(R.id.tvuserWishing);

        tvUsername.setText("Welcome"+" "+"Laxmi");
        tvuserWishing.setText("Good Morning,"+lib.getTime()+" "+lib.getCurrentTemp()+" ");

    }

    public void history(View view){


    }

    public void doTransfer(View view) {

    }

    public String getTime(){

        return "";
    }
}
