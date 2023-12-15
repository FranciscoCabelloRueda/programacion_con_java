/**
* Ejercicio3
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido = 0;
    int suma = 1;


    System.out.print("Introduce un número entero positivo: ");
    numeroIntroducido = sc.nextInt();

    System.out.printf("Los divisores propios de %d son: ", numeroIntroducido);
    for(int i = 2; i <= numeroIntroducido; i++){
      if ((numeroIntroducido % i == 0) && (i != numeroIntroducido)) {
      System.out.print(i + ", ");
      suma += i;
      }
    }
     System.out.println("");
     System.out.println("Suma de los divisores propios y el 1: " + suma);

     if (suma == numeroIntroducido) {
      System.out.println("Es un número perfecto");
     }

    sc.close();
  }
}