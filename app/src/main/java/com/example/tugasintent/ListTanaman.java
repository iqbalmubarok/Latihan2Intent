package com.example.tugasintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListTanaman extends AppCompatActivity {

    ListView listview;
    ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tanaman);
        listview = (ListView) findViewById(R.id.listview);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, list);
        listview.setAdapter(arrayAdapter);
        list.add("Cabe Merah");
        list.add("Cabe Domba");
        list.add("Cabe Keriting");
        list.add("Carolina Pepper");
        list.add("Sawi");
        list.add("Sosin");
        list.add("Bayam");
        list.add("Pakcoy");
        list.add("Kangkung");
        list.add("Tomat");
        list.add("Toge");
        list.add("Tin");
        list.add("Zaitun");
        list.add("Kentang");
        list.add("Bunga Melati");
        list.add("Bunga Mawar");
    }
}
