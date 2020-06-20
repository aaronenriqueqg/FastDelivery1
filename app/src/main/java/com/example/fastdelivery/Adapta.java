package com.example.fastdelivery;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.security.ProtectionDomain;
import java.util.List;

public class Adapta extends ArrayAdapter<Productos> {



    public Adapta(@NonNull Context context, int resource, @NonNull List<Productos> objects) {
        super(context, resource, objects);


    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       if(convertView==null){
           LayoutInflater inflar= (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView=inflar.inflate(R.layout.activity_vista1,null);
       }
        Productos item = (Productos) getItem(position);

        TextView tit= (TextView)convertView.findViewById(R.id.txttit);
        TextView pre =(TextView)convertView.findViewById(R.id.txtprecio);
        ImageView img= (ImageView)convertView.findViewById(R.id.image1);

        tit.setText(item.getTitulo());
        pre.setText(""+item.getPrecio());
        img.setImageResource(item.getImage1());
        if(item.getPrecio()>200)
            pre.setTextColor(Color.BLUE);
        return convertView;


    }
}
