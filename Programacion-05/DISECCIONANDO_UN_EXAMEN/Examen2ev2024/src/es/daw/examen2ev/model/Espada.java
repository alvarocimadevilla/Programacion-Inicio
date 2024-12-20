package es.daw.examen2ev.model;

public abstract class Espada extends Arma{
    private boolean afilada;

    public Espada(String nombre, int damage, boolean afilada) {
        super(nombre, damage);
        this.afilada = afilada;
    }

    public abstract void cortar();

    @Override
    public String toString() {
        return super.toString()+"-> Espada [afilada=" + afilada + "]";
    } 

    
}
