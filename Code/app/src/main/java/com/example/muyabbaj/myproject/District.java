package com.example.muyabbaj.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class District extends AppCompatActivity implements View.OnClickListener{
    private CardView sylhetDistrict,sunamgonjDistrict,habigonjDistrict,moulvibazarDistrict;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);
        setTitle("সিলেট বিভাগের জেলা সমূহ");
        sylhetDistrict=findViewById(R.id.sylhet_DistrictId);
        sunamgonjDistrict=findViewById(R.id.sunamgonj_DistrictId);
        habigonjDistrict=findViewById(R.id.habigonj_DistrictId);
        moulvibazarDistrict=findViewById(R.id.moulvibazar_DistrictId);

        sylhetDistrict.setOnClickListener(this);
        sunamgonjDistrict.setOnClickListener(this);
        habigonjDistrict.setOnClickListener(this);
        moulvibazarDistrict.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu_home_exit,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.exitId){
            finishAffinity();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.sylhet_DistrictId){
            Intent intent=new Intent(District.this,SylhetDistrictActivity.class);
            startActivity(intent);
        }
       else if(v.getId()==R.id.sunamgonj_DistrictId){

            Intent intent=new Intent(District.this,SunamgonjActivity.class);
            startActivity(intent);
        }
       else if(v.getId()==R.id.habigonj_DistrictId){

            Intent intent=new Intent(District.this,HabigonjActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.moulvibazar_DistrictId){

            Intent intent=new Intent(District.this,MoulvibazarActivity.class);
            startActivity(intent);
        }

    }
}
