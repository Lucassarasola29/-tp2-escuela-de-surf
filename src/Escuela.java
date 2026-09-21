public class Escuela {
	private static final int MAX_TABLAS = 100;
	private static final int MAX_TURNOS = 100;
	private static final int MAX_ALUMNOS = 100;
	private static int cantAlumnos = 0;

	private String nombre;
	private String playa;
	private int cantTurnos;
	private Turno turnos[];
	private int cantTablas;
	private Tabla tablas[];
	private Alumno alumnos[];

	public Escuela(String nombre, String playa) {
		this.nombre = nombre;
		this.playa = playa;
		this.turnos = new Turno[MAX_TURNOS];
		this.tablas = new Tabla[MAX_TABLAS];
		this.alumnos = new Alumno[MAX_ALUMNOS];
	}

	public String descripcion() {
		return "Escuela: " + this.nombre + "Playa: " + this.playa + "Cantidad turnos: " + this.cantTurnos
				+ "Cantidad tablas: " + this.cantTablas + "Cantidad alumnos: " + cantAlumnos;
	}

	public void crearTurno(String fecha, String horario) {
		this.turnos[cantTurnos] = new Turno(fecha, horario);
		this.cantTurnos++;
	}

	public void asignarTurno(Instructor instructor) {
		if (instructor != null) {
			for (Turno turno : turnos) {
				if (turno.getInstructor() == null) {
					instructor.agregarTurno(turno);
					return;
				}
			}
		} else {
			System.out.println("No se puede agregar turno a instructor nulo");
		}
	}

	public void registrarAlumno(Alumno alumno) {
		if (alumno != null) {
			alumno.setNumeroAlumno(cantAlumnos + 1);
			this.alumnos[cantAlumnos] = alumno;
			cantAlumnos++;
		} else {
			System.out.println("No se puede añadir un alumno nulo");
		}
	}

	public void cargarTabla(Tabla tabla) {
		if (tabla != null) {
			this.tablas[cantTablas] = tabla;
			this.cantTablas++;
		} else {
			System.out.println("No se puede añadir una tabla nula");
		}
	}
}
