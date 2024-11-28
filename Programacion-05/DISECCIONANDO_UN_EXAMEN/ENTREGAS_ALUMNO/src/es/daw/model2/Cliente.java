package es.daw.model2;

import java.time.LocalDate;

/**
 *
 * @author melola
 */
public class Cliente implements Corporatable {

    private String nombre;
    private String direccionCompleta;
    private LocalDate fechaInicioContrato;

    public Cliente(String nombre, String direccionCompleta, LocalDate fechaInicioContrato) {
        this.nombre = nombre;
        this.direccionCompleta = direccionCompleta;
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String obtenerRazonSocial() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", direccionCompleta=" + direccionCompleta + ", fechaInicioContrato="
                + fechaInicioContrato + "]";
    }

    

}
