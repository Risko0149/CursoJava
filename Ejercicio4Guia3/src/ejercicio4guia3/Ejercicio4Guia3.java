/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia3;

import java.util.Scanner;
/**
 *
 * @author Risko
 */
public class Ejercicio4Guia3 {

    /**
     * @param args the command line arguments
     */
    /*
    *   Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
    *   Si la primera letra es una ‘A’, se deberáde imprimir un mensaje por pantalla que diga “CORRECTO”, 
    *   en caso contrario, se deberá imprimir “INCORRECTO”. 
    *   Nota: investigar la función Substring y equals() de Java.
    */
    public static void main(String[] args) {
        String palabra;
        String letra;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una palabra que empiece con A:");

        palabra = leer.next();

        letra = palabra.substring(0,1);
        
        if ((letra.equals("A")) || (letra.equals("a"))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
