package com.rainbowtoast;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        callHalloweenToast(this);
    }

    private void callHalloweenToast(MainActivity activity) {

        Button success = activity.findViewById(R.id.Success);
        Button error = activity.findViewById(R.id.Error);
        Button warning = activity.findViewById(R.id.Warning);
        Button info = activity.findViewById(R.id.Info);
        Button custom = activity.findViewById(R.id.Custom);


        success.setOnClickListener(v ->
                HalloweenToast.showToast(activity, "Sunrise", "You've survived the demons",
                HalloweenToast.LENGTH_LONG, HalloweenToast.SUCCESS, HalloweenToast.LITE,
                        R.font.eater_regular, R.font.fontdinerswanky_regular));

        error.setOnClickListener(v ->
                HalloweenToast.showToast(activity, "Danger", "You're surrounded by demons",
                HalloweenToast.LENGTH_LONG, HalloweenToast.ERROR, HalloweenToast.LITE,
                        R.font.eater_regular, R.font.fontdinerswanky_regular));

        warning.setOnClickListener(v ->
                HalloweenToast.showToast(activity, "Warning", "You've awoken the demons",
                HalloweenToast.LENGTH_LONG, HalloweenToast.WARNING, HalloweenToast.LITE,
                        R.font.eater_regular, R.font.fontdinerswanky_regular));

        info.setOnClickListener(v ->
                HalloweenToast.showToast(activity, "Spell", "Chant the magical spell on demons",
                HalloweenToast.LENGTH_LONG, HalloweenToast.INFO, HalloweenToast.LITE,
                        R.font.eater_regular, R.font.fontdinerswanky_regular));

        custom.setOnClickListener(v ->
                HalloweenToast.showToast(activity, "Hint", "Disguise yourself in the dark",
                HalloweenToast.LENGTH_LONG, HalloweenToast.CUSTOM, HalloweenToast.LITE,
                        R.font.eater_regular, R.font.fontdinerswanky_regular));

    }
}