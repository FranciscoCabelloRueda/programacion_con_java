/**
* T05Ejercicio18
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio18 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int primerNumero;
    int segundoNumero;
    
    do {
      System.out.print("Introduzca un número entero: ");
      primerNumero = sc.nextInt();
      System.out.print("Introduzca otro número entero distinto al anterior: ");
      segundoNumero = sc.nextInt();
      
      if(primerNumero == segundoNumero) {
        System.out.print("Los números introducidos no son válidos, ");
        System.out.println(" deben ser distintos.");
      }
    } while (primerNumero == segundoNumero);
    
    if (primerNumero > segundoNumero) {
      int aux = primerNumero;
      primerNumero = segundoNumero;
      segundoNumero = aux;
    }
    
    for(int i = primerNumero; i <= segundoNumero; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
    sc.close();
  }
}