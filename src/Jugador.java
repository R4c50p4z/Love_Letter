import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Scanner;


public abstract class Jugador {
    Scanner sc = new Scanner (System.in);
    private List<Carta> mano;
    private int puntuacion;
    private boolean activo;
    private String user;
    private boolean vulnerable;   
    private Mazo mazo;
    private Partida partida;
    
    
    private final String ID;
    
    
    public Jugador(Partida partida){
        this.partida= partida;
        vulnerable=true;
        this.ID = UUID.randomUUID().toString();
    }
    
    public Jugador(String user) {
        vulnerable=true;
        this.ID = UUID.randomUUID().toString();
        this.user = user;
    }
    
    public boolean isVulnerable() {
        return vulnerable;
    }
    public void setVulnerable(boolean vulnerable) {
        this.vulnerable = vulnerable;
    }
    public String getID() {
        return ID;
    }
    public List<Carta> getMano() {
        return mano;
    }

    public void setMano(List<Carta> mano) {
        this.mano = mano;
    }
    
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public String getUser() {
        return user;
    }

    public void recibirCarta(Carta card){
        
    }

    public void descartarCarta(){
        System.out.println("Elije que carta descartar: ");
        for (Carta carta : mano) {
            System.out.println(carta.toString());
        }
        String cartaElegida = sc.nextLine();
        mano.remove(TipoCarta.fromNombre(cartaElegida));
    }
    public void robarCarta(){
        mano.add(Partida.mazo.robar());
        
        
        for (Carta i : mano) {
            if(i.getROL().getValor()==8){
                boolean haveKOrP;
                for (Carta j : mano) {
                    if(j.getROL().getValor()== 5||i.getROL().getValor()== 7){
                        mano.remove(i);
                        haveKOrP=true;
                        List<Carta> descartes = new ArrayList<>();
                        descartes.add(i);
                        partida.setDescartes(descartes);
                        //Logica para que si se ejecuta esto se salte el turno ya que se ha descartado ya la carta de condesa
                    }
                }


            }
        }
    }
    public void trade(Jugador player, Jugador playerSelected){
        List<Carta> auxMano = new ArrayList<>();
        auxMano.addAll(player.getMano());
        player.setMano(playerSelected.getMano());
        playerSelected.setMano(auxMano);
    }

    public abstract Carta jugarTurno(PartidaCC game);

    
    

}
