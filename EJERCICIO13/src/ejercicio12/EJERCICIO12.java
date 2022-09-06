package ejercicio12;

//@author FABIAN

import java.util.Scanner;

public class EJERCICIO12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la longitud que desea del cuadrado: ");
        int longitud = leer.nextInt();
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                if (i==0||j==0||i==longitud-1||j==longitud-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}
