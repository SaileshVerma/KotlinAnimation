package com.example.firstkotlin

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class FirstScreen : AppCompatActivity(),Animation.AnimationListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        var txtobj=findViewById<TextView>(R.id.hello)
        var rotobj=findViewById<Button>(R.id.rot1)
        var scalobj=findViewById<Button>(R.id.scal1)




        rotobj.setOnClickListener(){

            var anime=AnimationUtils.loadAnimation(this,R.anim.rotate)
           anime.setAnimationListener(this);


            txtobj.startAnimation(anime);



        }

        scalobj.setOnClickListener(){
            var animObjj=AnimationUtils.loadAnimation(this,R.anim.scale)
            txtobj.startAnimation(animObjj)


        }


    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
      var intent=Intent(this,MainActivity2::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_out,android.R.anim.slide_in_left)
    }

    override fun onAnimationRepeat(p0: Animation?) {

    }


}