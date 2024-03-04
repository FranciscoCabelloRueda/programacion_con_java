/**
 * T06Evaluable
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */
public class T06Evaluable {
  public static void main(String[] args) {
    int resultado;
    int columnas = 3;

    System.out.println("APUSETA REALIZADA");
    System.out.println("");

    for (int filas = 1; filas <= 15; filas++) {

      System.out.printf(" %2d. |", filas);
      
      if (filas == 15) {
        columnas = 0;
        int resultadoLocal = (int) (Math.random() * 4);
        int resultadoVisitante  = (int) (Math.random() * 4) ;
        
        if(resultadoLocal == 3 && resultadoVisitante == 3){
          System.out.println(" Local M  Visitante M");
        } else if (resultadoLocal == 3 && resultadoVisitante != 3) {
          System.out.println(" Local M  Visitante " + resultadoVisitante);
        } else if (resultadoLocal != 3 && resultadoVisitante == 3){
          System.out.println(" Local " + resultadoLocal + "  Visitante M");
        } else {
          System.out.println(" Local " + resultadoLocal + "  Visitante " + resultadoVisitante);
        }
      }

      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultado = (int)(Math.random() * 3) + 1;
        switch(resultado) {
        case 1:
          System.out.print(" 1 |");
          break;
        case 2:
          System.out.print(" 2 |");
          break;
        case 3:
          System.out.print(" X |");
        }
      }
      System.out.println();
    }

    System.out.println("RESULTADO");
    System.out.println("");

    columnas = 3;

    for (int filas = 1; filas <= 15; filas++) {

      System.out.printf(" %2d. |", filas);
      
      if (filas == 15) {
        columnas = 0;
        int resultadoLocal = (int) (Math.random() * 4);
        int resultadoVisitante  = (int) (Math.random() * 4) ;
        
        if(resultadoLocal == 3 && resultadoVisitante == 3){
          System.out.println(" Local M  Visitante M");
        } else if (resultadoLocal == 3 && resultadoVisitante != 3) {
          System.out.println(" Local M  Visitante " + resultadoVisitante);
        } else if (resultadoLocal != 3 && resultadoVisitante == 3){
          System.out.println(" Local " + resultadoLocal + "  Visitante M");
        } else {
          System.out.println(" Local " + resultadoLocal + "  Visitante " + resultadoVisitante);
        }
      }

      for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultado = (int)(Math.random() * 3) + 1;
        switch(resultado) {
        case 1:
          System.out.print(" 1 |");
          break;
        case 2:
          System.out.print(" 2 |");
          break;
        case 3:
          System.out.print(" X |");
        }
      }
      System.out.println();
    }
  } 
}
