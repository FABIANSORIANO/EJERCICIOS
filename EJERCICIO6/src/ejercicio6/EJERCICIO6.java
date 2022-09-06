

package ejercicio6;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

}
