/**
* T04Ejercicio04
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio04 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce las horas trabajadas durante la semana: ");
    int horas = sc.nextInt();

    if ((horas <= 40) && (horas >= 1)) {
    System.out.println("El sueldo semanal que le corresponde es de " + (horas * 12) + " euros.");  
    }
    if (horas >= 41) {
    System.out.println("El sueldo semanal que le corresponde es de " + (((horas - 40) * 16) + 480) + " euros.");  
    }
    sc.close();
  }
}