package com.example.library;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Customize Image View
 *
 * @version 1.0
 * @author Fazal Hussain
 */
public class SquareImageView extends AppCompatImageView {

    /**
     * This Constructor is used by java
     *
     * @param context Holding the reference of an activity.
     */
    public SquareImageView(Context context) {
        super(context);
    }

    /**
     * This Constructor is used by XML.
     *
     * @param context Holding the reference of an activity.
     * @param attrs The attrs set for setting different properties from XML.
     */
    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * Measure the height and width of the views.
     *
     * @param widthMeasureSpec Width measure spec that more like an struct that contains
     *                         more piece of information i.e mode & size. Note that the size in pixel
     * @param heightMeasureSpec Height measure spec that more like an struct that contains
     *                         more piece of information i.e mode & size. Note that the size in pixel
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = Math.min(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(size, size);
    }
}
