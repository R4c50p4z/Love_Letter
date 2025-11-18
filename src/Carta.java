public class Carta {

    private final TipoCarta ROL ;
    
    public Carta(TipoCarta ROL) {
        this.ROL = ROL;
    }

    public TipoCarta getTipo (){
        return this.ROL;
    }

    public TipoCarta getROL() {
        return ROL;
    }

    @Override
    public String toString(){
        return "("+ROL.getValor() + ")" + ROL.name() +"-" + ROL.getDescripcion();
    }

}
