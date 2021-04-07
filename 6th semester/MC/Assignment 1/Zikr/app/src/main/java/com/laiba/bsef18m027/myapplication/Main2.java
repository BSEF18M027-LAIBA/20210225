package com.laiba.bsef18m027.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2 extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView im1=(ImageView) findViewById(R.id.imageAllah);
        im1.animate().translationX(100f).setDuration(2000);
        ImageView im2=(ImageView) findViewById(R.id.imageAlhumd);
        im2.animate().translationX(100f).setDuration(2000);
        ImageView im3=(ImageView) findViewById(R.id.imageSubhan);
        im3.animate().translationX(100f).setDuration(2000);
        mediaPlayer= MediaPlayer.create(this,R.raw.subhan);
        mediaPlayer.start();
    }

    public void MoveAllah(View view) {
        Intent activity=new Intent(this,MainAllah.class);
        if(mediaPlayer.isPlaying())
            mediaPlayer.pause();
        startActivity(activity);
    }

    public void MoveAlhumd(View view) {
        Intent activity=new Intent(this,MainAlhumd.class);
        if(mediaPlayer.isPlaying())
            mediaPlayer.pause();
        startActivity(activity);
    }

    public void MoveSubhan(View view) {
        Intent activity=new Intent(this,MainSubhan.class);
        if(mediaPlayer.isPlaying())
            mediaPlayer.pause();
        startActivity(activity);
    }
}