package clases;
/**
* Definición de la clase Clínica
*
* @author Francisco Javier Cabello Rueda
*/
public class Clinica{
  //Atributos
  Clinica[] listado = new Clinica[100];

  //Métodos
  public boolean esVacia(){
    if (listado[0] == null) {
      return true;
    } else {
      return false;
    }
  }

  public boolean esLlena(){
    if (listado[99] != null) {
      return true;
    } else {
      return false;
    }
  }

  public int totalPerros(){
    return Perro.totalPerros;
  }

  public int totalGatos(){
    return Gato.totalGatos;
  }

  public int totalMascotas(){
    return Mascota.totalMascotas;
  }

  public String buscarChip(String chip){
    if ( == chip) {
      return this.nombre
    }else{
      return null;
    }
  }

  public void agregar(){
    System.out.println("1. Perro");
    System.out.println("2. Gato");
    System.out.println("Que deseas agregar: ");
    int tipo = Integer.parseInt(System.console().readLine());
    if (tipo == 1) {
      Perro perro = new Perro(String chip, String Nombre);
    }
    ;
  }

  public void listar(){
    for (int i = 0; i < listado.length; i++) {
      System.out.println("[" + this.chip + "] " + this.nombre + ", " + this.edad + " años" );
    }
  }
}
