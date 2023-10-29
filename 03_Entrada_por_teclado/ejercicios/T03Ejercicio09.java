/**
 * 
 * T03Ejercicio09
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    

    System.out.println("Introduce el radio y la altura del cono respectivamente separados con espacio: ");

    double radio = sc.nextDouble();
    double altura = sc.nextDouble();
    double pi = 3.1416;

    double area = ( ( 1 / 3 ) * pi *(radio * radio) * altura );

    System.out.printf("El volumen del cono es de %.5f metros cúbicos.", area);

    sc.close();
  }
}