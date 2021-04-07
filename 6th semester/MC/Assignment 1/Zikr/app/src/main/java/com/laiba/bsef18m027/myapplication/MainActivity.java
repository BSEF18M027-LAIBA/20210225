package com.laiba.bsef18m027.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer=MediaPlayer.create(this,R.raw.bismillah);
        mediaPlayer.start();
    }

    public void Move(View view) {
        Intent activity= new Intent(this, Main2.class);
        mediaPlayer.pause();
        startActivity(activity);
    }
}