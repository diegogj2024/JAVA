/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicios;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner objleer=new Scanner(System.in);
       System.out.println("ingrese el numero del ejercicio que desee probar rango(1 a 20)");
       int opcion=objleer.nextInt();
       switch(opcion){
           case 1: 
               Factura objFactura=new Factura();
               break;
               
           case 2:
               Ascensor objascensor=new Ascensor();
               break;
           case 3:
               Ascensorkg objascensorkg=new Ascensorkg();
               break;
           case 4:
               Temperatura objtemperatura=new Temperatura();
               break;
           case 5:
               Umbral objumbral=new Umbral();
               break;
           case 6:
               Ascensorandtemperatura objascensort=new Ascensorandtemperatura();
               break;
           case 7:
               Tienda objTienda=new Tienda();
               break;
           case 8:
               Imc objimc=new Imc();
               break;
           case 9:
               Cine objcine=new Cine();
               break;
           case 10:
               Futbol objfutbol=new Futbol();
               break;
           case 11:
               Menu objmenu=new Menu();
               break;
           case 12:
               Cajero objcajero=new Cajero();
               break;
           case 13:
               Tiendaonline objTiendaonline=new Tiendaonline();
               break;
           case 14:
               Impresora objimpresora=new Impresora();
               break;
           case 15:
               Viajeencoche objviajeencoche=new Viajeencoche();
               break;
           case 16:
               Cuentaregresiva objcuenta=new Cuentaregresiva();
               break;
           case 17:
               Adivinanza objadivinanza=new Adivinanza();
               break;
           case 18:
               Biblioteca objbiblioteca=new Biblioteca();
               break;
           default:
               System.out.println("esta opcion no existe");
       }
    }
    
}
