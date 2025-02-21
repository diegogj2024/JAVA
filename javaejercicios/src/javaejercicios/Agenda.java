/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Agenda {
    static Scanner objTeclado = new Scanner(System.in);
    public Agenda() {
        pedirNombre();
    }

    public static void pedirNombre() {
        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido a la agenda, senor(a): " + nombre);
        int n;
        
        while (true) {
            System.out.println("Ingrese la cantidad de numeros que quiere agregar:");
            n = objTeclado.nextInt();
            objTeclado.nextLine();
            
            if (n < 1) {
                System.out.println("Debe ser un numero mayor a 0");
            } else {
                break;
            }
        }
        
        hacerProceso(n);
    }

    public static void hacerProceso(int n) {
        StringBuilder nombres = new StringBuilder();
        StringBuilder telefonos = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el nombre del contacto " + i + ":");
            String nombreContacto = objTeclado.nextLine();
            
            System.out.println("Ingrese el numero de telefono " + i + ":");
            String telefono = objTeclado.nextLine();
            
            nombres.append(nombreContacto).append(", ");
            telefonos.append(telefono).append(", ");
        }
        
        mostrarInfo(nombres.toString(), telefonos.toString());
    }
    
    public static void mostrarInfo(String nombres, String telefonos) {
        System.out.println("El nombre de los contactos registrados es: " + nombres);
        System.out.println("Los numeros son: " + telefonos);
    }
}