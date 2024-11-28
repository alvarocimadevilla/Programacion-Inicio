# Gestión de personal de un instituto

## Objetivos
- Reforzar herencia.
- Reforzar clases abstractas

## Enunciado: versión 1
Se plantea desarrollar un programa Java que permita la gestión de personal de un instituto que trabaja con tres tipos de personas: 
- Profesor.
- Estudiante.
- EstudianteInternacional.
  
Todo  el personal tiene esta información común:
- Nombre completo: tipo String (nombreCompleto).
- Dirección: tipo String (direccion).
  
A su vez, cada tipo de personal tiene alguna información específica. 
- Los profesores tienen los aniosExperiencia (tipo entero). 
- Los estudiantes tienen su código de identificación NIA  (cadena de texto). 
- Los estudiantes internacionales, además de ser un estudiante normal, con el  NIA, tienen especificado el paisOrigen (cadena de texto)

Implementa el modelo con la jerarquía de clases que consideres adecuado.

Se proporciona una clase PersonaDAO para obtener una colección dinámica de Personas. Crea los constructores necesarios para que desaparezcan los errores de la clase PersonaDAO. 

En la clase principal obtén el listado del personal y muestra su información por consola de la siguiente manera:


![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/466d362f-5d78-42e5-b531-c6ad6f02dff0)

## Enunciado: versión 2

Ten en cuenta que todo el personal, una vez dado de alta en el sistema se deben validar. 

Usa, donde consideres,  el siguiente método abstracto para completar esta parte del ejercicio:

```
public abstract boolean validar();
```

Ten en cuenta que, la forma de validarse cada tipo de personal es diferente. Se consideran personas NO válidas si:
- Profesor: si tiene menos de dos años de experiencia.
- EstudianteInternacional: si el país de origen no se encuentra en la lista de países permitidos (España, Portugal, Francia e Italia).
- Estudiante: si el NIA no cumple con el patrón de empezar con 8 dígitos seguidos de una letra mayúscula, por ejemplo 12345678A;

Al ejecutar el programa debes obtener el listado del personal que no ha pasado la validación:

![image](https://github.com/profeMelola/Programacion-05-2023-24/assets/91023374/e37eb3c4-7528-41d8-bc5c-7e3a1dbc2f57)



