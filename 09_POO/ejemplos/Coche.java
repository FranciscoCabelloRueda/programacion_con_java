/**
* Coche.java
* Definición de la clase Coche
* @author Francisco Javier Cabello Rueda
*/
public class Coche {

  // atributo de clase
  private static int kilometrajeTotal = 0;

  // método de clase
  public static int getKilometrajeTotal() {
    return kilometrajeTotal;
  }

  private int kilometraje;

  public Coche() {
    kilometraje = 0;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  /**
  * Recorre una determinada distancia.
  *
  * @param km distancia a recorrer en kilómetros
  */
  public void recorre(int km) {
    kilometraje += km;
    kilometrajeTotal += km;
  }
}
