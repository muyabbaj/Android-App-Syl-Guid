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

public class Popular_Travel_PlaceActivity extends AppCompatActivity {
    private ListView popularlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular__travel__place);

        setTitle("Most Popular Place");
        popularlistView=findViewById(R.id.popular_listViewId);
        String[] popularlistItem=getResources().getStringArray(R.array.popularlist_item);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.sample_listview,R.id.textViewId,popularlistItem);
        popularlistView.setAdapter(adapter);

        popularlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
                    Intent intent=new Intent(getApplicationContext(),SatchariActivity.class);
                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent=new Intent(getApplicationContext(),Remakaleggha_activity.class);
                    startActivity(intent);
                }
                else if(position==6){
                    Intent intent=new Intent(getApplicationContext(),MalnichoraAtivity.class);
                    startActivity(intent);
                }
                else if(position==7){
                    Intent intent=new Intent(getApplicationContext(),Madhokudo_Activity.class);
                    startActivity(intent);
                }
                else if(position==8){
                    Intent intent=new Intent(getApplicationContext(),HamhamActivity.class);
                    startActivity(intent);
                }
                else if(position==9){
                    Intent intent=new Intent(getApplicationContext(),HakalukiActivity.class);
                    startActivity(intent);
                }
                else if(position==10){
                    Intent intent=new Intent(getApplicationContext(),TangurerHaworActivity.class);
                    startActivity(intent);
                }
                else if(position==11){
                    Intent intent=new Intent(getApplicationContext(),HasonRajaActivity.class);
                    startActivity(intent);
                }
                else if(position==12){
                    Intent intent=new Intent(getApplicationContext(),BashTolaActivity.class);
                    startActivity(intent);
                }



            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu_exit_activity,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.exitId){
            finishAffinity();
        }
        return super.onOptionsItemSelected(item);
    }
}
