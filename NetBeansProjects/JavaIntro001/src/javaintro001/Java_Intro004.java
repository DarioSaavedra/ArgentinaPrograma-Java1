/* Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32 + (9 * C / 5).*/
package javaintro001;
import java.util.Scanner;
public class Java_Intro004
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese un numero en grados centigrados y"
                + " lo convertire a farenheit");
        double grados = sc.nextDouble();
        double F;
        F = 32 + (9 * grados/5);
        System.out.println("El equivalente en farenheit es: " + F);
    }
}


