/**
 * T07Ejercicio07
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class T07Ejercicio07 {
  public static void main(String[] args) {
  int[] numero = new int[100];
  int i;
  String verde = "\033[32m";
  String blanco = "\033[37m";

  // Rellena el array con números aleatorios
  for (i = 0; i < 100; i++) {
    numero[i] = (int)(Math.random() * 21);
    System.out.print(numero[i] + " ");
  }

  System.out.print("\nIntroduzca un número de los que se han mostrado: ");
  int valor1 = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
  int valor2 = Integer.parseInt(System.console().readLine());
  System.out.println();

  for (i = 0; i < 100; i++) {
    if (numero[i] == valor1) {
      numero[i] = valor2;
      System.out.print(verde + "\"" + numero[i] + "\" ");
    } else {
      System.out.print(blanco + numero[i] + " ");
    }
  }
  System.out.println();
  }
}
  
