package com.example.attenlesson.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.attenlesson.R;
import com.example.attenlesson.db.DatabaseHelper;
import com.example.attenlesson.model.Questions;

public class AddQuizActivity extends AppCompatActivity {

    private EditText question;
    private EditText option1;
    private EditText option2;
    private EditText option3;
    private EditText option4;
    private EditText option5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quiz);
        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        prepareInputs();
    }
    public void prepareInputs(){
        question = findViewById(R.id.question);
        option1 = findViewById(R.id.opt1);
        option2 = findViewById(R.id.opt2);
        option3 = findViewById(R.id.opt3a);
        option4 = findViewById(R.id.opt4a);
        option5 = findViewById(R.id.opt5a);
    }
    public void add_quiz(View v){

        DatabaseHelper helper = new DatabaseHelper(this);

       Questions  questions = new Questions(question.getText().toString(),option1.getText().toString(),option2.getText().toString(),
                 option3.getText().toString(),option4.getText().toString(),option5.getText().toString(),1);
         helper.addExercise(questions);
    }
}
