package matematicas;

public class VolteaNumeros {

  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long numeroVolteado = 0;
    while (x > 0) {
      numeroVolteado = (numeroVolteado * 10) + (x % 10);
      x /= 10;
    }

    return numeroVolteado;
  }

  /** 
   * Voltear un número introducido por teclado, llamando a la función original que devuelve un long
   * @param x Un número entero
   * @return int casteando el resultado de llamar a la funcion long voltea()
   */

  public static int voltea(int x){

    return (int)voltea((long)x);
  }
}
