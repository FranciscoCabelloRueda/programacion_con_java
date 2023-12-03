/**
* T05Ejercicio15
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double base = 0;
    double exponente = 0;
    double potencia = 0;

    System.out.print("Introduzca la base: ");
    base = sc.nextDouble();

    System.out.print("Introduzca el exponente: ");
    exponente = sc.nextDouble();

    for(int i = 1; i <= exponente; i++){
      potencia = Math.pow(base, i);
      System.out.printf("%.2f ^ %d = %.2f\n",base,i,potencia);

    }
    sc.close();
  }
}