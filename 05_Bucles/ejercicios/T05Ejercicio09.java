/**
* T05Ejercicio09
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = 0;
    int cifra = 0;
    long num2 = 0;
    System.out.print("Introduce un número: ");
    num= sc.nextLong();
    num2 = num;

    do{
    num2 = num2 / 10 ;  
    cifra++;

    }while(num2 >= 1);

    if (cifra == 1) {
      System.out.println(num + " tiene 1 cifra.");
    } else {
      System.out.println(num + " tiene " + cifra +" cifras.");
    }


    sc.close();
  }
}