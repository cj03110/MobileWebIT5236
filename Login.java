package com.example.cody_jenkins.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        EditText email = (EditText)findViewById(R.id.email);
        EditText user = (EditText)findViewById(R.id.user);
        EditText pword = (EditText)findViewById(R.id.pword);
        Button submit_id = (Button)findViewById(R.id.submit_id);

        submit_id.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent int4 = new Intent(Login.this,userprofile.class);
                Login.this.startActivity(int4);


            }

        });

    }
}