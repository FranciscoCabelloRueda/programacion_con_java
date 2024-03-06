package clases;
/**
* Definición de la clase Perro
*
* @author Francisco Javier Cabello Rueda
*/
public class Perro extends Mascota {

  //Atributos
  private String raza;
  static int totalPerros;

  //Constructor
  public Perro(String chip) {
    super(chip);
    totalPerros++;
    totalMascotas++;
  }

  public Perro(String chip, String nombre) {
    super(chip, nombre);
    totalPerros++;
    totalMascotas++;
  }

  //Métodos
  public void ladrar(){
    System.out.println("Guau Guau");
  }

  public void grunir(){
    System.out.println("Grrrr...");
  }

  @Override
  public void pasear(){
    if (vacunada == false) {
      System.out.println(this.nombre + " no puede pasear hasta no estar vacunado/a"); 
    } else{
      System.out.println("Guau Guau");
    } 
  }

  @Override
  public void vacunar(){
    if (vacunada == true) {
      System.out.println(this.nombre + " se encuentra vacunado/a");
    } else {
      vacunada = true;
      this.grunir();
    }
  }

  //Setters
  public void setRaza(String raza){
    this.raza = raza;
  }

  //Getters
  public String getRaza(){
    return this.raza;
  }

}
