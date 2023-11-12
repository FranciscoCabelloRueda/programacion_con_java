/**
* T04Ejercicio05
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a:");
    int a = sc.nextInt();
    System.out.print("Por favor, introduzca el valor de b:");
    int b = sc.nextInt();

    if ((a == 0) && ( b != 0 )) {

    System.out.print("Esa ecuación no tiene soluciónn real."); 

    }else if ((a == 0) && (b == 0)) {

    System.out.print("x = 0"); 

    }else {

    System.out.print("x= " + (-b / a));

    }

    sc.close();
  }
}