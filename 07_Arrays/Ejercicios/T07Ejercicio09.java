/**
 * T07Ejercicio09
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class T07Ejercicio09 {
  public static void main(String[] args){
    int[] numero = new int[8];
    int i;

    System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número:");
    for (i = 0; i < 8; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    for (i = 0; i < 8; i++) {
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
        System.out.println(numero[i] + " impar");
      }
    }
  }
}
  
