public class Instructor {
    private String nombre;
    private String apellido;
    private int numeroMatricula;
    private Turno turnos[];
    private int cantTurnos;

    public Instructor(String nombre, String apellido, int numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroMatricula = numeroMatricula;
        this.cantTurnos = 0;
        this.turnos = new Turno[10];

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getnumeroMatricula() {
        return this.numeroMatricula;
    }

    public int getCantTurnos() {
        return cantTurnos;
    }

    public void agregarTurno(Turno turno) {
        if (cantTurnos < turnos.length) {
            this.turnos[cantTurnos] = turno;
            turno.setInstructor(this);
            this.cantTurnos++;
        } else {
            System.out.println("Error: el instructor " + apellido + "no se puede tener mas de " + turnos.length
                    + "turnos asignados");
        }

    }

    public Turno[] getTurnos() {
        return turnos;
    }

    public String descripcion() {
        return "Instructor: " + nombre + "" + apellido + "" + " | Matricula: " + numeroMatricula;
    }

}
