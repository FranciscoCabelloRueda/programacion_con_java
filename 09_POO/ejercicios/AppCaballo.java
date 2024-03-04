/**
* Ejercicio 1 Tema 9
* 
* @author Francisco Javier Cabello Rueda
*/
public class AppCaballo {
 public static void main(String[] args) {
  Caballo a = new Caballo("Avra", "Marrón", 6, 24);
  Caballo b = new Caballo("Lykos", "Negro", 8, 61);

  System.out.println("Hola me llamo " + a.getNombre());
  System.out.println("Tengo " + a.getEdad() + " años");
  System.out.println("Tengo el pelo " + a.getColor());
  System.out.println("He ganado " + a.getCarrerasGanadas() + " carreras");
  a.cabalga();
  a.relincha();

  System.out.println("");

  System.out.println("Hola me llamo " + b.getNombre());
  System.out.println("Tengo " + b.getEdad() + " años");
  System.out.println("Tengo el pelo " + b.getColor());
  System.out.println("He ganado " + b.getCarrerasGanadas() + " carreras");
  b.cabalga();
  b.rumia();
 }
}
