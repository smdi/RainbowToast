package com.rainbowtoast;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;


public class RainbowToast {


    public static final String LITE = "LITE";
    public static final String DARK = "DARK";
    public static final int LENGTH_SHORT = 2;
    public static final int LENGTH_LONG = 4;

    public static void showToast(Activity activity, String titleData, String messageData, int duration, String mode) {

        View view = LayoutInflater.from(activity)
                .inflate(R.layout.rainbow_toast_layout, null);

        MaterialCardView materialCardView = view.findViewById(R.id.rainbowCard);
        TextView title = view.findViewById(R.id.rainbowTitle);
        TextView message = view.findViewById(R.id.rainbowMessage);
        Toast toast = new Toast(activity);

        title.setText(titleData);
        message.setText(messageData);
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(view);
        toast.show();
    }

}
