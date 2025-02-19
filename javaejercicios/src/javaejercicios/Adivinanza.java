/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;
import java.util.Random;

public class Adivinanza {
    static Scanner objleer = new Scanner(System.in);
    static Random random = new Random();
    static int intentos = 0;
    static int numeroAleatorio = random.nextInt(100) + 1;

    public Adivinanza() {
        String nombre = pedirNombre();
        mostrarSaludo(nombre);
        jugar();
    }

    public static String pedirNombre() {
        System.out.println("Ingrese su nombre:");
        return objleer.nextLine();
    }

    public static void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido querido usuario " + nombre + ", a continuacion adivinaremos un numero del 1 al 100.");
    }

    public static void jugar() {
        int numeroIngresado = 0;
        while (numeroIngresado != numeroAleatorio) {
            System.out.println("Ingrese un numero:");
            numeroIngresado = objleer.nextInt();
            intentos++;
            
            if (numeroIngresado < 1 || numeroIngresado > 100) {
                System.out.println("Numero no valido");
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El numero que buscas es mayor");
            } else if (numeroIngresado > numeroAleatorio) {
                System.out.println("El numero que buscas es menor");
            } else {
                System.out.println("Felicidades Adivinaste el numero " + numeroAleatorio + " en " + intentos + " intentos.");
            }
        }
    }
}

