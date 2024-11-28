package es.daw.poo.model;

public class Electronica extends Producto implements Descuento {
    public Electronica(String nombre, double precio) {
        super(nombre, precio);
    }

    public void rebajarPrecio(){
        super.setPrecio(getPrecio()*0.2);
    }

    @Override
    public double aplicarDescuento() {
        //return precio * 0.2;
        return super.getPrecio() * 0.2;
    }
}
