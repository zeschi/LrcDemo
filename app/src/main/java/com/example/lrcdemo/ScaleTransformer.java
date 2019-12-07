package com.example.lrcdemo;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by chensuilun on 2016/12/16.
 */
public class ScaleTransformer implements GalleryLayoutManager.ItemTransformer {

    private static final String TAG = "CurveTransformer";


    @Override
    public void transformItem(GalleryLayoutManager layoutManager, View item, float fraction) {
        item.setPivotX(item.getWidth() / 2.f);
        item.setPivotY(item.getHeight() / 2.0f);
        float scale = 1 - 0.2f * Math.abs(fraction);
        item.setScaleX(scale);
        item.setScaleY(scale);
        Log.e("fraction", fraction + "");
        TextView textView = item.findViewById(R.id.item_tv_title);

        switch ((int) fraction) {
            case 1:
            case -1:
                textView.setTextColor(Color.parseColor("#D81B60"));
                break;
            case 0:
                textView.setTextColor(Color.parseColor("#FFFFFF"));
                break;

        }

//        if (fraction == 1) {
//        } else {
//        }
    }
}
