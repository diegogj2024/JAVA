/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Calificaciones {
    static Scanner objTeclado = new Scanner(System.in);
    public Calificaciones() {
        pedirNombre();
    }

    public static void pedirNombre() {
        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        mostrarSaludoYProceso(nombre);
    }

    public static void mostrarSaludoYProceso(String nombre) {
        System.out.println("Bienvenido, senor(a): " + nombre);
        double acum = 0;
        int suma = 0;
        String resultado;
        
        do {
            System.out.println("Ingrese su calificacion:");
            double nota = objTeclado.nextDouble();
            
            if (nota < 1) {
                System.out.println("Numero invalido");
            } else {
                acum += nota;
                suma++;
            }
            
            System.out.println("Desea ingresar otra nota (si/NO)");
            objTeclado.nextLine();
            resultado = objTeclado.nextLine();
            
        } while (resultado.equalsIgnoreCase("si"));
        
        System.out.println("Adios");
        
        double promedio = acum / suma;
        mostrarInfo(promedio);
    }

    public static void mostrarInfo(double promedio) {
        if (promedio > 3.5) {
            System.out.println("Felicitaciones, aprobaste con " + promedio);
        } else {
            System.out.println("No aprobaste, tu promedio es " + promedio);
        }
    }
}


