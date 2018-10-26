package com.example.lenovo.itmgoitimetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Choice extends AppCompatActivity implements View.OnClickListener {

    private CardView studentcard,facultycard,admincard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        studentcard= (CardView)findViewById(R.id.student_card);
        facultycard = (CardView)findViewById(R.id.faculty_card);
        admincard = (CardView)findViewById(R.id.admin_card);

        studentcard.setOnClickListener(this);
        facultycard.setOnClickListener(this);
        admincard.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.student_card : i= new Intent(this,MainActivity.class);
            startActivity(i);
            break;
            case R.id.faculty_card : i= new Intent(this,loginfaculty.class);
            startActivity(i);
            break;
            case R.id.admin_card : i= new Intent(this,login.class);
                startActivity(i);
                break;
            default:break;

        }
    }
}
