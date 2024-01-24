class Jugador {
    private Mano mano;
    private double saldo;
    private double apuesta;

    public Jugador(double saldoInicial) {
        mano = new Mano();
        saldo = saldoInicial;
    }

    public void realizarApuesta(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No tienes suficiente saldo para realizar esa apuesta.");
        } else {
            apuesta = cantidad;
            saldo -= apuesta;
        }
    }

    public void recibirCarta(Carta carta) {
        mano.añadirCarta(carta);
    }

    public Mano getMano() {
        return mano;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getApuesta() {
        return apuesta;
    }
}
