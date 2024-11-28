/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.articulos.Model;

/**
 *
 * @author alumnot
 */
public class Articulo {

    private String nombre;
    private float precio;
    private static final int IVA = 21;
    private int cuantosQuedan;

    public Articulo(String nombre, float precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    @Override
    public String toString() {
        return nombre + " - Precio:" + precio +"€"+" - IVA:" +IVA+ "% - PVP: "+getPVP()+"€";
    }

    public void informacionArticulo() {
        System.out.println(this.toString());
    }

    public float getPVP() {

        return ((this.precio * IVA) / 100) + this.precio;
    }

    public float getPVPDescuento(int descuento) {
        return ((this.getPVP() * descuento) / 100) - this.precio;
    }

    public boolean vender(int cantidad) {
        if (cantidad < this.cuantosQuedan) {
            System.out.println("Estas quieriendo vender mas de los que tienes");
            return false;
        } 
        this.cuantosQuedan -= cantidad;
        return true;
    }
    
    public boolean almacenar(int cantidad){
        if (cantidad < this.cuantosQuedan){
            System.out.println("Estas queriendo guardar mas de los que tienes");
            return false;
        }
        return true;          
            
    }
}
