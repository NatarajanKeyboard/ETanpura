package com.natarajansfirstapplication.etanpura;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    MediaPlayer cmusic,dmusic,emusic,fmusic,gmusic,amusic,bmusic;
    //Button c,d,e,f,g,a,b;

    TextView et;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(TextView) findViewById(R.id.tex);
        cmusic = MediaPlayer.create(this, R.raw.c);
        dmusic = MediaPlayer.create(this, R.raw.d);
        emusic = MediaPlayer.create(this, R.raw.e);
        fmusic = MediaPlayer.create(this, R.raw.f);
        gmusic = MediaPlayer.create(this, R.raw.g);
        amusic = MediaPlayer.create(this, R.raw.a);
        bmusic = MediaPlayer.create(this, R.raw.b);

//        c=(Button) findViewById(R.id.btnc);
//        d=(Button) findViewById(R.id.btnd);
//        e=(Button) findViewById(R.id.btne);
//        f=(Button) findViewById(R.id.btnf);
//        g=(Button) findViewById(R.id.btng);
//        a=(Button) findViewById(R.id.btna);
//        b=(Button) findViewById(R.id.btnb);

    }
    public void playc(View v)
    {
//        if (dmusic.isPlaying()) {
//            dmusic.stop();
//            dmusic=null;
//            dmusic = MediaPlayer.create(this, R.raw.d);
//        }
//        if (emusic.isPlaying()) {
//            emusic.stop();
//            emusic = MediaPlayer.create(this, R.raw.e);
//        }
//        if (fmusic.isPlaying()) {
//            fmusic.stop();
//            fmusic = MediaPlayer.create(this, R.raw.f);
//        }
//        if (gmusic.isPlaying()) {
//            gmusic.stop();
//            gmusic = MediaPlayer.create(this, R.raw.g);
//        }
//        if (amusic.isPlaying()) {
//            amusic.stop();
//            amusic = MediaPlayer.create(this, R.raw.a);
//        }
//        if (bmusic.isPlaying()) {
//            bmusic.stop();
//            bmusic = MediaPlayer.create(this, R.raw.b);
//        }
        musicstop(v);
        et.setText("Playing: C");
        cmusic.setLooping(true);
        cmusic.start();
    }

    public void playd(View v)
    {
//        if (cmusic.isPlaying()) {
//            cmusic.stop();
//            cmusic = MediaPlayer.create(this, R.raw.c);
//        }
//        if (emusic.isPlaying()) {
//            emusic.stop();
//            emusic = MediaPlayer.create(this, R.raw.e);
//        }
//        if (fmusic.isPlaying()) {
//            fmusic.stop();
//            fmusic = MediaPlayer.create(this, R.raw.f);
//        }
//        if (gmusic.isPlaying()) {
//            gmusic.stop();
//            gmusic = MediaPlayer.create(this, R.raw.g);
//        }
//        if (amusic.isPlaying()) {
//            amusic.stop();
//            amusic = MediaPlayer.create(this, R.raw.a);
//        }
//        if (bmusic.isPlaying()) {
//            bmusic.stop();
//            bmusic = MediaPlayer.create(this, R.raw.b);
//        }
        musicstop(v);
        et.setText("Playing: D");
        dmusic.setLooping(true);
        dmusic.start();
    }

    public void playe(View v)
    {

//        if (dmusic.isPlaying()) {
//            dmusic.stop();
//            dmusic = MediaPlayer.create(this, R.raw.d);
//        }
//        if (cmusic.isPlaying()) {
//            cmusic.stop();
//            cmusic = MediaPlayer.create(this, R.raw.c);
//        }
//        if (fmusic.isPlaying()) {
//            fmusic.stop();
//            fmusic = MediaPlayer.create(this, R.raw.f);
//        }
//        if (gmusic.isPlaying()) {
//            gmusic.stop();
//            gmusic = MediaPlayer.create(this, R.raw.g);
//        }
//        if (amusic.isPlaying()) {
//            amusic.stop();
//            amusic = MediaPlayer.create(this, R.raw.a);
//        }
//        if (bmusic.isPlaying()) {
//            bmusic.stop();
//            bmusic = MediaPlayer.create(this, R.raw.b);
//        }
        musicstop(v);
        et.setText("Playing: E");
        emusic.setLooping(true);
        emusic.start();
    }

    public void playf(View v)
    {

//        if (dmusic.isPlaying()) {
//            dmusic.stop();
//            dmusic = MediaPlayer.create(this, R.raw.d);
//        }
//        if (cmusic.isPlaying()) {
//            cmusic.stop();
//            cmusic = MediaPlayer.create(this, R.raw.c);
//        }
//        if (emusic.isPlaying()) {
//            emusic.stop();
//            emusic = MediaPlayer.create(this, R.raw.e);
//        }
//        if (gmusic.isPlaying()) {
//            gmusic.stop();
//            gmusic = MediaPlayer.create(this, R.raw.g);
//        }
//        if (amusic.isPlaying()) {
//            amusic.stop();
//            amusic = MediaPlayer.create(this, R.raw.a);
//        }
//        if (bmusic.isPlaying()) {
//            bmusic.stop();
//            bmusic = MediaPlayer.create(this, R.raw.b);
//        }
        musicstop(v);
        et.setText("Playing: F");
        fmusic.setLooping(true);
        fmusic.start();
    }

    public void playg(View v)
    {

//        if (dmusic.isPlaying()) {
//            dmusic.stop();
//            dmusic = MediaPlayer.create(this, R.raw.d);
//        }
//        if (cmusic.isPlaying()) {
//            cmusic.stop();
//            cmusic = MediaPlayer.create(this, R.raw.c);
//        }
//        if (fmusic.isPlaying()) {
//            fmusic.stop();
//            fmusic = MediaPlayer.create(this, R.raw.f);
//        }
//        if (emusic.isPlaying()) {
//            emusic.stop();
//            emusic = MediaPlayer.create(this, R.raw.e);
//        }
//        if (amusic.isPlaying()) {
//            amusic.stop();
//            amusic = MediaPlayer.create(this, R.raw.a);
//        }
//        if (bmusic.isPlaying()) {
//            bmusic.stop();
//            bmusic = MediaPlayer.create(this, R.raw.b);
//        }
        musicstop(v);
        et.setText("Playing: G");
        gmusic.setLooping(true);
        gmusic.start();
    }

    public void playa(View v) {
//        if (dmusic.isPlaying()) {
//            dmusic.stop();
//            dmusic = MediaPlayer.create(this, R.raw.d);
//        }
//        if (emusic.isPlaying()) {
//            emusic.stop();
//            emusic = MediaPlayer.create(this, R.raw.e);
//        }
//        if (fmusic.isPlaying()) {
//            fmusic.stop();
//            fmusic = MediaPlayer.create(this, R.raw.f);
//        }
//        if (gmusic.isPlaying()) {
//            gmusic.stop();
//            gmusic = MediaPlayer.create(this, R.raw.g);
//        }
//        if (cmusic.isPlaying()) {
//            cmusic.stop();
//            cmusic = MediaPlayer.create(this, R.raw.c);
//        }
//        if (bmusic.isPlaying()) {
//            bmusic.stop();
//            bmusic = MediaPlayer.create(this, R.raw.b);
//        }
        musicstop(v);
        et.setText("Playing: A");
        amusic.setLooping(true);
        amusic.start();
    }
    public void playb(View v) {
//        if (dmusic.isPlaying()) {
//            dmusic.stop();
//            dmusic = MediaPlayer.create(this, R.raw.d);
//        }
//        if (emusic.isPlaying()) {
//            emusic.stop();
//            emusic = MediaPlayer.create(this, R.raw.e);
//        }
//        if (fmusic.isPlaying()) {
//            fmusic.stop();
//            fmusic = MediaPlayer.create(this, R.raw.f);
//        }
//        if (gmusic.isPlaying()) {
//            gmusic.stop();
//            gmusic = MediaPlayer.create(this, R.raw.g);
//        }
//        if (amusic.isPlaying()) {
//            amusic.stop();
//            amusic = MediaPlayer.create(this, R.raw.a);
//        }
//        if (cmusic.isPlaying()) {
//            cmusic.stop();
//            cmusic = MediaPlayer.create(this, R.raw.c);
//        }


        musicstop(v);
        et.setText("Playing: B");
        bmusic.setLooping(true);
        bmusic.start();
    }
