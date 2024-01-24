import java.util.Scanner;

class JuegoSieteYMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¡Bienvenido a Siete y Media!");
            Baraja baraja = new Baraja();
            baraja.barajar();

            Jugador jugador = new Jugador(100.0);

            System.out.print("Ingrese la cantidad que desea apostar: ");
            double apuesta = scanner.nextDouble();
            jugador.realizarApuesta(apuesta);

            while (true) {
                Carta carta = baraja.repartirCarta();
                if (carta == null) {
                    break; // No hay más cartas en la baraja
                }

                jugador.recibirCarta(carta);

                System.out.println("Tus cartas:");
                jugador.getMano().mostrarCartas();

                System.out.println("¿Quieres otra carta? (s/n)");
                char opcion = scanner.next().charAt(0);

                if (opcion == 'n') {
                    break; // El jugador se planta
                }
            }

            // Turno de la banca
            Mano manoBanca = new Mano();
            while (manoBanca.getPuntuacion() < 7.5) {
                Carta carta = baraja.repartirCarta();
                if (carta == null) {
                    break; // No hay más cartas en la baraja
                }
                manoBanca.añadirCarta(carta);
            }

            System.out.println("Cartas de la banca:");
            manoBanca.mostrarCartas();

            // Determinar ganador
            double puntuacionJugador = jugador.getMano().getPuntuacion();
            double puntuacionBanca = manoBanca.getPuntuacion();

            if (puntuacionJugador > 7.5 || (puntuacionBanca <= 7.5 && puntuacionBanca > puntuacionJugador)) {
                System.out.println("¡Has perdido!");
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
            } else {
                System.out.println("¡Has ganado!");
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
                jugador.getMano().mostrarCartas();
            }

            System.out.println("Saldo actual: " + jugador.getSaldo());

            System.out.println("¿Quieres seguir jugando? (s/n)");
            char continuar = scanner.next().charAt(0);

            if (continuar == 'n' || jugador.getSaldo() <= 0) {
                System.out.println("Gracias por jugar. ¡Hasta la próxima!");
                break;
            }
        }

        scanner.close();
    }
}
