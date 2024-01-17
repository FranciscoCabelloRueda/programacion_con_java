/**
 * T06Ejercicio05
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio05 {
  public static void main(String[] args) {
    int numero = 0;
    int maximo = 0;
    int minimo = 199;
    int suma = 0;
    double media = 0;

    for (int i = 1; i <= 50; i++) {
      numero = (int) ((Math.random()* 100) + 100);
      System.out.printf("%d ",numero);

      if (numero > maximo) {
        maximo = numero;
      } else if (numero < minimo) {
        minimo = numero;
      }

      suma += numero;

    }

    media = suma / 50;

    System.out.print("\n");
    System.out.print("\n");
    System.out.printf("El maximo es %d \n", maximo);
    System.out.printf("El minimo es %d \n", minimo);
    System.out.printf("La media de los 50 números es de %.2f \n", media);

  }
}
