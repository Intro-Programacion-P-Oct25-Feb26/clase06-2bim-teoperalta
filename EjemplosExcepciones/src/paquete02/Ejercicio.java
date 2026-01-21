/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio {
    
       public static void main(String[] args) {
           int valor1;
           int valor2;
           int suma;
           valor1 = obtenerValores();
           valor2 = obtenerValores();
           suma = obtenerSuma(valor1, valor2);
       }
       public static int obtenerValores(){
        boolean bandera = true;
        int valor = 0;
        while (bandera){
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            valor = entrada.nextInt(); 
            if (valor > 0 && valor % 2 == 0){
            bandera = false;    
            }
        }

        catch(Exception e){
            
            System.out.printf(" Lo sentimos solo valores enteros y pares");
        
        }
        }
    return valor;           
    }
       public static int obtenerSuma (int a, int b){
           int resultado;
           resultado = a + b;
           return resultado;
       }
}

