/**
* T04Ejercicio03
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio_apuntes03 {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);

  System.out.println("¿Que área deseas calcular?");
  System.out.println("Triangulo (1)");
  System.out.println("Cuadrado (2)");
  System.out.println("Rectangulo (3)");



  int seleccion = sc.nextInt();

  switch (seleccion) {
    case 1:
    System.out.println("Introduce la base del triangulo");
    double baseTriangulo = sc.nextDouble();
    System.out.println("Introduce la altura del triangulo");
    double alturaTriangulo = sc.nextDouble();
    System.out.println("El área del triangulo es de " + ((baseTriangulo * alturaTriangulo) / 2) + " metros cuadrados.");
      
    break;
    case 2:
    System.out.println("Introduce la longitud del lado del cuadrado");
    double ladoCuadrado = sc.nextDouble();
    System.out.println("El área del cuadrado es de " + (ladoCuadrado * ladoCuadrado) + " metros cuadrados.");
      
    break;
    case 3:
    System.out.println("Introduce la base del rectangulo");
    double baseRectangulo = sc.nextDouble();
    System.out.println("Introduce la altura del rectangulo");
    double alturaRectangulo = sc.nextDouble();
    System.out.println("El área del rectangulo es de " + (baseRectangulo * alturaRectangulo) + " metros cuadrados."); 
    break;
  
    default:
    System.out.println("**ERROR: Número no valido");
      break;
  }

  sc.close();
  }

}