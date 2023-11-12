/**
* T04Ejercicio15
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;
public class T04Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print ("Introduce el caracter con el que desea dibujar la piramide: ");
    String caracter = sc.nextLine();

    System.out.println ("Introduce la direccion a la que debe apuntar el vertice de la piramide: ");
    System.out.println ("Arriba(1) ");
    System.out.println ("Abajo(2) ");
    System.out.println ("Izquierda(3) ");
    System.out.println ("Derecha(4) ");
    int direccion = sc.nextInt();

    switch (direccion) {
      case 1:
        System.out.println (" " + " " + " " + caracter);
        System.out.println (" " + " " +caracter + caracter + caracter);
        System.out.println (" " + caracter + caracter + caracter + caracter + caracter);
        System.out.println (caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        break;
      case 2:
        System.out.println (caracter + caracter + caracter + caracter + caracter + caracter + caracter);
        System.out.println (" " + caracter + caracter + caracter + caracter + caracter);
        System.out.println (" " + " " + caracter + caracter + caracter);
        System.out.println (" " + " " + " " + caracter);
        break;
      case 3:
        System.out.println (" " + " " + " " + caracter);
        System.out.println (" " + " " + caracter + caracter);
        System.out.println (" " + caracter + caracter + caracter);
        System.out.println (caracter + caracter + caracter + caracter);
        System.out.println (" " + caracter + caracter + caracter);
        System.out.println (" " + " " + caracter + caracter);
        System.out.println (" " + " " + " " + caracter);
        break;
      case 4:
        System.out.println (caracter + " " + " " + " ");
        System.out.println (caracter + caracter + " " + " ");
        System.out.println (caracter + caracter + caracter + " ");
        System.out.println (caracter + caracter + caracter + caracter);
        System.out.println (caracter + caracter + caracter + " ");
        System.out.println (caracter + caracter + " " + " ");
        System.out.println (caracter + " " + " " + " ");
        break;
      default:
      System.out.println ("ERROR: Número introducido no valido");
        break;
    }
    sc.close();
  }
  
}
