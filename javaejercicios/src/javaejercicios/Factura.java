/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Factura {
    String  nombre;
    int precio;
    int cantidad;
    String rol;
    public Factura(){
       Scanner objTeclado= new Scanner(System.in);
       System.out.println("ingrese el nombre producto");
       nombre=objTeclado.nextLine();
       System.out.println("ingrese el precio del producto");
       precio=objTeclado.nextInt();
       System.out.println("ingrese la cantidad del producto");
       cantidad=objTeclado.nextInt();
       objTeclado.nextLine();
       System.out.println("¿eres estudiante?");
       rol=objTeclado.nextLine();
       Factura.procesar(nombre,precio,cantidad,rol);
       objTeclado.close();
       
    }
    
    public static void procesar(String nombre,int precio,int cantidad,String rol){
        int subtotal = precio * cantidad;
        int total;
         if (rol.equalsIgnoreCase("si")) {
            int impuesto = (int) (0.05 * subtotal);
            total = subtotal + impuesto;
            rol = "estudiante";
        } else {
            int impuesto = (int) (0.13 * subtotal);
            total = subtotal + impuesto;
            rol = "persona normal";
        }
         Factura.imprimir(nombre, precio, cantidad, rol, subtotal, total);
    }
    
    public static void imprimir(String nombre,int precio,int cantidad,String rol,int subtotal,int total){
        System.out.println("nombre producto:"+nombre);
        System.out.println("precio producto:"+precio);
        System.out.println("cantidad producto:"+cantidad);
        System.out.println("rol cliente:"+rol);
        System.out.println("subtotal:"+subtotal);
        System.out.println("total:"+total);

    }
}
