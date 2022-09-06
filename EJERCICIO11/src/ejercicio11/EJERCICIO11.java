

package ejercicio11;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner opc = new Scanner(System.in);
        System.out.println("Por favor ingresa dos numeros enteros positivos ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        String opcion2 = "N";

        do {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los numeros es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de los numeros es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcion2 = opc.nextLine();
                    break;
                default:
                    System.out.println("Has ingresado una opcion invalida");

            }
        } while ((opcion2.equalsIgnoreCase("n")));

    }

}
