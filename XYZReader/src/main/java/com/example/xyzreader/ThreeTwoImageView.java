package com.example.xyzreader;

import android.content.Context;
import android.util.AttributeSet;

/**
 * TODO: document your custom view class.
 */
public class ThreeTwoImageView extends android.support.v7.widget.AppCompatImageView {
    public ThreeTwoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int desiredHeight = width * 2 / 3;
        super.onMeasure(widthMeasureSpec, MeasureSpec.makeMeasureSpec(desiredHeight, MeasureSpec.EXACTLY));
    }

}
