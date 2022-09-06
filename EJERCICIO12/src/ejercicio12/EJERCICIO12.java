
/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio12;

//@author FABIAN

import java.util.Scanner;


public class EJERCICIO12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String cadena =" ";

        do {
            System.out.println("Ingresa la cadena de texto ");
            cadena = leer.nextLine();
            if ((cadena.length() == 5) && (cadena.substring(0,1).equalsIgnoreCase("x")) && (cadena.substring(4, 5).equalsIgnoreCase("o"))) {
                correctas++;
            } else if(!(cadena.equals("&&&&&"))) {
                incorrectas++;
            }
        } while (!(cadena.equals("&&&&&")));
        System.out.println("La cantidad de cadenas correctas son: " + correctas);
        System.out.println("La cantidad de cadenas incorrectas son: " + incorrectas);
    }

}
