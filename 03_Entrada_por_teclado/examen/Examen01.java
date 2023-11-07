import java.util.Scanner;
/**
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class Examen01 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el nombre del artículo: ");
    String nombreArticulo = sc.next();

    System.out.print("Introduce el precio del articulo: ");
    double precioArticulo = sc.nextDouble();

    System.out.print("Introduce cuantas unidades deseas: ");
    int unidadesArticulo = sc.nextInt();

    double descuento = 15;
    double subtotal = precioArticulo * unidadesArticulo;
    double ahorro = subtotal * (descuento / 100);
    double subtotalConDescuento = subtotal - ahorro;
    double iva = subtotalConDescuento * 0.21;
    double total = subtotalConDescuento + iva;

    System.out.println("Factura");
    System.out.println("====================================");
    System.out.println("Artículo                " + (nombreArticulo));
    System.out.printf("Precio                  %.2f $/unidad \n",precioArticulo);
    System.out.println("Cantidad                " + (unidadesArticulo));
    System.out.printf("Subtotal                %.2f $ \n",subtotal);
    System.out.printf("Descuento (15%%)         -%.2f $ \n",ahorro);
    System.out.printf("Subtotal con descuento  %.2f $ \n", subtotalConDescuento);
    System.out.printf("IVA (21%%)               +%.2f $ \n",iva);
    System.out.println("");


    System.out.println("====================================");
    System.out.printf("\033[47mTOTAL                   %.2f $", total);
    System.out.println("\033[0m");


    sc.close();
  }
}
