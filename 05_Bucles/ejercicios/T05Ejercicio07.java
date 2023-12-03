/**
* T05Ejercicio07
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("CAJA FUERTE");
    int codigo = 1234;
    int codigoIntroducido = 0;
    int intentos = 4;
    boolean correcto = false;

   do{
    System.out.print("Introduce la combinación: ");
    codigoIntroducido = s.nextInt();
    intentos -= 1;

         if (codigoIntroducido == codigo) {
        correcto = true;
      } else {
        System.out.println("Clave incorrecta. Le quedan " + intentos + " intentos.");
      }
    } while((intentos > 0) && (!correcto));    //!correcto  <-->  correcto == false
    
    s.close();

    if (correcto) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, no le quedan más intentos.");
    }
  }
}