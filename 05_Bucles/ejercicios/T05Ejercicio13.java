/**
* T05Ejercicio13
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    int numPositivo = 0;
    int numNegativo = 0;

    for(int i = 0; i < 10; i++){
      System.out.print("Introduce un número: ");
      num = sc.nextInt();

      if(num >= 0){
        numPositivo++;

      }else {
        numNegativo++;
      }
    }

    System.out.printf("De los numeros introducidos %d son positivos y %d son negativos",numPositivo,numNegativo);

    sc.close();
  }
}