package com.example.compund;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;


public class HorizontalNumberPicker  extends LinearLayout {
    public HorizontalNumberPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
 
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      //layoutInflater.inflate(R.layout.main, this,true);
    }
}