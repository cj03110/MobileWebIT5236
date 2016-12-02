package com.example.cody_jenkins.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class signup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Intent signupIntent = getIntent();
    }
}

   /* EditText editText;
    EditText editText;
    EditText editText;
    Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_signup, container, false);
        editText = (EditText)view.findViewById(R.id.email);
        editText = (EditText)view.findViewById(R.id.user);
        editText = (EditText)view.findViewById(R.id.pword);
        button = (Button)view.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                String Name = editText.getText().toString();
            }
        });
        return view;

    }

} */

