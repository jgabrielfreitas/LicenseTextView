package com.jgabrielfreitas.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.jgabrielfreitas.androidmdown.R;

import static android.graphics.Typeface.BOLD;

/**
 * Created by JGabrielFreitas on 21/10/16.
 */

public class LicenseTextView extends AbstractRelativeLayout {

    TextView license;
    private String defaultLicenseColorText = "#333333";
    private String defaultLicenseColorBackground = "#F7F7F7";

    public LicenseTextView(Context context) {
        super(context);
    }

    public LicenseTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LicenseTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private void setFont() {
        Typeface fontsStyle = Typeface.createFromAsset(getContext().getAssets(), "fonts/Menlo-Regular.ttf");
        license.setTypeface(fontsStyle, BOLD);
    }

    @Override
    protected void init(AttributeSet attrs) {
        super.init(attrs);

        license = (TextView) view.findViewById(R.id.license);

        if (attrs != null)
            configureView(attrs);
    }

    @Override
    protected int getLayout() {
        return R.layout.license_textview;
    }

    @Override
    protected void configureView(AttributeSet attrs) {
        super.configureView(attrs);

        setFont();

        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.LicenseStyle);
        String textColor = ta.getString(R.styleable.LicenseStyle_licenseColor);
        String backgroundLicense = ta.getString(R.styleable.LicenseStyle_backgroundLicenseColor);

        if (textColor != null)
            license.setTextColor(Color.parseColor(textColor));
        else
            license.setTextColor(Color.parseColor(defaultLicenseColorText));

        if (backgroundLicense != null)
            setBackgroundColor(Color.parseColor(backgroundLicense));
        else
            setBackgroundColor(Color.parseColor(defaultLicenseColorBackground));
    }
}
