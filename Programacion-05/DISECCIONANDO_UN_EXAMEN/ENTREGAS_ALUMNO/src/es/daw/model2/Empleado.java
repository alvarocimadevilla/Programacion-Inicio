package es.daw.model2;

import java.time.LocalDate;

import es.daw.exception.DniFormatException;

import static es.daw.util.Utilidades.validarDNI;

/**
 *
 * @author melola
 */
public class Empleado implements Corporatable, Comparable<Empleado>{
    private String DNI;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private DEPARTAMENTOS departamentos;

    public Empleado(String dNI, String nombre, String apellidos, LocalDate fechaNacimiento,
            DEPARTAMENTOS departamentos) {
        DNI = dNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.departamentos = departamentos;
    }

    public String getDNI() {
        return DNI;
    }

    public DEPARTAMENTOS getDepartamentos() {
        return departamentos;
    }

    public Empleado(String dNI, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this(dNI, nombre, apellidos, fechaNacimiento, DEPARTAMENTOS.DESARROLLO);
    }
    @Override
    public String obtenerRazonSocial() {
        return String.format("%s, %s %s", apellidos, nombre, DNI);
    }

    @Override
    public int compareTo(Empleado arg0) {
        return DNI.compareTo(arg0.DNI);
    }

    public boolean dniValido(String dni) throws DniFormatException{
        return validarDNI(dni);
    }

}
