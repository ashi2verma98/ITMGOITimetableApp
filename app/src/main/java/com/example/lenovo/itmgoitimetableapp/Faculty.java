package com.example.lenovo.itmgoitimetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Faculty extends AppCompatActivity implements View.OnClickListener {

    private CardView timetablecard , editfacultycard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        timetablecard=(CardView)findViewById(R.id.timetable_card);
        editfacultycard=(CardView)findViewById(R.id.editfaculty_card);

        timetablecard.setOnClickListener(this);
        editfacultycard.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.timetable_card:
                i = new Intent(this, edittimetable.class);
                startActivity(i);
                break;
            case R.id.editfaculty_card:
                i = new Intent(this, editfacultylist.class);
                startActivity(i);
                break;
            default:
                break;

        }

    }
}
