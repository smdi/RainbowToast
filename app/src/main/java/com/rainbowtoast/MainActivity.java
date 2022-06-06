package com.rainbowtoast;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HalloweenToast.showToast(this, "Success", "Connection established successfully!",
                HalloweenToast.LENGTH_SHORT, HalloweenToast.SUCCESS, HalloweenToast.LITE );
    }
}