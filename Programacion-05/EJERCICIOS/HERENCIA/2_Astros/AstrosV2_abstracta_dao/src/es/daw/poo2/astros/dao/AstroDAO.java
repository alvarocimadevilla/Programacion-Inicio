package es.daw.poo2.astros.dao;

import java.util.ArrayList;

import es.daw.poo2.astros.model.Astro;
import es.daw.poo2.astros.model.Planeta;
import es.daw.poo2.astros.model.Satelite;

public class AstroDAO {

    private final ArrayList<Astro> astros;

    public AstroDAO(){
        astros = new ArrayList<>();

        // Instanciamos planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 
        14.05, 9.78, 146600000.0);
        astros.add(tierra);

        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 
        463.85, 8.87, 108200000.0);
        astros.add(venus);

        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, 
                -46.0, 3.711, 227940000.0);
        astros.add(marte);

        // Instanciamos satélites
        astros.add(new Satelite("Luna", 7.349E22, 3474.0, 27.5, 
                27.5, -153.0, 1.62, 384400.0, tierra));
        astros.add(new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 
                0.319, -40.15, 0.0084, 6000, marte));
        astros.add(new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 
                1.262, -40.15, 0.0039, 23460, venus));


    }

    public ArrayList<Astro> select(){
        return astros;
    }
    
}
