/**
* T04Ejercicio27
*
* @author Francisco Javier Cabello Rueda
*
*/

import java.util.Scanner;
public class T04Ejercicio27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String sabor= "";
    String chocolate = "";
    double total = 0;

    System.out.print("Elija un sabor ( manzana, fresa o chocolate): ");
    sabor = System.console().readLine();
    if (sabor.equals("chocolate")){
    System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco ): ");
    chocolate = System.console().readLine();
    }
    System.out.print("¿Quiere nata? (si / no): ");
    String nata = System.console().readLine();
    System.out.print("¿Quiere ponerle un nombre? (si / no): ");
    String nombre = System.console().readLine();
    
    double precioManzana = 18;
    double precioFresa = 16;
    double precioChocoBlanco = 15;
    double precioChocoNegro = 14;

    switch (sabor) {
      case "manzana":
        System.out.printf("Tarta de manzana:                    %.2f $ \n",precioManzana);
        total = total + precioManzana;
        break;
      case "fresa":
        System.out.printf("Tarta de fresa:                      %.2f $ \n",precioFresa);
        total = total + precioFresa;
        break;
      case "chocolate":
        if (chocolate.equals("blanco")) {
        System.out.printf("Tarta de chocolate blanco:           %.2f $ \n",precioChocoBlanco);
        total = total + precioChocoBlanco;  
        } else if (chocolate.equals("negro")){
        System.out.printf("Tarta de chocolate negro:            %.2f $ \n",precioChocoNegro); 
        total = total + precioChocoNegro;  
        }
        
        break;
    }

    if (nata.equals("si")) {
    double precioNata = 2.5;
    System.out.printf("Con nata:                            %.2f $ \n",precioNata);
    total = total + precioNata;  
    }

    if (nombre.equals("si")) {
    double precioNombre = 2.75;
    System.out.printf("Con nombre:                          %.2f $ \n",precioNombre);
    total = total + precioNombre;  
    }

    System.out.printf("Total:                               %.2f $ \n",total);
    sc.close();
  }
}