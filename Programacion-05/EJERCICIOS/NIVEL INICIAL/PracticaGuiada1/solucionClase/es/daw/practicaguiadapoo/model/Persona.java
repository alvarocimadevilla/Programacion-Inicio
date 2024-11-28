package es.daw.practicaguiadapoo.model;

public class Persona {

    // 1. ATRIBUTOS

    // atributos "normales"
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // .......................
    // pruebas con atributos static, final y static final
    //private final String NIF; //constante: una vez que tenga valor no se puede modificar. Obliga a estar declarado en el constructor
    public final static int MAYOR_EDAD = 18; // constante a la que acceder desde cualquier punto del programa
    private int contador; // pendiente!!! atributo compartido entre todos los objetos.
    // Si un objeto lo modifica, el resto de objetos se verán afectados...
    //..................................

    // ------------------------------------------
    // 2. CONSTRUCTORES
    // CASOS:
    // - sin constructor: por defecto tiene un constructor vacío. Creo objetos sin "datos"
    //                    Si creo objetos sin constructor, luego puedo meter valores con los método público setters
    // - con constructores: si necesito el constructor vacío tengo que crearlo. Puedo tener
    //                      tantos constructores como quiera (combinación de atributos)
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        contador++;
    }

    // public Persona(String dni, String nombre, String apellidos, int edad, String NIF) {
    //     this.dni = dni;
    //     this.nombre = nombre;
    //     this.apellidos = apellidos;
    //     this.edad = edad;
    //     this.NIF = NIF;
    // }

    // Para pruebas de Iván
    public Persona() {

    }
    // ------------------------------------------
    // 3. GETTERS & SETTERS son siempre públicos (ENCAPSULACIÓN: como los atributos son privados es la forma 
    // de acceder y modificar los atributos)    
    // No es necesario tener todos los getters & setters (según especificaciones)

    // public String getNIF() {
    //     return NIF;
    // }
    

    //public static int getContador() {
    //    return contador;
    //}    

    public int getContador() {
        return contador;
    }    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // 4. MÉTODOS DE COMPORTAMIENTO: funcionalidades el objeto
    public void imprime() {
        System.out.println(this.toString());
    }

    public boolean esMayorEdad() {
        if (edad >= 18)
            return true;
        else
            return false;
    }

    public boolean esJubilado() {
        if (this.edad >= 65)
            return true;
        else
            return false;
    }

    public int diferenciaEdad(Persona p1) {
        int diferencia = 0;
        diferencia = this.edad - p1.edad;
        return diferencia;
    }

    // 5. SOBREESCRITURA DE MÉTODOS DEL PADRE TODO PODEROSO OBJECT
    @Override
    public String toString() {
        return "dni = " + dni + ", nombre = " + nombre + ", apellidos = " + apellidos + ", edad = " + edad;
    }

}
