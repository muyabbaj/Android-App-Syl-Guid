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

public class SunamgonjActivity extends AppCompatActivity {
    private ListView sunamgonjlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunamgonj);
        setTitle("Traveling Place in Sunamgonj");
        sunamgonjlistView=findViewById(R.id.sunamgonj_listViewId);
        String[] sunamgonjlistItem=getResources().getStringArray(R.array.sunamgonjlist_item);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample_listview,R.id.textViewId,sunamgonjlistItem);
        sunamgonjlistView.setAdapter(adapter);

        sunamgonjlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),TangurerHaworActivity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(getApplicationContext(),HasonRajaActivity.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(getApplicationContext(),BashTolaActivity.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent=new Intent(getApplicationContext(),LaurerGorActivity.class);
                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent=new Intent(getApplicationContext(),TekergatActivity.class);
                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent=new Intent(getApplicationContext(),Gourang_JomidarBari_Activity.class);
                    startActivity(intent);
                }
                else if(position==6){
                    Intent intent=new Intent(getApplicationContext(),PailGawJomidarBari_Activity.class);
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
