import java.util.ArrayList;
/**
 * Eliminar y encontrar coincidencias de elementos de un ArrayList de String: 
 * métodos remove y contains
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class EjemploArrayList03 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("Blanco");
    a.add("amarillo");

    System.out.println("Contenido de la lista: ");

    for(String color: a) {
      System.out.println(color);
    }

    if (a.contains("Blanco")) {
      System.out.println("");
      System.out.println("El blanco está en la lista de colores");
    }

    a.remove("Blanco");  

    System.out.println("");
    System.out.println("Contenido de la lista después de quitar la primera ocurrencia del color blanco: ");

    for(String color: a) {
      System.out.println(color);
    }

    a.remove(2);
    System.out.println("");
    System.out.println("Contenido de la lista después de quitar el elemento de la posición 2: ");

    for(String color: a) {
      System.out.println(color);
    }
  }
}
