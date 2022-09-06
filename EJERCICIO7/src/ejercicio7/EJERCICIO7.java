/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
   pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
   la función equals() en Java.
 */

package ejercicio7;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase ");
        String frase = leer.nextLine();
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
