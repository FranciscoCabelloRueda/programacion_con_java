/**
* T05Ejercicio23
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contadorNumeros = 0;
    int suma = 0;
    int numeroIntroducido;
    
    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    //Al menos nos debe dejar introducir un número, por lo que encaja perfectamente un do-while o un while
    do {
      numeroIntroducido = sc.nextInt();
      contadorNumeros++;
      suma += numeroIntroducido;
    } while (suma <= 10000);
    sc.close();
    
    System.out.println("Ha introducido un total de " + contadorNumeros + " números.");
    System.out.println("La suma total de los números introducidos es " + suma + ".");
    System.out.printf("La media de los números introducidos es %.2f.\n", (double) suma / contadorNumeros);
  }
}