/**
 * 
 * T03Ejercicio05
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la base y la altura del rectángulo respectivamente separadas por espacios: ");

    double base = sc.nextDouble();
    double altura = sc.nextDouble();

    System.out.println("El área del rectangulo es = " + (base*altura) + " metros cúbicos" );

    sc.close();
  }
}