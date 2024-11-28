package es.daw.model;

public class Pokemon {
    // ---------------------------------
    // ATRIBUTOS
    private String nombre;
    private String habilidad;
    private String generacion;
    private String tipo;
    private int ps;
    private int ataque;
    private int defensa;
    private int numeroPokedex;

    // ---------------------------------
    // CONSTRUCTOR
    public Pokemon(String nombre, String habilidad, String generacion, String tipo, int ps, int ataque, int defensa, int numeroPokedex) {
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.generacion = generacion;
        this.tipo = tipo;
        this.ps = ps;
        this.ataque = ataque;
        this.defensa = defensa;
        this.numeroPokedex = numeroPokedex;
    
    

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    
    
}
