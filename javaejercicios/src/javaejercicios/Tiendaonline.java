/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Tiendaonline {
    static Scanner objleer = new Scanner(System.in);
    
    public Tiendaonline() {
        procesar();
    }
    
    public static void procesar() {
        int acumulador1 = 0;
        String resultado = "si";
        String acumuladorProductos = "";
        
        while (resultado.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nombre del producto:");
            String nombreProducto = objleer.nextLine();
            
            System.out.println("Ingrese el precio del producto:");
            int precio = objleer.nextInt();
            
            System.out.println("Ingrese la cantidad de productos:");
            int cantidad = objleer.nextInt();
            objleer.nextLine();
            
            acumuladorProductos += " " + nombreProducto;
            int precioAcumulado = precio * cantidad;
            acumulador1 += precioAcumulado;
            
            System.out.println("Desea agregar mas productos (si/no)");
            resultado = objleer.nextLine();
        }
        
        imprimir(acumuladorProductos, acumulador1);
    }
    
    public static void imprimir(String acumuladorProductos, int acumulador1) {
        System.out.println("Sus productos son:" + acumuladorProductos);
        System.out.println("El precio total es: " + acumulador1);
    }
}