import java.util.Scanner;

/**
 * Examen02
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class Examen02 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("\033[1mVOLUMEN DE UN TRONCO DE CONO \033[0m");
     System.out.println("=============================");
     System.out.print("Introduzca el radio de la base mayor R (cm): ");
     double  R = sc.nextDouble();
     System.out.print("Introduzca el radio de la base menor r (cm): ");
     double r = sc.nextDouble();
     System.out.print("Introduzca la altura h (cm): ");
     double h = sc.nextDouble();

     double volumen =  (Math.PI * h * ((R * R) + (r * r) + (R * r)))/3;
     
     System.out.printf("El volumen del toroide es de\033[1;31m %.4f cm\u00B3 ", volumen);
     System.out.println("\033[0m");

     sc.close();
  }
}
