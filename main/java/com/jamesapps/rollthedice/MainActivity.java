package com.jamesapps.rollthedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] dice={R.drawable.one,
               R.drawable.two,
               R.drawable.three,
               R.drawable.four,
               R.drawable.five,
               R.drawable.six
    };

    public void rollTapped(View view)
    {

        Random random=new Random();
        int randomNumber=random.nextInt(6);
        ImageView img= (ImageView) findViewById(R.id.dice);
        img.clearAnimation();
        img.setImageResource(dice[randomNumber]);
        img.animate().rotationYBy(180);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
