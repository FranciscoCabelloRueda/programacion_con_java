package matematicas;

public class EsCapicua {

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

  public static int voltea(int x){

    return (int)voltea((long)x);
  }

  
  public static boolean esCapicua(long x){
    return x == voltea(x);
   }
 
   public static boolean esCapicua(int x){
     return esCapicua((long)x);
   }
}
