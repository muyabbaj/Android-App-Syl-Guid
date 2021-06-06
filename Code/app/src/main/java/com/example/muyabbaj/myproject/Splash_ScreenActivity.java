package com.example.muyabbaj.myproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Splash_ScreenActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Timer time;
    int i;
    final static int period=40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        progressBar=findViewById(R.id.progressbarId);

       time= new Timer();
       time.schedule(new TimerTask() {
           @Override
           public void run() {
               if( i<90){
                   progressBar.setProgress(i);
                   i++;
               }
               else{
                   time.cancel();

                   Intent intent=new Intent(Splash_ScreenActivity.this,MainActivity.class);
                   startActivity(intent);
               }
           }
       },0,period);

    }
}
