package com.jgabrielfreitas.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by JGabrielFreitas on 21/10/16.
 */

public abstract class AbstractRelativeLayout extends RelativeLayout {

    LayoutInflater layoutInflater;
    View view;

    public AbstractRelativeLayout(Context context) {
        super(context);
        init(null);
    }

    public AbstractRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public AbstractRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    /**
     * View layout
     * */
    protected abstract int getLayout();

    protected void init(AttributeSet attrs) {

        layoutInflater = LayoutInflater.from(getContext());
        view = layoutInflater.inflate(getLayout(), this, true);
    }

    protected void configureView(AttributeSet attrs) {}
}
