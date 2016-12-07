package com.example.cody_jenkins.myapplication;



import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Response;

import org.json.JSONObject;


public class SignUp extends AppCompatActivity {
    Context c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        c = this;
        final EditText emailSignUp = (EditText) findViewById(R.id.emailSignUp);
        final EditText userSignUp = (EditText) findViewById(R.id.userSignUp);
        final EditText pwordSignUp = (EditText) findViewById(R.id.pwordSignUp);
        final Button signupbtn = (Button) findViewById(R.id.signupbtn);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = emailSignUp.getText().toString();
                final String username = userSignUp.getText().toString();
                final String password = pwordSignUp.getText().toString();

                if (email.length() == 0 || username.length() == 0 || password.length() == 0) {
                    Toast.makeText(c, "Please fill in a username and password", Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        });


    }
}



