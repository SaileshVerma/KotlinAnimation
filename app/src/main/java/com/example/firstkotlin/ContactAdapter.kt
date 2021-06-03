package com.example.firstkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ContactAdapter(private  var contacts: ArrayList<Contact>,private  var context: Context): BaseAdapter() {



    override fun getCount(): Int {
     return contacts.size
    }

    override fun getItem(p0: Int): Any {
    return  contacts.get(p0);
    }

    override fun getItemId(p0: Int): Long {
return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater;
        var convertview=layoutInflater.inflate(R.layout.row_layout_view,p2,false);
        var t1id=convertview.findViewById<TextView>(R.id.tv1);
        var t2id=convertview.findViewById<TextView>(R.id.tv2);
        var data=getItem(p0) as Contact

         t1id.setText(data.name.get(0).toString());
        t2id.setText(data.name)






        return convertview;


    }

}