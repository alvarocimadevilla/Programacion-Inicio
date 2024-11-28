# Ejercicios para practicar con los conceptos teóricos aprendidos


## Ejercicio 1: POKEDEX

https://github.com/profeMelola/Programacion-07-2023-24/tree/main/EJERCICIOS/POKEDEX

## Ejercicio 2: PlagioQuijote

https://github.com/profeMelola/Programacion-07-2023-24/tree/main/EJERCICIOS/PlagioQuijote

## Ejercicio 3: FIND FILE WEB. Buscando a Wally

https://github.com/profeMelola/Programacion-07-2023-24/tree/main/EJERCICIOS/FIND_WEB

## Ejercicio 4: Buffer en binario

Escribe un programa en Java que utilice BufferedInputStream y BufferedOutputStream para copiar un archivo JPG desde la tarjeta SD (simulada como un archivo en el sistema de archivos) a la unidad de disco duro externo (también simulada como un archivo en el sistema de archivos).

Usa estas clases:

```
    Path pathBase = Paths.get(System.getProperty("user.home"),"BUFFER");
    Path tarjetaSD = Paths.get("tarjeta_sd","archivo_original.jpg");
    Path discoDuroExterno = Paths.get("disco_externo","archivo_copia.jpg");
```

El tamaño del buffer será 4 KB:
```
byte[] buffer = new byte[4096];
```

Copia una imagen cualquiera en el subdirectorio tarjet_sd y prueba que se realiza correctamente la copia.

Puedes ver el ejemplo del GitHub: https://github.com/profeMelola/Programacion-07-2023-24/blob/main/EJEMPLOS_FlujoEntrada/src/es/daw/bytes/buffered/CopyBytes.java


## Ejercicio 5: Serializar

https://github.com/profeMelola/Programacion-07-2023-24/tree/main/EJERCICIOS/Serializar
