/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Viajeencoche {
    static Scanner objleer = new Scanner(System.in);
    
    public Viajeencoche() {
        procesar();
    }
    
    public static void procesar() {
        System.out.println("Ingrese su nombre:");
        String nombre = objleer.next();
        mostrarSaludo(nombre);
    }
    
    public static void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido senor: " + nombre);
        calcularViaje();
    }
    
    public static void calcularViaje() {
        String resultado = "si";
        String distancias = "";
        String tiempos = "";
        
        while (resultado.equalsIgnoreCase("si")) {
            System.out.println("Nombre del lugar donde desea ir:");
            String nombreLugar = objleer.next();
            System.out.println("Ingrese la distancia en kilometros:");
            float distancia = objleer.nextFloat();
            System.out.println("Ingrese la velocidad del auto en kilometros por hora:");
            float velocidad = objleer.nextFloat();
            
            if (distancia < 1 || velocidad < 1) {
                System.out.println("ERROR");
            } else {
                float tiempo = distancia / velocidad;
                distancias += distancia + " km, ";
                tiempos += tiempo + " horas, ";
                System.out.println("Tardaras: " + tiempo + " horas en llegar");
            }
            
            System.out.println("Deseas calcular de nuevo (si/no)");
            resultado = objleer.next();
        }
        
        System.out.println("Distancia total recorrida: " + distancias);
        System.out.println("Tiempos registrados: " + tiempos);
    }
}
