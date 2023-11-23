/**
* T04Ejercicio25
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;
public class T04Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Introduce la altura de la bandera en cm: ");
    int altura = sc.nextInt();
    System.out.print("Ahora introduzca la anchura: ");
    int anchura = sc.nextInt();
    System.out.print("¿Quieres el escudo bordado? (s/n): ");
    String bordado = sc.next();
    System.out.println("Gracias, Aquí tiene un desglose de su compra.");

    double area = (anchura * altura);
    double precio = (area / 100);
    System.out.printf("Bandera de %.0f cm2:       %.2f $ \n",area,precio);
    double precioBordado;
    if (bordado == "s") {
    precioBordado = 2.50; 
    System.out.printf("Con Escudo:              %.2f $ \n",precioBordado);  
    } else {
    precioBordado = 0;  
    System.out.printf("Sin Escudo:              %.2f $ \n",precioBordado);   
    }
    System.out.printf("Gastos de envio:         3,50 $ \n");
    final double envio = 3.50;
    double total = (precio + precioBordado + envio);   
    System.out.printf("Total:                   %.2f $ \n",total);
    sc.close();
  }
}