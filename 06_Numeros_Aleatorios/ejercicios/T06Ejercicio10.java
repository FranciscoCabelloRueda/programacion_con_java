/**
 * T06Ejercicio10
 * 
 * @author Francisco Javier cabello Rueda
 * 
 */

public class T06Ejercicio10 {
  public static void main(String[] args) {
    int caracter;
    int longitud;
    String relleno = "";

    for(int i = 1; i <= 10; i++) {
      longitud = (int)(Math.random() * 40) + 1;
      caracter = (int)(Math.random() * 6);
      switch(caracter) {
        case 0:
          relleno = "*";
          break;
        case 1:
          relleno = "-";
          break;
        case 2:
          relleno = "=";
          break;
        case 3:
          relleno = ".";
          break;
        case 4:
          relleno = "|";
          break;
        case 5:
          relleno = "@";
          break;
       }

      for(int j = 1; j <= longitud; j++) {
        System.out.print(relleno);
      }

      System.out.println();
    }
  }
}
  