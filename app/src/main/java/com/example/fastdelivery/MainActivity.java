package com.example.fastdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list1;
    List<Productos> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1= findViewById(R.id.lista_items);
        lista= new ArrayList<Productos>();
        llenadatos();
        Adapta dp= new Adapta(MainActivity.this,0,lista);
        list1.setAdapter(dp);


       /* String dep[]={"pollo_a_la_brasa","pizza","tallarines_al_alfredo","torta_helada"};
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
*/
    }

    void llenadatos(){
        lista.add(new Productos("Pizza",50,R.drawable.pizza));
        lista.add(new Productos("Pollo a la brasa",70,R.drawable.pollo_a_la_brasa));
        lista.add(new Productos("Tallarines al Alfredo",30,R.drawable.tallarines_al_alfredo));
        lista.add(new Productos("Torta Helada",25,R.drawable.torta_helada));
    }
    public void compra(View v){
        String cad="";
        double suma=0, precio;
        TextView texttit,txtpre;
        try{
        int can=list1.getAdapter().getCount()-1;
        for(int f=0;f<can;f++){
            ViewGroup fila = (ViewGroup)list1.getChildAt(f);
            CheckBox ck= (CheckBox) fila.findViewById(R.id.chk1);
            if(ck.isChecked()){
                texttit=(TextView)fila.findViewById(R.id.txttit);
                txtpre=(TextView)fila.findViewById(R.id.txtprecio);
                precio= Double.parseDouble(txtpre.getText().toString());
                suma +=precio;
                cad= cad+texttit.getText().toString()+"--"+txtpre.getText().toString()+ "\n";
            }
            }
            cad= cad+"\n total pago:"+suma;
            Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_LONG).show();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}