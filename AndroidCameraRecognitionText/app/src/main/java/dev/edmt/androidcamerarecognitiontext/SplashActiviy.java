package dev.edmt.androidcamerarecognitiontext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActiviy extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_activiy);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(SplashActiviy.this, MainActivity.class));
            }
        }).start();

    }
}
