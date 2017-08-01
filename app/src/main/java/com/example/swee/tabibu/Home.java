package com.example.swee.tabibu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "check response", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(intent.CATEGORY_APP_EMAIL);
                intent.putExtra("android.intent.extra.SUBJECT", "Leave Comment");
                intent.putExtra("android.intent.extra.TEXT", "Tabibu");
                Intent mailer = Intent.createChooser(intent, null);
                startActivity(mailer);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.home, menu);
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

        if (id == R.id.login) {
            // Handle the login action
            Intent Loginintent = new Intent(this, LoginActivity.class);
            startActivity(Loginintent);


        } else if (id == R.id.signup) {
                //handle signup  details here

                Intent Signupintent = new Intent(this, Signup.class);
                startActivity(Signupintent);







        } else if (id == R.id.hospitals) {
            //handle hospital details here

            Intent Hospitalintent = new Intent(this, Hospitals.class);
            startActivity(Hospitalintent);



        } else if (id == R.id.doctors) {

            Intent DoctorsIntent = new Intent(this, Doctors.class);
            startActivity(DoctorsIntent);

        } else if (id == R.id.about) {
            Intent Aboutintent = new Intent(this, About.class);
            startActivity(Aboutintent);


        } else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra("android.intent.extra.SUBJECT", "Tabibu App");
            sharingIntent.putExtra("android.intent.extra.TEXT", "Download app following this link");
            startActivity(Intent.createChooser(sharingIntent,"share app using"));


        } else if (id == R.id.nav_send) {

           Intent emailntent = new Intent(Intent.ACTION_SEND);
            emailntent.setData(Uri.parse("mailto:onesmusmakori@gmail.com"));
            emailntent.setType("text//plain");
            emailntent.putExtra(Intent.EXTRA_EMAIL , new String[]{"Reipient"});
            emailntent.putExtra(Intent.EXTRA_SUBJECT , new String[]{"Subject"});
            emailntent.putExtra(Intent.EXTRA_TEXT , new String[]{"Message Body"});





        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
