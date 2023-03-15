/*Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/
package javaintro001;

import java.util.Scanner;

public class Javaintro005 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int doble;
        int triple;
        double raiz;
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("El doble del numero es: " + doble);
        System.out.println("El triple del numero es: " + triple);
        System.out.println("La raiz cuadrada del numero es: " + raiz);
    }
}
