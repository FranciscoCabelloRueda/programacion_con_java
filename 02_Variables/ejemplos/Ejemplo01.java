/**
 * 
 * T02Ejemplo01
 * 
 * @author Francisco Javier Cabello Rueda
 * 
 */
  public class Ejemplo01 {
  public static void main(String[] args) {
     
    //Tipo byte
    byte miNumByte = 100;
    System.out.println(miNumByte);

    //Tipo short
    short miNumShort = 5000;
    System.out.println(miNumShort);

    //Tipo long
    long miNumLong = 150000000;
    System.out.println(miNumLong);

    //Tipo float
    float miNumFloat = 5.75f;
    System.out.println(miNumFloat);

    //Tipo boolean
    boolean esJavaDivertido = true;
    System.out.println(esJavaDivertido);
    boolean esJavaAburrido = false;
    System.out.println(esJavaAburrido);


    int numero = 5;

    System.out.println("El valor de  una variable es " + numero);

    double x;
    double y;

    x = 7;
    y = 25.75;

    System.out.println("X vale " + x);
    System.out.println("Y vale " + y);

    char letra1 = 99;
    System.out.println(letra1);

    String miString ="a";
    System.out.println(miString);

    int num1 = 9;
    int num2 = 2;
    System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es = " + num1%num2);

  
    int b = 9;

    System.out.println("El casting de la variable b es " + (double) b);
  }
}
