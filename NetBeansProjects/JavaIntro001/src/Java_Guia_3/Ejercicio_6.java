/*Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.*/
package Java_Guia_3;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int num1, num2, operacion, opcion = 0;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        System.out.println("Elija opción");
       
        while(opcion != 5) {
             opcion = sc.nextInt();
             switch (opcion) {
            case 1:
                operacion = num1 + num2;
                System.out.println(operacion);
                break;
            case 2:
                operacion = num1 - num2;
                System.out.println(operacion);
                break;
            case 3:
                operacion = num1 * num2;
                System.out.println(operacion);
                break;
            case 4:
                operacion = num1 / num2;
                System.out.println(operacion);
                break;
            default:
                System.out.println("Fin del programa");
             }
        }
    }
}
