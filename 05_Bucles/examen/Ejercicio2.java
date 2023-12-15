/**
* Ejercicio2
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String jugador1 = "";
    int longitud1 = 0;
    String jugador2 = "";
    int longitud2 = 0;
    String jugada1 = "";
    String jugada2 = "";
    int puntos1 = 0;
    int puntos2 = 0;
    int longitudmaxima = 0;
    int longitudminima = 0;

    System.out.print("Introduce el nombre del jugador 1:");
    jugador1 = sc.nextLine();
    longitud1 = jugador1.length();
    System.out.print("Introduce el nombre del jugador 2:");
    jugador2 = sc.nextLine();
    longitud2 = jugador2.length();

    if(longitud1 < longitud2){
      longitudmaxima = longitud2;
      longitudminima = longitud1;
    } else {
      longitudmaxima = longitud1;
      longitudminima = longitud2;
    }

      
    while(puntos1 != 3 && puntos2 != 3){
      System.out.println("");
      System.out.print("Turno del jugador1: ");
      jugada1 = sc.nextLine();
      System.out.print("\033[H\033[2J"); 
      System.out.flush();

      System.out.print("Turno del jugador2: ");
      jugada2 = sc.nextLine();

      if((jugada1.equals("piedra")) || (jugada1.equals("papel")) || (jugada1.equals("tijeras")) && (jugada2.equals("piedra"))  || (jugada2.equals("papel")) || (jugada2.equals("tijeras"))){
    
    
      if((jugada1.equals("piedra")) && (jugada2.equals("tijeras"))){
        System.out.print("Gana jugador 1"); 
        puntos1++;
      } else if ((jugada1.equals("papel")) && (jugada2.equals("piedra"))){
        System.out.print("Gana jugador 1"); 
        puntos1++;
      } else if ((jugada1.equals("tijeras")) && (jugada2.equals("papel"))){
        System.out.print("Gana jugador 1"); 
        puntos1++;
      } else if ((jugada1.equals(jugada2) || (jugada2.equals(jugada1) ))){
        System.out.print("Empate"); 
      } else {
        System.out.print("Gana jugador 2"); 
        puntos2++;
      }

      System.out.println("");
      System.out.print(" ");
      for (int i = 1; i <= longitudmaxima + 4; i++) {
        System.out.print("-");
    }
      System.out.print(" --- --- ");
      for (int i = 1; i <= longitudmaxima + 4 ; i++) {
        System.out.print("-");
    }
      System.out.print(" ");
      System.out.println("");
      System.out.print("|");

      if (longitudmaxima != longitud1) {
      for (int i = 1; i <= longitudmaxima - longitudminima + 2 ; i++) {
        System.out.print(" ");
    } 
      } else{ 
      System.out.print("  ");
      }
      
      System.out.print(jugador1 + "  | " + puntos1 +" | " + puntos2 + " |  " + jugador2 );

      if (longitudmaxima != longitud2) {
      for (int i = 1; i <= longitudmaxima - longitudminima + 2 ; i++) {
        System.out.print(" ");
    } 
      } else{ 
      System.out.print("  ");
      }
      System.out.print("|");
      System.out.println("");

      System.out.print(" ");
      for (int i = 1; i <= longitudmaxima + 4; i++) {
        System.out.print("-");
    }
      System.out.print(" --- --- ");
      for (int i = 1; i <= longitudmaxima + 4 ; i++) {
        System.out.print("-");
    }
      System.out.print(" ");

    }

    System.out.println("");

    if(puntos1 == 3){
      System.out.println("Ha ganado el jugador 1");
    }else if(puntos2 == 3){
      System.out.println("Ha ganado el jugador 2");
    }

    }
    sc.close();
  }
}