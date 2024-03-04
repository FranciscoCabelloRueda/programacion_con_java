/**
* Animal.java
* Definición de la clase Animal
* @author Francisco Javier Cabello Rueda
*/

public abstract class Animal {
  //Atributos
  private Sexo sexo;

  //Constructor
  public Animal () {
    sexo = Sexo.MACHO;
  }
  public Animal (Sexo s) {
    sexo = s;
  }
  //Getters
  public Sexo getSexo() {
    return sexo;
  }

  //Metodos
  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }

  /**
  * Hace que el animal se eche a dormir.
  */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }

}