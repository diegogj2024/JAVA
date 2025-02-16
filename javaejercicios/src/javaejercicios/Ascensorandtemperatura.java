/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;


public class Ascensorandtemperatura {
     public Ascensorandtemperatura(){
        Scanner objleer=new Scanner(System.in);
        System.out.println("ingrese al piso al que desee ir");
        int piso=objleer.nextInt();
        System.out.println("ingrese la temperactura actual");
        int temperatura=objleer.nextInt();
        Ascensorandtemperatura.procesar(piso,temperatura);
    }
    
      public static void procesar(int piso,int temperatura){
        String resultado;
        if (piso>0 && piso<11 && temperatura>10 && temperatura<30){
            resultado=("temperatura adecuada y piso disponible ....en camino al piso:"+piso);
        }else if (temperatura<10 || temperatura>30){
            resultado=("temperatura inadecuada");
        }else{
            resultado=("este piso no existe");
        }
        Ascensorandtemperatura.imprimir(resultado);
    }
      public static void imprimir(String resultado){
        System.out.println(resultado);
        
    }
}
