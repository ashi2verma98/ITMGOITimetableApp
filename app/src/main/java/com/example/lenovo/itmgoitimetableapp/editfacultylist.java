package com.example.lenovo.itmgoitimetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class editfacultylist extends AppCompatActivity {

    private EditText t1,t2,t3;
    Firebase firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editfacultylist);
       t1=(EditText)findViewById(R.id.etname);
        t2=(EditText)findViewById(R.id.etdes);
        t3=(EditText)findViewById(R.id.etcontact);

        Firebase.setAndroidContext(getApplicationContext());
    }

    public boolean add(View view)
    {

        String name=t1.getText().toString();
        String designation=t2.getText().toString();
        String contact=t3.getText().toString();


       /* if (TextUtils.isEmpty(t1.getText()))
        {
            t1.setError("Please Enter valid name");
            t1.requestFocus();
        }
        else
        {
            String a=t1.getText().toString();
            t1.setText(a);
        }
        if (TextUtils.isEmpty(t2.getText()))
        {
            t2.setError("Please Enter valid Designation");
            t2.requestFocus();
        }
        else
        {
            String b=t2.getText().toString();
            t2.setText(b);
        }

       /* if (TextUtils.isEmpty(t3.getText()))
        {
                t3.setError("Please Enter valid Number");
                t3.requestFocus();

        }
        else
        {
            Patterns.PHONE.matcher(contact).matches();
            String c=t3.getText().toString();
            t3.setText(c);
        }*/

       if(contact.length() < 6 || contact.length() > 11)
         {
            t3.setError("Please Enter valid Number");
            t3.requestFocus();
         }



        if(name.equals("")||designation.equals(""))
        {

            t1.setError("Please Enter valid name");
            t1.requestFocus();

            t2.setError("Please Enter valid Designation");
            t2.requestFocus();

            t3.setError("Please Enter valid Number");
            t3.requestFocus();

        }
        else
        {
            User user=new User();
            user.setName(name);
            user.setDesignation(designation);
            user.setContact(contact);

           // firebase=new Firebase(config.url);
            //firebase.child("Faculty").push().setValue(user);
            //firebase.child("Faculty").setValue(user);
            FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference();
            myRef.child("Faculty").push().setValue(user);

            Toast.makeText(this, "Data added successfully!", Toast.LENGTH_SHORT).show();

        }
        return false;
    }

   /* public void view(View v) {
        firebase.addValueEventListener(new com.firebase.client.ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if(dataSnapshot.hasChildren()) {
                    for (DataSnapshot ds : dataSnapshot.getChildren()) {
                        User user=ds.getValue(User.class);
                        Toast.makeText(editfacultylist.this, ""+user.getName()+ " "+user.getDesignation()+" "+user.getContact(), Toast.LENGTH_SHORT).show();
                    }
                }

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }*/
}
