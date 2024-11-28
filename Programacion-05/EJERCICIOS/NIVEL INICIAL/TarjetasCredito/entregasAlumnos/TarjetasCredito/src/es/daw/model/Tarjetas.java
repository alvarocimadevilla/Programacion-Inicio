package es.daw.model;

import java.util.Scanner;

public class Tarjetas {
    //ATRIBUTOS
    private String numero;
    private String fechaCaducidad; //localDate.now plusYear...
    private int cvv;
    private String titular;
    private int saldo;
    private final String entidadEmisora = "DAW_BANK";
    private boolean estadoActivo;
    private int limiteDinero;
    //GETTERS & SETTERS
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEntidadEmisora() {
        return entidadEmisora;
    }
    public boolean isEstadoActivo() {
        return estadoActivo;
    }
    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getLimiteDinero() {
        return limiteDinero;
    }
    public void setLimiteDinero(int limiteDinero) {
        this.limiteDinero = limiteDinero;
    }
    


    //CONSTRUCTORES
    public Tarjetas(String numero, String fechaCaducidad, int cvv, String titular, int apellidos, int saldo, int limiteDinero,
            boolean estadoActivo) {
        this.numero = numero;
        this.fechaCaducidad = fechaCaducidad;
        this.cvv = cvv;
        this.titular = titular;
        this.saldo = saldo;
        this.estadoActivo = estadoActivo;
        this.limiteDinero = limiteDinero;
    }
    public Tarjetas() {
    }
    
    
    
    
    //METODOS

    public void pagar(Tarjetas tarjeta, int precioCompra){ 


        if (precioCompra<=tarjeta.getSaldo()) {
            if (precioCompra<=tarjeta.getLimiteDinero()) {
                tarjeta.setSaldo(tarjeta.getSaldo()-precioCompra);
                System.out.println("Vas a realizar un pago con un valor de "+precioCompra+"€");
                System.out.println("Compra realizada con exito");
                System.out.println("Saldo restante: "+tarjeta.getSaldo());
                System.out.println("*****************************************************************************");
                tarjeta.setLimiteDinero(tarjeta.getLimiteDinero()-precioCompra);
            }
            else{
                System.out.println("Has superado tu limite de gastos :(");
            }
           
        }
        else{
            System.out.println("No tienes dinero suficiente en la cuenta, la compra no se ha realizado");
            System.out.println("*****************************************************************************");
        }
        

    }

    public void desactivarTarjeta(Tarjetas tarjeta){
        tarjeta.setEstadoActivo(false);
    }

    public void modificarTarjeta(Tarjetas tarjeta, int opcion){
        String titular="";
        Scanner sc = new Scanner(System.in);

        switch (opcion) {
            case 1:
                System.out.println("Cual va a ser el nuevo titular?");
                System.out.print("> ");
                titular = sc.nextLine();
                tarjeta.setTitular(titular);

                break;
            
            case 2:
            if (estadoActivo) {
                System.out.println("La tarjeta ya esta activa");
                System.out.println("*****************************************************************************");
            }
            else{
                tarjeta.setEstadoActivo(true);
                System.out.println("La tarjeta ha sido reactivada");
                System.out.println("*****************************************************************************");
            }
                
                break;
            default:
                break;
        }
    }
    public void hacerBizum(Tarjetas tarjeta, Tarjetas tarjeta2, int cantidad){
        tarjeta.setSaldo(tarjeta.getSaldo()-cantidad);
        tarjeta2.setSaldo(tarjeta2.getSaldo()+cantidad);
        System.out.println("Bizum realizado correctamente");

    }

}
