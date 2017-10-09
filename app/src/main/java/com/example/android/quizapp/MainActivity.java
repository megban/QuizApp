package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Score(View view)
    {

        scoreQuestion1();
        scoreQuestion2();
        scoreQuestion3();
        scoreQuestion4();
        scoreQuestion5();
        TextView scorecard = (TextView) findViewById(R.id.the_score_card);
        scorecard.setText("Your score: " + score);




    }

    public void scoreQuestion1()
    {
        CheckBox answer1ofQ1 = (CheckBox) findViewById(R.id.answer1ofQ1);
        CheckBox answer2ofQ1 = (CheckBox) findViewById(R.id.answer2ofQ1);
        CheckBox answer3ofQ1 = (CheckBox) findViewById(R.id.answer3ofQ1);
        boolean Answer1ofQ1 = answer1ofQ1.isChecked();
        boolean Answer2ofQ1 = answer2ofQ1.isChecked();
        boolean Answer3ofQ1 = answer3ofQ1.isChecked();

        if(Answer1ofQ1)
        {
            score = score + 1;
        }
        if(Answer2ofQ1)
        {
            score = score + 1;
        }
        if(Answer3ofQ1)
        {
            score = score + 1;
        }
    }

    public void scoreQuestion2()
    {
        RadioButton answerofQ2 = (RadioButton) findViewById(R.id.answerofQ2);
        boolean AnswerofQ2 = answerofQ2.isChecked();
        if(AnswerofQ2)
        {
            score = score + 1;
        }
    }

    public void scoreQuestion3()
    {
        EditText answerofQ3 = (EditText) findViewById(R.id.answerofQ3);
        String AnswerofQ3 = answerofQ3.getText().toString();
        if(AnswerofQ3.equalsIgnoreCase("Student Service Center"))
        {
            score = score + 1;
        }
    }

    public void scoreQuestion4()
    {
        RadioButton answerofQ4 = (RadioButton) findViewById(R.id.answerofQ4);
        boolean AnswerofQ4 = answerofQ4.isChecked();
        if(AnswerofQ4)
        {
            score = score + 1;
        }
    }

    public void scoreQuestion5()
    {
        RadioButton answerofQ5 = (RadioButton) findViewById(R.id.answerofQ5);
        boolean AnswerofQ5 = answerofQ5.isChecked();
        if(AnswerofQ5)
        {
            score = score + 1;
        }
    }
}
