/**
* T04Ejercicio21
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;
public class T04Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa calcula la media de dos notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    double nota1 = sc.nextDouble();
    
    System.out.print("Ahora introduzca la segunda nota: ");
    double nota2 = sc.nextDouble();

    double media = (nota1 + nota2) / 2;
    
    if ((media >= 5) && (media <= 10)) {
      System.out.print("Tu nota media en programación es un " + media);
    }
    if ((media < 5) && (media >= 0)) {
      System.out.print("¿Cual a sido el resultado de la recuperación? (apto / no apto): ");
      String recuperacion = System.console().readLine();
    
      if (recuperacion == "apto") {
      System.out.print("Tu nota media en programación es un 5");
      }
      if (recuperacion == "no apto") {
      System.out.print("Tu nota media en programación es un " + media);
      }
    }
    sc.close();
  }
}