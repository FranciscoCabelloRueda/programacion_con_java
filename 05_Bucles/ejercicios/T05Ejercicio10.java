/**
* T05Ejercicio10
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numIntroducido = 0;
    double suma = 0;
    int cantidadNumeros = 0;
    
    while (numIntroducido >= 0){

    System.out.print("Introduce un número: "); 
    numIntroducido = sc.nextDouble();

      if (numIntroducido > 0) {
      suma += numIntroducido;
      cantidadNumeros++; 
      }
    }

    System.out.println("La media de los numeros introducidos es: " + (suma / cantidadNumeros)); 

    sc.close();
  }
}