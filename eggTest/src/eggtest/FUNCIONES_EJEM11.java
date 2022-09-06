/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 */
package eggtest;

import java.util.Scanner;

public class FUNCIONES_EJEM11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase ");
        String frase = leer.nextLine();
        String cambio=reemplazar(frase);
        System.out.println(cambio);

    }

    public static String reemplazar(String frase) {
        String nueva;
        String nuevaFrase="";
        for (int i = 0; i < frase.length(); i++) {
            String letra = frase.substring(i, i+1);

            switch (letra) {
                case "A":case "a":
                    nueva = "@";
                    break;
                case "E":case"e":
                    nueva = "#";
                    break;
                case "I":case "i":
                    nueva = "$";
                    break;
                case "O":case "o":
                    nueva = "%";
                    break;
                case "U":case"u":
                    nueva = "*";
                    break;
                default:
                    nueva = letra;
                    break;
                    
            }
            nuevaFrase = nuevaFrase.concat(nueva);
        }
        
        return  nuevaFrase;

    }
}
