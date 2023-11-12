/**
* T04Ejercicio03
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el dia de la semana del cual deseas conocer el nombre:");
    int dia = sc.nextInt();
    System.out.println("=================================================================");
    switch (dia) {

      case 1:
      System.out.println("El dia introducido es LUNES");  
      break;
  
      case 2:
      System.out.println("El dia introducido es MARTES");  
      break;

      case 3:
      System.out.println("El dia introducido es MIERCOLES");  
      break;

      case 4:
      System.out.println("El dia introducido es JUEVES");  
      break;

      case 5:
      System.out.println("El dia introducido es VIERNES");  
      break;

      case 6:
      System.out.println("El dia introducido es SÁBADO");  
      break;

      case 7:
      System.out.println("El dia introducido es DOMINGO");  
      break;
    
      default:
      System.out.println("**ERROR** El día de la semana indicado no existe.");  
      break;
    }

    sc.close();
  }
}