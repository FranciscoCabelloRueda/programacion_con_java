/**
 * Salida formateada utilizando enteros, decimales y decimales con precisión
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class SalidaFormateada01 {
    public static void main(String[] args) {
      System.out.printf("El número %d no tiene decimales. \n", 21);
      System.out.printf("El número %f tiene decimales. \n", 21.10);
      System.out.printf("El %.3f sale exactamente con %d decimales. \n", 50.02, 3);
      System.out.printf("Letra: %c. \n", 83);

      //Para ver el orden

      System.out.printf("Mostramos el segundo argumento: %2$d \n Y después el primero: %1$.2f", 23.04, 56);
    } 
}
