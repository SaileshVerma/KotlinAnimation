package com.example.firstkotlin

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.core.app.ActivityCompat

class Intent_Permissionns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_intent_permissionns)
        requestPermission();
        var callbtn=findViewById<Button>(R.id.callbtn)
        var browserbtn=findViewById<Button>(R.id.browserbtn);
        var camerabtn=findViewById<Button>(R.id.camerabtn);

        var phntext=findViewById<EditText>(R.id.phn);
        var imgView=findViewById<ImageView>(R.id.imgView);
        var urltxt=findViewById<EditText>(R.id.url);


        callbtn.setOnClickListener(){

            var number=phntext.text.toString();
            var intent=Intent(Intent.ACTION_CALL)

            intent.setData(Uri.parse("tel:+91$number"));
            startActivity(intent);

        }
        camerabtn.setOnClickListener(){

            var intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,300);

        }

        browserbtn.setOnClickListener(){

            var url=urltxt.text.toString();
            var intent=Intent(Intent.ACTION_VIEW)

            intent.setData(Uri.parse("http://$url"));
            startActivity(intent);

        }


    }

    fun requestPermission(){
        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE),100);

        }
        if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CAMERA)!=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),200);

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==300&&resultCode==Activity.RESULT_OK&&data!=null){

            var imgbitmap=data.extras?.get("data") as Bitmap;


           var imgView=findViewById<ImageView>(R.id.imgView)
            imgView.setImageBitmap(imgbitmap);



        }



    }


}