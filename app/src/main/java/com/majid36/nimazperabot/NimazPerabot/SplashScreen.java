package com.majid36.nimazperabot.NimazPerabot;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.user.NimazPerabot.R;

public class SplashScreen extends AppCompatActivity {

    Handler handler = new Handler();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Runnable updateCurrentTime = new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        };
        handler.postDelayed(updateCurrentTime, 3500);
    }
}