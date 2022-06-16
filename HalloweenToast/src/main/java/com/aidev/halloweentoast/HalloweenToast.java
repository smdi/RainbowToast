package com.aidev.halloweentoast;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.res.ResourcesCompat;

import java.util.Timer;
import java.util.TimerTask;

public class HalloweenToast {

    private static int colorChooser = 0;
    private static final int DELAY_TIMER = 0;
    private static int cancelTimer = DELAY_TIMER;
    private static final int RUN_INTERVAL = 1000;
    private static int stopAfter = 0;
    private static final int STOP_AFTER2K = 1500;
    private static final int STOP_AFTER4K = 3500;
    public static final String SUCCESS = "SUCCESS";
    public static final String ERROR = "ERROR";
    public static final String WARNING = "WARNING";
    public static final String INFO = "INFO";
    public static final String CUSTOM = "CUSTOM";
    public static final String LITE = "LITE";
    public static final String DARK = "DARK";
    public static final int LENGTH_SHORT = 0;
    public static final int LENGTH_LONG = 1;


    public static void showToast(Activity activity, String titleData, String messageData, int duration,
                                 String type, String mode, int titleFont, int messageFont) {

        View view = LayoutInflater.from(activity)
                .inflate(R.layout.halloween_toast_layout, null);
        
        Timer timer = new Timer();
        
        TextView title = view.findViewById(R.id.rainbowTitle);
        TextView message = view.findViewById(R.id.rainbowMessage);

        Typeface fontTitle = ResourcesCompat.getFont(activity, titleFont);
        Typeface fontMessage = ResourcesCompat.getFont(activity, messageFont);


        if(duration == LENGTH_LONG){
            stopAfter = STOP_AFTER4K;
        }else{
            stopAfter = STOP_AFTER2K;
        }

        title.setTypeface(fontTitle);
        message.setTypeface(fontMessage);

        title.setText(titleData);
        message.setText(messageData);

        ImageView halloweenToastImage = view.findViewById(R.id.halloweenBat);

        callColorChanger(activity, halloweenToastImage, timer, type, mode);
        setBackgroundByType(activity, type, mode, halloweenToastImage);
        setColorByType(activity, type, mode, title, message);

        Toast toast = new Toast(activity);
        toast.setDuration(duration);
        toast.setView(view);
        toast.show();
    }

    private static Drawable getDrawableData(Activity activity, int styleHalloweenScene){
        final ContextThemeWrapper wrapper = new ContextThemeWrapper(activity, styleHalloweenScene);
        return ResourcesCompat.getDrawable(activity.getResources(), R.drawable.ht_default_bg, wrapper.getTheme());
    }

    private static void setBackgroundByType(Activity activity, String type, String mode, ImageView halloweenToastImage) {
        if(mode.equals(DARK)){
            switch (type) {
                case SUCCESS:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_success_dark_scene));
                    break;
                case ERROR:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_error_dark_scene));
                    break;
                case WARNING:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_warning_dark_scene));
                    break;
                case INFO:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_info_dark_scene));
                    break;
                default:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_custom_dark_scene));
                    break;
            }
        }else{
            switch (type) {
                case SUCCESS:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_success_lite_scene));
                    break;
                case ERROR:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_error_lite_scene));
                    break;
                case WARNING:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_warning_lite_scene));
                    break;
                case INFO:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_info_lite_scene));
                    break;
                default:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_custom_lite_scene));
                    break;
            }
        }
    }

    private static void setColorToCard(Activity activity, TextView title, int titleColor){
        title.setTextColor(activity.getResources().getColor(titleColor));
    }

    private static void setColorByType(Activity activity, String type, String mode, TextView title, TextView message) {

        if(mode.equals(DARK)){
            title.setTextColor(activity.getResources().getColor(R.color.ht_title_para_text_color_dark));
            message.setTextColor(activity.getResources().getColor(R.color.ht_title_para_text_color_dark));

        }else{
            message.setTextColor(activity.getResources().getColor(R.color.ht_para_text_color_lite));
            switch (type) {
                case SUCCESS:
                    setColorToCard(activity, title, R.color.ht_success_title_text_color_lite);
                    break;
                case ERROR:
                    setColorToCard(activity, title, R.color.ht_error_title_text_color_lite);
                    break;
                case WARNING:
                    setColorToCard(activity, title, R.color.ht_warning_title_text_color_lite);
                    break;
                case INFO:
                    setColorToCard(activity, title, R.color.ht_info_title_text_color_lite);
                    break;
                default:
                    setColorToCard(activity, title, R.color.ht_custom_title_text_color_lite);
                    break;
            }
        }
    }

    private static void setColorToCardStrokeLite(ImageView halloweenToastImage, Activity activity, String type, String mode){
        if(mode.equals(DARK)){
            switch (type) {
                case SUCCESS:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_success_dark_lite_scene));
                    break;
                case ERROR:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_error_dark_lite_scene));
                    break;
                case WARNING:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_warning_dark_lite_scene));
                    break;
                case INFO:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_info_dark_lite_scene));
                    break;
                default:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_custom_dark_lite_scene));
                    break;
            }
        }else{
            switch (type) {
                case SUCCESS:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_success_lite_lite_scene));
                    break;
                case ERROR:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_error_lite_lite_scene));
                    break;
                case WARNING:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_warning_lite_lite_scene));
                    break;
                case INFO:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_info_lite_lite_scene));
                    break;
                default:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_custom_lite_lite_scene));
                    break;
            }
        }
    }

    private static void setColorToCardStrokeDark(ImageView halloweenToastImage, Activity activity, String type, String mode){
        if(mode.equals(DARK)){
            switch (type) {
                case SUCCESS:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_success_dark_dark_scene));
                    break;
                case ERROR:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_error_dark_dark_scene));
                    break;
                case WARNING:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_warning_dark_dark_scene));
                    break;
                case INFO:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_info_dark_dark_scene));
                    break;
                default:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_custom_dark_dark_scene));
                    break;
            }
        }else{
            switch (type) {
                case SUCCESS:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_success_lite_dark_scene));
                    break;
                case ERROR:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_error_lite_dark_scene));
                    break;
                case WARNING:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_warning_lite_dark_scene));
                    break;
                case INFO:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_info_lite_dark_scene));
                    break;
                default:
                    halloweenToastImage.setImageDrawable(getDrawableData(activity, R.style.ht_custom_lite_dark_scene));
                    break;
            }
        }
    }

    private static void callColorChanger(Activity activity, ImageView halloweenToastImage, Timer timer, String type, String mode) {
        timer.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                if(colorChooser == 0){
                    colorChooser = 1;
                    setColorToCardStrokeLite(halloweenToastImage,  activity,  type, mode);
                }
                else {
                    colorChooser = 0;
                    setColorToCardStrokeDark(halloweenToastImage,  activity,  type, mode);
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
