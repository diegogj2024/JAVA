/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Sensor {
    public Sensor() {
        pedirNombreYSaludar();
    }

    public static void pedirNombreYSaludar() {
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido, senor(a): " + nombre);
        hacerProceso();
    }

    public static void hacerProceso() {
        Scanner objTeclado = new Scanner(System.in);
        System.out.println("Bienvenido al sensor de temperatura");
        double resultado;
        
        while (true) {
            System.out.println("Por favor ingrese la temperatura actual:");
            resultado = objTeclado.nextDouble();
            
            if (resultado < 18 || resultado > 25) {
                System.out.println("Alerta: temperatura no adecuada");
            } else {
                break;
            }
        }
        
        mostrarInfo(resultado);
    }

    public static void mostrarInfo(double resultado) {
        System.out.println("Temperatura adecuada: " + resultado);
    }
}
