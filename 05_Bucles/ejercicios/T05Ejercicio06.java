/**
* T05Ejercicio06
*
* @author Francisco Javier Cabello Rueda
*
*/
public class T05Ejercicio06 {
  public static void main(String[] args) {

    int num = 320;
    System.out.println("Listado de numeros desde el 320 al 160,contando de 20 en 20: ");

    do{
    System.out.println(num); 
    num -= 20;
     } while ( num >= 160);

    }  
  }