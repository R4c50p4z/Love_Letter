import java.util.ArrayList;
import java.util.Collections;

public  class Mazo {
    private ArrayList<Carta> baraja = new ArrayList<>();

    public Mazo(Modalidad modo){
        switch (modo){
            

        }
    }

    /*
     El metodo shuffle de collections sirve basicamente para barajar la lista de forma pseudoaleatoria (aunque podriamos poner una seed con un random), 
     para barajar de esta forma pseudoaletoria utiliza el metodo de mezcla Fisher–Yates shuffle que es muy simple a la par de muy funcional:
     Obtiene la lista, en este caso la baraja, coje el largo y empieza por el final, y hace un random de para una posicion, por ejemplo, una lista que sea [1,2,3,4,5] 
     empezamos en el 5 y hace un random dentro del rango que sale el numero 3 por ejemplo, pues cambiaria el 5 por el numero de la posicion 2 asi que dejaria la lista 
     de la siguiente forma [1,2,5,4,3] y ahora se volveria ha hacer pero con el penultimo en vez de el ultimo, y asi hasta acabar con la lista
     */
    public void barajar(){
        Collections.shuffle(baraja);
    }

    public Carta robar(){
        return baraja.removeLast();
    }

    public int size(){
        return baraja.size();
    }

    public void restart(Modalidad modo){

    }
}
