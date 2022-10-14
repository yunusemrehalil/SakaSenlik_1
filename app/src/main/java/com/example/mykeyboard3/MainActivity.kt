package com.example.mykeyboard3

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.text.InputType
import android.util.Log
import android.util.SparseArray
import android.util.SparseIntArray
import android.view.View
import com.example.mykeyboard3.databinding.ActivityMainBinding
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import kotlinx.coroutines.android.awaitFrame

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private var keyValues= SparseArray<String>()
    var code = StringBuilder()
    private lateinit var binding: ActivityMainBinding
   // private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

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