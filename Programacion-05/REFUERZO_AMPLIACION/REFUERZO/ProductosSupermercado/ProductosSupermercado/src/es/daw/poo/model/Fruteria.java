package es.daw.poo.model;

public class Fruteria extends Producto implements Caduca {
    
    private boolean caducado;

    public Fruteria(String nombre, double precio, boolean caducado) {
        super(nombre, precio);
        this.caducado = caducado;
    }

    @Override
    public boolean estaCaducado() {
        return caducado;
    }
}
