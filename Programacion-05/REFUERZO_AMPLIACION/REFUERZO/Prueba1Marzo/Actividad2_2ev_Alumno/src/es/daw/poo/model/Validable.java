package es.daw.poo.model;

import es.daw.poo.exceptions.NotValidException;

public interface Validable {
    public boolean validar() throws NotValidException;
}
