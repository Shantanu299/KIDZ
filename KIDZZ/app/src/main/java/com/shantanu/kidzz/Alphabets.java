package com.shantanu.kidzz;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.ImageButton;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ListView;
import pl.droidsonroids.gif.GifImageView;

public class Alphabets extends AppCompatActivity {

    private static ImageButton button_forward;
    private static ImageButton button_backward;
    private static ImageButton buttonAudioPlay;
    private static GifImageView gifView;
    public  static MediaPlayer mp;

    private static Button buttonAlphaA;
    private static Button buttonAlphaB;
    private static Button buttonAlphaC;
    private static Button buttonAlphaD;
    private static Button buttonAlphaE;
    private static Button buttonAlphaF;
    private static Button buttonAlphaG;
    private static Button buttonAlphaH;
    private static Button buttonAlphaI;
    private static Button buttonAlphaJ;
    private static Button buttonAlphaK;
    private static Button buttonAlphaL;
    private static Button buttonAlphaM;
    private static Button buttonAlphaN;
    private static Button buttonAlphaO;
    private static Button buttonAlphaP;
    private static Button buttonAlphaQ;
    private static Button buttonAlphaR;
    private static Button buttonAlphaS;
    private static Button buttonAlphaT;
    private static Button buttonAlphaU;
    private static Button buttonAlphaV;
    private static Button buttonAlphaW;
    private static Button buttonAlphaX;
    private static Button buttonAlphaY;
    private static Button buttonAlphaZ;

   public int[] images = {R.drawable.alpbet_a, R.drawable.alpbet_b,R.drawable.alpbet_c,R.drawable.alpbet_d,R.drawable.alpbet_e,
                           R.drawable.alpbet_f, R.drawable.alpbet_g,R.drawable.alpbet_h,R.drawable.alpbet_i,R.drawable.alpbet_j,
                          R.drawable.alpbet_k, R.drawable.alpbet_l,R.drawable.alpbet_m,R.drawable.alpbet_n,R.drawable.alpbet_o,
                            R.drawable.alpbet_p, R.drawable.alpbet_q,R.drawable.alpbet_r,R.drawable.alpbet_s,R.drawable.alpbet_t,
                        R.drawable.alpbet_u, R.drawable.alpbet_v,R.drawable.alpbet_w,R.drawable.alpbet_x,R.drawable.alpbet_y,R.drawable.alpbet_z
                            };

    public  int[] sounds= { R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,R.raw.k,R.raw.l,
            R.raw.m,R.raw.n,R.raw.o,R.raw.p,R.raw.q,R.raw.r,R.raw.s,R.raw.t,R.raw.u,R.raw.v,R.raw.w,R.raw.x,R.raw.y,R.raw.z };



    public int current_image_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        buttonClick();
    }


    public void buttonClick() {
        gifView = (GifImageView) findViewById(R.id.gifImage_alphabets);
        button_forward = (ImageButton) findViewById(R.id.imageButton_alpha1);
        button_backward = (ImageButton) findViewById(R.id.imageButton_alpha2);
        buttonAudioPlay =(ImageButton) findViewById(R.id.Audio_play_button);
        mp= MediaPlayer.create(Alphabets.this, R.raw.a);


        buttonAlphaA = (Button) findViewById(R.id.alpha_a_button);
        buttonAlphaB = (Button) findViewById(R.id.alpha_b_button);
        buttonAlphaC = (Button) findViewById(R.id.alpha_c_button);
        buttonAlphaD = (Button) findViewById(R.id.alpha_d_button);
        buttonAlphaE = (Button) findViewById(R.id.alpha_e_button);
        buttonAlphaF = (Button) findViewById(R.id.alpha_f_button);
        buttonAlphaG = (Button) findViewById(R.id.alpha_g_button);
        buttonAlphaH = (Button) findViewById(R.id.alpha_h_button);
        buttonAlphaI = (Button) findViewById(R.id.alpha_i_button);
        buttonAlphaJ = (Button) findViewById(R.id.alpha_j_button);
        buttonAlphaK = (Button) findViewById(R.id.alpha_k_button);
        buttonAlphaL = (Button) findViewById(R.id.alpha_l_button);
        buttonAlphaM = (Button) findViewById(R.id.alpha_m_button);
        buttonAlphaN = (Button) findViewById(R.id.alpha_n_button);
        buttonAlphaO = (Button) findViewById(R.id.alpha_o_button);
        buttonAlphaP = (Button) findViewById(R.id.alpha_p_button);
        buttonAlphaQ = (Button) findViewById(R.id.alpha_q_button);
        buttonAlphaR = (Button) findViewById(R.id.alpha_r_button);
        buttonAlphaS = (Button) findViewById(R.id.alpha_s_button);
        buttonAlphaT = (Button) findViewById(R.id.alpha_t_button);
        buttonAlphaU = (Button) findViewById(R.id.alpha_u_button);
        buttonAlphaV = (Button) findViewById(R.id.alpha_v_button);
        buttonAlphaW = (Button) findViewById(R.id.alpha_w_button);
        buttonAlphaX = (Button) findViewById(R.id.alpha_x_button);
        buttonAlphaY = (Button) findViewById(R.id.alpha_y_button);
        buttonAlphaZ = (Button) findViewById(R.id.alpha_z_button);


        button_forward.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Alphabets.this, sounds[current_image_index]);
                            }
                            else{
                                  mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
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
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()) {
                                mp.stop();
                                mp.release();
                                mp = MediaPlayer.create(Alphabets.this, sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
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
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaA.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 0;
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaB.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 1;
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 2;
                        //imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaD.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 3;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaE.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 4;
                        //   imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaF.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 5;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaG.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 6;
                        //imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaH.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 7;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaI.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 8;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaJ.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 9;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });
        buttonAlphaK.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 10;
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaL.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 11;
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaM.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 12;
                        //imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 13;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaO.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 14;
                        //   imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaP.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 15;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaQ.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 16;
                        //imgView.setImageResource(images[current_image_index]);

                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaR.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 17;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaS.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 18;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaT.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 19;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaU.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 20;
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaV.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 21;
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaW.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 22;
                        //imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaX.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 23;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaY.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 24;
                        //   imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });

        buttonAlphaZ.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        current_image_index = 25;
                        // imgView.setImageResource(images[current_image_index]);
                        gifView.setImageResource(images[current_image_index]);

                        try {
                            if(mp.isPlaying()){
                                mp.stop();
                                mp.release();
                                mp=MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }else{
                                mp =MediaPlayer.create(Alphabets.this,sounds[current_image_index]);
                            }mp.start();
                        }catch (Exception e){e.printStackTrace();}
                    }
                });


        //horizontal scroll
        HorizontalScrollView hv = (HorizontalScrollView) findViewById(R.id.myHsView_alpha);  // your HorizontalScrollView inside scrollview
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