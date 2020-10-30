package com.example.attenlesson.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.attenlesson.R;

public class StudentLoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);

//        loginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(username.getText().toString().equals("student") && password.getText().toString().equals("student123")){
//                    Intent loginIntent = new Intent(getApplicationContext(),StudentActivity.class);
//                    startActivity(loginIntent);
//                }else {
//                    Toast.makeText(getApplicationContext(),"incorrect credentials",Toast.LENGTH_SHORT);
//                }
//            }
//        });

    }
    public void student_login(View view){
        if(username.getText().toString().equals("student")&&password.getText().toString().equals("student123")){
            Intent loginIntent = new Intent(getApplicationContext(),StudentActivity.class);
            startActivity(loginIntent);
        }else {
            Toast.makeText(getApplicationContext(),"incorrect credentials",Toast.LENGTH_SHORT);
        }
    }
}
