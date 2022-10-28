package com.example.mykeyboard3

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.*
import android.media.Image
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.util.AttributeSet
import android.util.SparseArray
import android.view.View
import android.view.ViewPropertyAnimator
import com.example.mykeyboard3.databinding.ActivityMainBinding
import androidx.annotation.RequiresApi
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat.animate
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.coroutines.delay
import kotlin.math.max

private fun generatePath(path: Path, maxh: Float, damp: Float)
{
    var damp1 = damp
    path.lineTo(0f, maxh)

    for (i in 1..8)
    {
        path.lineTo(0f, maxh-maxh/damp1)
        path.lineTo(0f,maxh)
        damp1 *= 2f
    }
}



class MainActivity : AppCompatActivity(),View.OnClickListener {

        private var keyValues= SparseArray<String>()
        var code = StringBuilder()
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        var height1: Int = resources.displayMetrics.heightPixels
        var width1: Int = resources.displayMetrics.widthPixels
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            circle_btn.setOnClickListener(){
                keyValues.put(R.id.circle_btn, "1")
            }


            circle_btn.setOnClickListener(){
            ObjectAnimator.ofFloat(circle_btn, "translationY", 770f).apply {
                duration=800L
                start()
            }
                ObjectAnimator.ofFloat(circle_btn, "translationY", 400f).apply {
                    duration=800L
                    startDelay = 800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn, "translationY", 650f).apply {
                    duration=800L
                    startDelay = 1600L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn, "translationY", 500f).apply {
                    duration=800L
                    startDelay = 2400L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn, "translationY", 550f).apply {
                    duration=800L
                    startDelay = 3200L
                    start()
                }
            }


            animate.setOnClickListener(){
                val animasyon1 = ObjectAnimator.ofFloat(button1,"translationY", 700f)
                val animasyon2 = ObjectAnimator.ofFloat(button2,"translationY", 700f)
                val animasyon3 = ObjectAnimator.ofFloat(button3,"translationY", 700f)
                val animasyon4 = ObjectAnimator.ofFloat(button4,"translationY", 700f)
                val animasyon5 = ObjectAnimator.ofFloat(button5,"translationY", 700f)

                animasyon1.duration = 800
                animasyon2.duration = 800
                animasyon3.duration = 800
                animasyon4.duration = 800
                animasyon5.duration = 800
                animasyon1.start()
                animasyon2.start()
                animasyon3.start()
                animasyon4.start()
                animasyon5.start()
            }

            if(Build.VERSION.SDK_INT >=21) edittexts.showSoftInputOnFocus=false
            else if(Build.VERSION.SDK_INT >=11)
            {
                edittexts.setRawInputType(InputType.TYPE_CLASS_TEXT)
                edittexts.setTextIsSelectable(true)
            }
            else{
                edittexts.setRawInputType(InputType.TYPE_NULL)
                edittexts.isFocusable=true
            }


            button1.setOnClickListener(this@MainActivity)
            button2.setOnClickListener(this@MainActivity)
            button3.setOnClickListener(this@MainActivity)
            button4.setOnClickListener(this@MainActivity)
            button5.setOnClickListener(this@MainActivity)
            button6.setOnClickListener(this@MainActivity)
            button7.setOnClickListener(this@MainActivity)
            button8.setOnClickListener(this@MainActivity)
            button9.setOnClickListener(this@MainActivity)

        }
        keyValues.put(R.id.button1, "1")
        keyValues.put(R.id.button2, "2")
        keyValues.put(R.id.button3, "3")
        keyValues.put(R.id.button4, "4")
        keyValues.put(R.id.button5, "5")
        keyValues.put(R.id.button6, "6")
        keyValues.put(R.id.button7, "7")
        keyValues.put(R.id.button8, "8")
        keyValues.put(R.id.button9, "9")
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onClick(v: View?)  {
        var value =keyValues.get(v!!.id)
        setContentView(binding.root)
        binding.apply {
            code.append(value)
            edittexts.setText(code)

        }
    }

}