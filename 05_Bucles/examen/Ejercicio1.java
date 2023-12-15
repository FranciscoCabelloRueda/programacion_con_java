/**
* Ejercicio1
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombreCompleto= "";
    int primerTrimestre=0;
    int segundoTrimestre=0;
    int tercerTrimestre=0;
    double notaMedia=0;

    System.out.print("Introduce tu nombre en el formato (Apellido1 Apelllido2, nombre):");
    nombreCompleto = sc.nextLine();

    do{
    System.out.print("Introduce la nota del primer trimestre: ");
    primerTrimestre = sc.nextInt();
    System.out.print("Introduce la nota del segundo trimestre: ");
    segundoTrimestre = sc.nextInt();
    System.out.print("Introduce la nota del tercer trimestre: ");
    tercerTrimestre = sc.nextInt();
    if ((primerTrimestre>=10 || primerTrimestre<=0)||(segundoTrimestre>=10 || segundoTrimestre<=0)||(tercerTrimestre>=10 || tercerTrimestre<=0)) {
      System.out.println("ERROR. Repita las notas");
    }
    }while((primerTrimestre>=10 || primerTrimestre<=0)||(segundoTrimestre>=10 || segundoTrimestre<=0)||(tercerTrimestre>=10 || tercerTrimestre<=0));

    notaMedia= (double) ((primerTrimestre + segundoTrimestre + tercerTrimestre)/3);

    System.out.printf("| %s | %d | %d | %d | %.2f |",nombreCompleto,primerTrimestre,segundoTrimestre,tercerTrimestre,notaMedia);




    sc.close();
  }
}
