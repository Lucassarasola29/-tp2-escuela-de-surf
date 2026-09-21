public class Turno {
    public static final int CUPO_MAXIMO = 2;
    private String fecha;
    private String horario;
    private Instructor instructor;
    private int cupo;
    private Inscripcion[] inscripciones;
    private int cantInscripciones;

    public Turno(String fecha, String horario) {
        this.fecha = fecha;
        this.horario = horario;
        this.inscripciones = new Inscripcion[CUPO_MAXIMO];
        this.cantInscripciones = 0;

    }

    public String getFecha() {
        return fecha;
    }

    public String getHorario() {
        return horario;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public int getCantInscripciones() {
        return cantInscripciones;
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        if (inscripcion == null) {
            System.out.println("Error: No se puede agregar una inscripción nula.");
        } else if (cantInscripciones < CUPO_MAXIMO) {
            inscripciones[cantInscripciones] = inscripcion;
            cantInscripciones++;
        } else {
            System.out.println("Error: El turno no tiene cupo disponible para más inscripciones.");

        }
    }

    public void setInstructor(Instructor instructor) {
        if (instructor != null) {
            this.instructor = instructor;
        } else {
            System.out.println("Error, no se puede asginar un instructor nulo al turno");

        }
    }

    public boolean tablaDisponible(Tabla tabla) {
        if (tabla == null) {
            return false;
        }
        for (int i = 0; i < cantInscripciones; i++) {
            Tabla tablaOcupada = inscripciones[i].getTabla();

            if (tablaOcupada != null && tablaOcupada.equals(tabla)) {
                return false;
            }

        }
        return true;
    }

    public String descripcion() {
        String nombreInstructor = (instructor != null) ? instructor.getApellido() : "Sin asignar";
        return "Turno del " + fecha + " a las " + horario + " Hs | Instructor: " + nombreInstructor + "  | Cupo: "
                + cantInscripciones;
    }

}
