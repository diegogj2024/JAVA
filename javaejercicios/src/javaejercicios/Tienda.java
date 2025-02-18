/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Tienda {
    static int A=1000;
    static int V=2000;
    static int E=3000;
    
    public Tienda(){
        Scanner objTeclado= new Scanner(System.in);
        System.out.println("ingrese el tipo de producto (A,V o E");
        String tipo= objTeclado.nextLine();
        int cantidad; 
        do {
           System.out.println("Ingrese la cantidad de productos");
           cantidad = objTeclado.nextInt();
           if (cantidad<=0){
               System.out.println("el numero es menor a 0");
           }
        } while (cantidad <= 0);
        
        Tienda.procesar(tipo,cantidad);
    }
    
    public static void procesar(String tipo,int cantidad){
        int subtotal = 0;
        int descuento;
        int total;
        switch(tipo){
            case "A":
                subtotal=A*cantidad;
                descuento = (int) (subtotal * 0.10);
                total=subtotal-descuento;
                Tienda.imprimir(tipo,cantidad,subtotal,total);
                break;
            case "V":
                subtotal=V*cantidad;
                descuento = (int) (subtotal * 0.05);
                total=subtotal-descuento;
                Tienda.imprimir(tipo,cantidad,subtotal,total);
                break;
            case "E":
                subtotal=E*cantidad;
                total=subtotal;
                Tienda.imprimir(tipo,cantidad,subtotal,total);
                break;
            default:
                System.out.println("este producto no existe");
                break;
        }
    }
    
    public static void imprimir(String tipo,int cantidad,int subtotal,int total){
        System.out.println("tipo:"+tipo);
        System.out.println("cantidad:"+cantidad);
        System.out.println("subtotal:"+subtotal);
        System.out.println("total:"+total);
        
    }
}
