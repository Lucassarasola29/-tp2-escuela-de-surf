# Trabajo Práctico N°2 Programación
## Integrantes: Luciano Dindart, Lucas Sarasola, Simon Delmenico
Trabajo por integrante:
* Luciano -> Alumno.java,Inscripcion.java.
* Lucas -> Instructor.java,Turno.java.
* Simon -> Tabla.java,Escuela.java.
* Todos -> Main.java,diagrama UML, Tp2-programacion.pdf, README.md.

### Para compilar:
Es requerido [JDK](https://www.oracle.com/latam/java/technologies/downloads/) (Java Development Kit)
Se compila el archivo Main.java y se ejecuta:
```
javac Main.java
java Main
```

## Preguntas:
1. El enunciado tiene una relación que necesitó una clase propia. Expliquen qué pasaba si no la creaban, con
un ejemplo concreto de este sistema.
Respuesta: Si no creabamos inscripcion los datos propios de la clase, como fecha y asistencia, o no serian tratados o directamente tendrian que ir en alguna de las otras dos clases, en este sistema tiene mucho mas sentido una clase inscripcion que hacer un arreglo de asistencias en turnos y alumnos.

2. Elijan una de las tres relaciones del diagrama y expliquen por qué le pusieron ese rombo y no otro. No
repitan la definición: usen la frase del enunciado que los decidió.
Respuesta: La relacion de Escuela-tabla es agregacion porque en el enunciado se menciona que "escuela tiene tablas de alquiler" y "Las tablas se reparten entre los turnos según haga falta" entonces escuela tiene que tener un recuento de las tablas existentes.

3. El número de alumno se resolvió con un atributo static. Expliquen qué habría cambiado si ese contador lo
llevaba el main, y por qué el sistema no debería depender de eso.
Respuesta: Si el contador lo llevase el main, el contador no podria usarse internamente en la clase Escuela, por lo que algunos calculos e accesos podrian verse limitados por un parametro, ademas el sentido de que escuela lleve el recuento de alumnos es un agregado a la lectura del sistema.

4. Tuvieron al menos un conflicto de merge. Cuenten cuál fue, qué archivo era y cómo lo resolvieron.
respuesta: Fue en el archivo Alumno.java, se resolvio eliminando las partes que no necesitabamos y commiteando.
