package com.example.attenlesson.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.VideoView;

import com.example.attenlesson.R;
import com.example.attenlesson.db.DatabaseHelper;
import com.example.attenlesson.model.DataModel;
import com.example.attenlesson.model.Questions;

import java.util.ArrayList;

public class AddCourseActivity extends AppCompatActivity {

    EditText title;
    EditText lesson;
    EditText course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        course = (EditText)findViewById(R.id.contents);
        title = (EditText)findViewById(R.id.title1);

    }

    public void addButton(View view){
        DataModel model = new DataModel(course.getText().toString(),title.getText().toString());
        DatabaseHelper helper = new DatabaseHelper(this);
        //helper.addData(model);
         helper.addCourse(model);

    }
}
