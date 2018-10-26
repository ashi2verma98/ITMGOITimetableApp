package com.example.lenovo.itmgoitimetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.etname);
        Password=(EditText)findViewById(R.id.etpassword);
        Info=(TextView)findViewById(R.id.tvinfo);
        Login=(Button)findViewById(R.id.btnlogin);

        Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validate(Name.getText().toString(), Password.getText().toString());

            }
        });
    }

    private void validate(String username, String userPassword)
    {


        if((username.equals("Student") || username.equals("student")) && userPassword.equals("1234"))
        {
            Intent intent= new Intent(MainActivity.this,navigation.class);
            startActivity(intent);
        }
        else
        {
                Toast.makeText(this, "Invalid usename or password", Toast.LENGTH_SHORT).show();
                counter--;

                Info.setText("No of attempts remaining: " + String.valueOf(counter));

                if (counter == 0) {
                    Login.setEnabled(false);
                }

        }

    }
}