//    public void musicplay(View v)
//    {
//        et.setText("Playing");
//        //music.start();
//    }
//    public void musicpause(View v)
//    {
//        et.setText("Pausing");
//        //music.pause();
//    }
    public void musicstop(View v)
    {
        et.setText("Stopped playing");
//        Thread.sleep(3000);
//        et.setText("Select the scale");
        if (cmusic.isPlaying()) {
            cmusic.stop();
            cmusic.release();
            cmusic = MediaPlayer.create(this, R.raw.c);

        }
        if (dmusic.isPlaying()) {
            dmusic.stop();
            dmusic.release();
            dmusic = MediaPlayer.create(this, R.raw.d);
        }
        if (emusic.isPlaying()) {
            emusic.stop();
            emusic.release();
            emusic = MediaPlayer.create(this, R.raw.e);
        }
        if (fmusic.isPlaying()) {
            fmusic.stop();
            fmusic.release();
            fmusic = MediaPlayer.create(this, R.raw.f);
        }
        if (gmusic.isPlaying()) {
            gmusic.stop();
            gmusic.release();
            gmusic = MediaPlayer.create(this, R.raw.g);
        }
        if (amusic.isPlaying()) {
            amusic.stop();
            amusic.release();
            amusic = MediaPlayer.create(this, R.raw.a);
        }
        if (bmusic.isPlaying()) {
            bmusic.stop();
            bmusic.release();
            bmusic = MediaPlayer.create(this, R.raw.b);
        }

        //music = MediaPlayer.create(this, R.raw.malare_opening);

    }



    }
