
/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
  dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicio1;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros a sumar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma de "+num1 + " mas "+num2+" es igual a: "+ (num1+num2));
    }

}
