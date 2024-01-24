/**
 * T06Ejercicio12
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio12 {
  public static void main(String[] args) {

    int num = 0;
    int bucle = 1;

    System.out.print("\033[32m"); // pinta en verde
   
    while (bucle == 1) {
      num = (int) (Math.random()*95 + 32);
      System.out.print((char) num);
    }
  }
}