public class Alumno {
    private String nombre;
    private String apellido;
    private String DNI;
    private String nivel;
    private int numeroAlumno;
    private int cantInscripciones;
    private Inscripcion[] inscripciones;

    public Alumno(String nombre, String apellido, String DNI, String nivel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nivel = nivel;
        this.cantInscripciones = 0;
        this.inscripciones = new Inscripcion[100];
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getNivel() {
        return this.nivel;
    }

    public Inscripcion[] getInscripciones() {
        return this.inscripciones;
    }

    public void setNivel(String nivel) {
        if (nivel == "intermedio" || nivel == "principiante") {
            this.nivel = nivel;
        } else {
            System.out.println("Error, el nivel no existe");
        }
    }

    public void setNumeroAlumno(int numeroAlumno) {
        this.numeroAlumno = numeroAlumno;
    }

    public int getNumeroAlumno() {
        return this.numeroAlumno;
    }

    public void inscribirse(Turno turno, Tabla tabla) {

        if (turno == null) {
            System.out.println("Error, no se puede inscribirse a un turno inexistente");
            return;
        } else if (tabla == null || tabla.disponible() == false || turno.tablaDisponible(tabla) == false) {
            System.out.println("Error, no se puede inscribirse a un turno con una tabla no disponible");
            return;
        } else {
            this.inscripciones[cantInscripciones] = new Inscripcion(turno, tabla);
            turno.agregarInscripcion(this.inscripciones[cantInscripciones]);
            this.cantInscripciones++;
        }

    }

    public void mostrarInscripciones() {
        for (int i = 0; i < cantInscripciones; i++) {
            System.out.println(this.inscripciones[i].descripcion());
        }
    }

    public String descripcion() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " DNI: " + DNI + " Nivel: " + nivel + " Numero Alumno: "
                + numeroAlumno + " Cantidad de inscripciones: " + cantInscripciones;
    }

}
