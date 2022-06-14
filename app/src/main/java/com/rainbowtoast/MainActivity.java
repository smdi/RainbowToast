package com.rainbowtoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        callRainbowToast(this);
    }

    private void callRainbowToast(MainActivity mainActivity) {

        Button success = mainActivity.findViewById(R.id.Success);
        Button error = mainActivity.findViewById(R.id.Error);
        Button warning = mainActivity.findViewById(R.id.Warning);
        Button info = mainActivity.findViewById(R.id.Info);
        Button custom = mainActivity.findViewById(R.id.Custom);
        Button fullRainbow= mainActivity.findViewById(R.id.FullRainbow);

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RainbowToast.showToast(mainActivity, "Greetings", "Welcome to FairyLand", RainbowToast.LENGTH_LONG, RainbowToast.SUCCESS, RainbowToast.LITE);
            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RainbowToast.showToast(mainActivity, "Hemlock", "Poisoned by witch", RainbowToast.LENGTH_LONG, RainbowToast.ERROR, RainbowToast.LITE);
            }
        });

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RainbowToast.showToast(mainActivity, "Hound", "Peeped by witch", RainbowToast.LENGTH_LONG, RainbowToast.WARNING, RainbowToast.LITE);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RainbowToast.showToast(mainActivity, "Aspirin", "Medicine is in the cave", RainbowToast.LENGTH_LONG, RainbowToast.INFO, RainbowToast.LITE);
            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RainbowToast.showToast(mainActivity, "Hint", "Grab the Magic Wand", RainbowToast.LENGTH_LONG, RainbowToast.CUSTOM, RainbowToast.LITE);
            }
        });

        fullRainbow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullRainbowToast.showToast(mainActivity, "Blessed", "Great, You've escaped from witch and won chocolates & candies", FullRainbowToast.LENGTH_LONG);
            }
        });

    }
}