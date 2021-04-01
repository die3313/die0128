package com.Work.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    var ans ="1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var button = findViewById<Button>(R.id.button)
        var edittext = findViewById<EditText>(R.id.editText)
        var textview = findViewById<TextView>(R.id.textView)

        var value = intent.extras?.getString("user")
        var tv= findViewById<TextView>(R.id.textView2)
        tv.setText("Welcome "+value)

        /*var button2 = findViewById<Button>(android.R.id.button2)
        button2.setOnClickListener{
            fun onClick(v: View?) {
                val intent = Intent()
                intent.setClass(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
            }
        }   這行有問題!!*/


        button.setOnClickListener {
            var guess=edittext.text.toString()
            var nA =0;
            var nB =0;
            for( i in 0..3){
                for (j in 0..3){
                    if ( ans.get(i) == guess.get(j))
                    {
                        if (i==j )
                            nA++
                        else
                            nB++
                    }
                }
            }
            textview.text = nA.toString()+"A"+nB.toString()+"B"
        }

    }

}

