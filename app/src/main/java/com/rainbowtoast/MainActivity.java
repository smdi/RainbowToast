package com.rainbowtoast;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RainbowToast.showToast(this, "Delete", "Connection terminated successfully!",
                RainbowToast.LENGTH_LONG, RainbowToast.ERROR, RainbowToast.LITE );
    }
}