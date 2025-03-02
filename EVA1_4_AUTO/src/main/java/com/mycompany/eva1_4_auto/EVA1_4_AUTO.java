/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_auto;

/**
 *
 * @author USER
 */
public class EVA1_4_AUTO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
public class Vehiculo {
    //ATRIBUTOS - PRIVADOS
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
   //contructores - metodos
    //metodos - comportamiento
    //get y set
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
        public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
        public double getPrecio(){
        return precio;
    }
    public void setPrecio(double valor){
        precio = valor;
    }
        public int getYear(){
        return year;
    }
    public void setYear(int valor){
        year = valor;
    }
        public String getColor(){
        return color;
    }
    public void setColor(String valor){
        color = valor;
    }
    
    public void imprimirDatos(){
    System.out.println("datos del vehiculo: ");
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año:  " + year);
    System.out.println("Color: " + color);
    System.out.println("precio: " + precio);
    
    
    }
}