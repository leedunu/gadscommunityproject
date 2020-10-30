package com.example.attenlesson.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.attenlesson.R;

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
    }

    public void addCourse(View v){
        Intent cIntent = new Intent(getApplicationContext(),AddCourseActivity.class);
        startActivity(cIntent);
    }

    public void addQuizs(View v){
        Intent qIntent = new Intent(getApplicationContext(),AddQuizActivity.class);
        startActivity(qIntent);
    }
}
