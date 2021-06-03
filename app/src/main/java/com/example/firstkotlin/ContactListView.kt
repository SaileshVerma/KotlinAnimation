package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ContactListView : AppCompatActivity() {
    private lateinit var contactListView: ListView;
    private lateinit var contacts: ArrayList<Contact>;
    private  lateinit var adapter:ContactAdapter;

    
    fun init(){
        contactListView=findViewById(R.id.listviewid)

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
        setContentView(R.layout.activity_contact_list_view)

init()
initData()

        adapter=ContactAdapter(contacts,this)
        contactListView.adapter=adapter;
    }
}