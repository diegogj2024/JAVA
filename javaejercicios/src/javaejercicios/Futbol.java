/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Futbol {
    public Futbol() {
        Scanner objTeclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer equipo:");
        String equipo1 = objTeclado.nextLine();

        int puntosEquipo1 = procesarResultado(equipo1, objTeclado);

        System.out.println("Ingrese el nombre del segundo equipo:");
        String equipo2 = objTeclado.nextLine();

        int puntosEquipo2 = procesarResultado(equipo2, objTeclado);

        imprimirTabla(equipo1, puntosEquipo1, equipo2, puntosEquipo2);
    }

    public static int procesarResultado(String equipo, Scanner objTeclado) {
        String resultado;
        int puntos = 0;

        do {
            System.out.println("Ingrese el resultado de " + equipo + " (ganador, empatado, perdido):");
            resultado = objTeclado.nextLine().toLowerCase();
        } while (!resultado.equals("ganador") && !resultado.equals("empatado") && !resultado.equals("perdido"));

        switch (resultado) {
            case "ganador":
                puntos = 3;
                System.out.println(equipo + " ha ganado y suma 3 puntos.");
                break;
            case "empatado":
                puntos = 1;
                System.out.println(equipo + " ha empatado y suma 1 punto.");
                break;
            case "perdido":
                puntos = 0;
                System.out.println(equipo + " ha perdido y no suma puntos.");
                break;
        }
        return puntos;
    }

    public static void imprimirTabla(String equipo1, int puntos1, String equipo2, int puntos2) {
        System.out.println("\n--- Tabla de Clasificación ---");
        System.out.println(equipo1 + ": " + puntos1 + " puntos");
        System.out.println(equipo2 + ": " + puntos2 + " puntos");
    }

}

