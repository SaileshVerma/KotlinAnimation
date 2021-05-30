package com.example.firstkotlin

import android.content.Context
import android.os.*
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class mainActivity: AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
         setContentView(R.layout.vibrlayout)
        var btn=findViewById<Button>(R.id.btn1);

        btn.setOnClickListener(){
            var vibr=getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibr.vibrate(VibrationEffect.createOneShot(300,VibrationEffect.DEFAULT_AMPLITUDE))
        }





    }

}