/**
 * 
 * T03Ejercicio11
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio11 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de KiloBytes ");

    double kiloBytes = sc.nextDouble();
    double megaBytes = kiloBytes / 1000;  

    System.out.println( kiloBytes + " KiloBytes equivalen a " + megaBytes + " MegaBytes");

    sc.close();
  }
}