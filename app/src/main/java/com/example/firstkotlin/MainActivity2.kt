package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     var rotateObj=findViewById<Button>(R.id.rotate)   //creating all layouts objects
     var textviewobj=findViewById<TextView>(R.id.text1)


        rotateObj.setOnClickListener(){
            //on click this should happend


            var animationObj=AnimationUtils.loadAnimation(this,R.anim.rotate)  //animation object of our define object

            textviewobj.startAnimation(animationObj)   // to whooom we need to apply the animation we define hhere

        }



    }
}