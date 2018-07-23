package com.shantanu.kidzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

import static com.shantanu.kidzz.R.raw.j;

public class test_numbers extends AppCompatActivity {

    private static int i=0,j=0,numQ,numA;
    Random random=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_numbers);
        GetAnswer();
    }

    protected void GetAnswer()
    {
        final Button btnButton=(Button)findViewById(R.id.button_Next);
        btnButton.setClickable(false);
        int[] arr={-1,-1,-1,-1};
        int count=0;
        numQ=random.nextInt(10);
        numA=random.nextInt(4);
        j=numA;
        i=numQ;
        arr[count]=numQ;
        final Button btnQ=(Button)findViewById(R.id.button_Q);
        final Button btnA=(Button)findViewById(R.id.button_A);
        final Button btnB=(Button)findViewById(R.id.button_B);
        final Button btnC=(Button)findViewById(R.id.button_C);
        final Button btnD=(Button)findViewById(R.id.button_D);
        btnQ.setText(String.valueOf(numQ));
        if(j==0) {
            btnA.setText(String.valueOf(i));
        }
        else if(j==1) {
            btnB.setText(String.valueOf(i));
        }
        else if(j==2) {
            btnC.setText(String.valueOf(i));
        }
        else
            btnD.setText(String.valueOf(i));
        if(j==3)
            j=0;
        else
            j++;
        while(j!=numA)
        {
            i=random.nextInt(10);
            for(int l=0;l<=count;l++)
            {
                if(i==arr[l]) {
                    i = random.nextInt(10);
                    l = -1;
                }
            }
            count++;
            arr[count]=i;
            if(j==0)
                btnA.setText(String.valueOf(i));
            else if(j==1)
                btnB.setText(String.valueOf(i));
            else if(j==2)
                btnC.setText(String.valueOf(i));
            else
                btnD.setText(String.valueOf(i));
            if(j>=3)
                j=0;
            else
                j++;
        }
        btnB.setBackgroundColor(Color.WHITE);
        btnC.setBackgroundColor(Color.WHITE);
        btnD.setBackgroundColor(Color.WHITE);
        btnA.setBackgroundColor(Color.WHITE);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numA==0) {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Correct!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Correct", Toast.LENGTH_LONG).show();
                    btnA.setBackgroundColor(Color.GREEN);
                    btnButton.setClickable(true);
                    btnB.setClickable(false);
                    btnC.setClickable(false);
                    btnD.setClickable(false);
                    btnB.setBackgroundColor(Color.WHITE);
                    btnC.setBackgroundColor(Color.WHITE);
                    btnD.setBackgroundColor(Color.WHITE);
                }
                else
                {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Wrong", Toast.LENGTH_LONG).show();
                    btnA.setBackgroundColor(Color.RED);
                }
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numA==1) {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Correct!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Correct", Toast.LENGTH_LONG).show();
                    btnB.setBackgroundColor(Color.GREEN);
                    btnButton.setClickable(true);
                    btnA.setClickable(false);
                    btnC.setClickable(false);
                    btnD.setClickable(false);
                    btnA.setBackgroundColor(Color.WHITE);
                    btnC.setBackgroundColor(Color.WHITE);
                    btnD.setBackgroundColor(Color.WHITE);
                }
                else
                {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Wrong", Toast.LENGTH_LONG).show();
                    btnB.setBackgroundColor(Color.RED);
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numA==2) {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Correct!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Correct", Toast.LENGTH_LONG).show();
                    btnC.setBackgroundColor(Color.GREEN);
                    btnButton.setClickable(true);
                    btnA.setClickable(false);
                    btnB.setClickable(false);
                    btnD.setClickable(false);
                    btnB.setBackgroundColor(Color.WHITE);
                    btnD.setBackgroundColor(Color.WHITE);
                    btnA.setBackgroundColor(Color.WHITE);
                }
                else
                {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Wrong", Toast.LENGTH_LONG).show();
                    btnC.setBackgroundColor(Color.RED);
                }
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numA==3) {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Correct!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Correct", Toast.LENGTH_LONG).show();
                    btnD.setBackgroundColor(Color.GREEN);
                    btnButton.setClickable(true);
                    btnA.setClickable(false);
                    btnC.setClickable(false);
                    btnB.setClickable(false);
                    btnB.setBackgroundColor(Color.WHITE);
                    btnC.setBackgroundColor(Color.WHITE);
                    btnA.setBackgroundColor(Color.WHITE);
                }
                else
                {
                    final Toast toast = Toast.makeText(getApplicationContext(), "Your Answer is Wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 800);
                    //Toast.makeText(getApplicationContext(), "Your Answer Is Wrong", Toast.LENGTH_LONG).show();
                    btnD.setBackgroundColor(Color.RED);
                }
            }
        });
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetAnswer();
            }
        });

    }
}
