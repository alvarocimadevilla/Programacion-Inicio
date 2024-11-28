package es.daw.model;

public class Arco extends Arma{
    //ATRIBUTOS
    private float distancia;
    
    //CONSTRUCTORES
    public Arco(String nombre, int damage, float distancia) {
        super(nombre, damage);
    }
    //TO STRING

    @Override
    public String toString() {
        return super.toString()+"-> Arco [distancia=" + distancia + "]";
    }
    
}
