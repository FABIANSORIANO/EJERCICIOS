/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

package ejercicio14;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de euros: ");
        float euros = leer.nextFloat();

        System.out.println("Ingresa la monea a la cual deseas convertir:\n"
                + "1. dolares\n"
                + "2. yenes\n"
                + "3. libras");
        String moneda = leer.next();
        cambio(euros,moneda);

    }

    public static void cambio(float euros, String moneda) {
        switch (moneda) {
            case "dolares":
                System.out.println(euros + " € corresponden a " + (euros * 1.28611) + " $");
                break;
            case "libras":
                System.out.println(euros + " € corresponden a " + (euros * 0.86) + " libras");
                break;
            case "yenes":
                System.out.println(euros + " € corresponden a " + (euros * 129.852) + " yenes");
                break;
            default:
                System.out.println("Ingresa una opción valida");
                break;
        }
    }

}
