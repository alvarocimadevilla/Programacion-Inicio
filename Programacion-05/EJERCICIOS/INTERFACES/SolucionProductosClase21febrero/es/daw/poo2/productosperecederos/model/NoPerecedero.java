package es.daw.poo2.productosperecederos.model;

public class NoPerecedero extends Producto{

    public enum TIPO {SIN_DEVOLUCION,PERMITE_DEVOLUCION};

    private TIPO tipo;

    public NoPerecedero(TIPO tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"-> NoPerecedero [tipo=" + tipo + "]";
    }

    @Override
    public boolean permiteDevolucion() {
        if (tipo == TIPO.PERMITE_DEVOLUCION) 
            return true;

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
        sb.append("<tipo>");
        sb.append(tipo);
        sb.append("</tipo>");
        sb.append("</producto>");

        return sb.toString();
    }

    

        
}
