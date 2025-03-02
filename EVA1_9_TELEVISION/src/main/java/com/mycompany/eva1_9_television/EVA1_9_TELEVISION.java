/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_television;

/**
 *
 * @author USER
 */
public class EVA1_9_TELEVISION {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
public class TELEVISION {
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
       
}