package com.laiba.bsef18m027.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainAlhumd extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alhumd);
        ImageView im=(ImageView) findViewById(R.id.imageAlhumd);
        im.animate().translationX(200f).setDuration(2000);
        mediaPlayer= MediaPlayer.create(this,R.raw.alhumd);
        mediaPlayer.start();
        rotate(im);
    }

    public void rotate(View view) {
        ImageView im=(ImageView) findViewById(R.id.hands);
        im.animate().rotationY(360).setDuration(1000);
    }
}