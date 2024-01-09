package matematicas;

public class NumerosAmigos {
  
  public static int sumaDivisoresPropios (int x){
    int suma = 0;
    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        suma += i;
      }
    }
    return suma;
  }

  public static boolean numerosAmigos (int x, int y){
    if (x == sumaDivisoresPropios(y) && y == sumaDivisoresPropios(x)) {
      return true;
    }
    return false;
  }
}
