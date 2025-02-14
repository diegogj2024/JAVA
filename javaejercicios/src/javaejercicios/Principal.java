/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner objleer=new Scanner(System.in);
       System.out.println("ingrese el numero del ejercicio que desee probar rango(1 a 20)");
       int opcion=objleer.nextInt();
       switch(opcion){
           case 1: 
               Factura objFactura=new Factura();
           default:
               System.out.println("este ejercicio no existe");
       }
    }
    
}
