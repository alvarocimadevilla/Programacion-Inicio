# Ejercicio: gestionar listas TO-DO de tareas

Se necesita crear una aplicación para gestionar listas TO-DO de tareas. Para ello es necesario implementar una clase llamada Tarea con las siguientes características:

### Todas las tareas tendrán:
- **Una descripción:** cadena de texto con la descripción de la tarea.
- **Fecha de finalización:** fecha límite de finalización de la tarea. Por ejemplo: LocalDate date = LocalDate.parse("2018-10-30");  //formato YYY-MM-DD
- **Prioridad:** valor entero comprendido entre 1 y 3. Una tarea con valor 1 es más prioritaria que otra con valor 3.
- **Finalizada:** un atributo booleano para indicar si ha finalizado o no la tarea.

### Se podrán crear tareas de tres formas:
- Indicando obligatoriamente la descripción, la fecha de finalización y la prioridad
- Indicando solo la descripción y la fecha de finalización. En este caso la tarea se inicializará por defecto con la prioridad más baja. (valor constante que no va a cambiar).
- Indicando solo la descripción. En este caso la tarea se inicializará:
  - por defecto con la prioridad más baja
  - tendrá como fecha de finalización la fecha actual (LocalDate.now())
  Usa la función this() para las llamadas entre constructores.

### Ten en cuenta también que al crear la tarea:
- Su estado por defecto será no finalizada.
- Si la descripción supera los 40 caracteres (valor constante) se cortará el texto hasta ese límite. Por ejemplo si la tarea es:
    “Tengo que estudiar mucho Programación para aprobar” (50 caracteres), la descripción con la que se crea la tarea será “Tengo que estudiar mucho Programación pa” (40 caracteres).
- Al crear la tarea se da por hecho que el resto de los valores introducidos son correctos.

Una vez creada la tarea se podrá modificar cualquier dato de la misma menos su descripción, porque si se necesitase modificar la descripción se crearía una nueva tarea.

### Funcionalidades
La clase tendrá la funcionalidad de codificar y descodificar la descripción. 

Para ello implementa los dos métodos de comportamiento proporcionados, uno para codificar y otro para descodificar, teniendo en cuenta:
- Los caracteres a codificar/descodificar vienen especificados en los arrays constantes LETRAS y CODIGOS. Cada letra se corresponde con el código en su misma posición. Sustituye cada letra por su código y al revés según corresponda.
  El método debería de funcionar aunque se modifique el contenido de dichos arrays (añadiendo o quitando letras y códigos).
- Se podrá codificar/descodificar la descripción cuando se desee pero debes controlar que solo se podrá codificar si la descripción no está codificada y solo podrá descodificar si la descripción está codificada. Devuelve false en caso de error.

Finalmente sobreescribe el método toString() para obtener la información de cada Tarea con el siguiente formato:

![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/d94a61a2-079b-449a-ba82-abc8740c1013)


Como puedes observar se indica si la tarea está finalizada o no. Usa la clase StringBuilder. 

### Clase principal ejecutable

Vas a simular una lista de tareas TODO usando un array de objetos Tarea.

En el simulacro, dicha lista estará compuesta por 5 tareas con los siguientes datos:

![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/f23c3cd6-9785-4308-9303-b09d88a8e5b3)

**PASO 1:** Da de alta los diferentes objetos Tarea en el array en base a la información proporcionada.

**PASO 2:** Codifica la descripción de la última tarea y haz las pruebas pertinentes según lo especificado. Por ejemplo:

![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/543b5f82-9d9c-4016-a342-9d3f4ec8e7ee)


**PASO 3:** muestra la información de todas las tareas. Crea un método estático en la propia clase principal.  Debes obtener las siguientes trazas por consola:

![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/24811a77-baf8-412b-ab21-eb3df81c85d5)


**PASO 4:** finaliza la segunda y tercera tarea y muestra solo las tareas que han finalizado indicando también cuántas han finalizado. 

Crea un método estático en la propia clase principal. Debes obtener las siguientes trazas por consola:

![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/a4214e88-532d-4942-9729-6daa2ac2d3ce)




