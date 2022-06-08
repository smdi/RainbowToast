package com.rainbowtoast;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FullRainbowToast.showToast(this, "Treat", "You have won chocolates and candies!",
                FullRainbowToast.LENGTH_LONG );
    }
}