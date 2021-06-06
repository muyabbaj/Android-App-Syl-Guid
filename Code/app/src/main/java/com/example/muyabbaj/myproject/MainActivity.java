package com.example.muyabbaj.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private CardView detailsCardView, districtCardView,popularCardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        detailsCardView=findViewById(R.id.sylhet_DivisionId);
        districtCardView=findViewById(R.id.sylhet_allDistricId);
        popularCardView=findViewById(R.id.popularplacesId);

        detailsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.sylhet_DivisionId){
                    Intent intent=new Intent(getApplicationContext(),DetailsSylhet.class);
                    startActivity(intent);
                }

            }
        });
        districtCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.sylhet_allDistricId){
                    Intent intent=new Intent(getApplicationContext(),District.class);
                    startActivity(intent);
                }

            }
        });
        popularCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.popularplacesId){
                    Intent intent=new Intent(getApplicationContext(),Popular_Travel_PlaceActivity.class);
                    startActivity(intent);
                }

            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(),"Exit ",Toast.LENGTH_SHORT).show();
        finishAffinity();
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activiti_optionmenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.feedbackId) {
            Toast.makeText(getApplicationContext(), "Clicked " , Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);
            startActivity(intent);
        }

        else  if (id==R.id.about_developerId){
            Intent intent=new Intent(MainActivity.this,DeveloperActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.shareId) {
            Toast.makeText(getApplicationContext(), "Share apk file " , Toast.LENGTH_LONG).show();
            Intent share=new Intent(Intent.ACTION_SEND);
            share.setType("text/link");
            String sub="Share Apk Link";
            share.putExtra(Intent.EXTRA_SUBJECT,sub);
            share.putExtra(Intent.EXTRA_TEXT,"This app is only for sylhet travel area information are given.\nhttps://www.facebook.com/pg/haterkaj1/photos/?tab=album&album_id=1905126469745047\n\n");
            startActivity(Intent.createChooser(share,"Share with: "));
        }
        else if(id==R.id.mapId){
            Intent intent=new Intent(getApplicationContext(),GoogleMaps_Activity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.allPlaceId) {
            Toast.makeText(getApplicationContext(), "Clicked ", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), AllTravelPlaceActivity.class);
            startActivity(intent);

        }   else if (item.getItemId() == R.id.nav_share) {
            Toast.makeText(getApplicationContext(), "Clicked ", Toast.LENGTH_LONG).show();
            Intent share=new Intent(Intent.ACTION_SEND);
            share.setType("text/link");
            String sub="Share Apk Link";
            share.putExtra(Intent.EXTRA_SUBJECT,sub);
            share.putExtra(Intent.EXTRA_TEXT,"This app is only for sylhet travel area information are given.\nhttps://www.facebook.com/pg/haterkaj1/photos/?tab=album&album_id=1905126469745047\n\n");
            startActivity(Intent.createChooser(share,"Share with: "));

        } else if (item.getItemId() == R.id.nav_send) {
            Toast.makeText(getApplicationContext(), "Clicked ", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), FeedbackActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
