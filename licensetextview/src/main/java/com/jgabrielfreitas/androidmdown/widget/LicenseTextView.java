package com.jgabrielfreitas.androidmdown.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.jgabrielfreitas.androidmdown.R;

/**
 * Created by JGabrielFreitas on 22/04/16.
 */
@Deprecated
public class LicenseTextView extends TextView {

    private String defaultLicenseColorText = "#333333";
    private String defaultLicenseColorBackground = "#F7F7F7";

    public LicenseTextView(Context context) {
        super(context);
        setFont();
    }

    public LicenseTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        changeAttributes(attrs);
    }

    public LicenseTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        changeAttributes(attrs);
    }

    private void setFont() {
        Typeface fontsStyle = Typeface.createFromAsset(getContext().getAssets(), "fonts/Menlo-Regular.ttf");
        this.setTypeface(fontsStyle,Typeface.BOLD);
    }

    private void changeAttributes(AttributeSet attrs) {
        setFont();

        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.LicenseStyle);
        String textColor = ta.getString(R.styleable.LicenseStyle_licenseColor);
        String backgroundLicense = ta.getString(R.styleable.LicenseStyle_backgroundLicenseColor);

        if (textColor != null)
            setTextColor(Color.parseColor(textColor));
        else
            setTextColor(Color.parseColor(defaultLicenseColorText));

        if(backgroundLicense != null)
            setBackgroundColor(Color.parseColor(backgroundLicense));
        else
            setBackgroundColor(Color.parseColor(defaultLicenseColorBackground));
    }

}
