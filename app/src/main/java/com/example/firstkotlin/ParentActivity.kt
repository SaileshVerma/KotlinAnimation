package com.example.firstkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ParentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)
        var text1=findViewById<EditText>(R.id.ptext1);
        var btn1=findViewById<Button>(R.id.pbtn1)
        var btn2=findViewById<Button>(R.id.pbtn2);


        btn2.setOnClickListener(){
            //to get the data from the child activity
            var intent=Intent(this,ChildActivity::class.java);
            startActivityForResult(intent, 100);

        }


        btn1.setOnClickListener(){

            var name=text1.text.toString();
            var bundle=Bundle();
            bundle.putString("name",name);
            var it=Intent(this,ChildActivity::class.java)
            it.putExtras(bundle);
            startActivity(it);



        }





    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==100&&requestCode==Activity.RESULT_OK&&data!=null){

            var bndle= data.extras;//we use to extract value

            var name= bndle?.getString("data");
            var text1=findViewById<EditText>(R.id.ptext1);
            text1.setText(name);

        }
    }

}