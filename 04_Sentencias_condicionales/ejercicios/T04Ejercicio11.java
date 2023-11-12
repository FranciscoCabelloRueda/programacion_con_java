/**
* T04Ejercicio11
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("A continuación deberá introducir una hora del día, primero introducirá la hora y luego los minutos.");
    System.out.print("hora: ");
    int hora = sc.nextInt();

    System.out.print("minutos: ");
    int minutos = sc.nextInt();

    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.\n", hora, minutos, segundosHastaMedianoche);
    
    sc.close();
  }
}