package com.rainbowtoast;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RainbowToast.showToast(this, "Treat", "You have won chocolates and candy!",
                RainbowToast.LENGTH_LONG, RainbowToast.LITE );
    }
}