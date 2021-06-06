package com.example.muyabbaj.myproject;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SylhetDistrictActivity extends AppCompatActivity {
    private ListView sylhetlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_district);
        sylhetlistView=findViewById(R.id.sylhet_listViewId);
        setTitle("Traveling Place in Sylhet District");

        String[] sylhetlistItem=getResources().getStringArray(R.array.sylhetlist_item);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample_listview,R.id.textViewId,sylhetlistItem);
        sylhetlistView.setAdapter(adapter);

        sylhetlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),Shah_Jalal_R_Activity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(getApplicationContext(),Shah_Poran_R_Activity.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(getApplicationContext(),JaflongActivity.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent=new Intent(getApplicationContext(),Lalakhal_Activity.class);
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent=new Intent(getApplicationContext(),MalnichoraAtivity.class);
                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent=new Intent(getApplicationContext(),OsmaniPark_Activity.class);
                    startActivity(intent);
                }
                else if(position==6){
                    Intent intent=new Intent(getApplicationContext(),Lovachora_Activity.class);
                    startActivity(intent);
                }
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu_home_exit,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.homeId){
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }

        else if(item.getItemId()==R.id.exitId){
            finishAffinity();
        }


        return super.onOptionsItemSelected(item);
    }


}
