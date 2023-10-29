/**
 * 
 * T03Ejercicio10
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio10 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de MegaBytes ");

    double megaBytes = sc.nextDouble();
    double kiloBytes = megaBytes * 1000;  

    System.out.println( megaBytes + " MegaBytes equivalen a " + kiloBytes + " KiloBytes");

    sc.close();
  }
}