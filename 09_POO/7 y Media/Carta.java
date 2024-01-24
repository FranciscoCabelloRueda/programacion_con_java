

class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public double getPuntuacion() {
        try {
            int num = Integer.parseInt(numero);
            if (num >= 1 && num <= 7) {
                return num;
            } else {
                return 0.5; // Sota, Caballo, Rey valen 0.5 puntos cada uno
            }
        } catch (NumberFormatException e) {
            return 0.5; // Sota, Caballo, Rey valen 0.5 puntos cada uno
        }
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
