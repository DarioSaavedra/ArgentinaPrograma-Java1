/*Escribir un programa que pida una frase y 
la muestre toda en mayúsculas y después toda en minúsculas.*/ 
package javaintro001;
import java.util.Scanner;
public class Java_Intro003 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Igrese una frase y la mostrare en minusculas");
       String frase = sc.nextLine();
       System.out.println(frase.toLowerCase());
       System.out.println("Ahora la escribire en mayusculas");
       System.out.println(frase.toUpperCase());
   }
}
