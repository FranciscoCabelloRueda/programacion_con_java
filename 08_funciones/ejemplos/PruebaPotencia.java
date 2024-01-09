import matematicas.Potencia;
import java.util.Scanner;
public class PruebaPotencia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     int base;
     int exponente;

     base =sc.nextInt();
     exponente = sc.nextInt();

     System.out.println(Potencia.potencia(base, exponente));
     

sc.close();
  }
}
