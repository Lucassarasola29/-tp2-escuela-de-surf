public class Main {
    public static void main(String args[]) {
        Escuela escuela = new Escuela("Escuela tifon", "Las necocheas");
        Instructor instructores[] = new Instructor[2];
        instructores[0] = new Instructor("Juan", "Perez", 76543);
        instructores[1] = new Instructor("Ana", "Gomez", 34567);
        Tabla tablas[] = new Tabla[4];
        tablas[0] = new Tabla("123", 7.00);
        tablas[1] = new Tabla("456", 6.00);
        tablas[2] = new Tabla("789", 6.50);
        tablas[3] = new Tabla("101112", 5.00);
        escuela.crearTurno("06/08/2026", "13:00");
        escuela.crearTurno("08/08/2026", "08:00");
        escuela.crearTurno("13/08/2026", "16:00");
        escuela.asignarTurno(instructores[0]);
        escuela.asignarTurno(instructores[0]);
        escuela.asignarTurno(instructores[1]);
        escuela.asignarTurno(instructores[1]);
        Alumno alumnos[] = new Alumno[5];
        alumnos[0] = new Alumno("James", "Johnson", "50000000", "intermedio");
        alumnos[1] = new Alumno("Luciano", "Dindart", "11111111", "principiante");
        alumnos[2] = new Alumno("Simon", "Delmenico", "22222222", "principiante");
        alumnos[3] = new Alumno("Lucas", "Sarasola", "33333333", "principiante");
        alumnos[4] = new Alumno("Bautista", "Arevalo", "44444444", "intermedio");
        for (Alumno alumno : alumnos) {
            escuela.registrarAlumno(alumno);
        }
        Turno turnos[] = escuela.getTurnos();
        alumnos[0].inscribirse(turnos[0], tablas[0]);
        alumnos[1].inscribirse(turnos[1], tablas[2]);
        alumnos[2].inscribirse(turnos[0], tablas[3]);
        alumnos[3].inscribirse(turnos[2], tablas[2]);
        alumnos[4].inscribirse(turnos[1], tablas[1]);
        alumnos[1].inscribirse(turnos[2], tablas[1]);
        alumnos[2].inscribirse(turnos[2], tablas[0]);

        escuela.mostrarTurnos();
        System.out.println(alumnos[2].descripcion());
        alumnos[0].mostrarInscripciones();

        Tabla tablaEnReparacion = new Tabla("1111111", 8.00);
        tablaEnReparacion.setDisponibilidad(false);
        escuela.cargarTabla(tablaEnReparacion);
        System.out.println("Tablas en reparacion: " + escuela.tablasEnReparacion());
        Inscripcion[] inscripciones = alumnos[0].getInscripciones();
        inscripciones[0].setAsistencia(true);
        System.out.printf("Porcentaje de asistencia de turno 1: %.2f%%", turnos[0].porcentajeAsistencia());
        escuela.mostrarAlumnos();

    }
}
