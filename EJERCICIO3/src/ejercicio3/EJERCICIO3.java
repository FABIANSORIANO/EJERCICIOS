/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

package ejercicio3;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase ");
        String frase = leer.nextLine();
        System.out.println("La palabra en mayuscula es: "+frase.toUpperCase());
        System.out.println("La palabra en minuscula es: "+frase.toLowerCase());
    }

}
