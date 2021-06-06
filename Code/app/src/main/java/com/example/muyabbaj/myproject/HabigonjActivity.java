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

public class HabigonjActivity extends AppCompatActivity {
    private ListView habiganjlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habigonj);
        habiganjlistView=findViewById(R.id.habigonj_listViewId);
        setTitle("Traveling Place in Habigonj");

        String[] habigonjlistItem=getResources().getStringArray(R.array.habigonjlist_item);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample_listview,R.id.textViewId,habigonjlistItem);
        habiganjlistView.setAdapter(adapter);

        habiganjlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent=new Intent(getApplicationContext(),SatchariActivity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent=new Intent(getApplicationContext(),Remakaleggha_activity.class);
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent=new Intent(getApplicationContext(),Shangkor_pasha_mosjidActivity.class);
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent=new Intent(getApplicationContext(),Dara_gutiActivity.class);
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
