# Ejercicio 1: expedición arqueológica

En una expedición arqueológica, un grupo de exploradores descubre una serie de artefactos antiguos. 

Sin embargo, muchos de los artefactos son duplicados y quieren eliminar las copias para mantener solo uno de cada tipo. 

Escribe un programa en Java que elimine los duplicados de la lista de artefactos encontrados.

Vas a partir de este código:

```
List<String> artefactos = new ArrayList<>();
        artefactos.add("Reloj antiguo");
        artefactos.add("Vaso de cerámica");
        artefactos.add("Reliquia de oro");
        artefactos.add("Reloj antiguo"); // Duplicado
        artefactos.add("Amuleto de plata");
        artefactos.add("Vaso de cerámica"); // Duplicado

        System.out.println("Artefactos antes de eliminar duplicados: " + artefactos);

        eliminarDuplicados(artefactos);

        System.out.println("Artefactos después de eliminar duplicados: " + artefactos);
```

Implementa el método eleminarDuplicados.


# Ejercicio 2: cola de supermercado

Crea una cola de supermercado. 

Aleatoriamente:
- 70% probabilidades un cliente nuevo se pone en la cola
- 30% un cliente de la cola ha sido atendido. 

Si la cola llega a tener 10 personas suena un mensaje por megafonía diciendo que, por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja. 

Que se vea por consola todo el proceso (cada vez que alguien entra o sale de la cola y el mensaje por megafonía).

Ejemplo de salida por consola:

```
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 1
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 2
El cliente Cliente 1 ha sido atendido. Total de clientes en cola: 1
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 2
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 3
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 4
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 5
El cliente Cliente 2 ha sido atendido. Total de clientes en cola: 4
El cliente Cliente 3 ha sido atendido. Total de clientes en cola: 3
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 4
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 5
El cliente Cliente 4 ha sido atendido. Total de clientes en cola: 4
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 5
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 6
El cliente Cliente 5 ha sido atendido. Total de clientes en cola: 5
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 6
El cliente Cliente 6 ha sido atendido. Total de clientes en cola: 5
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 6
El cliente Cliente 7 ha sido atendido. Total de clientes en cola: 5
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 6
El cliente Cliente 8 ha sido atendido. Total de clientes en cola: 5
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 6
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 7
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 8
El cliente Cliente 9 ha sido atendido. Total de clientes en cola: 7
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 8
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 9
El cliente Cliente 10 ha sido atendido. Total de clientes en cola: 8
El cliente Cliente 11 ha sido atendido. Total de clientes en cola: 7
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 8
El cliente Cliente 12 ha sido atendido. Total de clientes en cola: 7
El cliente Cliente 13 ha sido atendido. Total de clientes en cola: 6
El cliente Cliente 14 ha sido atendido. Total de clientes en cola: 5
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 6
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 7
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 8
El cliente Cliente 15 ha sido atendido. Total de clientes en cola: 7
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 8
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 9
El cliente Cliente 16 ha sido atendido. Total de clientes en cola: 8
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 9
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 10
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 17 ha sido atendido. Total de clientes en cola: 9
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 10
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 11
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 12
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 18 ha sido atendido. Total de clientes en cola: 11
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 12
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 13
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 19 ha sido atendido. Total de clientes en cola: 12
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 13
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 14
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 15
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 20 ha sido atendido. Total de clientes en cola: 14
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 15
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 16
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 17
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 21 ha sido atendido. Total de clientes en cola: 16
El cliente Cliente 22 ha sido atendido. Total de clientes en cola: 15
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 16
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 17
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 18
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 23 ha sido atendido. Total de clientes en cola: 17
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 18
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 19
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 20
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 21
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 24 ha sido atendido. Total de clientes en cola: 20
El cliente Cliente 25 ha sido atendido. Total de clientes en cola: 19
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 20
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 21
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 22
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 26 ha sido atendido. Total de clientes en cola: 21
El cliente Cliente 27 ha sido atendido. Total de clientes en cola: 20
El cliente Cliente 28 ha sido atendido. Total de clientes en cola: 19
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 20
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 21
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 22
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 29 ha sido atendido. Total de clientes en cola: 21
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 22
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 23
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 24
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 30 ha sido atendido. Total de clientes en cola: 23
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 24
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 31 ha sido atendido. Total de clientes en cola: 23
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 24
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 32 ha sido atendido. Total de clientes en cola: 23
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 24
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 25
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 26
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 27
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 28
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 29
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 30
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 31
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 32
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 33 ha sido atendido. Total de clientes en cola: 31
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 32
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 33
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 34
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 34 ha sido atendido. Total de clientes en cola: 33
El cliente Cliente 35 ha sido atendido. Total de clientes en cola: 32
El cliente Cliente 36 ha sido atendido. Total de clientes en cola: 31
El cliente Cliente 37 ha sido atendido. Total de clientes en cola: 30
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 31
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 32
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 38 ha sido atendido. Total de clientes en cola: 31
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 32
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 33
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 39 ha sido atendido. Total de clientes en cola: 32
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 33
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 34
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 40 ha sido atendido. Total de clientes en cola: 33
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 34
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 35
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 36
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 41 ha sido atendido. Total de clientes en cola: 35
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 36
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 37
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 38
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 42 ha sido atendido. Total de clientes en cola: 37
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 38
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 43 ha sido atendido. Total de clientes en cola: 37
El cliente Cliente 44 ha sido atendido. Total de clientes en cola: 36
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 37
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 38
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 39
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 40
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 45 ha sido atendido. Total de clientes en cola: 39
El cliente Cliente 46 ha sido atendido. Total de clientes en cola: 38
El cliente Cliente 47 ha sido atendido. Total de clientes en cola: 37
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 38
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 39
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 40
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 41
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 48 ha sido atendido. Total de clientes en cola: 40
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 41
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 42
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 43
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 44
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 45
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 49 ha sido atendido. Total de clientes en cola: 44
El cliente Cliente 50 ha sido atendido. Total de clientes en cola: 43
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 44
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 45
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 51 ha sido atendido. Total de clientes en cola: 44
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 45
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 46
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 47
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 48
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
El cliente Cliente 52 ha sido atendido. Total de clientes en cola: 47
El cliente Cliente 53 ha sido atendido. Total de clientes en cola: 46
Nuevo cliente se ha unido a la cola. Total de clientes en cola: 47
¡Megafonía!: Por favor, Pepito Pérez vuelva a su puesto de trabajo en Caja.
```

# Ejercicio 3: practicando con comparators

Utilizando la clase Persona, y partiendo de la lista, muestra diferentes listados:
- Por fecha de nacimiento.
- Por nombre y apellidos.

```
        List<Persona> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("34567890Z", "Ana", "Elola", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1992, 3, 4)));

```

# Ejercicio 4: borrar una persona de la lista

## Objetivo: aprender la interface Iterator

Crear un proyecto (es.daw.colecciones)

Crear un ArrayList de personas y borrar mientras se recorre la persona cuyo nombre sea X.

Para ello implementa un método llamado borrarPersona, con esta firma:

```
public static void borrarPersona(String nombre)
```

```
        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        listaPersonas.add(new Persona("34567890Z", "Ana", "Elola", LocalDate.of(1992, 3, 4)));
        listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1992, 3, 4)));
```


