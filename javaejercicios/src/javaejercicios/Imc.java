/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Imc {
    
    public Imc(){
        Scanner objTeclado= new Scanner(System.in);
        System.out.println("ingresa tu altura");
        float altura=objTeclado.nextFloat();
        System.out.println("ingresa tu peso");
        int peso=objTeclado.nextInt();
        Imc.procesar(altura,peso);
    }
    
    public static void procesar(float altura,int peso){
        float imc = peso / (altura * altura);
        String resultado = null;
        String categoria = null;
        if(imc<18.5 && imc>0){
            categoria="BP";
    }else if(imc>18.5 && imc<24.9){
            categoria="PM";
    }else if(imc>24.9 && imc<29.9){
        categoria="SP";
    }else if(imc>29.9){
        categoria="OB";
    }
        switch(categoria){
            case "BP":
                resultado="bajo peso";
                break;
            case "PM":
                resultado="peso normal";
                break;
            case "SP":
                resultado="sobre peso";
                break;
            case "OB":
                resultado="obesidad";
                break;
            default:
                System.out.println("no hay opcion disponible");
                break;
        }
        Imc.imprimir(resultado);
    }
    
    public static void imprimir(String resultado){
     System.out.println("resultado:"+resultado);
    }
    
}
