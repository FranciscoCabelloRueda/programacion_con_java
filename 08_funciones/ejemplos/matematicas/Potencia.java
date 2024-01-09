package matematicas;

public class Potencia {
  
  public static double potencia(double base, int exponente) {
    // Manejar el caso cuando el exponente es 0
    if (exponente == 0) {
        return 1;
    }

    double resultado = 1;

    // Calcular la potencia iterativamente
    for (int i = 0; i < Math.abs(exponente); i++) {
        resultado *= base;
    }

    // Manejar el caso cuando el exponente es negativo
    if (exponente < 0) {
        resultado = 1 / resultado;
    }

    return resultado;
}
}
