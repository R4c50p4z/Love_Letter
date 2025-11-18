import java.util.UUID;

public class JugadorIA extends Jugador{
    private EstrategiaIA estrategia;

    public JugadorIA() {
    super("IA_" + UUID.randomUUID());
    this.estrategia = new EstrategiaLogica();
    }
    @Override
    public Carta jugarTurno(PartidaCC game) {
        Carta cartaAJugar = estrategia.elegirCarta(this, game);
        return cartaAJugar;
    }
}
