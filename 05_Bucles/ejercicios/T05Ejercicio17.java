/**
* T05Ejercicio17
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numeroIntroducido = 0;
    int num = 0;

    do{
    System.out.print("Introduzca un número: ");
    numeroIntroducido = sc.nextInt();
    }while(numeroIntroducido < 0);

    for (int i = numeroIntroducido; i < (numeroIntroducido + 100); i++){
      num += i;

    }

    System.out.println("El numero que surge de la suma de los 100 numeros siguientes al numero introducido es " + num);

    sc.close();
  }
}