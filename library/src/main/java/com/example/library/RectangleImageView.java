package com.example.library;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;

public class RectangleImageView extends AppCompatImageView {

    /**
     * This Constructor is used by java
     *
     * @param context Holding the reference of an activity.
     */
    public RectangleImageView(Context context) {
        super(context);
    }

    /**
     * This Constructor is used by XML.
     *
     * @param context Holding the reference of an activity.
     * @param attrs The attrs set for setting different properties from XML.
     */
    public RectangleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * To determine the size requirements for this view and all of its children.
     *
     * <p>Fetch the size from {@link View#getMeasuredWidth()} and {@link View#getMeasuredHeight()}
     * than set the dimension for rectangle image view.</p>
     *
     * @see {@link View#setMeasuredDimension(int, int)}
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
        setMeasuredDimension(size, (size/2));
    }
}
