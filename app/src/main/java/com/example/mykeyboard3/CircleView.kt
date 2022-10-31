package com.example.mykeyboard3
import android.animation.ObjectAnimator
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
    val paintcircle = Paint().apply{
         color = Color.GRAY
    }
    val painttext = Paint().apply {
        color = Color.BLACK
        textSize = 50f
    }
    private val char: String = resources.getString(R.string.circle1)
    private val centre = PointF(100f,100f)
    override fun onDraw(canvas: Canvas?) {
        canvas?.drawCircle(centre.x,centre.y,100f,paintcircle)
        canvas?.drawText(char,centre.x-12,centre.y+12,painttext)
    }
}