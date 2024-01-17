/**
 * T06Ejercicio02
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio02 {
  public static void main(String[] args) {
    int palo = 0;
    String palo2 = "";
    int numero = 0;
    String numero2 = "";

    palo = (int) ((Math.random()*4) + 1);
    switch (palo) {
      case 1:
        palo2 = ("Picas");
        break;
      case 2:
        palo2 = ("Corazones");
        break;
      case 3:
        palo2 = ("Diamantes");
        break;
      case 4:
        palo2 = ("Tréboles");
        break;
    }

    numero = (int) ((Math.random()*12) + 1);
    switch (numero) {
      case 1:
        numero2 = ("A");
        break;
      case 10:
        numero2 = ("J");
        break;
      case 11:
        numero2 = ("Q");
        break;
      case 12:
        numero2 = ("K");
        break;
      default:
        numero2 = String.valueOf(numero);
        break;
    }

    System.out.println("Tu carta es un " + numero2 + " de " + palo2 + ".");
  }
}