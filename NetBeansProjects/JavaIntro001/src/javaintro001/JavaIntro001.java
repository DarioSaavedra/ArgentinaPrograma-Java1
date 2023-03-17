/*Escribir un programa que pida dos números 
enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma*/
package javaintro001;
import java.util.Scanner;
public class JavaIntro001 
{
    public static void main(String[] args) 
    {
    Scanner leer = new Scanner(System.in);
    int num1;
    int num2;
    System.out.println("Ingresa dos numeros");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    int suma;
    suma = num1 + num2;
    System.out.println("La suma de los dos numeros es: "+ suma);
     
    }  
}
