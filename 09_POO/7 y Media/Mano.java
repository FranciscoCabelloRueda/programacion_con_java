import java.util.ArrayList;



class Mano {
    private ArrayList<Carta> cartas;

    public Mano() {
        cartas = new ArrayList<>();
    }

    public void añadirCarta(Carta carta) {
        cartas.add(carta);
    }

    public double getPuntuacion() {
        double puntuacion = 0;
        for (Carta carta : cartas) {
            puntuacion += carta.getPuntuacion();
        }
        return puntuacion;
    }

    public void mostrarCartas() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
        System.out.println("Puntuación total: " + getPuntuacion());
    }
}