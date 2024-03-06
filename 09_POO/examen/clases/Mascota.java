package clases;
/**
* Definición de la clase abstracata Mascota
*
* @author Francisco Javier Cabello Rueda
*/
public abstract class Mascota implements MascotaInterface {
  //Atributos
  protected String chip;
  protected String nombre;
  protected int edad;
  protected boolean vacunada = false;
  static int totalMascotas;

  //Constructor

  public Mascota(String chip){
    this.chip = chip;
  }

  public Mascota(String chip, String nombre){
    this.chip = chip;
    this.nombre = nombre;
  }

  //Métodos
  public void vacunar(){
    vacunada = true;
  }

  //Setters
  public void setEdad(int edad){
    this.edad = edad;
  }

    //Getters
    public String getChip(){
      return this.chip;
    }

    public int getEdad(){
      return this.edad;
    }

    public String getNombre(){
      return this.nombre;
    }
}
