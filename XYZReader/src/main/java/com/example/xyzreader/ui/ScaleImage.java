package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.android.volley.toolbox.NetworkImageView;

/**
 * Created by schmidegv on 2018. 07. 18..
 */

public class ScaleImage extends NetworkImageView {

    public ScaleImage(Context context) {
        super(context);
    }

    public ScaleImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScaleImage(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int twoThirdHeight = MeasureSpec.getSize(widthMeasureSpec) *2/3;
        int twoThirdHeightSpec = MeasureSpec.makeMeasureSpec(twoThirdHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, twoThirdHeightSpec);
    }
}
