/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/

package ejercicio16;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        
        for (int i = 0; i < vector.length; i++) {
            vector [i] = (int) (Math.random()*10);
            
        }
        ImprimirVector(vector);
        System.out.println("");
        System.out.println("Ingresa el numero a buscar en el vector ");
        int opcion =leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (opcion==vector[i]){
                System.out.println("el numero se encuentar en la posicion "+ "["+i+"]");
            }
            
        }
                
    }
    public static void ImprimirVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"] ");
        }
    }

}
