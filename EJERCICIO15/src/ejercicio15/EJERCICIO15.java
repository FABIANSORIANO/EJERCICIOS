/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */

package ejercicio15;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        for (int i = 100; i>0 ; i--) {
            System.out.println("["+i+"]");
        }   
    }

}
