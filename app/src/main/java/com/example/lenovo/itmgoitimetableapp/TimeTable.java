package com.example.lenovo.itmgoitimetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class TimeTable extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        spinner=(Spinner)findViewById(R.id.spinner);

        List<String> list=new ArrayList<String>();
        list.add("Select Course");
        list.add("B.E.");
        list.add("B.Tech.");
        list.add("M.C.A.");
        list.add("B.Arch.");
        list.add("M.E.");
        list.add("M.Tech.");
        list.add("Diploma");

        spinner2=(Spinner) findViewById(R.id.spinner2);

        List<String> list1=new ArrayList<String>();
        list1.add("Select Branch");
        list1.add("Computer Science");
        list1.add("Information Technology");
        list1.add("Civil");
        list1.add("Mechanical");
        list1.add("Electrical");
        list1.add("Electronics Communication");
        list1.add("Electrical and Electronics");
        list1.add("Electronics and Instrumentation");
        list1.add("Chemical");


        spinner3 =(Spinner) findViewById(R.id.spinner3);

        List<String> list2=new ArrayList<String>();
        list2.add("Select Semester");
        list2.add("1st Semester");
        list2.add("2nd Semester");
        list2.add("3rd Semester");
        list2.add("4th Semester");
        list2.add("5th Semester");
        list2.add("6th Semester");
        list2.add("7th Semester");
        list2.add("8th Semester");



        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list1);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter1);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner2.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list2);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter2);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner3.setSelection(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
