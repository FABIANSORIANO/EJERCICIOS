
/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
*/
package ejercicio2;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO2 {

    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: "+ nombre);
    }

}
