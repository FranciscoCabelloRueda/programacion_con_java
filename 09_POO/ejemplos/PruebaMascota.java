/**
* PruebaMascota.java
* Programa que prueba la interfaz Mascota
*
* @author Francisco Cabello Rueda
*/
public class PruebaMascota {
  public static void main(String[] args) {

  Mascota kuki = new Perro(Sexo.HEMBRA, "234678");
  Mascota ayo = new Perro(Sexo.MACHO, "778950");

  System.out.println(kuki.getCodigo());
  System.out.println(ayo.getCodigo());

  kuki.come("pescado");
  ayo.peleaCon((Perro)kuki);
  }
}
  
