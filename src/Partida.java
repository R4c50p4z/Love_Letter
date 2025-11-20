import com.*;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.UUID;

public class Partida {
    private static List<Jugador> jugadores;
    public static Mazo mazo = new Mazo();
    private List<Carta> descartes;
    private Modalidad modo;
    private UUID idGame;
    private Map<Jugador, Integer> puntuaciones;

    
    public static List<Jugador> getJugadores() {
        return jugadores;
    }
    public  static void setJugadores(List<Jugador> jugadoreslista) {
        jugadores = jugadoreslista;
    }
    public Mazo getMazo() {
        return mazo;
    }
    public void setMazo(Mazo mazo) {
        this.mazo = mazo;
    }
    public List<Carta> getDescartes() {
        return descartes;
    }
    public void setDescartes(List<Carta> descartes) {
        this.descartes.addAll(descartes);
    }
    public Map<Jugador, Integer> getPuntuaciones() {
        return puntuaciones;
    }
    public void setPuntuaciones(Map<Jugador, Integer> puntuaciones) {
        this.puntuaciones = puntuaciones;
    }
    Partida(){

    }
    public void iniciar(){

    } 
    public static void iniciarRonda(){

    }
    public static void finalizarRonda(){
        
    }

    

    
}
