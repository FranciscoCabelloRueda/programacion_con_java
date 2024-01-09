import matematicas.EsPrimo;
import java.util.Scanner;
public class PruebaEsPrimo {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   System.out.print("Introduzca un número entero y le diré si es primo: ");
   int numeroIntroducido = sc.nextInt();

   if (EsPrimo.esPrimo(numeroIntroducido)) {
    System.out.println("El número introducido es primo.");
  } else {
    System.out.println("El número introducido no es primo.");
  }
  
   sc.close();
  }
}


