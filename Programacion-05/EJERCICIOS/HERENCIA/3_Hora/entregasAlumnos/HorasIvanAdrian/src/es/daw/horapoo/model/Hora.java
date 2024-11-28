
package es.daw.horapoo.model;

public class Hora {
    
    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void inc(){
        minutos++;
    }
    
    public void inc(int valor){
        hora += (valor / 60);
        minutos += (valor % 60);
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }
    
    public boolean setMinutos(int valor){
        if(valor >= 0 && valor < 60){
            minutos = valor;
            return true;
        }
        return false;         
    }
    
    public boolean setHora(int valor){
        if(valor >= 0 && valor < 24){
            hora = valor;
            System.out.println("\tLa hora cambiada es: "+toString());
            return true;
        }
        System.out.println("\tLa hora no se pudo cambiar");
        return false; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.hora;
        hash = 23 * hash + this.minutos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hora other = (Hora) obj;
        if (this.hora != other.hora) {
            return false;
        }
        return this.minutos == other.minutos;
    }
    
    

    @Override
    public String toString() {
        if (minutos < 10)
            return hora+":0" +minutos;
        else 
            return hora+":" +minutos;
    }
    
    
}
