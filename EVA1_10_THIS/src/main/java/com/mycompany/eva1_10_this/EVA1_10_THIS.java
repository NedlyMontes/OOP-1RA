/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_this;

/**
 *
 * @author USER
 */
public class EVA1_10_THIS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


public class Persona(){
    private String nombre;
    private String apellidos;
    private int edad;
                
public Persona(){
    This.nombre = "SIN NOMBRE";        
    This.apellidos = "SIN NOMBRE";
    This.edad = 0;

 public void SetNombre (String nombre){
     this.nombre = nombre;
}
 public String getNombre(){
     return this.nombre;
 }    
 public void Setapellido(String apellido){
     this.apellidos = apellidos;
}
     
 public String getApellidos(){
     return this.Apellidos; 
 }     
 
 public void SetEdad(String Edad){
     this.Edad = Edad;
}
     
 public String getEdad(){
     return this.Edad;
}
}

