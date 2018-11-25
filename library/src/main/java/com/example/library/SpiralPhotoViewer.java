package com.example.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Spiral Photo Viewer
 *
 * @author Fazal Hussain
 * @version 1.1
 */

public class SpiralPhotoViewer extends ViewGroup {

    /**
     * This constructor is used by java for constructing a {@link SpiralPhotoViewer}
     *
     * @param context Holding the reference of an activity.
     */
    public SpiralPhotoViewer(Context context) {
        super(context);
    }

    /**
     * This constructory is user by xml for constructing views
     *
     * @param context Holding the reference of an activity.
     * @param attrs   The attributes sets i.e set from xml.
     */
    public SpiralPhotoViewer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //measure the children
        measureChildren(widthMeasureSpec, heightMeasureSpec);
        //get the first children
        View first = getChildAt(0);
        //Fetch the size
        int size = first.getMeasuredWidth() + first.getMeasuredHeight();
        int width = ViewGroup.resolveSize(size, widthMeasureSpec);
        int height = ViewGroup.resolveSize(size, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }

    /**
     * Loop the child count of the View Group and position the child according the
     * x and y position {@link View#layout(int, int, int, int)}
     *
     *
     * @param l left position.
     * @param t top position.
     * @param r right position.
     * @param b bottom position.
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //Get the first child of the view group and fetch the measure width & height
        View first = getChildAt(0);
        int childWidth = first.getMeasuredWidth();
        int childHeight = first.getMeasuredHeight();


        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            int x = 0;
            int y = 0;
            switch (i) {
                case 1: {
                    x = childWidth;
                    y = 0;
                    break;
                }

                case 2: {
                    x = childHeight;
                    y = childWidth;
                    break;
                }

                case 3: {
                    x = 0;
                    y = childHeight;
                }
            }

            child.layout(x, y, x + child.getMeasuredWidth(), y + child.getMeasuredHeight());
        }
    }
}
