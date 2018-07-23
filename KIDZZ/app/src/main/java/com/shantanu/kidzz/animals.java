package com.shantanu.kidzz;

import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static java.sql.Types.NULL;

public class animals extends AppCompatActivity {
    private static ImageButton button_forward;
    private static ImageButton button_backward;
    private static ImageButton buttonAudioPlay;
    private static ImageView button_img;
    private static TextView button_txt;
    public  static MediaPlayer mp;
    Random random=new Random();
    public int[] images={R.drawable.ani_cat,R.drawable.animal_cow,R.drawable.animal_dog,R.drawable.animal_horse,R.drawable.animal_lion,R.drawable.animal_monkey,R.drawable.animal_rabbit,R.drawable.animal_sheep,R.drawable.animal_tiger,R.drawable.animal_elephant};
    public  int[] sounds= { R.raw.animal_cat,R.raw.ani_cow,R.raw.animal_dog,R.raw.animal_horse,R.raw.animal_lion,R.raw.animal_monkey,R.raw.animal_rabbit,R.raw.animal_sheep,R.raw.animal_tiger,R.raw.animal_elephant};
    public String[] txt={"Cat","Cow","Dog","Horse","Lion","Monkey","Rabbit","Sheep","Tiger","Elephant"};
    public int current_image_index;

    @Override
    public void onBackPressed()
    {
        if(mp!= null)
            mp.stop();
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        button_click();
    }
    public void button_click()
    {

        button_img = (ImageView) findViewById(R.id.animal_img);
        button_forward = (ImageButton) findViewById(R.id.animal_forward);
        button_backward = (ImageButton) findViewById(R.id.animal_backward);
        buttonAudioPlay =(ImageButton) findViewById(R.id.animal_sound);
        button_txt=(TextView)findViewById(R.id.animal_text);
        current_image_index=random.nextInt(10);
        mp= MediaPlayer.create(animals.this,sounds[current_image_index]);
        mp.start();
        button_img.setImageResource(images[current_image_index]);
        button_txt.setText(txt[current_image_index]);
        button_forward.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        button_img.setImageResource(images[current_image_index]);
                        button_txt.setText(txt[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(animals.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(animals.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });
        button_backward.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image_index--;
                        if (current_image_index < 0)
                            current_image_index = images.length - 1;
                        current_image_index = current_image_index % images.length;
                        button_img.setImageResource(images[current_image_index]);
                        button_txt.setText(txt[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(animals.this, sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(animals.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAudioPlay.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(animals.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(animals.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });
    }

}