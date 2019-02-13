package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myButton = findViewById(R.id.button);
        Random r = new Random();
        final int ArrayAsk = r.nextInt(5);
        final ImageView ballImage = findViewById(R.id.image_eightBall);
        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ballImage.setImageResource(ballArray[ArrayAsk]);
            }
        });
        }



    }
