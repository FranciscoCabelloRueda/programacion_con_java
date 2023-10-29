/**
 * 
 * T03Ejercicio08
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio08 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de horas trabajadas esta semana: ");

    int horas = sc.nextInt();

    System.out.println("El salario semanal correspondiente a " + horas + " horas trabajadas es de " + (horas * 12 ) +" euros");

    sc.close();
  }
}