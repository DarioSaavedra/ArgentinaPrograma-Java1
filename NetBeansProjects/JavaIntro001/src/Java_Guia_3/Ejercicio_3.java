/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pant
alla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
package Java_Guia_3;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
     String frase;
     System.out.println("Ingrese una frase de 8 caracteres");
     Scanner sc = new Scanner(System.in);
     frase = sc.nextLine();
     int largo = frase.length();
     if(largo == 8){
         System.out.println("Correcto");
     }
     else {
         System.out.println("Incorrecto");
         }
    }
}
