package com.shantanu.kidzz;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public MediaPlayer mp;
    public MediaPlayer mp_num;
    public MediaPlayer mp_start;


    private long lastPressedTime;
    private static final int PERIOD = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view =this.getWindow().getDecorView();

        mp= MediaPlayer.create(MainActivity.this, R.raw.a);
        mp_num = MediaPlayer.create(MainActivity.this,R.raw.sound_0);
        mp_start = MediaPlayer.create(MainActivity.this, R.raw.jinglebells);
        try {
            if(mp_start.isPlaying()){
                mp_start.stop();
                mp_start.release();
                mp_start=MediaPlayer.create(MainActivity.this,R.raw.jinglebells);
            }else{
                mp_start =MediaPlayer.create(MainActivity.this,R.raw.jinglebells);
            }
            mp_start.start();
            mp_start.setLooping(true);
            mp_start.setVolume(5,5);
        }
        catch (Exception e){e.printStackTrace();}

        int orientation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            view.setBackgroundResource (R.drawable.nature);

        } else {
            view.setBackgroundResource (R.drawable.nature_front);
        }

        final ImageButton alphabets=(ImageButton) findViewById(R.id.imageButton2);
        alphabets.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent alphabets=new Intent(MainActivity.this,Alphabets.class);
                MainActivity.this.startActivity(alphabets);
                mp_start.stop();
                try {
                    if(mp.isPlaying()){
                        mp.stop();
                        mp.release();
                        mp=MediaPlayer.create(MainActivity.this,R.raw.a);
                    }else{
                        mp =MediaPlayer.create(MainActivity.this,R.raw.a);
                    }
                    mp.start();
                    mp.setVolume(300,300);
                }
                    catch (Exception e){e.printStackTrace();}
            }
        });
        final ImageButton numbers=(ImageButton) findViewById(R.id.imageButton3);
        numbers.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent numbers=new Intent(MainActivity.this,Numbers.class);
                MainActivity.this.startActivity(numbers);
                mp_start.stop();
                try {
                    if(mp.isPlaying()){
                        mp.stop();
                        mp.release();
                        mp=MediaPlayer.create(MainActivity.this,R.raw.sound_0);
                    }else{
                        mp =MediaPlayer.create(MainActivity.this,R.raw.sound_0);
                    }
                    mp.start();
                    mp.setVolume(300,300);

                }
                    catch (Exception e){e.printStackTrace();}
            }
        });
        final ImageButton games=(ImageButton) findViewById(R.id.imageButton4);
        games.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent games=new Intent(MainActivity.this,Puzzles.class);
                MainActivity.this.startActivity(games);
                try {
                    if(mp_start.isPlaying()){
                        mp_start.stop();
                        mp_start.release();
                        mp_start=MediaPlayer.create(MainActivity.this,R.raw.jinglebells);
                    }else{
                        mp_start =MediaPlayer.create(MainActivity.this,R.raw.jinglebells);
                    }
                    mp_start.start();
                    mp_start.setLooping(true);
                    mp_start.setVolume(5,5);
                }
                catch (Exception e){e.printStackTrace();}
            }
        });

        final ImageButton animals_var=(ImageButton) findViewById(R.id.imageButton6);
        animals_var.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent animal_var=new Intent(MainActivity.this,animals.class);
                MainActivity.this.startActivity(animal_var);
                mp_start.stop();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            switch (event.getAction()) {
                case KeyEvent.ACTION_DOWN:
                    if (event.getDownTime() - lastPressedTime < PERIOD) {
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Press again to exit.",
                                Toast.LENGTH_SHORT).show();
                        lastPressedTime = event.getEventTime();
                    }
                    mp_start.stop();
                    return true;
            }
        }

        return false;
    }

}
