/**
* T04Ejercicio02
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;

public class T04Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la hora del día actual:");
    int hora = sc.nextInt();
    System.out.println("=================================");
    
    if ((6 <= hora) && (hora <= 12) ) {
    System.out.println("Buenos días");  
    }
    if ((13 <= hora) && (hora <= 20) ) {
    System.out.println("Buenos tardes");  
    }
    if (((hora <= 5) && (1 <= hora)) || ((21 <= hora) && (hora <= 24)) ) {
    System.out.println("Buenos noches");  
    }
    if ((25 <= hora) || (hora <= 0) ) {
    System.out.println("**ERROR** La hora introducida no existe");  
    }
 
    sc.close();
  }
}