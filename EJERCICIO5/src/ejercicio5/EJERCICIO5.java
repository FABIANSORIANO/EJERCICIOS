

package ejercicio5;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println("El doble de su número es " + num*2);
        System.out.println("El triple de su número es " + num*3);
        System.out.println("La raíz cuadrada de su número es " + Math.sqrt(num));
    }

}
