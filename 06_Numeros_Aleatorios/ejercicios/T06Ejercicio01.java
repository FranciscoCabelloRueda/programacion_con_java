/**
 * T06Ejercicio01
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio01 {
  public static void main(String[] args) {
    double numero = 0;
    int suma = 0;

    for (int i = 1; i <= 3; i++) {
      numero = (int) ((Math.random()* 6) + 1);
      System.out.printf("%dº Tirada: %.0f \n", i, numero);
      suma += numero;
    }

    System.out.println("La suma de las tiradas es " + suma + ".");

  }
}
