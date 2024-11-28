package es.daw.examen1ev.ejercicio2.model;

import java.time.LocalDate;

public class Tarea {

    // ---------------------------
    // CONSTANTES
    // ---------------------------
    private static final int PRIORIDAD_DEFECTO = 3;
    private static final int LONGITUD = 40;
    
    // IMPORTANTE PARA CODIFICAR: cada letra se corresponde al código en su misma posición
    // Sustituye cada letra por su código y al revés para descodificar
    private static final char[] LETRAS = {'a','e','i','o','u'};
    private static final char[] CODIGOS = {'&','%','$','#','@'};
    
    // ---------------------------
    // ATRIBUTOS
    // ---------------------------
    private String descripcion;
    private LocalDate fechaFinalización;
    private int prioridad;
    private boolean finalizada;

    private boolean codificada; //para uso interno

    // ---------------------------
    //CONSTRUCTORES
    // ---------------------------
    public Tarea(String descripcion, LocalDate fechaFinalización, int prioridad) {
        formatearDescripcion(descripcion);
        this.fechaFinalización = fechaFinalización;
        this.prioridad = prioridad;
        
        this.finalizada = false;
        this.codificada = false;
    }

    public Tarea(String descripcion, LocalDate fechaFinalizacion) {
        this(descripcion, fechaFinalizacion,PRIORIDAD_DEFECTO);
    }
    
    public Tarea(String descripcion){
        this(descripcion, LocalDate.now(),PRIORIDAD_DEFECTO);
    }
    
    // ---------------------------
    // GETTERS & SETTERS
    // ---------------------------
    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public LocalDate getFechaFinalización() {
        return fechaFinalización;
    }

    public void setFechaFinalización(LocalDate fechaFinalización) {
        this.fechaFinalización = fechaFinalización;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    // ---------------------------
    // MÉTODOS PROPIOS
    // ---------------------------
    private void formatearDescripcion(String descripcion){
        
        if (descripcion.length() > LONGITUD)
            descripcion = descripcion.substring(0,LONGITUD);
        
        this.descripcion = descripcion;
        
    }
    
    public boolean codificar(){
        if (!codificada){
            for(int i=0; i < LETRAS.length; i++)
                descripcion = descripcion.replace(LETRAS[i],CODIGOS[i]);
            
            codificada = true;
            return true;
        }
        else
            return false;
        
    }
    
    public boolean descodificar(){
        if (codificada){
            for(int i=0; i < LETRAS.length; i++)
                descripcion = descripcion.replace(CODIGOS[i],LETRAS[i]);
            codificada = false;
            
            return true;
        }
        else
            return false;
    }
    
    
    // ---------------------------
    // toString()
    // ---------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TAREA:");
        sb.append("\n\tDescripción: ").append(descripcion);
        sb.append("\n\tPrioridad: ").append(prioridad);
        sb.append("\n\tFecha límite de finalización: ").append(fechaFinalización);
        //sb.append((finalizada) ? "\n\tLa tarea está finalizada" : "\n\tLa tarea no está finalizada");
        if (finalizada)
            sb.append("\n\tLa tarea está finalizada\n");
        else
            sb.append("\n\tLa tarea no está finalizada\n");

        
        return sb.toString();
        
    }
    
    /* 
    private boolean checkCodificado(){
        boolean codificado = true;
            
        for (int i = 0; i < LETRAS.length; i++)
            if(descripcion.contains(Character.toString(LETRAS[i]))) return false;        
        
        return codificado;
    }*/
    
    /*
            for (int i = 0; i < CODIGOS.length; i++) {
            if (descripcion.contains(CODIGOS[i] + "")) {
                System.out.println("[ERROR] Ya estaba codificado");
                return false;
            }
        }

    */
    
}
