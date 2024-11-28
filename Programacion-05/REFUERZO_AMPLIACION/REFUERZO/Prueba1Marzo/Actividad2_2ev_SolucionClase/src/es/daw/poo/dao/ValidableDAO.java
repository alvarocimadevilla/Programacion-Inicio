package es.daw.poo.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import es.daw.poo.model.Estudiante;
import es.daw.poo.model.EstudianteInternacional;
import es.daw.poo.model.ProductoCongelado;
import es.daw.poo.model.ProductoFresco;
import es.daw.poo.model.ProductoRefrigerado;
import es.daw.poo.model.Profesor;
import es.daw.poo.model.Validable;

public class ValidableDAO {
    private final ArrayList<Validable> validables;

    public ValidableDAO(){
        validables = new ArrayList<>();
        validables.add(new Profesor("Mari Luz", "Donde vive melola", 1));
        validables.add(new EstudianteInternacional("Elon Musk", "Donde vive Elon", "12345678A","España"));
        validables.add(new Profesor("Chema", "Donde vive Chema", 20));
        validables.add(new Estudiante("Luis Maeso","Donde vive Luis", "12345678B"));
        validables.add(new EstudianteInternacional("Mark Zuckerberg","Donde vive Mark","12345678C", "Marruecos"));
        validables.add(new Estudiante("Scarlett Johansson", "Donde vive Scarlett","A234"));
        validables.add(new ProductoCongelado(LocalDate.of(2025, 02, 14), 3, -20));
        validables.add(new ProductoFresco(LocalDate.of(2024, 02, 16), 6, "España"));
        validables.add(new ProductoCongelado(LocalDate.of(2025, 02, 13), 5, 5));
        validables.add(new ProductoRefrigerado(LocalDate.of(2024, 03, 13), 1, "A123"));
        validables.add(new ProductoFresco(LocalDate.of(2024, 02, 16), 2, "Marruecos"));
        validables.add(new ProductoRefrigerado(LocalDate.of(2024, 03, 13), 4, "1234"));

    }

    public ArrayList<Validable> select(){
        return (ArrayList<Validable>) validables.clone();
    }
    
}
