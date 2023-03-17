/*Crear un programa que dado un número determine si es par o impar*/
package Java_Guia_3;

import java.util.Scanner;


public class Ejercicio_1 
{
    public static void main(String[] args)  {
            System.out.println("Escriba un numero y le dire si es par o impar");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num%2 != 0)  {
                System.out.println("El numero ingresado es impar");
            }        
            else{
                System.out.println("El numero ingresado es par");
            }     
    }        
}
