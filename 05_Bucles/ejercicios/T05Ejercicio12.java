/**
* T05Ejercicio12
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido = 0;
    int primerNumero = 0;
    int segundoNumero = 1;
    int siguienteNumero = 0;


    System.out.print("Introduce los numeros que quieres ver de la sucesión de fibonacci: ");
    numIntroducido = sc.nextInt();

    
    for(int i = 1; i <= numIntroducido; i++){
    
    System.out.print(" " + siguienteNumero + ",");
    primerNumero = segundoNumero;
    segundoNumero = siguienteNumero;
    siguienteNumero = primerNumero + segundoNumero;
    }
    sc.close();
  }
}
