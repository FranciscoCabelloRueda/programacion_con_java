/**
* T04Ejercicio24
*
* @author Francisco Javier Cabello Rueda
*/

import java.util.Scanner;
public class T04Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Programador Junior (1)");
    System.out.println("Programador Senior (2)");
    System.out.println("Jefe de Proyecto (3)");
    System.out.println("Programador Junior (1)");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = sc.nextInt();

    System.out.print("¿Cuantos dias ha estado de viaje visitando clientes?: ");
    int dias = sc.nextInt();

    System.out.println("Soltero (1)");
    System.out.println("Casado (2)");
    System.out.print("¿Cual es tu estado civil?: ");
    int estadoCivil = sc.nextInt();

    double sueldoBase;
    int irpf;

    System.out.println("---------------------------------------");
    switch (cargo) {
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        break;
    
      default:
        sueldoBase = 0;
        break;
    }
    switch (estadoCivil) {
      case 1:
        irpf = 25;
        break;
      case 2:
        irpf = 20;
        break;
      default:
        irpf = 0;
        break;
    }
    System.out.printf("| Sueldo Base                 %.2f |\n",sueldoBase);
    double dietas = (30 * dias);
    System.out.printf("| Dietas (%d viajes)            %.2f |\n",dias,dietas);
    System.out.println("|-------------------------------------|");
    double sueldoBruto = ( sueldoBase + dietas );
    System.out.printf("| Sueldo Bruto                %.2f |\n",sueldoBruto);
    double retencionIrpf = (sueldoBruto * (irpf * 0.01) );
    System.out.printf("| Retencion IRPF (%d%%)         %.2f |\n",irpf,retencionIrpf);
    System.out.println("|-------------------------------------|");
    double sueldoNeto = ( sueldoBruto - retencionIrpf );
    System.out.printf("| Sueldo Neto                 %.2f |\n",sueldoNeto);
    sc.close();
  }
}