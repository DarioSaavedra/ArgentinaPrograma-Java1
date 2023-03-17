
/**
 *
 * @author David Mendez
Realizar un programa que simule el funcionamiento de un dispositivo RS232,
* este tipo de dispositivo lee cadenas enviadas por el usuario.
* Las cadenas deben llegar con un formato fijo: 
* tienen que ser de un máximo de 5 caracteres de largo,
* el primer carácter tiene que ser X 
* y el último tiene que ser una O.
* 
Las secuencias leídas que respeten el formato se consideran correctas,
* la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
* y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
* 
Al finalizar el proceso, 
* se imprime un informe indicando la cantidad
* de lecturas correctas e incorrectas recibidas.
* Para resolver el ejercicio deberá investigar cómo se utilizan
* las siguientes funciones de Java Substring(), Length(), equals().

 */

package Java_Guia_3;

import java.util.Scanner;

public class Ejercicio_7 {    
    public static void main(String[] args) {
        int incorrecto = 0, correcto = 0;
        String frase;
        boolean continuar=true;
        Scanner sc = new Scanner(System.in);
        while(continuar){
            System.out.println("Ingrese la frase");
            frase= sc.nextLine();
            if (frase.equals("&&&&&")) {
                System.out.println("FDE");
                continuar=false;
            }
            else if(continuar && (frase.length()<2 || frase.length()>5) ){
                System.out.println("No tiene largo correcto");
                incorrecto = incorrecto + 1;
            }
            else if (continuar && (!frase.substring(0,1).equals("X")) ) {
                System.out.println("No empieza con X");
                incorrecto = incorrecto + 1;
            }
            else if (continuar && (!frase.substring(frase.length()-1,frase.length()).equals("O")) ) {
                System.out.println("No termina con O");
                incorrecto = incorrecto + 1;
            }     
            else {
                correcto = correcto + 1;
            }
       }
        System.out.println("La cantidad de veces que se escribio incorrectamente es: " + incorrecto);
    }
}
  
