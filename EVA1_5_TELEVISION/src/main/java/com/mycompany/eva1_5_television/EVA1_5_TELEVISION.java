/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_television;

/**
 *
 * @author USER
 */
public class EVA1_5_TELEVISION {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
      private boolean encendido;
      private int volumen;
      private int canal;
      
      public void encenderApagar(){
          if(encendido == true)//TV encendida
              encendido = false; //apaga la TV
          else 
              encendido = true;
      }
      //VOLUMEN REQUIERE DOS METODOS: SUBIR Y BAJAR VOLUMEN
      public void subirVolumen(){
          volumen += 1; //acumulador --> volumen = volumen + 1;
      }
       public void bajarVolumen(){
          volumen -= 1; //acumulador --> volumen = volumen + 1;
      }
      
      
public void imprimirDatos(){
    if(encendido == true)
        System.out.println("TV Apagada");
    else
        System.out.println("TV Apagada");
    System.out.println("volumen: " + volumen );
}
