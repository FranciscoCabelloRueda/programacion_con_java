/**
* T05Ejercicio08
*
* @author Francisco Javier Cabello Rueda
*
*/
import java.util.Scanner;
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0;

    System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
    num= sc.nextInt();

    for(int i = 0; i <= 10; i++  ){
    int resultado = num * i;  
    System.out.printf("%d X %d = %d \n",num,i,resultado);
    }

    sc.close();

   
  }
}