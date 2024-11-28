package model;

public enum MATERIAL {
    MADERA(100,"soy madera"),
    HIERRO(200),
    HIELO(50);

    private int puntos;
    private String mensaje;

    private MATERIAL(int puntos) {
        this.puntos = puntos;
    }

    private MATERIAL(int puntos, String mensaje) {
        this.puntos = puntos;
        this.mensaje = mensaje;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getMensaje() {
        return mensaje;
    }

    
    
}



