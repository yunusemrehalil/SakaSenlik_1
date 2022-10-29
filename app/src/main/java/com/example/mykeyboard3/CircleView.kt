package com.example.mykeyboard3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.PointF
import android.util.AttributeSet
import android.view.View


public class CircleView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    val paint = Paint().apply{
         color = Color.RED
    }
    val paint1 = Paint().apply {
        color = Color.BLACK
        textSize = 50f
    }

    private val centre = PointF(50f,50f)
    override fun onDraw(canvas: Canvas?) {
        canvas?.drawCircle(centre.x,centre.y,50f,paint)
        canvas?.drawText("1",centre.x-12,centre.y+12,paint1)
    }
}