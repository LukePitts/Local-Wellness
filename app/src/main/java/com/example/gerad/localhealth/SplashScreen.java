package com.example.gerad.localhealth;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;





public class SplashScreen extends Activity {
    MediaPlayer Sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

      /*   Sound = MediaPlayer.create(this,);
                Sound.start();*/

        Thread ScreenTimer = new Thread() {
            public void run() {
                try {
                    sleep(1000);

                    Intent intent = new Intent(getBaseContext(),Disclaimer.class);
                    startActivity(intent);

                    finish();

                } catch (Exception e) {
                }
            }
        };
        ScreenTimer.start();

    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
       /* Sound.release();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Sound.pause();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Sound.start();*/
    }

}


