package com.example.david.instantfun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button homer;
    private Button badumts;
    private Button nyancat;
    private Button dramatic;
    private Button nooooo;
    private Button firing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homer = (Button)findViewById(R.id.button);

        };
        public void sound(View view) {
            MediaPlayer mp = MediaPlayer.create(this, R.raw.badumtss);
            mp.start();
        }
    public void sound1(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.nyancat);
        mp.start();
    }
    public void sound2(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.dramatic);
        mp.start();
    }
    public void sound3(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.nooo);
        mp.start();
    }
    public void sound4(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.over_9000);
        mp.start();
    }
    public void sound5(View view) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.homer);
        mp.start();
    }

    };

