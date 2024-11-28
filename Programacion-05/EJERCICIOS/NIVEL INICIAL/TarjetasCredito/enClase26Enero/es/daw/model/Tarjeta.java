package es.daw.model;

import java.time.LocalDate;

public class Tarjeta{
    // CONSTANTES
    public final static int LIMITE_GASTO = 1000;
    public final static String ENTIDAD = "DAW_BANK";

    // ATRIBUTOS
    private String numero;
    private String titular;
    private double saldo;
    private int gastoDiario; //si no se especifica será 1000
    private String entidad; //siempre DAW_BANK
    private LocalDate fechaCaducidad; //un año posterior a la fecha de alta de la tarjeta
    private int cvv; //se gener automáticamente entre 100 y 900
    private boolean activa;

    public static int contador;// atributo de clase

    // CONSTRUCTORES
    public Tarjeta(String numero, String titular, double saldo, int gastoDiario) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.gastoDiario = gastoDiario;
        this.entidad = ENTIDAD;
        this.fechaCaducidad = LocalDate.now().plusYears(1);
        this.cvv = 0;//pendiente generarlo automáticamente...

        //activarla al crearla
        activa = true;
        //incrementar el número de tarjetas creadas en el banco
        contador++;

        if (gastoDiario <= 0) gastoDiario = LIMITE_GASTO;
    }

    public Tarjeta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        gastoDiario = LIMITE_GASTO;

        this.entidad = ENTIDAD;
        this.fechaCaducidad = LocalDate.now().plusYears(1);
        this.cvv = 0;//pendiente generarlo automáticamente...

        //activarla al crearla
        activa = true;
        //incrementar el número de tarjetas creadas en el banco
        contador++;

    }

    
    
  
    

}
