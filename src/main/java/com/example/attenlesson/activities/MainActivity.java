package com.example.attenlesson.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.attenlesson.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void student(View view){
        Intent studentIntent = new Intent(getApplicationContext(), StudentLoginActivity.class);
        startActivity(studentIntent);
    }
    public void teacher(View view){
        Intent teacherIntent = new Intent(getApplicationContext(), TeacherLogin.class);
        startActivity(teacherIntent);
    }
}
