package com.example.cody_jenkins.myapplication;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        final EditText email = (EditText)findViewById(R.id.email);
        final EditText user1 = (EditText)findViewById(R.id.user1);
        final EditText pword1 = (EditText)findViewById(R.id.pword1);
        final Button submit_id1 = (Button)findViewById(R.id.submit_id);

        submit_id1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent int3 = new Intent(SignUp.this,userprofile.class);
                SignUp.this.startActivity(int3);


            }

        });

    }
}




