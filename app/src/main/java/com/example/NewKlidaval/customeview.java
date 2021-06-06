package com.example.NewKlidaval;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class customeview  extends View {
    public customeview(Context context) {
        super(context);
    }

    public customeview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public customeview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public customeview(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.parseColor("#30ACE1"));
        paint.setStyle(Paint.Style.FILL);
        Path path=new Path();
        path.moveTo(0,getHeight()/11);
//        path.rCubicTo(0,getHeight()/20,getWidth()/2,getHeight()/25,getWidth(),getHeight()/10);
       path.quadTo(getWidth()/2,0,getWidth(),getHeight()/11);
        path.lineTo(getWidth(),getHeight());
        path.lineTo(0,getHeight());
        path.lineTo(0,getHeight()/11);
        canvas.drawPath(path,paint);
    }
}
