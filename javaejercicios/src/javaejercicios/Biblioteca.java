package javaejercicios;

import java.util.Scanner;

public class Biblioteca {
    static Scanner objScanner = new Scanner(System.in);
    static int contador;
    static String acumular = " ";
    static String acumulador1 = " ";
    static String acumulador = " ";
    
    public Biblioteca() {
        System.out.println("Bienvenido a la biblioteca Leeme Esta");
        Procesar();
    }
    
    public static void Procesar() {
        String resultado;
        String nombrelibro;
        String autor;
        int paginas;

        do {
            System.out.println("Desea registrar algun libro (SI/NO)");
            resultado = objScanner.nextLine().trim();

            if (resultado.equalsIgnoreCase("SI")) {
                contador++;
                System.out.println("Ingrese el nombre del libro " + contador + ":");
                nombrelibro = objScanner.nextLine();
                System.out.println("Ingrese el autor:");
                autor = objScanner.nextLine();
                System.out.println("Ingrese la cantidad de paginas:");
                
                while (!objScanner.hasNextInt()) {
                    System.out.println("Error, ingrese un numero valido de paginas:");
                    objScanner.next();
                }
                
                paginas = objScanner.nextInt();
                objScanner.nextLine();
                
                if (paginas < 1) {
                    System.out.println("Error, numero de paginas invalido");
                    contador--;
                } else {
                    acumular += nombrelibro + ", ";
                    acumulador1 += autor + ", ";
                    acumulador += paginas + ", ";
                }
            } else if (resultado.equalsIgnoreCase("NO")) {
                System.out.println("Adios");
                Imprimir();
                break;
            } else {
                System.out.println("Respuesta invalida. Escriba SI o NO.");
            }
            
        } while (resultado.equalsIgnoreCase("SI"));
    }
    public static void Imprimir(){
        System.out.println("los libros registrados son:"+acumular+","+"los autores son:"+acumulador1+","+"la cantidad de paginas de los libros es:"+acumulador);
    }
}
