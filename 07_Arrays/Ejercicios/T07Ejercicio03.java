/**
 * T07Ejercicio03
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class T07Ejercicio03 {
  public static void main(String[] args) {
    int[] n = new int [10];

    System.out.println("Por favor, introduzca 10 números enteros.");
    System.out.println("Pulse la tecla INTRO después de introducir cada número.");

    for (int i = 0; i < 10; i++) {
    n[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("\nLos números introducidos, al revés, son los siguientes:");

    for (int i = 9; i >= 0; i--) {
      System.out.println(n[i]);
    }
  } 
}


