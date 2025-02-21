/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Listanumeros {
    static Scanner objTeclado = new Scanner(System.in);
    public Listanumeros() {
        pedirNombre();
    }
    public static void pedirNombre() {
        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido, señor(a): " + nombre);
        int n;
        
        while (true) {
            System.out.println("Ingrese la cantidad de números que quiere agregar:");
            n = objTeclado.nextInt();
            objTeclado.nextLine();
            if (n < 1) {
                System.out.println("Debe ser un número mayor a 0");
            } else {
                break;
            }
        }
        
        hacerProceso(n);
    }

    public static void hacerProceso(int n) {
        int suma = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = objTeclado.nextInt();
            suma += numero;
        }
        
        mostrarInfo(suma);
    }
    
    public static void mostrarInfo(int suma) {
        System.out.println("La suma de los números es: " + suma);
    }
}

