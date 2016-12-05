package com.example.cody_jenkins.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;




public class homescreen extends AppCompatActivity {
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(homescreen.this,SignUp.class);
                startActivity(int1);


            }

        });


        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent int2 = new Intent(homescreen.this,Login.class);
                startActivity(int2);
            }

        });
    }
}