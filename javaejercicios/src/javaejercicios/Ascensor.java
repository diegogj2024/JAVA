/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Ascensor {
    
    public Ascensor(){
        Scanner objleer=new Scanner(System.in);
        System.out.println("ingrese al piso al que desee ir");
        int piso=objleer.nextInt();
        Ascensor.procesar(piso);
        
    }
    
    public static void procesar(int piso){
        String resultado;
        if (piso>0 && piso<11){
            resultado=("en camino al piso:"+piso);
         
    }
        else{
            resultado=("este piso no existe");
        }
        Ascensor.imprimir(resultado);
    }
    
    
    public static void imprimir(String resultado){
        System.out.println(resultado);
        
    }
}
