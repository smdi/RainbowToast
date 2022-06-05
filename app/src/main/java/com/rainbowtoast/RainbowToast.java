package com.rainbowtoast;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

import java.util.Timer;
import java.util.TimerTask;


public class RainbowToast {

    private static int colorChooser = 0;
    private static final int DELAY_TIMER = 0;
    private static int cancelTimer = DELAY_TIMER;
    private static final int RUN_INTERVAL = 1000;
    private static final int STOP_AFTER = 4000;
    public static final String LITE = "LITE";
    public static final String DARK = "DARK";
    public static final int LENGTH_SHORT = 2;
    public static final int LENGTH_LONG = 4;

    public static void showToast(Activity activity, String titleData, String messageData, int duration, String mode) {

        View view = LayoutInflater.from(activity)
                .inflate(R.layout.rainbow_toast_layout, null);
        Timer timer = new Timer();
        MaterialCardView materialCardView = view.findViewById(R.id.rainbowCard);
        MaterialCardView materialCardView2 = view.findViewById(R.id.rainbowCard2);
        MaterialCardView materialCardView3 = view.findViewById(R.id.rainbowCard3);
        MaterialCardView materialCardView4 = view.findViewById(R.id.rainbowCard4);
        MaterialCardView materialCardView5 = view.findViewById(R.id.rainbowCard5);
        TextView title = view.findViewById(R.id.rainbowTitle);
        TextView message = view.findViewById(R.id.rainbowMessage);
        Toast toast = new Toast(activity);

        callColorChanger(activity, timer, mode, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5);
        title.setText(titleData);
        message.setText(messageData);
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(view);
        toast.show();
    }
    private static void setColorToCardStrokeLite(Activity activity, String mode, MaterialCardView... materialCardView){

        if(mode.equals(DARK)){

        }else{
            materialCardView[0].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card_lite_stroke_lite));
            materialCardView[1].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card2_lite_stroke_lite));
            materialCardView[2].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card3_lite_stroke_lite));
            materialCardView[3].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card4_lite_stroke_lite));
            materialCardView[4].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card5_lite_stroke_lite));
        }
    }
    private static void setColorToCardStrokeDark(Activity activity, String mode, MaterialCardView... materialCardView){

        if(mode.equals(DARK)){

        }else{
            materialCardView[0].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card_lite_stroke_dark));
            materialCardView[1].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card2_lite_stroke_dark));
            materialCardView[2].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card3_lite_stroke_dark));
            materialCardView[3].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card4_lite_stroke_dark));
            materialCardView[4].setStrokeColor(activity.getResources().getColor(R.color.rainbow_card5_lite_stroke_dark));
        }
    }

    private static void callColorChanger(Activity activity,  Timer timer, String mode, MaterialCardView... materialCardView){

        timer.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                if(colorChooser == 0){
                    colorChooser = 1;
                    setColorToCardStrokeLite(activity, mode, materialCardView);
                }
                else {
                    colorChooser = 0;
                    setColorToCardStrokeDark(activity, mode, materialCardView);
                }
                cancelTimer += RUN_INTERVAL;
                if(cancelTimer >= STOP_AFTER){
                    timer.cancel();
                    colorChooser = 0;
                    cancelTimer = DELAY_TIMER;
                }
            }
        },DELAY_TIMER,RUN_INTERVAL);
    }
}
