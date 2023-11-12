/**
* T04Ejercicio17
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;
public class T04Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print ("Introduce un número del cual deseas conocer la última cifra: ");
    int n = sc.nextInt();
    System.out.println("La última cifra del número introducido es el "+ (n % 10) +".");

    sc.close();
  }
}