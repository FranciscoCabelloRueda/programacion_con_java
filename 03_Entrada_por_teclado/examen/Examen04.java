import java.util.Scanner;
/**
 * Examen04
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class Examen04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\033[1m CALCULADORA DEL TIEMPO\033[0m");
    System.out.println("========================");
    System.out.print("Introduzca la cantidad de dias: ");
    int dias = sc.nextInt();

    int años = dias / 365;
    int meses =  (dias % 365) / 30;
    int dias2 = (dias % 365) % 30;

    System.out.println(dias + " días son \033[41m" + años + " años\033[0m, \033[42m" + meses + " meses\033[0m y \033[43m" + dias2 + " días\033[0m.");
    sc.close();
    }
  }