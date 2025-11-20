import java.util.Scanner;

public class GestorEfectos {
    
    public static void aplicar(Carta carta, Jugador player, Partida game){
        Scanner sc = new Scanner(System.in);
        int valorCarta= carta.getROL().getValor();
        Jugador playerSelected= null;
        if(!player.isVulnerable()){
            player.setVulnerable(true);
        }
        switch (valorCarta) {
            case 1:
            case 2:
            case 3:
            case 7:
                playerSelected = chooseRival();
                
                break;

            
        }

        //En este switch entrara en un bloque o otro mediante el valor de la carta elegida ya 
        // que en este juego cada carta tiene un valor unico
        switch (valorCarta) {
            case 1:
                if(playerSelected.isVulnerable()){
                    System.out.println("Adivina la carta del rival: ");
                    Carta prediccion = TipoCarta.fromNombre(sc.nextLine());
                    if(prediccion== playerSelected.getMano()){
                        System.out.println("Has ganado la ronda");
                        Partida.finalizarRonda();
                    }else{
                        System.out.println("No es su carta seleccionada");
                    }
                }else{
                    System.out.println("Jugador invulnerable este turno");
                }   
            sc.close();
                break;
            case 2:
                playerSelected.getMano();
                break;
            case 3:
                if(playerSelected.isVulnerable()){
                    if(playerSelected.getMano().getFirst().getROL().getValor()<player.getMano().getFirst().getROL().getValor()){
                        System.out.println("Has ganado la ronda");
                    }else if(playerSelected.getMano().getFirst().getROL().getValor()>player.getMano().getFirst().getROL().getValor()){
                        System.out.println("Has perdido la ronda");
                    }else{
                        throw new IllegalArgumentException("Error desconocido");
                    }
                }else{
                System.out.println("Jugador invulnerable este turno");
                }

                break;
            case 4:
                player.setVulnerable(false);
                System.out.println("Este turno seras invulnerable");
                break;
            case 5:
                if(playerSelected.isVulnerable()){
                    playerSelected.descartarCarta();
                    playerSelected.robarCarta();

                }else{
                System.out.println("Jugador invulnerable este turno");
                }
                break;
            case 6:
                player.robarCarta();
                player.robarCarta();
                player.descartarCarta();
                player.descartarCarta();
                break;
            case 7:
                if(playerSelected.isVulnerable()){
                    player.trade(player, playerSelected);
                }else{
                System.out.println("Jugador invulnerable este turno");
                }
                break;
            case 8:
                
                break;
            case 9:
                
                break;
                
            default:
                throw new IllegalArgumentException("Error inesperado");
                
        }
    }
    private static Jugador chooseRival(){
                Scanner sc = new Scanner(System.in);
                boolean continuar = true;
                boolean existe = false;
                Jugador playerSelected= null;
                do{
                    System.out.println("Elije al rival que quieres adivinar la carta");
                    for (Jugador i : Partida.getJugadores()) {
                        System.out.println(i.getUser());
                    }
                    String auxPlayer= sc.nextLine();
                    for (Jugador i : Partida.getJugadores()) {
                        if(i.getUser().equals(auxPlayer)){
                            continuar= false;
                            existe = true;
                            playerSelected = i;
                            break;
                        }
                    }
                    if(!existe){
                        System.out.println("No existe ese usuario");
                    }
                
                
                }while(continuar);
                sc.close();
                return playerSelected;

            

    }
}
