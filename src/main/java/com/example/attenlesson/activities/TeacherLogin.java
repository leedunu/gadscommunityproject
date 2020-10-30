package com.example.attenlesson.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.attenlesson.R;

public class TeacherLogin extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login2);

        username = findViewById(R.id.userT);
        password = findViewById(R.id.passwordT);
        login = findViewById(R.id.loginT);
    }

    public void login_teacher(View view){
        if(username.getText().toString().equals("teacher") && password.getText().toString().equals("teacher123")){
            Intent tIntent = new Intent(getApplicationContext(),TeacherActivity.class);
            startActivity(tIntent);
        }else {
            Toast.makeText(getApplicationContext(),"wrong credentials", Toast.LENGTH_SHORT);
        }
    }
    }
