/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;
public class Umbral {
    public Umbral(){
        Scanner objleer=new Scanner(System.in);
        System.out.println("ingrese la temperatura actual");
        float temperatura=objleer.nextFloat();
        Umbral.procesar(temperatura);
    }
    public static void procesar(float temperatura){
        String resultado;
        if(temperatura<10 || temperatura>30){
            resultado=("temperatura por fuera de rango evacue!!!");
        }else{
            resultado=("temperatura adecuada");
        }
        Umbral.imprimir(resultado);
    }
     public static void imprimir(String resultado){
        System.out.println(resultado);
     }
}
