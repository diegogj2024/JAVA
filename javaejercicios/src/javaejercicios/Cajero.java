package javaejercicios;

import java.util.Scanner;

public class Cajero {
    static int saldo = 1000000;
    static int clave = 6969;
    static Scanner objleer = new Scanner(System.in);

    public Cajero() {
        System.out.println("Ingrese su tarjeta");
        System.out.println(".......................");
        System.out.println("Ingrese su contrasena");
        int contraseña = objleer.nextInt();
        procesar(contraseña);
    }

    public static void procesar(int contraseña) {
        int opcion = 0;
        int retirar = 0;

        if (contraseña == clave) {
            System.out.println("Contrasena correcta");
            while (opcion == 0) {
                System.out.println("Desea retirar dinero? 0=Si 1=No");
                opcion = objleer.nextInt();

                if (opcion == 0) {
                    System.out.println("Cuanto deseas retirar?");
                    retirar = objleer.nextInt();

                    if (retirar > saldo || retirar < 1) {
                        System.out.println("No cuentas con saldo suficiente o cantidad no valida.");
                        opcion = 0;
                    } else {
                        saldo -= retirar;
                        System.out.println("Saldo despues del retiro: " + saldo);
                        System.out.println("Retirando.........");
                        imprimir(retirar);
                        opcion = 1;
                        
                    }
                } else {
                    opcion = 1;
                }
            }
        } else {
            System.out.println("Contrasena incorrecta");
        }
    }

    public static void imprimir(int retirar) {
        System.out.println("Se retiro: " + retirar);
        System.out.println("Saldo actual: " + saldo);
    }

}
