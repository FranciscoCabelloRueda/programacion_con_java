/**
 * 
 * T03Ejercicio02
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de euros: ");

    double euros = sc.nextDouble();
    int pesetas = (int)(euros * 166.386);

    System.out.println( euros + " euros equivalen a " + pesetas + " pesetas.");

    sc.close();
  }
}