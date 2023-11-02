/**
* T04Ejercicio01
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio01 {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Introduce tu edad");

  int edad = sc.nextInt();

 if (edad<=18) {
  System.out.println("Usted es menor de edad");
 } else {
  if (edad>=64) {
  System.out.println("Usted esta jubilado");  
  } else {
  System.out.println("Usted es mayor de edad");  
  }
 }
 

  sc.close();
  }

}