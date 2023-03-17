/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.*/
package Java_Guia_3;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese frase");
        String frase = sc.nextLine();
        frase = frase.toUpperCase();
        String primeraLetra= frase.substring(0, 1);
         if (primeraLetra.equals("A")) {
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");}    
    } 
}
