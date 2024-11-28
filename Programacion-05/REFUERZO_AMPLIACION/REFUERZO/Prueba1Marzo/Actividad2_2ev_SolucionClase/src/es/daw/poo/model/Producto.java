package es.daw.poo.model;

import java.time.LocalDate;

public abstract class Producto implements Validable, Comparable<Producto>{
    private LocalDate fechaCaducidad;
    private int numeroLote;
   
    public Producto(LocalDate fechaCaducidad, int numeroLote){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
   
    public void setFechaCaducidad(LocalDate fecha){
        fechaCaducidad = fecha;
    }
   
    public void setNumeroLote(int num){
        numeroLote = num;
    }
   
    public LocalDate getFechaCaducidad(){
        return fechaCaducidad;
    }
   
    public int getNumeroLote(){
        return numeroLote;
    }

    //public abstract boolean validar();

    @Override
    public String toString() {
        return "Producto [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
    }

    @Override
    public int compareTo(Producto o) {
        return fechaCaducidad.compareTo(o.fechaCaducidad);
    }

    
    
}
    

