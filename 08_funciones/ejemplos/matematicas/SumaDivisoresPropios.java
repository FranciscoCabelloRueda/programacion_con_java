package matematicas;

public class SumaDivisoresPropios {

  public static int sumaDivisoresPropios (int x){
    int suma = 0;
    for (int i = 1; i < x; i++) {
      if (x % i == 0) {
        suma += i;
      }
    }
    return suma;
  }
  
}
