package com.example.cody_jenkins.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    Context c;

    EditText userLogin;
    EditText pword;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        c = this;
        final EditText userLogin = (EditText)findViewById(R.id.userLogin);
        final EditText pwordLogin = (EditText)findViewById(R.id.pwordLogin);
        final Button loginbtn = (Button)findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final String username = userLogin.getText().toString();
                final String password = pwordLogin.getText().toString();

                if(username.length() == 0 || password.length() == 0)
                {
                    Toast.makeText(c, "Please fill in a username and password", Toast.LENGTH_SHORT).show();
                    return;
                }
            }

        });

    }
}