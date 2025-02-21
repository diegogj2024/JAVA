/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class RegistroVehiculos {
    static Scanner objTeclado = new Scanner(System.in);
    public RegistroVehiculos() {
        pedirNombreYSaludar();
    }

    public static void pedirNombreYSaludar() {
        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        System.out.println("Bienvenido, senor(a): " + nombre);
        int n;
        
        while (true) {
            System.out.println("Ingrese el numero de vehiculos que ingresan:");
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
        StringBuilder placas = new StringBuilder();
        StringBuilder horas = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el numero de la placa del vehiculo " + i + ":");
            String placa = objTeclado.nextLine();
            
            int hora;
            while (true) {
                System.out.println("Ingrese la hora de ingreso en formato 24 horas:");
                hora = objTeclado.nextInt();
                objTeclado.nextLine(); 
                
                if (hora < 1 || hora > 24) {
                    System.out.println("Hora invalida");
                } else {
                    break;
                }
            }
            
            placas.append(placa).append(", ");
            horas.append(hora).append(" horas, ");
        }
        
        mostrarInfo(placas.toString(), horas.toString());
    }
    
    public static void mostrarInfo(String placas, String horas) {
        System.out.println("Los vehiculos registrados son: " + placas + "\nHora de ingreso: " + horas);
    }
}

