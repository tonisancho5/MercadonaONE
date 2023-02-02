### 7-10 días antes del evento

Enviar antes de empezar, enviar a los candidatos el link:
https://gitlab.gcp.mercadona.com/diving/ingenieria/training-and-hiring/ejercicio-1-preparar-a-los-participantes

### LEER ESTO PREVIO AL EVENTO (Mientras llega la gente)

El ejericio es una kata de refactorización.

Al examinado se le presenta:
* La definición del ejercicio en la pantalla grande
* La lógica de negocio legacy
* Una demostración de como ejecutar el main()
* Una demostración de como ejecutar los tests
* Se le explica que el alcance del reto es añadir un nuevo caso de uso.

Explicación del reto:
* El problema es que no se puede hacer si no se limpia el código antes.
* El nuevo caso de uso es casi imposible de añadir.

El facilitador:
* Acompaña en el desarrollo
* Resuelve dudas (tanto de código como de compresión del ejercicio)
* Si el progreso del candidato se estanca se sugieren cambios en el código, para desbloquearle. Idealmente basados en los refactors sugeridos más adelante.

En la introducción:
* Si los candidatos no están familiarizados con TDD, se les sugiere que el ejercicio se resuelve muchísimo mas facil si hacen tests, varios por caso de uso descrito en la funcionalidad presentada, de forma que a medida que modifica el programa, podrá ver si lo ha roto o no.
* El ejercicio se puede resolver sin tests también.

La evaluación:
La forma de evaluar si la solución es completa es usando los tests preparados previamente. Pasar los tests nos dice qué ha roto y si ha implementado el nuevo caso de uso correctamente.

### INTRODUCCIÓN A LOS CANDIDATOS

* Present yourself and the facilitators.

* Explain the exercise. **This point is very important to avoid confusions.**

* Explain the rules. **This point is very important to avoid confusions.**

* Explicar que el objetivo del ejercicio es conocernos, sobre todo pasarlo bien y compartir conocimientos. Matizar que **NO** es un examen, y que tiene muchísimas formas de resolverse.

* El objetivo no es acabarla, sino ver hasta donde llegamos.

* Preguntar qué lenguaje prefieren, JAVA o PYTHON

* Al finalizar de la kata cualquiera que lo desee puede presentar su código al resto de la sala. O comentar en retrospectiva como ha conseguido desenredar el código. Ideas que ha tenido por ejemplo (Esto demuestra que el candidato tiene ganas de participar y no tiene miedo y es proactivo, actitud)

* Hacemos pausas cada 25 minutos para que la gente descanse un poco.

* Prohibido condicionar a otros candidatos dejando que comenten entre ello lo que cada uno está haciendo. Esto solo lo puede hacer el facilitador. Comentar en voz alta ideas (puesto que son compartidas para desbloquear)

* Do not forget to take some pictures!. Para los candidatos esto es un reto y lo recordarán con cariño.


### AYUDAS

Acciones para bajar el nivel de dificultad si es requerido por el nivel del candidato.

Nivel de dificultad inicial
  * Sin tests, solo el de ejemplo
  * Si en los primeros 15 min se bloquea, bajamos en nivel

Bajada de nivel dificultad
  * Les damos el enunciado de los tests, tests vacíós.
  * A los 15 minutos sugerimos algún refactor y sugerimos un ejemplo con su código

Bajada de nivel dificultad
  * Les damos los tests del ejemplo base, pero no el test del caso que tienen que añadir
  * A los 15 minutos sugerimos algún refactor y sugerimos un ejemplo con su código

Bajada de nivel dificultad
  * Les damos todos los tests
  * Les sugerimos cada 10 mins un cambio para desbloquearlos


### SUGERIR AL EXAMINADO

Sugerencias al pasearse y ver cada pantalla cada 10 mins. Si es necesario.

* El ejercicio se puede resolver de varias formas:
  * Usando programación orientada a objetos o procedural, si lo prefiere
  * Puede usar un enfoque inside-out o outside-in


* Sugerir siempre testear, cambios pequeños (baby steps) y reejecutar los tests en cada cambio.

### Refactors

Motivos:

* Refactorizar es simplemente para reducir la carga cognitiva que se requiere para entender el código. Y por lo tanto poder trabajarlo mejor.

* Hacer tests es para poder modificar el código teniendo claro a cada paso que no rompemos ni cambiamos ninguna funcionalidad de forma involuntaria.

Explicar los refactos a la gente durante el ejercicio, a poder ser en la pizarra, hacer un .md por ejemplo.

* [For loops](refactors/1_for_loops.md)
* [Negative conditionals](refactors/2_negative_conditionals.md)
* [Split conditionals](refactors/3_split_conditionals.md)
* [Remove dead code](refactors/4_remove_dead_code.md)
* [Simplify operation](refactors/5_simplify_operations.md)
* [Extract method](refactors/6_extract_method.md)
* [Extract variable](refactors/7_extract_variable.md)

### BASE HISTÓRICA

Personaje nº 1 que hay que conocer:

**Michael C. Feathers** Autor del libro working Effectively With Legacy Code

Veamos su punto de vista inicial:

```
What’s legacy code?

Legacy code is code that we’ve gotten from someone else. (…) tangled, unintelligible structure, code that you have to change but don’t really understand.
```

En mi opinión este razonamiento inicial de se Michael C. Feathers basaba en el coste cognitivo que tiene trabajar código entregado en esas condiciones.

Para trabajar con legacy code hay que poder modificarlo sin cambiar su comportamiento existente, con seguridad de que no rompemos nada. Esto se hace con Refactoring.

Refactoring es cambiar el código sin cambiar su comportamiento.

**Martin Fowler** define el refactoring como: a change made to the internal structure of software **to make it easier to understand and cheaper to modify** without changing its existing behavior.

Es decir, modificarlo para que trabajar con él tenga menos carga cognitiva.

Pero... cuando refactorizamos el código, ¿cómo podemos estar seguros de que no cambiamos su comportamiento?, con tests unitarios.

Con el paso de los años Michael C. Feathers cambió su idea de qué es legacy code:

```
Legacy code is simply code without tests.

Why?

Code without tests is bad code. It doesn’t matter how well written it is; it doesn’t matter how pretty or object-oriented or well-encapsulated it is. With tests, we can change the behavior of our code quickly and verifiably. Without them, we really don’t know if our code is getting better or worse.
```

Con la aparición de Test Driven Development (aka TDD) la industria ha dado un vuelco.
Ya no es el estado del código lo que define si es o no légacy, **sino la capacidad de hacer cambios al comportamiento del mismo de forma verificable**. Por ejemplo añadir un caso nuevo de uso (como el ejercicio de hoy), o arreglar un error.

Como Michael C. Feathers indica, hay 2 tipos de desarrolladores, los que 

* **Edit and Pray**

o los que

* **Cover and Modify**  <- Test

¿Y qué es TDD?

Test-Driven Development (TDD) is a technique for building software that guides software development by writing tests. It was developed by **Kent Beck** in the late 1990's as part of Extreme Programming. In essence you follow three simple steps repeatedly:

* Write a test for the next bit of functionality you want to add.
* Write the functional code until the test passes.
* Refactor both new and old code to make it well structured.

