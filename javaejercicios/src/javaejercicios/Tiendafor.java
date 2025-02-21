/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Tiendafor {
    static Scanner objTeclado = new Scanner(System.in);
    public Tiendafor() {
        pedirNombreYSaludar();
    }

    public static void pedirNombreYSaludar() {
        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido senor(a) " + nombre);
        int n;
        
        while (true) {
            System.out.println("Ingrese el numero de productos a ingresar:");
            n = objTeclado.nextInt();
            objTeclado.nextLine();
            
            if (n < 1) {
                System.out.println("Ingrese un numero mayor a 0");
            } else {
                break;
            }
        }
        
        hacerProceso(n);
    }

    public static void hacerProceso(int n) {
        double totalPagar = 0;
        StringBuilder productos = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el nombre del producto " + i + ":");
            String nombreProducto = objTeclado.nextLine();
            
            System.out.println("Ingrese el precio:");
            double precio = objTeclado.nextDouble();
            
            System.out.println("Ingrese la cantidad:");
            int cantidad = objTeclado.nextInt();
            objTeclado.nextLine();
            
            if (precio < 1 || cantidad < 1) {
                System.out.println("Error: numero invalido");
                i--;
            } else {
                productos.append(nombreProducto).append(", ");
                totalPagar += precio * cantidad;
            }
        }
        
        mostrarInfo(productos.toString(), totalPagar);
    }

    public static void mostrarInfo(String productos, double totalPagar) {
        System.out.println("Los productos comprados fueron: " + productos);
        System.out.println("El total a pagar es: " + totalPagar);
    }
}
