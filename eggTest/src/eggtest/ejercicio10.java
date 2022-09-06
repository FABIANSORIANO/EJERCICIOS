
package eggtest;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese 4 numeros entre 1 y 20");
       int num;
       for (int i=1;i<5;i++){
           do{ 
           num=leer.nextInt();
          
              }while(num<0 || num >20);
           
               System.out.print(" "+num);
               
           for (int j=1; j <= num ;j++){
               System.out.print("*");
           }
               System.out.println("");
              
        
       }
       
    }

}

  