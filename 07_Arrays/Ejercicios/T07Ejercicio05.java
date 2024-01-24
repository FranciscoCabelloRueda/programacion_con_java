/**
 * T07Ejercicio05
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class T07Ejercicio05 {
  public static void main(String[] args) {
    int[] numero = new int [10];
    int maximo = 0;
    int minimo = 999999999;

    System.out.println("Introduce 10 números aleatorios:");

    for (int i = 0; i < 10; i++) {
      numero[i] =Integer.parseInt(System.console().readLine());

      if (numero[i] > maximo) {
        maximo = numero[i];
      } else if (numero[i] < minimo){
        minimo= numero[i];
      }
    }

    for (int i = 0; i < 10; i++) {
      System.out.print(numero[i]);

      if (numero[i] == maximo) {
        System.out.print(" (MÁXIMO)");
      }else if (numero[i] == minimo) {
        System.out.print(" (MÍNIMO)");
      }
      System.out.println();
    }  
  } 
}