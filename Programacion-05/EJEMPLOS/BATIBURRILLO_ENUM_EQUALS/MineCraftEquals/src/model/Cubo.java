package model;

public class Cubo {

    private MATERIAL material;
    private String nombre;

    public Cubo(MATERIAL material,String nombre) {
        this.material = material;
        this.nombre = nombre;
    }

    public Cubo(MATERIAL material) {
        this.material = material;
    }


    
    public MATERIAL getMaterial() {
        return material;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cubo other = (Cubo) obj;
        if (material != other.material)
            return false;
        return true;
    }


}
