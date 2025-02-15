/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Ascensorkg {
    
    public Ascensorkg(){
        Scanner objleer=new Scanner(System.in);
        System.out.println("ingrese al piso al que desee ir");
        int piso=objleer.nextInt();
        System.out.println("ingrese su peso");
        int peso=objleer.nextInt();
        Ascensorkg.procesar(piso,peso);
    }
    
      public static void procesar(int piso,int peso){
        String resultado;
        if (piso>0 && piso<11 && peso>0 && peso<100){
            resultado=("peso adecuado y piso disponible ....en camino al piso:"+piso);
        }else if (peso<0 || peso>100){
            resultado=("peso inadecuado");
        }else{
            resultado=("este piso no existe");
        }
        Ascensor.imprimir(resultado);
    }
      public static void imprimir(String resultado){
        System.out.println(resultado);
        
    }
        
}
