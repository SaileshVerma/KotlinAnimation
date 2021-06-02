package com.example.firstkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)


        var text1=findViewById<EditText>(R.id.ctext1);
        var cbtn=findViewById<Button>(R.id.cbtn3);

        var bndle=intent.extras;
        var data=bndle?.getString("name");


        text1.setText(data);



        cbtn.setOnClickListener(){

            var name=text1.text.toString();
            var bndle=Bundle();
            bndle!!.putString("data",name);
            var intent=Intent();
            intent.putExtras(bndle!!)  //sending the name back to parent activity
            setResult(Activity.RESULT_OK,intent);
            finish();

        }


    }
}


