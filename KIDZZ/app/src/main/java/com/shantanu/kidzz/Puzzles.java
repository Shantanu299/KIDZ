package com.shantanu.kidzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Puzzles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzles);


        final Button btn_Button_alpha=(Button)findViewById(R.id.shar);
        btn_Button_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Puzzles.this,test_main.class);
                startActivity(i);
            }
        });

        final Button btn_Button_drawing=(Button)findViewById(R.id.shan);
        btn_Button_drawing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Puzzles.this,test_drawing.class);
                startActivity(j);
            }
        });
    }
}
