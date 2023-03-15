/*Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.*/
package javaintro001;
import java.util.Scanner;
public class JavaIntro002 {
    public static void main (String[] args)
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese su nombre");
      String nom = sc.next();
      System.out.println("Su nombre es: " + nom);      
     }
}
