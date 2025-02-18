/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Cine {
    public Cine(){
        Scanner objTeclado= new Scanner(System.in);
        int edad;
        do{
            System.out.println("ingrese su edad");
            edad=objTeclado.nextInt();
        }while(edad<=0);
        Cine.procesar(edad);
    }
    
    public static void procesar(int edad){
        String categoria = null;
        String resultado = null;
        if(edad<7){
            resultado="N";
        }else if(edad>=7 && edad<17){
            resultado="J";
        }else if(edad>=18 && edad<30){
            resultado="A";
        }else if(edad>31){
            resultado="V";
        }
        switch (resultado){
            case "N":
                categoria="peliculas animadas y educativas";
                break;
            case "J":
                categoria="peliculas familiares";
                break;
            case "A":
                categoria="peliculas de accion y dramas";
                break;
            case "V":
                categoria="peliculas clasicas";
                break;
        }
        Cine.imprimir(categoria);
    }
    
    public static void imprimir(String categoria){
     System.out.println("resultado:"+categoria);
    }
}
