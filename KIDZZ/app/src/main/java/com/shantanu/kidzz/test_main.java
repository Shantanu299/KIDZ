package com.shantanu.kidzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class test_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);

        final Button btn_Button_alpha = (Button) findViewById(R.id.button_alphabets);
        btn_Button_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(test_main.this, test_alphabets.class);
                startActivity(i);
            }
        });
        final Button btn_Button_num = (Button) findViewById(R.id.button_numbers);
        btn_Button_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(test_main.this, test_numbers.class);
                startActivity(i);
            }
        });
    }
}


