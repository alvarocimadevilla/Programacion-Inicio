package es.daw.model;

import java.time.LocalDate;

import es.daw.utils.Utilidades;

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
    public Tarjeta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        gastoDiario = LIMITE_GASTO;

        this.entidad = ENTIDAD;
        this.fechaCaducidad = LocalDate.now().plusYears(1);
        this.cvv = Utilidades.obtenerRandom(100,999);

        //activarla al crearla
        activa = true;
        //incrementar el número de tarjetas creadas en el banco
        contador++;

        if (gastoDiario <= 0) gastoDiario = LIMITE_GASTO;

    }

    // SOBRECARGA Y USO DE THIS()
    public Tarjeta(String numero, String titular, double saldo, int gastoDiario) {
        this(numero,titular,saldo);
        this.gastoDiario = gastoDiario; // NO REPETIDO
        
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    // MÉTODO DE COMPORTAMIENTO - FUNCIONALIDAD
    /*
     * Pagar: indicando el importe del pago. 
     * Solo se podrá pagar si la tarjeta está activa (verificarlo previamente). 
     * En el caso de que hubiera algún problema en el pago se mostrará un mensaje por consola 
     * y se controlará a través de un booleano si ha habido error o no.
     * SI DEVUELVE FALSE ES QUE HA HABIDO ERROR
     */
    public boolean pagar(float importe){
        boolean sePuedePagar = true;

        // Se puede pagar si la tarjeta tiene saldo y el importe es menor que el gasto diario
        if ( saldo < importe || importe > gastoDiario){
            sePuedePagar = false;
        }else{
            //saldo = saldo - importe;
            saldo -= importe;
            //sePuedePagar = true;
        }

        return sePuedePagar;
    }

    @Override
    public String toString() {
        return "Tarjeta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + ", gastoDiario="
                + gastoDiario + ", entidad=" + entidad + ", fechaCaducidad=" + fechaCaducidad + ", cvv=" + cvv
                + ", activa=" + activa + "]";
    }

    

    
    
  
    

}
