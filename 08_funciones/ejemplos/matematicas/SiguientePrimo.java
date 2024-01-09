package matematicas;

public class SiguientePrimo {

  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
  return true;
  }
  
  public static int siguientePrimo(int x){
    do {
      x++;
    } while (!esPrimo(x));
    return x;
  }
}
