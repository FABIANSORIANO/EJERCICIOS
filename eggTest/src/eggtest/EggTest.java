/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggtest;

import java.util.Scanner;

public class EggTest {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int num,sum;
       sum=0;
        do {
            System.out.println("ingrese numeros ");
             num = leer.nextInt();
             if(num<0){
             continue;
             }
            sum += num;
        }while(num != 0);
        
        System.out.println("se a capturado un 0 ");
        
        System.out.println("la suma de lo numingresado es: "+sum);
                
    }

}

    
