/**
 * T06Ejercicio06
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio06 {
  public static void main(String[] args) {

    int numero_Introducido = 0;
    int numero = (int) (Math.random()* 101);
    int intentos = 5;

    do {
      System.out.print("Introduce un número: ");
      numero_Introducido = Integer.parseInt(System.console().readLine());

      if (numero != numero_Introducido) {
        intentos --;
        System.out.println("FALLO. Quedan " + intentos + " intentos.");

        if (numero_Introducido > numero) {
          System.out.println("El número a adivinar es menor al introducido");
        } else if (numero_Introducido < numero) {
          System.out.println("El número a adivinar es mayor al introducido");
        }
      } else if ( numero == numero_Introducido){
        System.out.println("ENHORABUENA, has acertado el número.");
        intentos = 0;
      }
    } while (intentos > 0);
  }
}
