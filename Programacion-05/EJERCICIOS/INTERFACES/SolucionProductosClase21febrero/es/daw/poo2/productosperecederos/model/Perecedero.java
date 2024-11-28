package es.daw.poo2.productosperecederos.model;

import es.daw.poo2.productosperecederos.exceptions.CantidadIncorrectaException;

public class Perecedero extends Producto{
    
    private int diasCaducar;
    
    public Perecedero(int diasCaducar,String nombre, double precio) {
        super(nombre, precio);
        this.diasCaducar = diasCaducar;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    /**
     *         
    Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
    Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
    Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
     * @throws CantidadIncorrectaException 
     */
    @Override
    public double calcular(int cantidad) throws CantidadIncorrectaException {
        double precioTotal = super.calcular(cantidad);

        switch (diasCaducar) {
            case 1:
                precioTotal = precioTotal - (precioTotal*0.75);
                break;
            case 2:
                precioTotal = precioTotal - (precioTotal*0.66);
                break;
            case 3:
                precioTotal = precioTotal - (precioTotal*0.50);
                break;            
            default:
                break;
        }

        return precioTotal;

    }

    @Override
    public String toString() {
        return super.toString()+"-> Perecedero [diasCaducar=" + diasCaducar + "]";
    }

    @Override
    public boolean permiteDevolucion() {
        if (diasCaducar > 5) return true;
        
        return false;

    }

    @Override
    public String convert2XML() {
        StringBuilder sb = new StringBuilder();

        sb.append("<producto>");
        sb.append("<nombre>");
        sb.append(super.getNombre());
        sb.append("</nombre>");
        sb.append("<precio>");
        sb.append(super.getPrecio());
        sb.append("</precio>");
        sb.append("<diasCaducar>");
        sb.append(diasCaducar);
        sb.append("</diasCaducar>");
        sb.append("</producto>");

        return sb.toString();

    }

    
}
