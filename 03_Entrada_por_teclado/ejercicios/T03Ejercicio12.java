/**
 * 
 * T03Ejercicio12
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */

import java.util.Scanner;

public class T03Ejercicio12 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la nota del primer examen: ");

    double primerExamen = sc.nextDouble();

    System.out.println("Introduce la nota que deseas sacar en el trimestre: ");

    double notaMedia  = sc.nextDouble();
    double segundoExamen = ((notaMedia - ( primerExamen * 0.4 )) / 0.6);   

    System.out.println("Para tener un " + notaMedia + " en el trimestre necesitas sacar un " + segundoExamen + " en el segundo examen");

    sc.close();
  }
}