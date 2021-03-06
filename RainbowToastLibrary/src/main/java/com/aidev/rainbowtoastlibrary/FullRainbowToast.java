package com.aidev.rainbowtoastlibrary;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.card.MaterialCardView;

import java.util.Timer;
import java.util.TimerTask;

public class FullRainbowToast {

    private static int colorChooser = 0;
    private static final int DELAY_TIMER = 0;
    private static int cancelTimer = DELAY_TIMER;
    private static final int RUN_INTERVAL = 1000;
    private static int stopAfter = 0;
    private static final int STOP_AFTER2K = 1500;
    private static final int STOP_AFTER4K = 3500;
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;
    public static final int DEFAULT_FONT = 0;

    public static void showToast(Activity activity, String titleData, String messageData,
                                 int duration, int titleFont, int messageFont) {

        View view = LayoutInflater.from(activity)
                .inflate(R.layout.full_rainbow_toast_layout, null);
        Timer timer = new Timer();
        MaterialCardView materialCardView = view.findViewById(R.id.rainbowCard);
        MaterialCardView materialCardView2 = view.findViewById(R.id.rainbowCard2);
        MaterialCardView materialCardView3 = view.findViewById(R.id.rainbowCard3);
        MaterialCardView materialCardView4 = view.findViewById(R.id.rainbowCard4);
        MaterialCardView materialCardView5 = view.findViewById(R.id.rainbowCard5);

        TextView title = view.findViewById(R.id.rainbowTitle);
        TextView message = view.findViewById(R.id.rainbowMessage);

        setFontByCheckingDefault(activity, titleFont, messageFont, title, message);

        if(duration == LENGTH_LONG){
            stopAfter = STOP_AFTER4K;
        }else {
            stopAfter = STOP_AFTER2K;
        }

        setColorToText(activity, title, message, materialCardView);
        callColorChanger(activity, timer, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5);

        Toast toast = new Toast(activity);
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(view);
        toast.show();
    }

    private static void setFontByCheckingDefault(Activity activity, int titleFont, int messageFont, TextView title, TextView message) {
        if(titleFont != DEFAULT_FONT) setFontForTitle(activity, titleFont, title);
        if(messageFont != DEFAULT_FONT) setFontForMessage(activity, messageFont, message);
    }

    private static void setFontForMessage(Activity activity, int messageFont, TextView message) {
        Typeface fontMessage = ResourcesCompat.getFont(activity, messageFont);
        message.setTypeface(fontMessage);
    }

    private static void setFontForTitle(Activity activity, int titleFont, TextView title) {
        Typeface fontTitle = ResourcesCompat.getFont(activity, titleFont);
        title.setTypeface(fontTitle);
    }

    private static void setColorToText(Activity activity, TextView title, TextView message, MaterialCardView materialCardView) {

        title.setTextColor(activity.getResources().getColor(R.color.fr_custom_title_text_color_lite));
        message.setTextColor(activity.getResources().getColor(R.color.fr_para_text_color_lite));
        materialCardView.setCardBackgroundColor(activity.getResources().getColor(R.color.fr_card_backgroud_custom_lite));

    }

    private static void setColorToCardStrokeLite(Activity activity, MaterialCardView... materialCardView){

        materialCardView[0].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card_lite_stroke_lite));
        materialCardView[1].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card2_lite_stroke_lite));
        materialCardView[2].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card3_lite_stroke_lite));
        materialCardView[3].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card4_lite_stroke_lite));
        materialCardView[4].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card5_lite_stroke_lite));

    }
    private static void setColorToCardStrokeDark(Activity activity, MaterialCardView... materialCardView){

        materialCardView[0].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card_lite_stroke_dark));
        materialCardView[1].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card2_lite_stroke_dark));
        materialCardView[2].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card3_lite_stroke_dark));
        materialCardView[3].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card4_lite_stroke_dark));
        materialCardView[4].setStrokeColor(activity.getResources().getColor(R.color.fr_rainbow_card5_lite_stroke_dark));

    }

    private static void callColorChanger(Activity activity, Timer timer, MaterialCardView... materialCardView){

        timer.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                if(colorChooser == 0){
                    colorChooser = 1;
                    setColorToCardStrokeLite(activity, materialCardView);
                }
                else {
                    colorChooser = 0;
                    setColorToCardStrokeDark(activity, materialCardView);
                }
                cancelTimer += RUN_INTERVAL;
                if(cancelTimer >= stopAfter){
                    timer.cancel();
                    colorChooser = 0;
                    cancelTimer = DELAY_TIMER;
                }
            }
        },DELAY_TIMER,RUN_INTERVAL);
    }
}
