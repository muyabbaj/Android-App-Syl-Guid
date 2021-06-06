package com.example.muyabbaj.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {
    private TextView nameText,feedbackText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        setTitle("Feedback");
        nameText=findViewById(R.id.nameTextId);
        feedbackText=findViewById(R.id.feedbackTextId);
        button=findViewById(R.id.feedbackbuttonId);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                try {
                    String name=nameText.getText().toString();
                    String feedback=feedbackText.getText().toString();
                    if(v.getId()==R.id.feedbackbuttonId){
                        Intent intent=new Intent(Intent.ACTION_SEND);
                        intent.setType("text/email");
                        String[] email={"muyabbaz@gmail.com"};
                        intent.putExtra(Intent.EXTRA_EMAIL,email);
                        intent.putExtra(Intent.EXTRA_SUBJECT,"App Feedback:");
                        intent.putExtra(Intent.EXTRA_TEXT,"Name: "+name+"\n\nFeedback: "+feedback);
                        startActivity(Intent.createChooser(intent,"Feedback with: "));
                    }

                }catch (Exception e){
                    Toast.makeText(FeedbackActivity.this,"Please fill up correctly",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.option_menu_exit_activity,menu);

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
