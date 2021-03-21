package com.Work.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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