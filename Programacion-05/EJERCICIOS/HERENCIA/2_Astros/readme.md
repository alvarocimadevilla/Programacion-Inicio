# Enunciado

Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites (lunas) que forman parte del sistema solar. 

Algunos atributos que necesitaremos almacenar son: 

- Nombre
- Radio
- Rotación del eje
- Masa del cuerpo. 
- Temperatura media
- Gravedad

En el caso de los **planetas** es necesario almacenar:

- Distancia al sol
- Órbita al sol
- tiene satélites (guardadlos en una lista dinámica **ArrayList**)

En el caso de los **satélites** es necesario almacenar:

- Distancia al planeta 

- Órbita al planeta planeta al que pertenece



**Define las clases necesarias conteniendo:**

• Constructores. 

• Métodos para recuperar y almacenas atributos. 

• Método para mostrar la información del objeto. 


**Sobreescribir el método toString()**
Vamos a sobreescribirlo para que dado un objeto del sistema solar (planeta o satélite), devuelva un String con toda la información que se dispone sobre el mismo (además de su lista de satélites si los tuviera).

Para ello haremos uso de la clase StringBuilder.

**Aunque salga en la captura, no hay que implementar el método muestra y mucho menos abstracto!!!!! utilizad el método toString() adecuadamente en cada caso** 

![Captura de pantalla de 2022-01-14 18-55-49](https://user-images.githubusercontent.com/91023374/149562533-f583c5b3-2c44-4b25-8155-ecba6e193b6d.png)


## Ejemplo de salida del programa

Con un menú para elegir los diferentes astros

![image](https://user-images.githubusercontent.com/91023374/213674199-dedb6630-9c8f-49ff-b964-2c791049b035.png)

**CONTROL DE ERRORES**
El programa controla que se intruduzca un número de planeta correcto (debe ser un entero positivo relacionado a un planeta existente)


## Valores de ejemplo para planetas y satélites

```
        // Instanciamos planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 227940000.0);

        // Instanciamos satélites
        Satelite luna = new Satelite("Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, 384400.0, tierra);
        Satelite fobos = new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, 6000, marte);
        Satelite deimos = new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, 23460, marte);
```

### Pista: para crear correctamente el método toString()
Investiga sobre:
- getClass()
- getClass().getSimpleName()

```
    public String toString() {
        StringBuilder sb = new StringBuilder("\n*** "+getClass().getSimpleName()+" "+super.getNombre()+" ***");
        sb.append(super.toString());
        sb.append("\ndistPlaneta=").append(distPlaneta);
        sb.append("\norbPlaneta=").append(orbPlaneta);
        sb.append("\nplaneta=").append(planeta.getNombre());
        return sb.toString();
    }
```



# VERSIÓN 2: Con clase abstracta

Implementar el método abstracto en Astro:

```
    // MÉTODO ABSTRACTO
    public abstract double obtenerNumeroDistanciaSoles();
    
```

Para obtener el número de soles de distancia hay que tener en cuenta que no se obtiene igual en los planetas que en los satélites. Vamos a considerar (que no se entere ningún astrónomo que nos mata!!!!) que:
- **En los planetas:** el número de soles será la distancia al sol dividida por el diámetro del sol (distSol / DIAMETRO_SOL).
- **En los satélites:** el número de soles será la distancia del satélite al planeta + la distancia del planeta el sol, dividido por el diámetro del sol.

```
    // Constante en la clase padre Astro
    protected final double DIAMETRO_SOL = 1500000;

```

**Al usar el método abstracto obligará a:**

- Declarar Astro como clase abstracta.

- Implementar el método abstracto en las clases hijas Planeta y Satélite.


# VERSIÓN 3: Uso de instance of

Solo la clase **Planeta** va a tener un nuevo método de comportamiento:

```
    // Método de comportamiento
    public String infoExtra(){
       return "Un planeta es un cuerpo esférico sin luz propia, que gira alrededor de una estrella"; 
    }
```

En la clase Main añade la lógica para que en el caso de que el astro de la lista sea un Planeta además muestra dicha información extra.
