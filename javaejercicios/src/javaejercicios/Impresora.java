/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Impresora {
    static Scanner objleer = new Scanner(System.in);
    
    public Impresora() {
        procesar();
    }
    
    public static void procesar() {
        System.out.println("Capacidad maxima: 50 hojas");
        System.out.println("Ingrese la capacidad de hojas en la impresora:");
        int capacidadHojas = objleer.nextInt();
        int capacidadPaginas = capacidadHojas * 2;
        int papelRestante = capacidadPaginas;
        
        if (papelRestante < 1 || papelRestante > 100) {
            System.out.println("ERROR");
        } else {
            imprimirProceso(papelRestante);
        }
    }
    
    public static void imprimirProceso(int papelRestante) {
        while (papelRestante > 1 && papelRestante < 101) {
            System.out.println("Paginas disponibles para imprimir: " + papelRestante);
            System.out.println("Ingrese la cantidad de paginas a imprimir (0 para salir):");
            int cantidadPaginas = objleer.nextInt();
            
            if (cantidadPaginas > papelRestante || cantidadPaginas < 1) {
                System.out.println("No hay suficiente papel o el numero ingresado es inválido");
                papelRestante = 0;
            } else {
                System.out.println("Imprimiendo " + cantidadPaginas + " paginas...");
                papelRestante -= cantidadPaginas;
                System.out.println("Quedan " + papelRestante + " paginas restantes");
            }

            if (papelRestante < 1) {
                System.out.println("Llene la bandeja de papel");
                break;
            }
        }
    }
}
