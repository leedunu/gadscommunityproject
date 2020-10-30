package com.example.attenlesson.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.attenlesson.R;
import com.example.attenlesson.model.DataModel;
import com.example.attenlesson.recyclerview.RecyclerViewAdapter;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    private ArrayList<DataModel> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        Toolbar toolbar = findViewById(R.id.toolbarH);
        setSupportActionBar(toolbar);
        setSupportActionBar(toolbar);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataModels = new ArrayList<>();
        adapter = new RecyclerViewAdapter(dataModels);
        recyclerView.setAdapter(adapter);
        addData();
    }

    public void addData(){
        dataModels.add(new DataModel("video here", "geography"));
        dataModels.add(new DataModel("video here", "geography"));
        dataModels.add(new DataModel("video here", "geography"));
        dataModels.add(new DataModel("video here", "geography"));
        dataModels.add(new DataModel("video here", "geography"));
        dataModels.add(new DataModel("video here", "geography"));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
                break;
            case R.id.about:
                Intent about = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(about);
                break;
            case R.id.take_quiz:
                Intent quizIntent = new Intent(getApplicationContext(),ExerciseActivity.class);
                startActivity(quizIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
