
/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio10;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el límite");
        int lim = leer.nextInt();
        System.out.println("Ingrese los números, se leerán hasta q la suma sea mayor al lim");
        int suma=0,num;
        do {
          num=leer.nextInt();
          suma+=num;
        }while(suma<=lim);
    
    }

}
