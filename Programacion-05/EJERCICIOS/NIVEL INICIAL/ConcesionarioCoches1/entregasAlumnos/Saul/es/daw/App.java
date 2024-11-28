package es.daw;
import es.daw.model.Coche;
import es.daw.utils.*;

public class App {

    public static Coche[] coches = new Coche[10];
    public static void main(String[] args) throws Exception {
        
        

        coches[0] = new Coche("9090HWC",5,"Nissan",100000,20000);
        coches[1] = new Coche("2020WCD");
        coches[2] = new Coche("0000BBB", 4, "KIA", 200000, 15000);
        coches[3] = new Coche("3333ALO", 33000);
        coches[4] = new Coche("4444AAA", 3, "KIA", 200, 12000);
        coches[5] = new Coche("5555CCC", 5, "BMW", 4000, 8000);
        coches[6] = new Coche("6666FFF", 3, "CITROEN", 39859, 25000);
        coches[7] = new Coche("9999WWW", 7, "BUGATTI", 400, 400000);



        utilidades.calcularEspaciosVacios(coches);

        
            System.out.println("COCHES ANTES DEL DESCUENTO");
            utilidades.concesionarioEntero(coches);

        for (int i = 0; i < utilidades.cochesEnConcesionario(coches); i++) {
            if (coches[i].getMarca() != null) {
                if (coches[i].getMarca().equals("KIA")) {
                utilidades.aplicarDescuentoMarca(coches[i]);
            }
            }
            
        }
        
            System.out.println("COCHES DESPUÉS DEL DESCUENTO");
            utilidades.concesionarioEntero(coches);

        System.out.println("-------ENSEÑAR COCHES CON PRECIOS MENOR A 10000");
        for (int i = 0; i < utilidades.cochesEnConcesionario(coches); i++) {
            if (coches[i].getPrecio() <= 10000) {
                utilidades.sacarCochesConPrecioMenor(coches[i]);
            }
        }

        System.out.println("----------- ESTABLECER PRECIO POR MATRICULA");
        utilidades.establecerPrecioPorMatricula("2020WCD", 20000);


        utilidades.concesionarioEntero(coches);

    }     
}
