public class LeeNumeros {
  public static void main(String[] args) {
    String linea; //Variable que alamacenara cada linea que introduzcamos

    System.out.println("Introduce un número");
    linea = System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea);

        System.out.println("Introduce otro número");
    linea = System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea);

    System.out.println("La suma de los números introducidos es " + (num1 + num2));

    //Parseamos float


    System.out.println("Introduce un número real: ");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);

    System.out.println("El numero introducido entre 2.5 es " + (numReal/2.5));
  }
}
