import java.util.Scanner;

public class LeeDatosScanner01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");                 //Creamos un objeto de la clase Scanner; llamado sc
    System.out.println(("Introduce tu nombre: ")); 
    String nombre = sc.nextLine();                        //Guardamos en la variable nombre lo que introducimos

    System.out.println("Introduce tu edad: "); 
    int edad = sc.nextInt();                              //Guardamos en la variable edad lo que introducimos

    System.out.println("Tu nombre es " + nombre + " y tu edad es de " + edad + " años");
    sc.close();
  }
}
