import java.util.Scanner;
public class LeeDatosScanner03 {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);

  System.out.println("Introduce numeros separados por espacios: ");

  double X1 = sc.nextDouble();
  double X2 = sc.nextDouble();
  double X3 = sc.nextDouble();

  double media = (X1 + X2 + X3 ) / 3.0;

   System.out.println("Los números introducidos son " + X1 + ". " + X2 + ", " + X3 + " y su media es: " + media );
  sc.close();  //Para evitar el warning cerramos el buffer

 

  }
}
