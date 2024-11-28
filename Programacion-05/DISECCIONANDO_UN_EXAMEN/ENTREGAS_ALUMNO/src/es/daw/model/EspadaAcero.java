package es.daw.model;

public class EspadaAcero extends Espada {

    //CONSTRUCTORES
    public EspadaAcero(String nombre, int damage, boolean afilada) {
        super(nombre, damage, afilada);
    }

    @Override
    public void cortar(){
        System.out.println("Soy de acero y solo corto si estoy afilada");
    }
}
