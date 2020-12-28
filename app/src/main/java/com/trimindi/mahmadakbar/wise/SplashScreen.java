package com.trimindi.mahmadakbar.wise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private ImageView mSplashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        mSplashImage = findViewById(R.id.splash_image);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.splashanimation);
        mSplashImage.startAnimation(myanim);

        final Intent activityIntent = new Intent(this, MainActivity.class);

        Thread timer = new Thread(){

            public void run(){
                try{
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                finally {

                    startActivity(activityIntent);
                    finish();

                }
            }

        };

        timer.start();

    }
}
