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


        callHalloweenToast(this);
    }

    private void callHalloweenToast(MainActivity mainActivity) {

        Button success = mainActivity.findViewById(R.id.Success);
        Button error = mainActivity.findViewById(R.id.Error);
        Button warning = mainActivity.findViewById(R.id.Warning);
        Button info = mainActivity.findViewById(R.id.Info);
        Button custom = mainActivity.findViewById(R.id.Custom);


        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HalloweenToast.showToast(mainActivity, "Sunrise", "You've survived the demons", HalloweenToast.LENGTH_LONG, HalloweenToast.SUCCESS, HalloweenToast.LITE);
            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HalloweenToast.showToast(mainActivity, "Danger", "You're surrounded by demons", HalloweenToast.LENGTH_LONG, HalloweenToast.ERROR, HalloweenToast.LITE);
            }
        });

        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HalloweenToast.showToast(mainActivity, "Warning", "You've awoken the demons", HalloweenToast.LENGTH_LONG, HalloweenToast.WARNING, HalloweenToast.LITE);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HalloweenToast.showToast(mainActivity, "Spell", "Chant the magical spell on demons", HalloweenToast.LENGTH_LONG, HalloweenToast.INFO, HalloweenToast.LITE);
            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HalloweenToast.showToast(mainActivity, "Hint", "Disguise yourself in the dark", HalloweenToast.LENGTH_LONG, HalloweenToast.CUSTOM, HalloweenToast.LITE);
            }
        });

    }
}