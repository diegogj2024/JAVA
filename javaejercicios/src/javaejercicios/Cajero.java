/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Cajero {
    static int saldo=1000000;
    static int clave=6969;
    static Scanner objleer=new Scanner(System.in);
    public Cajero(){
        System.out.println("ingrese su tarjeta");
        System.out.println(".......................");
        System.out.println("ingrese su contraseña");
        int contraseña=objleer.nextInt();
        procesar(contraseña);
    }
    
    public static void procesar(int contraseña){
        int opcion=0;
        int retirar = 0;
        if(contraseña==clave){
            System.out.println("contraseña correcta");
            while(opcion>0){
                System.out.println("desea retirar dinero? 0=si 1=no");
                opcion=objleer.nextInt();
                if(opcion==0){
                    System.out.println("cuanto deseas retirar");
                    retirar=objleer.nextInt();
                    if ((retirar>saldo || retirar<=1)) {
                        System.out.println("no cuentas con saldo suficiente");
                        opcion=0;
                    }else{
                        int residuo=saldo-retirar;
                        saldo=residuo;
                        System.out.println("retirando.........");
                        opcion=0;
                    }
                }else{
                    opcion=1;
                }
            }
        }else {
            System.out.println("contraseña incorrecta");
        }
        imprimir(retirar, saldo);
    }
    
    public static void imprimir(int retirar,int saldo){
        System.out.println("se retiro"+retirar);
        System.out.println("saldo actual"+saldo);
    }
}
