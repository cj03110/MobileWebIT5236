package com.example.cody_jenkins.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;


public class userprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);

        final TextView welcomeMsg = (TextView) findViewById(R.id.welcomeMsg);
        final EditText user2 = (EditText) findViewById(R.id.user2);
    }
}
