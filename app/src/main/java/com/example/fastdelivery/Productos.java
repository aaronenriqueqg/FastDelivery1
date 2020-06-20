package com.example.fastdelivery;

import java.io.Serializable;

public class Productos  implements Serializable {
    private String titulo;
    private double precio;
    private int image1;


    public Productos(String titulo, double precio, int image1) {
        this.titulo = titulo;
        this.precio = precio;
        this.image1 = image1;
    }
    public String getTitulo(){

        return titulo;

    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public double getPrecio(){

        return precio;

    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public int getImage1(){
        return image1;
    }
    public void setImage1(int image1)
    {
        this.image1=image1;
    }



}
