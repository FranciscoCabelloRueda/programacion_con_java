import matematicas.VolteaNumeros;
public class PruebaVolteaNumeros {
  public static void main(String[] args) {

   //Prueba de la función long voltea()

    System.out.print("Introduzca un número para voltearlo: ");
    long x = Long.parseLong(System.console().readLine());
     System.out.println("El numero " + x + " volteado es: " + VolteaNumeros.voltea(x));
    
   //Prueba de la función int voltea()

   System.out.print("Introduzca un número para voltearlo: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("El numero " + num + " volteado es: " + VolteaNumeros.voltea(num));
  }

}
