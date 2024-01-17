/**
 * T06Ejercicio04
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio04 {
  public static void main(String[] args) {
    double numero = 0;

    for (int i = 1; i <= 20; i++) {
      numero = (int) (Math.random()* 11);
      System.out.printf("%.0f ",numero);
    }
  }
}
