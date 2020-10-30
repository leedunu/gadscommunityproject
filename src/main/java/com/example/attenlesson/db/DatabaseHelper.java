package com.example.attenlesson.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import com.example.attenlesson.model.DataModel;
import com.example.attenlesson.model.Questions;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "myCourse";
    public static final int DB_VERSION = 1;
    public static final String TABLE_COURSE = "lessons";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_LESSON = "lecture";
    public static final String COLUMN_TITLE = "title";

    public static final String TABLE_EXCERISE = "exercise";
    public static final String COLUMN_QUESTION = "question";
    public static final String COLUMN_OPT1 = "option1";
    public static final String COLUMN_OPT2 = "option2";
    public static final String COLUMN_OPT3 = "option3";
    public static final String COLUMN_OPT4 = "option4";
    public static final String COLUMN_OPT5 = "option5";
    public static final int COLUMN_ANSWER = 0;

    String sqlCourse = "CREATE TABLE "+TABLE_COURSE+"("+ COLUMN_ID +
            "INTEGER PRIMARY KEY AUTOINCREMENT,"+ COLUMN_LESSON +"TEXT" +COLUMN_TITLE +"TEXT"+")";

   String sqlExcercise = "CREATE TABLE"+TABLE_EXCERISE+"("+COLUMN_ID+"INTEGER PRIMARY KEY,"+COLUMN_QUESTION+"TEXT"+COLUMN_OPT1+"TEXT"
            +COLUMN_OPT2+"TEXT"+COLUMN_OPT3+"TEXT"+COLUMN_OPT4+"TEXT"+COLUMN_OPT5+"TEXT"+ COLUMN_ANSWER+"INT"+")";

     SQLiteDatabase db;

public DatabaseHelper(Context context) {
    super(context, DB_NAME, null, DB_VERSION);
}

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COURSE);
        onCreate(db);
    }


    public void addCourse(DataModel model){
        // database refernce
        SQLiteDatabase db = this.getWritableDatabase();
        // content values
        ContentValues values = new ContentValues();
        // add data to content values
        values.put(COLUMN_LESSON, model.getLecture());
        values.put(COLUMN_TITLE, model.getTitle());
        // insert data
       long result = db.insert(sqlCourse, null, values);
       if(result == -1){
           Log.i(null, "data not inserted");
       }else {
           Log.i(null, "data inserted successfully");
       }
        // closing the database
        db.close();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCourse);
        db.execSQL(sqlExcercise);

    }
//    private void populateExerciseTable(){
//        Questions q1 = new Questions("what is science", "study of surrounding environment", "study of universe",
//                "study of environmental disaster","study of human being","none of the above", 1);
//        addExercise(q1);
//        Questions question1 = new Questions("what is geography",
//                "opt1", "opt2","opt3","opt4","opt5", 1);
//        addExercise(question1);
//    }

    public void addExercise(Questions questions){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues quizValues = new ContentValues();
        // quizValues.put(COLUMN_ID, questions.getId());
        quizValues.put(COLUMN_QUESTION, questions.getQuestion());
        quizValues.put(COLUMN_OPT1, questions.getOpt1());
        quizValues.put(COLUMN_OPT2, questions.getOpt2());
        quizValues.put(COLUMN_OPT3, questions.getOpt3());
        quizValues.put(COLUMN_OPT4, questions.getOpt4());
        quizValues.put(COLUMN_OPT5, questions.getOpt5());
        db.insert(sqlExcercise, null, quizValues);

        db.close();

    }
    public List<Questions> getAllQuestions() {
        List<Questions> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + TABLE_EXCERISE,null);
        if (c.moveToFirst()) {
            do {
                Questions question = new Questions();
                question.setQuestion(c.getString(c.getColumnIndex(COLUMN_QUESTION)));
                question.setOpt1(c.getString(c.getColumnIndex(COLUMN_OPT1)));
                question.setOpt2(c.getString(c.getColumnIndex(COLUMN_OPT2)));
                question.setOpt3(c.getString(c.getColumnIndex(COLUMN_OPT3)));
                question.setOpt4(c.getString(c.getColumnIndex(COLUMN_OPT4)));
                question.setOpt5(c.getString(c.getColumnIndex(COLUMN_OPT5)));
                question.setAnswer(c.getInt(c.getColumnIndex(String.valueOf(COLUMN_ANSWER))));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
