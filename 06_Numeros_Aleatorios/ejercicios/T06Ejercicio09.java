/**
 * T06Ejercicio09
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio09 {
  public static void main(String[] args) {
    int numero = 0;
    int contador = 0;

    do{
      numero = (int)(Math.random() * 51) * 2;
      System.out.print(numero + " ");
      contador++;
    } while(numero != 24);
    
    System.out.println("\nSe han generado " + contador + " números.");
  }
}
  
