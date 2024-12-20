package es.daw.poo2.electrodomesticos.model;

public class Lavadora extends Electrodomestico{

    private final static int CARGA_DEF=5;

    private int carga;


    /*

    Un constructor por defecto.
    Un constructor con el precio y peso. El resto por defecto.
    Un constructor con la carga y el resto de atributos heredados. 
    Recuerda que debes llamar al constructor de la clase padre.
    Un constructor con precio, peso, consumo energético y color (sin carga).
     
     */

    public Lavadora() {
    }

    public Lavadora(float precioBase, float peso) {
        super(precioBase, peso);
        carga = CARGA_DEF;
    }

    public Lavadora(float precioBase, float peso, int carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(float precioBase, float peso, char consumoEnergetico, String color) {
        super(precioBase, color, consumoEnergetico, peso);
    }

    public Lavadora(float precioBase, float peso, char consumoEnergetico, String color, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
    }

    @Override
    public float getPrecioFinal() {
        
        float precioFinal = super.getPrecioFinal();

        /*/
        if (carga > 30){
            precioFinal += 50;
        }*/

        precioFinal += (carga>30)?50:0;

        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Lavadora [carga=" + carga + "]";
    }

    
     

}