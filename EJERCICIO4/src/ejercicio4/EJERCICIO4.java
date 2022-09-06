
/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados centigrados ");
        double grados = leer.nextDouble();
        double F = 32 + (9*grados/5);
        System.out.println("la respuesta en grados Fareng: "+F);
    }

}
