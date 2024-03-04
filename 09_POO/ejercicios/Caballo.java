/**
* Ejercicio 1 Tema 9
* 
* @author Francisco Javier Cabello Rueda
*/
public class Caballo {

  //Atributos
  private int carrerasGanadas;
  private String color;
  private int edad;
  private String nombre;

  //Constructor
  Caballo (String n, String c, int e, int cg){
    this.nombre = n;
    this.color = c;
    this.edad = e;
    this.carrerasGanadas = cg;
  }

  //Getter
  public String getNombre(){
    return this.nombre;
  }

  public int getEdad(){
    return this.edad;
  }

  public String getColor(){
    return this.color;
  }

  public int getCarrerasGanadas(){
    return this.carrerasGanadas;
  }

  //Metodos
  public void rumia(){
    System.out.println("ñam ñam ñam");
  }

  public void cabalga(){
    System.out.println("tocoto cotoco tocoto cotoco tocoto");
  }

  public void relincha(){
    System.out.println("hiiiieeeee");
  }
}
