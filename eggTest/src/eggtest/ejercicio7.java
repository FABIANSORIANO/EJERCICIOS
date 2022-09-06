
package eggtest;
import java.util.Scanner;

public class ejercicio7 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el tipo de motor entre 1 y 4");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;  
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break; 
            default:
                System.out.println("No existe una valor válido para el tipo de bomba ");
        }
        
    }
    
}
