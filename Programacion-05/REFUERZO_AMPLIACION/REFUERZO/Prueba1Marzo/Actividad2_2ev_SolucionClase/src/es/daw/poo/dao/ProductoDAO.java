package es.daw.poo.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import es.daw.poo.model.*;

public class ProductoDAO {

    private final ArrayList<Producto> productos;

    public ProductoDAO(){
        productos = new ArrayList<>();
        productos.add(new ProductoCongelado(LocalDate.of(2025, 02, 14), 3, -20));
        productos.add(new ProductoFresco(LocalDate.of(2024, 02, 16), 6, "España"));
        productos.add(new ProductoCongelado(LocalDate.of(2025, 02, 13), 5, 5));
        productos.add(new ProductoRefrigerado(LocalDate.of(2024, 03, 13), 1, "A123"));
        productos.add(new ProductoFresco(LocalDate.of(2024, 02, 16), 2, "Marruecos"));
        productos.add(new ProductoRefrigerado(LocalDate.of(2024, 03, 13), 4, "1234"));
    }

    public ArrayList<Producto> select(){
        return (ArrayList<Producto>) productos.clone();
    }
    
}
