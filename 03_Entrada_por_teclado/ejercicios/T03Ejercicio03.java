/**
 * 
 * T03Ejercicio03
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de pesetas: ");

    int pesetas = sc.nextInt();
    double euros = (double)(pesetas / 166.386);

    System.out.printf(  "%d pesetas equivalen a %.2f euros.", pesetas, euros);

    sc.close();
  }
}