package es.daw.colecciones;

import es.daw.colecciones.model.Bolsa;
import es.daw.colecciones.model.Chocolatina;
import es.daw.colecciones.model.Chuche;
import es.daw.colecciones.model.Golosina;

public class App {
    public static void main(String[] args) {
        
        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Nestlé");
        Chocolatina c3 = new Chocolatina("Valor");

        Golosina g1 = new Golosina("chupa chup");
        Golosina g2 = new Golosina("chicle");

        Bolsa<Chuche> bolsa = new Bolsa<>(4);
        
        try {
            bolsa.add(c1);
            bolsa.add(g1);
            bolsa.add(c3);
            bolsa.add(g2);
            bolsa.add(c2); //daría error... pinta el mensaje
    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Pintando todas las chuches:");
        for (Chuche chuche : bolsa) {
            System.out.println(chuche.toString());
        }

        // PENDIENTE!!! CREAR BOLSA DE ENTEROS
        // RELLENAR 
        // MOSTAR
        Bolsa<Integer> bolsaInt = new Bolsa<>(5);


        // AHORA QUIERO CREAR UNA BOLSA SOLO DE CHUCHES!!!!!!
        // NO PUEDE SER DE OTRA COSA
        // PISTA: pdf del aula virtual...
        // Crear BolsaChuches
    }
}
