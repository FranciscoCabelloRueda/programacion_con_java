/**
* PruebaLibro
* 
* @author Francisco Javier Cabello Rueda
*/
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();


    lib.titulo = "Atomka";
    lib.autor = "Frank Thilliez";
    lib.numeroDePaginas = 490;
    System.out.println("Titulo: " + lib.titulo);
    System.out.println("Autor: " + lib.autor);
    System.out.println("Número de Paginas: " + lib.numeroDePaginas);
    System.out.println("Edición: " + lib.edicion);
  }
}
