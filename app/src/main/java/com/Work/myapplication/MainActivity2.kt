package com.Work.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import android.Manifest.permission.CAMERA
import android.content.pm.PackageManager

class MainActivity2 : AppCompatActivity() {
    val request_code=101
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button3)
        btn.setOnClickListener {
            if (check()){
                takePhoto()
            }else
            {
                request()
            }
        }
    }
    private fun takePhoto(){
    }
    private fun check():Boolean{
        return ActivityCompat.checkSelfPermission(applicationContext, CAMERA)== PackageManager.PERMISSION_GRANTED
    }
    private fun request(){
        ActivityCompat.requestPermissions(this, arrayOf(CAMERA),request_code)
    }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            request_code->{
                if (grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED)
                {
                    takePhoto()
                }
            }
        }
    }
}