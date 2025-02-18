/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Cuentaregresiva {
    static Scanner objleer = new Scanner(System.in);
    static int numero=0;
    public Cuentaregresiva(){
        System.out.println("ingrese el numero para inciar la cuenta regresiva");
        numero=objleer.nextInt();
        imprimir();
    }
    
    public static void imprimir(){
        if(numero<1){
            System.out.println("ERROR DEBE SER UN NUMERO POSITIVO");
        }
        int control=2;
        while(control!=1){
            if (numero>1){
                numero-=1;
                System.out.println(numero);
            }else{
                System.out.println("tiempo cumplido");
                control=1;
            }
        }
    }
}
