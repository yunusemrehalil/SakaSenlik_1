package com.example.mykeyboard3


import android.animation.ObjectAnimator
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.mykeyboard3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        var height1: Int = resources.displayMetrics.heightPixels
        var width1: Int = resources.displayMetrics.widthPixels
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            circle_btn_1.setOnClickListener()
            {
                edittexts.append("1")
                ObjectAnimator.ofFloat(circle_btn_1, "translationY", 770f).apply {
                duration=800L
                start()
            }
                ObjectAnimator.ofFloat(circle_btn_1, "translationY", 400f).apply {
                    duration=800L
                    startDelay = 800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_1, "translationY", 650f).apply {
                    duration=800L
                    startDelay = 1600L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_1, "translationY", 500f).apply {
                    duration=800L
                    startDelay = 2400L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_1, "translationY", 550f).apply {
                    duration=800L
                    startDelay = 3200L
                    start()
                }
            }
            circle_btn_2.setOnClickListener()
            {
                edittexts.append("2")
                ObjectAnimator.ofFloat(circle_btn_2, "translationY", 770f).apply {
                    duration=800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_2, "translationY", 400f).apply {
                    duration=800L
                    startDelay = 800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_2, "translationY", 650f).apply {
                    duration=800L
                    startDelay = 1600L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_2, "translationY", 500f).apply {
                    duration=800L
                    startDelay = 2400L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_2, "translationY", 550f).apply {
                    duration=800L
                    startDelay = 3200L
                    start()
                }
            }
            circle_btn_3.setOnClickListener()
            {
                edittexts.append("3")
                ObjectAnimator.ofFloat(circle_btn_3, "translationY", 770f).apply {
                    duration=800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_3, "translationY", 400f).apply {
                    duration=800L
                    startDelay = 800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_3, "translationY", 650f).apply {
                    duration=800L
                    startDelay = 1600L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_3, "translationY", 500f).apply {
                    duration=800L
                    startDelay = 2400L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_3, "translationY", 550f).apply {
                    duration=800L
                    startDelay = 3200L
                    start()
                }
            }
            circle_btn_4.setOnClickListener()
            {
                edittexts.append("4")
                ObjectAnimator.ofFloat(circle_btn_4, "translationY", 770f).apply {
                    duration=800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_4, "translationY", 400f).apply {
                    duration=800L
                    startDelay = 800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_4, "translationY", 650f).apply {
                    duration=800L
                    startDelay = 1600L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_4, "translationY", 500f).apply {
                    duration=800L
                    startDelay = 2400L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_4, "translationY", 550f).apply {
                    duration=800L
                    startDelay = 3200L
                    start()
                }
            }
            circle_btn_5.setOnClickListener()
            {
                edittexts.append("5")
                ObjectAnimator.ofFloat(circle_btn_5, "translationY", 770f).apply {
                    duration=800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_5, "translationY", 400f).apply {
                    duration=800L
                    startDelay = 800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_5, "translationY", 650f).apply {
                    duration=800L
                    startDelay = 1600L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_5, "translationY", 500f).apply {
                    duration=800L
                    startDelay = 2400L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_5, "translationY", 550f).apply {
                    duration=800L
                    startDelay = 3200L
                    start()
                }
            }
            circle_btn_6.setOnClickListener()
            {
                edittexts.append("6")
                ObjectAnimator.ofFloat(circle_btn_6, "translationY", 770f).apply {
                    duration=800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_6, "translationY", 400f).apply {
                    duration=800L
                    startDelay = 800L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_6, "translationY", 650f).apply {
                    duration=800L
                    startDelay = 1600L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_6, "translationY", 500f).apply {
                    duration=800L
                    startDelay = 2400L
                    start()
                }
                ObjectAnimator.ofFloat(circle_btn_6, "translationY", 550f).apply {
                    duration=800L
                    startDelay = 3200L
                    start()
                }
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
        }
    }
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onClick(v: View?)  {
        setContentView(binding.root)
        binding.apply {

        }
    }
    fun DeleteText(view: View) {
        var len:Int = edittexts.length()
        if(len>0)
        {
            var newString:String = edittexts.text.toString().substring(0,len-1)
            edittexts.setText(newString)
        }
    }
}