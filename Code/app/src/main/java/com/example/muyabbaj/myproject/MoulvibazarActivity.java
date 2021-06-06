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

public class MoulvibazarActivity extends AppCompatActivity {
    private ListView moulovibazarlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moulvibazar);
        moulovibazarlistView=findViewById(R.id.moulvibazar_listViewId);
        setTitle("Traveling Place in Moulvibazar");
        String[] moulvibazarlistItem=getResources().getStringArray(R.array.moulvibazarlist_item);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample_listview,R.id.textViewId,moulvibazarlistItem);
        moulovibazarlistView.setAdapter(adapter);

        moulovibazarlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),Madhokudo_Activity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(getApplicationContext(),HakalukiActivity.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(getApplicationContext(),KhujarShaActivity.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent=new Intent(getApplicationContext(),HamhamActivity.class);
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent=new Intent(getApplicationContext(),Hail_haworActivity.class);
                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent=new Intent(getApplicationContext(),Srimongol_teagardenActivity.class);
                    startActivity(intent);
                }
                else if(position==6){
                    Intent intent=new Intent(getApplicationContext(),KomlaRanirDighi_Activity.class);
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
