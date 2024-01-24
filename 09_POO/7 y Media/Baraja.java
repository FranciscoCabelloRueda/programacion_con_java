import java.util.ArrayList;
import java.util.Collections;

class Baraja {
    private ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        for (String palo : palos) {
            for (String numero : numeros) {
                cartas.add(new Carta(palo, numero));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }
}
