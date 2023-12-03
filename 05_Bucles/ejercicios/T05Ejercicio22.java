/**
* T05Ejercicio22
*
* @author Francisco Javier Cabello Rueda
*
*/
public class T05Ejercicio22 {
  public static void main(String[] args) {
  
    boolean esPrimo = true;   

    System.out.println("Números primos entre 2 y 100:");

    for (int num = 2; num <= 100; num++) {
      esPrimo = true;    

      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          esPrimo = false;
          break;     
        }
      }

      if (esPrimo) {
        System.out.print(num + " ");
      }
    }
  }
}