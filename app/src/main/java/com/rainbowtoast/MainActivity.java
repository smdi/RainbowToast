package com.rainbowtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add enum for type and interface for duration
        showToast(MainActivity.this, "Success", "Connection Established Successfully!", 4, "Success" );
    }

    public void showToast(Activity activity, String titleData, String messageData, int duration, String type) {

        View view = LayoutInflater.from(activity)
                    .inflate(R.layout.rainbow_toast_layout, null);

        TextView title = view.findViewById(R.id.rainbowTitle);
        title.setText(titleData);

        TextView message = view.findViewById(R.id.rainbowMessage);
        message.setText(messageData);

        //check type and add colors
        Toast toast = new Toast(activity);
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(view);
        toast.show();
    }
}