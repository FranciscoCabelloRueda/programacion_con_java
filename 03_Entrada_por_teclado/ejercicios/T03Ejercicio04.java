/**
 * 
 * T03Ejercicio04
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce dos números separados por espacios: ");

    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();

    System.out.println("SUMA = " + (num1 + num2));
    System.out.println("RESTA = " + (num1 - num2));
    System.out.println("MULTIPLICACIÓN = " + (num1 * num2));
    System.out.println("DIVISIÓN = " + (num1 / num2));

    sc.close();
  }
}