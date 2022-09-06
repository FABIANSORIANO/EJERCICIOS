
package eggtest;
import java.util.Scanner;

public class ejercicio8 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una nota entre 0 y 10");
        int nota = leer.nextInt();
        while (nota<0 || nota>10){
            System.out.println("Ingresa una nota entre 0 y 10");
            nota = leer.nextInt();
        }
        
    }
    
}
