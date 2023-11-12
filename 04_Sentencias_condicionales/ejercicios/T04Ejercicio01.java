/**
* T04Ejercicio01
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el dia de la semana del cual quieres saber la asignatura que toca a primera hora:");
    int dia = sc.nextInt();
    System.out.println("=============================================================================================");
    switch (dia) {

      case 1:
      System.out.println("El Lunes a primera hora hay FOL");  
      break;
  
      case 2:
      System.out.println("El Martes a primera hora hay PROGRAMACIÓN");  
      break;

      case 3:
      System.out.println("El Miércoles a primera hora hay ENTORNOS DE DESARROLLO");  
      break;

      case 4:
      System.out.println("El Jueves a primera hora hay BASE DE DATOS");  
      break;

      case 5:
      System.out.println("El Viernes a primera hora hay PROGRAMACIÓN");  
      break;

      case 6:
      System.out.println("El Sábado no hay instituto");  
      break;

      case 7:
      System.out.println("El Domingo no hay instituto");  
      break;
    
      default:
      System.out.println("**ERROR** El día de la semana indicado no existe.");  
      break;
    }

    sc.close();
  }
}
