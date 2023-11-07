import java.util.Scanner;
/**
 * Examen05
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class Examen05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("\033[1m VIDA ÚTIL SSD\033[0m");
    System.out.println("=============== ");
    System.out.print("Introduce el factor TBW de tu disco duro SSD: ");
    double TBW = sc.nextDouble();

    double TB = TBW / (365*6);
    double GB = TB * 1000;

    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: %.4f TB ( %.1f GB)",TB,GB );


    sc.close();
  }
}