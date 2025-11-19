public class GestorEfectos {
    public static void aplicar(Carta carta, Jugador player, Mazo mazo){
        int valorCarta= carta.getROL().getValor();
        switch (valorCarta) {
            case 0:
                
                break;
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            
            default:
                throw new IllegalArgumentException("Error inesperado");
        }
    }
}
