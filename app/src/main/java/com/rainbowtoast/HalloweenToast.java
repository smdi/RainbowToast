package com.rainbowtoast;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class HalloweenToast {

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
                .inflate(R.layout.halloween_toast_layout, null);

        MaterialCardView materialCardView = view.findViewById(R.id.rainbowCard);

        TextView title = view.findViewById(R.id.rainbowTitle);
        TextView message = view.findViewById(R.id.rainbowMessage);

        title.setText(titleData);
        message.setText(messageData);

        setBackgroundByType(type, mode, materialCardView);
        setColorByType(view, activity, type, mode, materialCardView, title, message);

        Toast toast = new Toast(activity);
        toast.setDuration(duration);
        toast.setView(view);
        toast.show();
    }

    private static void setBackgroundByType(String type, String mode, MaterialCardView materialCardView) {
        if(mode.equals(DARK)){
            switch (type) {
                case SUCCESS:
                    materialCardView.setBackgroundResource(R.drawable.ht_success_bg_dark);
                    break;
                case ERROR:
                    materialCardView.setBackgroundResource(R.drawable.ht_error_bg_dark);
                    break;
                case WARNING:
                    materialCardView.setBackgroundResource(R.drawable.ht_warning_bg_dark);
                    break;
                case INFO:
                    materialCardView.setBackgroundResource(R.drawable.ht_info_bg_dark);
                    break;
                default:
                    materialCardView.setBackgroundResource(R.drawable.ht_custom_bg_dark);
                    break;
            }
        }else{
            switch (type) {
                case SUCCESS:
                    materialCardView.setBackgroundResource(R.drawable.ht_success_bg_lite);
                    break;
                case ERROR:
                    materialCardView.setBackgroundResource(R.drawable.ht_error_bg_lite);
                    break;
                case WARNING:
                    materialCardView.setBackgroundResource(R.drawable.ht_warning_bg_lite);
                    break;
                case INFO:
                    materialCardView.setBackgroundResource(R.drawable.ht_info_bg_lite);
                    break;
                default:
                    materialCardView.setBackgroundResource(R.drawable.ht_custom_bg_lite);
                    break;
            }
        }
    }

    private static void setColorToCard(Activity activity, TextView title, int titleColor){
        title.setTextColor(activity.getResources().getColor(titleColor));
    }

    private static void setColorByType(View view, Activity activity, String type, String mode, MaterialCardView materialCardView, TextView title, TextView message) {


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
}
