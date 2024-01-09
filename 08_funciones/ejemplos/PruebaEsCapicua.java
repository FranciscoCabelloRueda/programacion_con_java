import matematicas.EsCapicua;

public class PruebaEsCapicua {

  public static void main(String[] args) {
    
        System.out.print("Introduzca un número para saber si es capicúa (int): ");
    int x = Integer.parseInt(System.console().readLine());

    if (EsCapicua.esCapicua(x)) {
       System.out.println("El número es capicúa");
     } else {
       System.out.println("El número no es capicúa");
     }
  }
}
