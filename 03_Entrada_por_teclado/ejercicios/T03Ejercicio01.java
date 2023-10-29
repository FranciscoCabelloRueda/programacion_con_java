/**
 * 
 * T03Ejercicio01
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce dos números separados por espacios: ");

    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();

    System.out.println("El resultado de la multiplicación de " + num1 + " y " + num2 + " es " + (num1 * num2));

    sc.close();
  }
}
