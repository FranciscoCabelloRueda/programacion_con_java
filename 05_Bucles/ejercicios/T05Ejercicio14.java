/**
* T05Ejercicio14
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double potencia = 1;
    System.out.println("Cálculo de una potencia");

    System.out.print("Introduzca la base: ");
    int base = sc.nextInt();

    System.out.print("Introduzca el exponente: ");
    int exponente = sc.nextInt();

    if (exponente == 0) {
      potencia = 1;
    } else if (exponente > 0) {
      for (int i = 1; i <= exponente; i++) {
        potencia *= base;
      }
    } else {
      for (int i = 1; i <= -exponente; i++) {
        potencia *= base;
      }
      potencia = 1 / potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);

    sc.close();
  }
}