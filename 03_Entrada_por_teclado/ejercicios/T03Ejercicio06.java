/**
 * 
 * T03Ejercicio06
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la base y la altura del triángulo respectivamente separadas por espacios: ");

    double base = sc.nextDouble();
    double altura = sc.nextDouble();

    System.out.println("El área del triángulo es = " + ( (base*altura) / 2) + " metros cúbicos" );

    sc.close();
  }
}