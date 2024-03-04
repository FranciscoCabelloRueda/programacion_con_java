public class Ejercicio01 {
  public static void main(String[] args) {
    int minimo = 0;
    int maximo = 0;
    int num = 0;
    int numeroAleatorio = 0;
    int juego = 1;

    do {
      System.out.println("");
      System.out.println("Bienvenido a D-I-V-I-N-A-R-E-M !!");
      System.out.println("Divinarem pensará un número entre los valores que tu decidas");
      System.out.print("Introduzca el valor mínimo del intervalo: ");
      minimo = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el valor máximo del intervalo: ");
      maximo = Integer.parseInt(System.console().readLine());
      System.out.println("");

      System.out.println("D-I-V-I-N-A-R-E-M");

      maximo = (int)(Math.random()*(maximo - minimo) + minimo );
      minimo = (int)(Math.random()* maximo + minimo );
      System.out.printf("Estoy pensando un número entre %d y %d \n", minimo, maximo);

      int intentos = (int)(Math.log(maximo-minimo+1) / Math.log(2));
      System.out.printf("Tienes %d intentos \n", intentos);

      numeroAleatorio = (int)(Math.random()*(maximo- minimo) + minimo );

      do {
        System.out.print("Escribe un numero:");
        num = Integer.parseInt(System.console().readLine());

        if (num > numeroAleatorio) {
          System.out.println("Te has pasado");
        } else if(num < numeroAleatorio){
          System.out.println("Te has quedado corto");
        }
        intentos--; 
        if (intentos == 0){
          System.out.println("");
          System.out.println("Has superado el numero de intentos");
          System.out.printf("El numero era: %d \n", numeroAleatorio);
        } else if (num == numeroAleatorio){
          System.out.println("");
          System.out.println("ENHORABUENA!! HAS ACERTADO.");
          System.out.printf("Efectivamente el numero era: %d \n", numeroAleatorio);
          intentos = 0;
        } 
      } while ((intentos > 0));

      System.out.println("");
      System.out.println("1. Volver a jugar.");
      System.out.println("2. Salir del juego");
      System.out.print("Elige una opcion: ");
      juego = Integer.parseInt(System.console().readLine());
} while (juego == 1);

System.out.println("");
System.out.printf("Gracias por jugar a D-I-V-I-N-A-R-E-M"); 

  }
}
