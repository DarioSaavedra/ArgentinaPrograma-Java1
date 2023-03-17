/*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java*/
package Java_Guia_3;

import java.util.Scanner;


public class Ejercicio_2 {
    public static void main(String[] args) {
        String frase;
        System.out.println("Ingrese la frase Eureka");
        Scanner x = new Scanner(System.in);
        frase = x.next();
        x.nex
        if(frase.equals("Eureka")){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
}
