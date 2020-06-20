package com.example.fastdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1= findViewById(R.id.lista_items);
        String dep[]={"pollo_a_la_brasa","pizza","tallarines_al_alfredo","torta_helada"};
        ArrayAdapter<String> dp=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dep);
        list1.setAdapter(dp);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                try{
                    String nom= list1.getItemAtPosition(pos).toString();

                    Intent it= new Intent(MainActivity.this, Actividad_img.class);
                    it.putExtra("dato",nom);
                    startActivity(it);
                }
                catch(Exception ex){

                }
            }
        });

    }
}