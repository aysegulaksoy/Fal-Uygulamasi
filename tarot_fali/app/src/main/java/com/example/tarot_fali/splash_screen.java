package com.example.tarot_fali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class splash_screen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 6000; //açılış ekranının kaç saniye ekranda görüneceği belirlenir

    VideoView video;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        player = new MediaPlayer();

        video=(VideoView) findViewById(R.id.videoView);

        Uri uri= Uri.parse("android.resource://"+getPackageName()+ "/"  + R.raw.b); //Videonun kaynaktan alınması

        video.setVideoURI(uri);//videonun videoview'a atanması


        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                player.setLooping(true);//videonun sürekli tekrarlanması sağlanır
            }
        });
        video.start();//videonunbaşlatılması


        new Handler().postDelayed(new Runnable() {   //uygulama açılırken diğer sayfaya yönlendirmenin 6 saniyede gerçekleşmesini sağlar
            @Override
            public void run() {

                Intent i = new Intent(splash_screen.this, ana_sayfa.class);//ana sayfaya yönlendirir
                startActivity(i);

            }
        }, SPLASH_TIME_OUT);//static int olarak tanımlanan sürenin çalıştırılması
    }

}