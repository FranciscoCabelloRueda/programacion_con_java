/**
 * T06Ejercicio13
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio13 {
  public static void main(String[] args) {

    int dado1=0;
    int dado2=0;

    do {
      dado1 = (int) (Math.random()*6 + 1);
      System.out.print(dado1 + ", ");
      dado2 = (int) (Math.random()*6 + 1);
      System.out.println(dado2);
    } while (dado1 != dado2);
  }
}