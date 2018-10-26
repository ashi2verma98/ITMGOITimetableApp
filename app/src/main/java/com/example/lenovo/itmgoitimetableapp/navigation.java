package com.example.lenovo.itmgoitimetableapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        int images[]= {R.drawable.slide1, R.drawable.slide2,R.drawable.slide3, R.drawable.slide4, R.drawable.slide5, R.drawable.slide6 };

        v_flipper=findViewById(R.id.v_flipper);


        //foreach

        for (int image: images)
        {
            flipperImages(image);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void flipperImages(int image)
    {
        ImageView imageView= new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        //animation

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setInAnimation(this,android.R.anim.slide_out_right);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent= new Intent(navigation.this,navigation.class);
            startActivity(intent);

            // Handle the home action
        } else if (id == R.id.nav_timetable) {
            Intent intent= new Intent(navigation.this,TimeTable.class);
            startActivity(intent);

        } else if (id == R.id.nav_faculty) {
            Intent intent= new Intent(navigation.this,showfacultylist.class);
            startActivity(intent);

        } /*else if (id == R.id.nav_mis) {

            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://mis.itmgoi.in/")));

        }*/

        else if (id == R.id.nav_aboutus) {
            Intent intent= new Intent(navigation.this,AboutUs.class);
            startActivity(intent);

        } else if (id == R.id.nav_website)
        {
            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://itmgoi.in/")));

        } else if (id == R.id.nav_facebook)
        {
            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/itmgoigwl/")));

        }else if (id == R.id.nav_youtube)
        {
            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=UF08WYQQeec")));

        }else if (id == R.id.nav_location)
        {

            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/maps/dir/0.0043366,-0.0043366/itm+goi/@10.1861961,-0.229804,3z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3976c4964532abdd:0xe71fa0450b77e0a5!2m2!1d78.1880118!2d26.1474771")));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
