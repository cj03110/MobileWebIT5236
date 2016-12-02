package com.example.cody_jenkins.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homescreen extends AppCompatActivity {
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                Intent signupIntent = new Intent(homescreen.this, signup.class);
                startActivity(signupIntent);


            }
        });

        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {

                Intent loginIntent = new Intent(homescreen.this, login.class);
                startActivity(loginIntent);

            }
        });





    }
}
