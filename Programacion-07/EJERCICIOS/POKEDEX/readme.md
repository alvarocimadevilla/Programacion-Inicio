# POKEDEX WEB: práctica guiada
<img src="https://user-images.githubusercontent.com/91023374/231422148-c2699d1c-2aab-452c-915d-406c4fc85eb4.png" height="400"/>

## Con la realización de este proyecto vamos a aprender a:

- Conectar a un API de Pokemon vía web **https://pokeapi.co/api/v2/pokemon/**
- Guardar el JSON en el filesystem con la información pertinente
- Usar la librería **Gson** para convertir el json a objetos Java, concretamente a objetos Pokemon
- Mostrar la información del Pokemon en cuestión en una página HTML

____

## Monta el proyecto

1. Descarga la carpeta del proyecto para empezar a trabajar.

2. Monta el proyecto en tu entorno, genera el paquete WAR con Maven, despliégalo y comprueba que funciona en tu navegador.

3. Observa que el archivo **pom.xml** contiene una nueva dependencia. Es la que me permitirá usar la librería GSON:

![image](https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/ec0a4c75-96de-48a8-96ae-9cf5c8a22cc3)


4. Debe salir la página html de inicio y al dar ver info, se mostrará simplemente un mensaje:

<img src="https://github.com/profeMelola/Programacion-07-2023-24/assets/91023374/476eb14b-416f-4364-969d-c0e23e0d879e" height="200"/>



## Mostrar una ficha completa del pokemon o la imagen frontal o la imagen trasera

Usando la siguiente página html, el servlet recibirá la información pertienente para decidir qué devolver.

Sigue los pasos que te indique el profesor.

**Página index.html:**

___
<img src="https://user-images.githubusercontent.com/91023374/231729308-8aec30d0-d840-423d-a4ed-0a7f1c5ac6e8.png" height="200"/>

___

**Página HTML resultado:**

<img src="https://user-images.githubusercontent.com/91023374/231729364-0ae60908-bf0d-4b6d-bbf2-fc7eb4465ad2.png" height="200"/>


___

### WEB INTERESANTE: Generate Plain Old Java Objects from JSON or JSON-Schema

https://www.jsonschema2pojo.org/

![image](https://user-images.githubusercontent.com/91023374/232442531-d80411cd-9af9-490a-98fa-eea8959e85f9.png)

