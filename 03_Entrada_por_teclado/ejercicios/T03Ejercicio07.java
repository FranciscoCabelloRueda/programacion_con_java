/**
 * 
 * T03Ejercicio07
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio07 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la base imponible: ");

    double baseImponible = sc.nextDouble();

    System.out.println("BASE IMPONIBLE : "+ baseImponible + " euros");
    System.out.println("IVA :            "+ (baseImponible * 0.21) + " euros");
    System.out.println("----------------------------");
    System.out.println("TOTAL :          "+ (baseImponible * 1.21) + " euros");


    sc.close();
  }
}