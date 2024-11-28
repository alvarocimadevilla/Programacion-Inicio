package es.daw.examen2ev.model2;

import java.time.LocalDate;

/**
 *
 * @author melola
 */
public class Empleado implements Corporatable,Comparable<Empleado>{
    private String DNI;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private DEPARTAMENTOS departamentos;

    public Empleado(String DNI, String nombre, String apellidos, LocalDate fechaNacimiento, DEPARTAMENTOS departamentos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.departamentos = departamentos;
    }

    public Empleado(String DNI, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this(DNI,nombre,apellidos,fechaNacimiento,DEPARTAMENTOS.DESARROLLO);
        // this.DNI = DNI;
        // this.nombre=nombre;
        // this.apellidos = apellidos;
        // this.fechaNacimiento = fechaNacimiento;
        // departamentos=DEPARTAMENTOS.DESARROLLO;
        
    }
    
    public Empleado(){
        
    }

    public String getDNI() {
        return DNI;
    }

    public void setNIF(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public DEPARTAMENTOS getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(DEPARTAMENTOS departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento + ", departamentos=" + departamentos + '}';
    }
    
    
    @Override
    public String obtenerRazonSocial() {
        return apellidos+", "+nombre+" "+DNI;
    }

    @Override
    public int compareTo(Empleado o) {
        return DNI.compareToIgnoreCase(o.DNI);
    }

    
}
