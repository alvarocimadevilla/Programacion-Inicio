# Serialización de objetos en Java

Serializar un objeto es convertirlo a una secuencia de bytes para ser almacenada en un archivo o transmitida a través de una red.

## Beneficios de los archivos en binario

- **Eficiencia de almacenamiento:** Los archivos binarios tienden a ser más eficientes en cuanto al espacio de almacenamiento requerido. Debido a que los datos se almacenan en su forma más cruda, sin ninguna representación de texto legible para humanos, los archivos binarios generalmente ocupan menos espacio que sus equivalentes en texto.

- **Velocidad de lectura y escritura:** Los archivos binarios suelen ser más rápidos de leer y escribir en comparación con los archivos de texto. Esto se debe a que no hay necesidad de realizar conversiones entre representaciones de texto y formatos de datos internos.

- **Estructura de datos compleja:** Si tus datos tienen una estructura compleja o incluyen objetos con relaciones complejas entre ellos, como en el ejemplo de los estudiantes, la serialización de objetos en un archivo binario es una forma conveniente de guardar y recuperar esos datos sin tener que preocuparse por la estructura subyacente.

- **Seguridad y privacidad:** Los archivos binarios pueden ser más seguros en términos de protección de datos, ya que no son fácilmente legibles para los humanos. Esto puede ser importante si estás tratando con datos sensibles que necesitan ser protegidos de accesos no autorizados.

## Enunciado del ejercicio

Escribe un programa en Java que permita guardar y cargar los datos de los estudiantes desde un archivo binario. Debes usar flujos de entrada y salida en binario para esta tarea.

Vas a usar una clase Estudiante:

```
class Estudiante implements Serializable {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
```

Observa que es necesario implementar la interfaz **Serializable** para poder convertir los objetos a binario.

Implementa un método llamado **guardarEstudiantes** que reciba el nombre del archivo binario que se va a guardar en el directorio SERIALIZADOS del directorio home del usuario y diferentes objetos Estudiante (número variable).

```
private static void guardarEstudiantes(String archivo, Estudiante... estudiantes)
```

Vas a aprender a usar un **parámetro varargs**. Fíjate en este ejemplo y aplícalo en el método guardarEstudiantes.

```
public void imprimirEstudiantes(Estudiante... estudiantes) {
    for (Estudiante estudiante : estudiantes) {
        System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad());
    }
}
```