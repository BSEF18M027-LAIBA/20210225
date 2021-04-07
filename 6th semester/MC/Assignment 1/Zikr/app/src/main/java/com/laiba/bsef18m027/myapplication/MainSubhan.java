package com.laiba.bsef18m027.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainSubhan extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subhan);
        ImageView im=(ImageView) findViewById(R.id.imageSubhan);
        im.animate().translationX(200f).setDuration(2000);
        mediaPlayer= MediaPlayer.create(this,R.raw.subhan);
        mediaPlayer.start();
    }

    public void rotate(View view) {
        ImageView im=(ImageView) findViewById(R.id.hands);
        im.animate().rotationY(360).setDuration(1000);
    }
}