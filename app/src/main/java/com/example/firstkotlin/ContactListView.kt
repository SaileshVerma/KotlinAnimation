package com.example.firstkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterViewAnimator
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


        contactListView.setOnItemClickListener(AdapterView.OnItemClickListener()
        {
            adapterView:AdapterView<*>, view1:View, i:Int, l:Long ->  //for sending data ie navigation like argumnets passing

            var position=adapterView.selectedItemPosition
            var contacts=contacts.get(position);
            var bundle=Bundle()
            bundle.putString("name",contacts.name)
            intent=Intent(this,DetailActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent);

        });



    }
}