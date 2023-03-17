package Java_Guia_3;

import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        int cifra;
        int suma = 0;
        System.out.println("Ingrese un numero de dos cifras");
        numero = leer.nextInt();
        System.out.println("Ingrese numeros aleatorios de una cifra");
        cifra = leer.nextInt();
        suma = suma + cifra;
        while (suma <= numero) {
            System.out.println("Ingrese numeros aleatorios de una cifra");
                                cifra = leer.nextInt();
            suma = suma + cifra;
        }
        System.out.println(" La suma total fue " + suma);
    }
}
