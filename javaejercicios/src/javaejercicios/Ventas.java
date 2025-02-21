/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Ventas {
    static Scanner objTeclado = new Scanner(System.in);
    public Ventas() {
        pedirNombreYSaludar();
    }

    public static void pedirNombreYSaludar() {
        System.out.println("Ingrese su nombre");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido al registrador de productos senor(a) " + nombre);
        hacerProceso();
    }

    public static void hacerProceso() {
        StringBuilder productos = new StringBuilder();
        double totalCosto = 0;
        String resultado;
        
        do {
            System.out.println("Ingrese el nombre del producto");
            String producto = objTeclado.nextLine();
            System.out.println("Ingrese el precio");
            double precio = objTeclado.nextDouble();
            objTeclado.nextLine();
            
            if (precio < 1) {
                System.out.println("Precio invalido");
            } else {
                productos.append(producto).append(", ");
                totalCosto += precio;
            }
            
            System.out.println("Desea agregar otro producto si NO");
            resultado = objTeclado.nextLine();
        } while (resultado.equalsIgnoreCase("si"));
        
        System.out.println("Adios");
        mostrarInfo(productos.toString(), totalCosto);
    }
    
    public static void mostrarInfo(String productos, double totalCosto) {
        System.out.println("Los productos registrados fueron " + productos + " y el costo total es " + totalCosto);
    }
}
