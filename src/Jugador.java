import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public abstract class Jugador {
    private List<Carta> mano;
    
    private boolean activo;
    private String user;
    
    
    private final String ID;
    
    public Jugador(){
        this.ID = UUID.randomUUID().toString();
    }
    
    public Jugador(String user) {
        this.ID = UUID.randomUUID().toString();
        this.user = user;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public String getUser() {
        return user;
    }

    public void recibirCarta(Carta card){

    }

    public void descartarCarta(Carta card){

    }

    public abstract Carta jugarTurno(PartidaCC game);

    
    

}
