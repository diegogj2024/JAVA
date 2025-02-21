/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class RegistradorTareas {
    static Scanner objTeclado = new Scanner(System.in);
    public RegistradorTareas() {
        pedirNombreYSaludar();
    }

    public static void pedirNombreYSaludar() {
        System.out.println("Ingrese su nombre");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido al registrador de tareas senor(a) " + nombre);
        hacerProceso();
    }

    public static void hacerProceso() {
        StringBuilder tareas = new StringBuilder();
        StringBuilder vencimientos = new StringBuilder();
        String resultado;
        
        do {
            System.out.println("Ingrese el nombre de la tarea");
            String nombretarea = objTeclado.nextLine();
            System.out.println("Ingrese el vencimiento de la tarea en letras nada de numeros");
            String vencimiento = objTeclado.nextLine();
            
            tareas.append(nombretarea).append(", ");
            vencimientos.append(vencimiento).append(", ");
            
            System.out.println("Desea ingresar otra tarea si NO");
            resultado = objTeclado.nextLine();
            
        } while (resultado.equalsIgnoreCase("si"));

        System.out.println("Adios");
        mostrarInfo(tareas.toString(), vencimientos.toString());
    }
    
    public static void mostrarInfo(String tareas, String vencimientos) {
        System.out.println("Las tareas registradas fueron " + tareas + " y las fechas de vencimiento son " + vencimientos);
    }
}