import java.util.ArrayList;

import es.daw.model.Tarjeta;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*********** GESTIÓN DE TARJETAS ***************");
        // -------------------------------------------------------------------
        // CREACIÓN DE TARJETAS
        // -------------------------------------------------------------------
        // FORMA 1
        Tarjeta t1 = new Tarjeta("666", "Mari", 500);
        Tarjeta t2 = new Tarjeta("11111","Paula",1000);
        Tarjeta t3 = new Tarjeta("222222","Iván G",5000,10);

        // SIMULAR PAGAR
        t1.pagar(550); // el saldo de la tarjeta t1 disminuye 550

        // --------------------------------
        // FORMA 2
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(t1);
        tarjetas.add(t2);
        tarjetas.add(t3);
        tarjetas.add(new Tarjeta("888459","Saúl",2000,100));

        //quiero pagar con la tarjeta 2
        if (!tarjetas.get(1).pagar(1000000))
            System.out.println("Ha habido un problema al pagar!!!!");
        else
            System.out.println("Se ha podido pagar perfectamente!");

        // --------------------------------
        // FORMA 3
        // Crear la clase Banco
        // Dentro de Banco que haya un atributo ArrayList para guardar las tarjetas
        // Añadir un método addTarjeta para ir añadiendo las tarjetas al banco

        // Deberes para los alumnos

        // -----------------------------------------
        // -------------------------------------------------------------------
        // CUÁNTAS TARJETAS SE HAN CREADO????
        // -------------------------------------------------------------------
        System.out.printf("SE HAN CREADO %d TARJETAS\n",Tarjeta.contador);

        // Pinto todas las tarjetas
        for (Tarjeta tarjeta : tarjetas) {
            System.out.println(tarjeta);
        }
        // -------------------------------------------------------------------
        // DESACTIVAR
        // -------------------------------------------------------------------
        // Habría que preguntar por el número de tarjeta o titular
        // Después habría que buscar dicha tarjeta para desactivarla
        // Cuando la encuentra me devuelve la posición = 1
        tarjetas.get(1).setActiva(false); // esto es desactivar, poner a false


       
    }
}
