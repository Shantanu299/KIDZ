package com.shantanu.kidzz;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import pl.droidsonroids.gif.GifImageView;

public class Numbers extends AppCompatActivity {

    private static ImageView imgView;
    private static ImageButton button_forward;
    private static ImageButton button_backward;
    private static GifImageView gifView;

    private static Button buttonNum0;
    private static Button buttonNum1;
    private static Button buttonNum2;
    private static Button buttonNum3;
    private static Button buttonNum4;
    private static Button buttonNum5;
    private static Button buttonNum6;
    private static Button buttonNum7;
    private static Button buttonNum8;
    private static Button buttonNum9;
    private static ImageButton buttonAudioPlay;

    public static MediaPlayer mp;

    public int current_image_index;
    int[] images={R.drawable.num_0,R.drawable.num_1,R.drawable.num_2,R.drawable.num_3,R.drawable.num_4,R.drawable.num_5,R.drawable.num_6,
                  R.drawable.num_7,R.drawable.num_8,R.drawable.num_9};

    int[] sounds={R.raw.sound_0,R.raw.sound_1,R.raw.sound_2,R.raw.sound_3,R.raw.sound_4,R.raw.sound_5,R.raw.sound_6,R.raw.sound_7,R.raw.sound_8,R.raw.sound_9};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        buttonClick();
    }

    public void buttonClick(){
           // imgView = (ImageView) findViewById(R.id.imageView);
            gifView = (GifImageView) findViewById(R.id.gifImage1);
            button_forward =(ImageButton) findViewById(R.id.imageButton);
            button_backward=(ImageButton) findViewById(R.id.imageButton5);
            buttonAudioPlay =(ImageButton) findViewById(R.id.Audio_play_button2);
            mp = MediaPlayer.create(Numbers.this,R.raw.sound_0);

        buttonNum0=(Button) findViewById(R.id.num_0_button);
        buttonNum1=(Button) findViewById(R.id.num_1_button);
        buttonNum2=(Button) findViewById(R.id.num_2_button);
        buttonNum3=(Button) findViewById(R.id.num_3_button);
        buttonNum4=(Button) findViewById(R.id.num_4_button);
        buttonNum5=(Button) findViewById(R.id.num_5_button);
        buttonNum6=(Button) findViewById(R.id.num_6_button);
        buttonNum7=(Button) findViewById(R.id.num_7_button);
        buttonNum8=(Button) findViewById(R.id.num_8_button);
        buttonNum9=(Button) findViewById(R.id.num_9_button);



            button_forward.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            current_image_index++;
                            current_image_index=current_image_index % images.length;
                            //imgView.setImageResource(images[current_image_index]);
                            gifView.setImageResource(images[current_image_index]);

                            try {
                                if(mp.isPlaying()) {
                                    mp.stop();
                                    mp.release();
                                    mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                                }
                                else{
                                    mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                                }mp.start();
                            }catch (Exception e){e.printStackTrace();}
                        }
                    });
            button_backward.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            current_image_index--;
                            if(current_image_index<0)
                                current_image_index=images.length-1;
                            current_image_index=current_image_index % images.length;
                            //imgView.setImageResource(images[current_image_index]);
                            gifView.setImageResource(images[current_image_index]);

                            try {
                                if(mp.isPlaying()) {
                                    mp.stop();
                                    mp.release();
                                    mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                                }
                                else{
                                    mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
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
                                mp=MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });


        buttonNum0.setOnClickListener(
                 new View.OnClickListener(){
                     @Override
                     public void onClick(View v) {
                         current_image_index=0;
                        // imgView.setImageResource(images[current_image_index]);
                         gifView.setImageResource(images[current_image_index]);
                         try {
                             if(mp.isPlaying()) {
                                 mp.stop();
                                 mp.release();
                                 mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                             }
                             else{
                                 mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                             }mp.start();
                         }catch (Exception e){e.printStackTrace();}
                     }
                 });

        buttonNum1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=1;
                      //  imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonNum2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=2;
                        //imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonNum3.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=3;
                       // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonNum4.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=4;
                     //   imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonNum5.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=5;
                       // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonNum6.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=6;
                        //imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonNum7.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=7;
                       // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}

                    }
                });

        buttonNum8.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=8;
                       // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonNum9.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_image_index=9;
                       // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);
                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Numbers.this, sounds[current_image_index]);
                            }
                            else{
                                mp =MediaPlayer.create(Numbers.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        //horizontal scroll
        HorizontalScrollView hv = (HorizontalScrollView)findViewById(R.id.myHsView);  // your HorizontalScrollView inside scrollview
        hv.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle HorizontalScrollView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });

    }


}

