package com.troncodroide.fawesome;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class AwesomeView extends TextView {

    public AwesomeView(Context context) {
        super(context);
        if (!this.isInEditMode()){
            setTypeface(Typeface.createFromAsset(context.getAssets(),"fontawesome.ttf"));
        }
    }
    public AwesomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!this.isInEditMode()){
            setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome.ttf"));
        }
    }

    public AwesomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!this.isInEditMode()){
            setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome.ttf"));
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public AwesomeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        if (!this.isInEditMode()){
            setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome.ttf"));
        }
    }
}

