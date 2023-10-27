import java.util.Scanner;
public class LeeDatosScanner02 {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);

  System.out.println("Introduce tu nombre y tu edad (Separados por un espacio): ");
  String nombre = sc.next();
  int edad = sc.nextInt();

   System.out.println("Tu nombre es " + nombre + " y tu edad es de " + edad + " años");
  sc.close();  //Para evitar el warning cerramos el buffer

 

  }
}
