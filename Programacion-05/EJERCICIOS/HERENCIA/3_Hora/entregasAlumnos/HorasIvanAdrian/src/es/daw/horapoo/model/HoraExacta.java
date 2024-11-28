
package es.daw.horapoo.model;


public class HoraExacta extends Hora{
    
    private int segundos;

    public HoraExacta(int segundos, int hora, int minutos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public boolean setSegundos(int valor) {
        if(valor >= 0 && valor < 60){
            segundos = valor;
            System.out.println("\tLa hora cambiada es: "+toString());
            return true;
        }
        System.out.println("\tLa hora no se pudo cambiar");
        return false;
    }
    
    @Override
    public void inc(){
        segundos++;
    }
    
    @Override
    public void inc(int valor){
        super.inc(valor / 60);
        segundos += valor % 60;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.segundos;
        hash = 97 * hash + this.getHora();
        hash = 97 * hash + this.getMinutos();
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
        final HoraExacta other = (HoraExacta) obj;
        if (this.getHora() != other.getHora()) {
            return false;
        }
        if (this.getMinutos() != other.getMinutos()) {
            return false;
        }
        return this.segundos == other.segundos;
    }
    
    
    public boolean sonIguales(HoraExacta hora){                
        return this.equals(hora);        
    }

    @Override
    public String toString() {
        if (segundos < 10)
            return super.toString() + ":0" + segundos;
        else
            return super.toString() + ":" + segundos;
    }
    
    
    
    

    
    
    
    
}
