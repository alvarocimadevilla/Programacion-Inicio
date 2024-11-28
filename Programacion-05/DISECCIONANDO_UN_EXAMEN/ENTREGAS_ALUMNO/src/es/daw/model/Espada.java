package es.daw.model;

public abstract class Espada extends Arma{
    //ATRIBUTES
    private boolean afilada;

    //CONSTRUCTORES
    public Espada(String nombre, int damage, boolean afilada) {
        super(nombre, damage);
    }

    public abstract void cortar();

    @Override
    public String toString() {
        return super.toString()+"-> Espada [afilada=" + afilada + "]";
    }



}
