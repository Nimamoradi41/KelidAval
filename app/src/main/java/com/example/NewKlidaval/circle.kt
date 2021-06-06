package com.example.NewKlidaval

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class circle(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) :
    View(context, attrs, defStyleAttr, defStyleRes) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var p=Paint()
        p.color=Color.BLACK
        p.style=Paint.Style.STROKE
        canvas?.drawCircle(width/2f,height/2f,width/2f,p)
    }
}