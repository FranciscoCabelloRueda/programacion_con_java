/**
* T05Ejercicio16
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número entero y le diré si es primo: ");
    int numeroIntroducido = sc.nextInt();

    boolean primo = true;
    
    for (int i = 2; i < numeroIntroducido; i++) {
      if ((numeroIntroducido % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

    sc.close();
  }
}