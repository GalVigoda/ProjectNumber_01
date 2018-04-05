package com.galv.android.projectnumber_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecendActivity extends  MainActivity {


    TextView tvDetailsUser;
    String firstName;
    String lastName;
    String age;
    TextView messageDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);

        firstName=getIntent().getExtras().getString("F_NAME");
        lastName=getIntent().getExtras().getString("L_NAME");
        age=getIntent().getExtras().getString("AGE");

       // Bundle extras= getIntent().getExtras();



        tvDetailsUser=(TextView)findViewById(R.id.theTvDetailsUser);
        messageDisplay=findViewById(R.id.tvMessageDisplay);
        tvDetailsUser.setText(firstName +" " + lastName+", "+ age +"\n\n");
        messageDisplay.setText("Welcome to the Memory game\nPlease select level for the Memory game:");

    }


}
