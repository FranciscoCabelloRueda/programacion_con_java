/**
 * Coche
 * 
 * @author Francisco Javier Cabello Ruedda
 */
public class Coche {

   //Atributos
   String matricula;
   String modelo;
   String marca;
   int puertas;
   String color;
   int potencia;

  public static void main(String[] args) {
    Coche miCoche = new Coche();
    Coche tuCoche = new Coche();

    miCoche.matricula = "1234ABC";
    System.out.println("Matricula coche 1: " + miCoche.matricula);
    System.out.println("Potencia coche 1: " + miCoche.potencia);
    System.out.println("Matricula coche 2: " + tuCoche.matricula);
    System.out.println("Potencia coche 2: " + tuCoche.potencia);
  }
}
