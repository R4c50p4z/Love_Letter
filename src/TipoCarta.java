/*
 * Lo que hace enum es basicamente que declaras las posibles formas que tendra el objeto, en este caso como son cartas solo 
 * queremos que hayan 9 tipos y el formato que tendran sera, el nombre de la carta y entre parentesis los valores, es decir el valor
 * (el numero) y la descripcion (lo que hace la carta), luego ponemos atributos para saber de que tipo sera el valor y la descripcion
 * (Int y String), el constructor, para poder generar el objeto, y el metodo fromNombre que servira para que retorne la carta tal cual
 * sin que el usuario o la ia se puedan equivocar, haciendo un values
 */
public enum TipoCarta {

    ESPIA(0,"Gana un punto de mas si nadie mas juega o descarta otro espia"),
    GUARDIA(1, "Adivina la carta de otro jugador"),
    SACERDOTE(2, "Mira la carta de un jugador"),
    BARON(3, "Comparas mano, pierde la más baja"),
    DONCELLA(4, "Inmune hasta tu siguiente turno"),
    PRINCIPE(5, "Alguien descarta su carta y roba otra"),
    CANCILLER(6, "Cojes 2 cartas mas y guardas en el monton de cartas las 2 que quieras"),
    REY(7, "Intercambia mano"),
    CONDESA(8,"Debes jugarla instantaneamente si tienes un rey o un principe"),
    PRINCESA(9, "Pierdes si la descartas o usas");

    private final int valor;
    private final String descripcion;

    TipoCarta(int valor, String descripcion){
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public int getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }


    /*
    Este metodo lo que hace de forma mas desglosada es basicamente que le pasas un nombre, por ejemplo guardia, en referencia
    a la carta guardia ya sea pq queramos jugarla, descartarla o lo que sea, entonces hacemos un for-each de el values 
    de TipoCarta, lo que hace basicamente es dar una lista con las posibles formas que puede tener el enum TipoCarta
    espia, guardia, sacerdote, baron, doncella, principe, rey, conde, princesa. Es una forma de asegurar el codigo y 
    gestionar errores
    */ 
    public static TipoCarta fromNombre(String nombre) {
        for (TipoCarta t : TipoCarta.values()) {
            if (t.name().equalsIgnoreCase(nombre)) {
                return t;
            }
        }
    throw new IllegalArgumentException("No existe esa carta: " + nombre);
    }


        
    
    
}
