package clases;
/**
* Definición de la clase Gato
*
* @author Francisco Javier Cabello Rueda
*/
public class Gato extends Mascota {

  //Atributos
  String pelaje;
  static int totalGatos;

  //Constructor
  public Gato(String chip) {
    super(chip);
    totalGatos++;
    totalMascotas++;
  }

  public Gato(String chip, String nombre) {
    super(chip,nombre);
    totalGatos++;
    totalMascotas++;
  }

  //Métodos
  public void maullar(){
    System.out.println("Miaaaaaauuuuu Brrrr....");
  }

  public void bufar(){
    System.out.println("Fuuuu...");
  }

  @Override
  public void pasear(){
    if (vacunada == false) {
      System.out.println(this.nombre + " no puede pasear hasta no estar vacunado/a"); 
    } else{
      System.out.println("Miaaaaaaauuuuuu Brrr...."); 
    } 
  }

  @Override
  public void vacunar(){
    if (vacunada == true) {
      System.out.println(this.nombre + " se encuentra vacunado/a");
    } else {
      vacunada = true;
      bufar();
    }
  }

  //Setters
  public void setPelaje(String pelaje){
    this.pelaje = pelaje;
  }

  //Getters
    public String getPelaje(){
    return this.pelaje;
  }

}
