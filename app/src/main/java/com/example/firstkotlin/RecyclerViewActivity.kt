package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var contactListView: RecyclerView;
    private lateinit var contacts: ArrayList<Contact>;
    private  lateinit var adapter:ContactAdapter;

    fun init(){
        contactListView=findViewById(R.id.recyclerViewId)

    }
    fun initData(){
        contacts= ArrayList();
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))
        contacts.add(Contact("Sailesh"))

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
    }




}