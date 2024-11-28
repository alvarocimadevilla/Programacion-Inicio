
package es.daw.horapoo;

import es.daw.horapoo.model.*;

public class HoraPOO {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
        HoraExacta horaExacta = new HoraExacta(9, 12, 6);
        

        
        System.out.println("La hora exacta es " + horaExacta);
        horaExacta.inc(123);
        System.out.println("La hora exacta es " + horaExacta);
        
        if (horaExacta.sonIguales(new HoraExacta(12, 12, 8))) {
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }*/
        
        Hora hora = new Hora(11, 30);
        System.out.println("* PARTE I:");
        System.out.println("1. Hora inicializada: "+hora);
        
        hora.inc(61);
        System.out.println("2. Hora incrementada 61 minutos "+hora);
        
        System.out.println("3. Escriba una hora para cambiar:\n15");
        hora.setHora(15);
        
        
        HoraExacta horaExacta = new HoraExacta(23, 11, 15);
        System.out.println("* PARTE II:");
        System.out.println("1. Hora inicializada: "+horaExacta);
        
        horaExacta.inc(61);
        System.out.println("2. Hora incrementada 61 segundos "+horaExacta);
        
        System.out.println("3. Escriba una hora para cambiar:\n56");
        horaExacta.setSegundos(56);
        
        HoraExacta a = new HoraExacta(3, 1, 2);
        HoraExacta b = new HoraExacta(3, 1, 2);
        HoraExacta c = new HoraExacta(30, 10, 20);
        
        System.out.println("¿es a igual a b?");
        
        if (a.sonIguales(b)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
        System.out.println("¿es a igual a c?");
        
        if (a.sonIguales(c)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
    
}
