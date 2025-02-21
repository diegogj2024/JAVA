/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;


import java.util.Scanner;

public class Tiendavirtual {
    static Scanner objTeclado = new Scanner(System.in);
    public Tiendavirtual() {
        pedirNombreYSaludar();
    }

    public static void pedirNombreYSaludar() {
        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido, señor(a): " + nombre);
        int n;
        
        while (true) {
            System.out.println("Ingrese el número de productos que desea comprar:");
            n = objTeclado.nextInt();
            objTeclado.nextLine();
            
            if (n < 1) {
                System.out.println("Ingrese un número mayor a 0");
            } else {
                break;
            }
        }
        
        hacerProceso(n);
    }

    public static void hacerProceso(int n) {
        StringBuilder productos = new StringBuilder();
        double total = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el nombre del producto " + i + ":");
            String nombreProducto = objTeclado.nextLine();
            
            double precio;
            while (true) {
                System.out.println("Ingrese el precio:");
                precio = objTeclado.nextDouble();
                objTeclado.nextLine();
                
                if (precio < 1) {
                    System.out.println("Error, número inválido");
                } else {
                    break;
                }
            }
            
            productos.append(nombreProducto).append(", ");
            total += precio;
        }
        
        mostrarInfo(productos.toString(), total);
    }
    
    public static void mostrarInfo(String productos, double total) {
        System.out.println("Los productos comprados fueron: " + productos);
        System.out.println("El costo total de los productos es de: " + total);
    }
}

