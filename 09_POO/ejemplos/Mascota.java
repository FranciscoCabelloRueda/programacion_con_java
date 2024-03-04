/**
* Mascota.java
* Definición de la interfaz Mascota
*
* @author Francisco Javier Cabello Rueda
*/
public interface Mascota {
  String getCodigo();
  void hazRuido();
  void come(String comida);
  void peleaCon(Animal contrincante);
  }
  
