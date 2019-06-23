package com.example.randikamadhushan.hireme;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;


public class SplashScreen extends AppCompatActivity {

    ImageView splashImage;
    TextView splashText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashImage = (ImageView) findViewById(R.id.splashimage);

        Animation splashscreen = AnimationUtils.loadAnimation(this,R.anim.splash_screen_animation);
        splashImage.startAnimation(splashscreen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    sleep(3000);

                    Intent i = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

    }
}
