package com.example.fastdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Actividad_img extends AppCompatActivity {
TextView res;
ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_img);
        String nom=getIntent().getStringExtra("dato");
        img1= findViewById(R.id.imageView);
        res= findViewById(R.id.txtImagen);
        res.setText(nom);
        int dir= getResources().getIdentifier("drawable/"+nom,null,getOpPackageName());
        img1.setImageResource(dir);
    }
        public void retorna(View v){

            Intent it= new Intent(Actividad_img.this,MainActivity.class);
            startActivity(it);


    }
}