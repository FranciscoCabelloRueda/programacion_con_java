/**
* T05Ejercicio11
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido = 0;

    System.out.print("Introduce un numero: ");
    numIntroducido = sc.nextInt();


    System.out.println("---------------------------");
    for(int i = numIntroducido; i < numIntroducido + 5; i++){
    System.out.printf("|  %d  | |  %d  | |  %d  |  \n", i, (i*i), (i*i*i));
    }
    System.out.println("---------------------------");
    sc.close();
    }
  }
    
