package com.example.cody_jenkins.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class homescreen extends AppCompatActivity {
    TextView loginLink, signupLink;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        loginLink = (TextView)findViewById(R.id.loginLink);
        signupLink = (TextView)findViewById(R.id.signupLink);

        signupLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent int2 = new Intent(homescreen.this,SignUp.class);
                startActivity(int2);
            }

        });

        loginLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(homescreen.this,Login.class);
                startActivity(int1);


            }

        });



    }
}