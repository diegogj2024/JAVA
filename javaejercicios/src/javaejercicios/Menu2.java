/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Menu2 {
    public Menu2() {
        Scanner objTeclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = objTeclado.nextLine();
        saludo(nombre);

        int total = pedirPlatos(objTeclado);
        total = pedirBebidas(objTeclado, total);

        mostrarInfo(total);
    }

    public static void saludo(String nombre) {
        System.out.println("Bienvenido, senor " + nombre);
    }

    public static int pedirPlatos(Scanner objTeclado) {
        int subtotalPlatos = 0;
        String plato;

        while (true) {
            System.out.println("Seleccione un plato (pastas, milanesa, carne asada, sopa, Terminar pedido):");
            plato = objTeclado.nextLine().toLowerCase();

            switch (plato) {
                case "pastas":
                    subtotalPlatos += 20000;
                    break;
                case "milanesa":
                    subtotalPlatos += 30000;
                    break;
                case "carne asada":
                    subtotalPlatos += 24000;
                    break;
                case "sopa":
                    subtotalPlatos += 18000;
                    break;
                case "terminar pedido":
                    System.out.println("Ud decidio terminar el pedido.");
                    return subtotalPlatos;
                default:
                    System.out.println("Error: opcion invalida.");
            }
        }
    }

    public static int pedirBebidas(Scanner objTeclado, int total) {
        int subtotalBebidas = 0;
        String bebida;

        while (true) {
            System.out.println("Seleccione una bebida (cocacola, malteada, jugo de fresa, agua, Terminar pedido):");
            bebida = objTeclado.nextLine().toLowerCase();

            switch (bebida) {
                case "cocacola":
                    subtotalBebidas += 2500;
                    break;
                case "malteada":
                    subtotalBebidas += 5000;
                    break;
                case "jugo de fresa":
                    subtotalBebidas += 6000;
                    break;
                case "agua":
                    subtotalBebidas += 1200;
                    break;
                case "terminar pedido":
                    System.out.println("Ud decidio terminar el pedido.");
                    return total + subtotalBebidas;
                default:
                    System.out.println("Error: opcion invalida.");
            }
        }
    }

    public static void mostrarInfo(int total) {
        System.out.println("El total a pagar es: " + total + " pesos.");
    }
}

