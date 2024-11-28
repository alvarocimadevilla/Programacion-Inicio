# Primeros pasos con la POO: ejemplos guiados

## Ejemplo 1: definición de la clase Persona

1. Construir la clase Persona con los siguientes **atributos** (elige el tipo más apropiado):

- Nombre
- Color de piel
- Color de ojos
- Profesión

2. Añadir métodos de comportamiento:

- nacer()
- hablar()
- caminar()
- morir()

Cada método que simplemente muestre una traza informativa.

**¿Cómo creamos objetos persona?**

- Al definir una clase esta se convierte en un **nuevo tipo de dato**
- El nombre de la clase y el nombre del fichero que la contiene debe ser el mismo.
- La declaración de clase es sólo una descripción de tipos, no crea ningún objeto.

Vamos a usar:

- Constructor por defecto.
- Reerencias a atributos de un objeto.
- Referencias a métodos de un objeto.

## Ejemplo 2: definición de una clase Vehiculo

1. Construir la clase vehículo con los siguientes **atributos** (elige el tipo más apropiado):

- marca
- modelo
- número de pasajeros
- capacidad combustible
- consumo (consumo km/litro)

###  Creación de objetos Vehiculo

1. Vamos a usar:

- Constructor con todos los atributos. 
- Creación de métodos getter&setter
- Referencias a métodos de un objeto.

2. Crearemos dos vehículos distintos (dos objetos) en la clase Main:

**Vehículo1: monovolumen**

- marca = Renault
- modelo=Space
- pasajeros = 7
- capacidad depósito = 50
- consumo = 14

**Vehículo2: deportivo**

- marca = Lexus
- modelo= F Sport
- pasajeros = 2
- capacidad depósito = 66
- consumo = 18,8

3. Modificaremos la clase Vehiculo para que incluya el método calcularAutonomía:

```
float calcularAutonomia() {
 return capacidadCombustible*consumo;
}

```
4. Añadiremos en el main la llamada al método para obtener la autonomía de cada vehículo y mostrar los resultados por consola.

**¿Y si ahora quiero modificar el modelo del monovolumen para que sea Space Deluxe? ¿Cómo podemos hacerlo?**
