/**
 * T06Ejercicio08
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Ejercicio08 {
  public static void main(String[] args) {
    int resultadoPartido;
    int columnas = 3;
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf(" %4d. |", fila);
      if (fila == 15) {
        columnas = 1;
      }
      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 6) + 1;
        switch(resultadoPartido) {
        case 1,2,3:
          System.out.print(" 1 |");
          break;
        case 4,5:
          System.out.print(" X |");
          break;
        case 6:
          System.out.print(" 2 |");
        
        }
      }
      System.out.println();
    }
  }
}