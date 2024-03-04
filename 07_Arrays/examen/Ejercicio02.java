public class Ejercicio02 {

  // Función para generar una tabla con números aleatorios
  public static int[][] generarTablaAleatoria(int filas, int columnas, int maxAleatorio) {
    int[][] tabla = new int[filas][columnas];

    for (int i = 0; i < filas ; i++) {
      for (int j = 0; j < columnas; j++) {
        tabla[i][j] = (int) (Math.random() * (maxAleatorio +1));
      }
    }
    return tabla;
  }

  // Función para generar una tabla introduciend0 números manualmente
  public static int[][] generarTablaManual(int filas, int columnas) {

    int[][] tabla = new int[filas][columnas];

    for (int i = 0; i < filas ; i++) {
      for (int j = 0; j < columnas; j++) {
        tabla[i][j] = Integer.parseInt(System.console().readLine());;
      }
    }
    return tabla;
  };
  

  // // Función para mostrar la tabla
  // public static void mostrarTabla(int[][] tabla) {
  //   if (tabla == null) {
  //     System.out.println("Primero debe generar la tabla.");
  //     return;
      
  //   for (int i = 0; i < tabla[i][j] ; i++) {
  //     for (int j = 0; j < tabla; j++) {
  //       System.out.print(tabla[i][j]);
  //     }
  //   System.out.println("");
  //   }
  // }
  // }

  // // Función para intercambiar dos filas en la tabla
  // public static void intercambiarFilas(int[][] tabla, int fila1, int fila2) {
  //   /* COMPLETAR */
  // }

  // // Función para intercambiar dos columnas en la tabla
  // public static void intercambiarColumnas(int[][] tabla, int col1, int col2) {
  //   /* COMPLETAR */
  // }

  // // Función para sumar los elementos de una fila
  // public static int sumarFila(int[][] tabla, int fila) {
   
  // }

  // // Función para sumar los elementos de una columna
  // public static int sumarColumna(int[][] tabla, int col) {
    
  // }


  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas = 0;
    int columnas = 0;
    int fila;
    int columna;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma = 0;
    int colSuma = 0;
    int maxAleatorio;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          System.out.print("Introduce el número de filas: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce el número de columnas: ");
          columnas = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce aleatorio maximo que podra tener la tabla: ");
          maxAleatorio = Integer.parseInt(System.console().readLine());
          tabla = generarTablaAleatoria(filas, columnas, maxAleatorio);
          break;
        case 2:
          System.out.print("Introduce el número de filas: ");
          filas = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce el número de columnas: ");
          columnas = Integer.parseInt(System.console().readLine());
          tabla = generarTablaManual(filas, columnas);
          break;
        case 3:
          /*
        //    * Completar
        //    */
        //   break;
        // case 4:
        //   /*
        //    * Completar
        //    */
        //   intercambiarFilas(tabla, fila1, fila2);
        //   break;
        // case 5:
        //   /*
        //    * Completar
        //    */
        //   intercambiarColumnas(tabla, col1, col2);
        //   break;
        case 6:
          System.out.print("¿En que fila desea sumar los valores?:");
          fila = Integer.parseInt(System.console().readLine()); 
          for (int i = 0; i < columnas; i++) {
            filaSuma += tabla[fila][i];
          }    
          System.out.print("La suma de la fila es: " + filaSuma);
         break;
        case 7:
          System.out.print("¿En que columna desea sumar los valores?:");
          columna = Integer.parseInt(System.console().readLine()); 
          for (int i = 0; i < filas; i++) {
            colSuma += tabla[i][columna];
          }    
          System.out.print("La suma de la columna es: " + colSuma);
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
