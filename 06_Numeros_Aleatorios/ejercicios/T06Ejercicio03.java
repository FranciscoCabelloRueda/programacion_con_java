/**
 * T06Ejercicio03
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio03 {
  public static void main(String[] args) {
    int palo = 0;
    String palo2 = "";
    int numero = 0;
    String numero2 = "";

    palo = (int) ((Math.random()*4) + 1);
    switch (palo) {
      case 1:
        palo2 = ("Copas");
        break;
      case 2:
        palo2 = ("Espadas");
        break;
      case 3:
        palo2 = ("Oros");
        break;
      case 4:
        palo2 = ("Bastos");
        break;
    }

    numero = (int) ((Math.random()*10) + 1);
    switch (numero) {
      case 1:
        numero2 = ("As");
        break;
      case 8:
        numero2 = ("Sota");
        break;
      case 9:
        numero2 = ("Caballo");
        break;
      case 10:
        numero2 = ("Rey");
        break;
      default:
        numero2 = String.valueOf(numero);
        break;
    }

    System.out.println("Tu carta es un " + numero2 + " de " + palo2 + ".");
  }
}