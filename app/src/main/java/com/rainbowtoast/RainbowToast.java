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
    private static int stopAfter = 0;
    private static final int STOP_AFTER2K = 2000;
    private static final int STOP_AFTER4K = 4000;
    public static final String SUCCESS = "SUCCESS";
    public static final String ERROR = "ERROR";
    public static final String WARNING = "WARNING";
    public static final String INFO = "INFO";
    public static final String CUSTOM = "CUSTOM";
    public static final String LITE = "LITE";
    public static final String DARK = "DARK";
    public static final int LENGTH_SHORT = 2;
    public static final int LENGTH_LONG = 4;

    public static void showToast(Activity activity, String titleData, String messageData, int duration, String type, String mode) {

        View view = LayoutInflater.from(activity)
                .inflate(R.layout.rainbow_toast_layout, null);
        Timer timer = new Timer();
        MaterialCardView materialCardView = view.findViewById(R.id.rainbowCard);
        TextView title = view.findViewById(R.id.rainbowTitle);
        TextView message = view.findViewById(R.id.rainbowMessage);
        Toast toast = new Toast(activity);

        if(duration == LENGTH_LONG){
            stopAfter = STOP_AFTER4K;
        }else{
            stopAfter = STOP_AFTER2K;
        }

        setColorByType(view, activity, type, mode, materialCardView, title, message);
        callColorChanger(view, activity, materialCardView, timer, type, mode);
        title.setText(titleData);
        message.setText(messageData);
        toast.setDuration(duration);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setView(view);
        toast.show();
    }

    private static void setColorToCard(MaterialCardView materialCardView, Activity activity, int colorBackground, int colorStroke, TextView title, int titleColor){
        title.setTextColor(activity.getResources().getColor(titleColor));
        materialCardView.setCardBackgroundColor(activity.getResources().getColor(colorBackground));
        materialCardView.setStrokeColor(activity.getResources().getColor(colorStroke));
    }

    private static void setColorByType(View view, Activity activity, String type, String mode, MaterialCardView materialCardView, TextView title, TextView message) {


        if(mode.equals(DARK)){
            message.setTextColor(activity.getResources().getColor(R.color.dark_title_para_text_color));
            switch (type) {
                case SUCCESS:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_success_dark, R.color.card_stroke_success_dark, title, R.color.dark_title_para_text_color);
                    break;
                case ERROR:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_error_dark, R.color.card_stroke_error_dark, title, R.color.dark_title_para_text_color);
                    break;
                case WARNING:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_warning_dark, R.color.card_stroke_warning_dark, title, R.color.dark_title_para_text_color);
                    break;
                case INFO:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_info_dark, R.color.card_stroke_info_dark, title, R.color.dark_title_para_text_color);
                    break;
                default:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_custom_dark, R.color.card_stroke_custom_dark, title, R.color.dark_title_para_text_color);
                    break;
            }
        }else{
            message.setTextColor(activity.getResources().getColor(R.color.para_text_color_lite));
            switch (type) {
                case SUCCESS:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_success_lite, R.color.card_stroke_success_lite, title, R.color.success_title_text_color_lite);
                    break;
                case ERROR:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_error_lite, R.color.card_stroke_error_lite, title, R.color.error_title_text_color_lite);
                    break;
                case WARNING:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_warning_lite, R.color.card_stroke_warning_lite, title, R.color.warning_title_text_color_lite);
                    break;
                case INFO:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_info_lite, R.color.card_stroke_info_lite, title, R.color.info_title_text_color_lite);
                    break;
                default:
                    setColorToCard(materialCardView, activity, R.color.card_backgroud_custom_lite, R.color.card_stroke_custom_lite, title, R.color.custom_title_text_color_lite);
                    break;
            }
        }

    }

    private static void setColorToCardStrokeLite(MaterialCardView materialCardView, Activity activity, String type, String mode){

        if(mode.equals(DARK)){
            switch (type) {
                case SUCCESS:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_success_dark_stoke_lite));
                    break;
                case ERROR:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_error_dark_stoke_lite));
                    break;
                case WARNING:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_warning_dark_stoke_lite));
                    break;
                case INFO:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_info_dark_stoke_lite));
                    break;
                default:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_custom_dark_stoke_lite));
                    break;
            }
        }else{
            switch (type) {
                case SUCCESS:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_success_lite_stoke_lite));
                    break;
                case ERROR:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_error_lite_stoke_lite));
                    break;
                case WARNING:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_warning_lite_stoke_lite));
                    break;
                case INFO:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_info_lite_stoke_lite));
                    break;
                default:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_custom_lite_stoke_lite));
                    break;
            }
        }
    }
    private static void setColorToCardStrokeDark(MaterialCardView materialCardView, Activity activity, String type, String mode){

        if(mode.equals(DARK)){
            switch (type) {
                case SUCCESS:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_success_dark));
                    break;
                case ERROR:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_error_dark));
                    break;
                case WARNING:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_warning_dark));
                    break;
                case INFO:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_info_dark));
                    break;
                default:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_custom_dark));
                    break;
            }
        }else{
            switch (type) {
                case SUCCESS:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_success_lite_stoke_dark));
                    break;
                case ERROR:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_error_lite_stoke_dark));
                    break;
                case WARNING:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_warning_lite_stoke_dark));
                    break;
                case INFO:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_info_lite_stoke_dark));
                    break;
                default:
                    materialCardView.setStrokeColor(activity.getResources().getColor(R.color.card_stroke_custom_lite_stoke_dark));
                    break;
            }
        }
    }

    private static void callColorChanger(View view, Activity activity, MaterialCardView materialCardView, Timer timer, String type, String mode){

        timer.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                if(colorChooser == 0){
                    colorChooser = 1;
                    setColorToCardStrokeLite(materialCardView,  activity,  type, mode);
                }
                else {
                    colorChooser = 0;
                    setColorToCardStrokeDark(materialCardView,  activity,  type, mode);
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
