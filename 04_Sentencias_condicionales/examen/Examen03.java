/**
* Examen03
*
* @author Francisco Javier Cabello Rueda
*
*/

import java.util.Scanner;
public class Examen03 {
  public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  
  System.out.println("CALCULADORA");
  System.out.print("Escribe el primer operando: ");
  double num1 = sc.nextDouble();
  System.out.print("Escribe el código de operación(+, -, *, /, ^, %): ");
  String operador = System.console().readLine();
  System.out.print("Escribe el segundo operando: ");
  double num2 = sc.nextDouble();

  double calculo = 0;

  switch (operador) {
    case "+":
      calculo = num1 + num2;
      break;
    case "-":
      calculo = num1 - num2;
      break;
    case "*":
      calculo = num1 * num2;
      break;
    case "/":
      calculo = num1 / num2;
      break;
    case "^":
      calculo = Math.pow(num1, num2);
      break;
    case "%":
      calculo = num1 % num2;
      break;
  
    default:System.out.println("ERROR** Operador introducido incorrecto.");
      break;
  }
  System.out.printf("%.2f %s %.2f = %.2f ",num1,operador,num2,calculo);
  sc.close();
  }
}