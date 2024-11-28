package es.daw.poo.model;

public class Conservas extends Producto implements Caduca, Descuento {
    private boolean caducado;

    public Conservas(String nombre, double precio, boolean caducado) {
        super(nombre, precio);
        this.caducado = caducado;
    }

    @Override
    public boolean estaCaducado() {
        return caducado;
    }

    @Override
    public double aplicarDescuento() {
        // con protected no es necesario los get y set para acceder a los atributos del padre
        //return precio * 0.1; 
        return super.getPrecio() * 0.1;
    }
}
