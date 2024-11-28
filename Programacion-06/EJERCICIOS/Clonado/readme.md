# PRÁCTICA GUIADA: clonado de ArrayList y clonado de los objetos del mismo

Con este ejercicio vemos la diferencia de hacer un clonado de ArrayList superficial a un clonado profundo clonando cada uno de los objetos que lo componen.

![image](https://user-images.githubusercontent.com/91023374/217520139-4fcccc2d-ebb6-45bd-9b02-3bac8c658209.png)

```
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;

    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    /*
    @Override
    public int compareTo(Object t) {
                
    }
    */

    @Override
    public int compareTo(Persona other) {
        /*if (other.getEdad() > edad)
            return -1;
        else if (edad > other.getEdad())
            return 1;
        else
            return 0;*/
        
        return edad - other.getEdad();
        
    }

}

```


## TEORÍA: Aclaraciones sobre interface Clonable

**No es necesario implementar la interface Cloneable** para hacer que una clase se pueda clonar en Java (aunque sí recomendable),  ya que todas las clases en Java heredan de java.lang.Object, que tiene un método clone(). 

Sin embargo, implementar Cloneable indica explícitamente que una clase es clonable y que se espera que su método clone() sea invocado para crear una copia del objeto.


Además, si una clase no implementa Cloneable, y se llama al método clone() en un objeto de esa clase, se lanzará una excepción CloneNotSupportedException. 

Por lo tanto, implementar Cloneable permite que una clase controle y personalice su comportamiento de clonación.


La clonación real se logra a través del método **clone() protegido de la clase Object**, que debe ser **redefinido en la clase a clonar y hacer que sea público.**

Ejemplo:

```

class ClonableExample implements Cloneable {
    private int value;

    public ClonableExample(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public ClonableExample clone() throws CloneNotSupportedException {
        return (ClonableExample) super.clone();
    }
}

```

También podríamos sobreescribir el método clone() de la siguiente forma:

```
    @Override
    public Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
```

Pero en este caso habría que hacer un cast al clonar el objeto, por ejemplo:

```
lista.add((ClonableExample)p.clone());

```

En algunos casos se opta por realizar la clonación profunda con el operador new.

No es necesario usar el operador new en el método clone(). De hecho, el método clone() proporcionado por la clase Object realiza una clonación superficial por defecto, por lo que en muchos casos es suficiente con llamar a super.clone() para obtener una clonación funcional.

Sin embargo, en algunos casos es posible que se quiera realizar una clonación profunda en lugar de una clonación superficial.

En ese caso, se puede optar por implementar una clonación manual en el método clone() en lugar de llamar a super.clone(). 

En ese caso, se crearía una nueva instancia usando el operador new y se asignarían manualmente los valores a los campos correspondientes.

En general, se recomienda usar super.clone() para realizar una clonación superficial y crear una clonación profunda manual si es necesario. 

Esto asegura que se cumpla con las buenas prácticas de programación y se eviten errores de implementación.

Ejemplo:

![image](https://user-images.githubusercontent.com/91023374/217517996-1d82e9d8-664a-4a03-89dc-5910b8dc2cb6.png)
