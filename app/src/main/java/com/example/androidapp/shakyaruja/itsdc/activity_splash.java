package com.example.androidapp.shakyaruja.itsdc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by rujan on 1/4/2018.
 */

public class activity_splash extends AppCompatActivity {
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        iv = (ImageView) findViewById(R.id.homeimage);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.home_anim);
        iv.startAnimation(myanim);
        final Intent i = new Intent(this,SlideActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}
