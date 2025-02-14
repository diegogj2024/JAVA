/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Factura {
    String  nombre;
    int precio;
    public Factura(){
       Scanner objTeclado= new Scanner(System.in);
       System.out.println("ingrese el nombre producto");
       nombre=objTeclado.nextLine();
       System.out.println("ingrese el precio del producto");
       precio=objTeclado.nextInt();
       
    }
    
    public void imprimir(){
        System.out.println("nombre producto:"+nombre);
        System.out.println("precio producto:"+precio);
    }
}
