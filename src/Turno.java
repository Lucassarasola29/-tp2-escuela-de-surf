public class Turno {
    public static final int CUPO_MAXIMO = 20;
    private String fecha; 
    private String horario; 
    private Instructor instructor;
    private int cupo; 
    private Tabla tablas[];
    private Inscripcion[] inscripciones;
    private int cantTablas;
    private int cantInscripciones;
    
    public Turno (String fecha, String horario) {
        this.fecha = fecha; 
        this.horario = horario;
        this.cupo = 0; 
        this.tablas = new Tabla [CUPO_MAXIMO];
        this.inscripciones = new Inscripcion [CUPO_MAXIMO];
        this.cantTablas = 0;
        this.cantInscripciones = 0;
  


    }
    public String getFecha (){
        return fecha; 
    } 

    public String getHorario (){
        return horario;
    }



    public int getCupo (){
        return cupo; 
    }
    
    public Instructor getInstructor () {
        return instructor;
    }
    public int getCantTablas (){
        return cantTablas;
    }

    public int getCantInscripciones (){
        return cantInscripcione; 
    }

    public void agregarTabla(Tabla tabla) {
        if (tabla == null) {
            System.out.println("Error: No se puede agregar una tabla nula.");
        } else if (cantTablas < tablas.length) {
            tablas[cantTablas] = tabla;
            cantTablas++;
        } else {
            System.out.println("Error: Se alcanzó el límite máximo de tablas asignadas al turno.");
        }
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        if (inscripcion == null) {
            System.out.println("Error: No se puede agregar una inscripción nula.");
        } else if (cantInscripciones < cupo) {
            inscripciones[cantInscripciones] = inscripcion;
            cantInscripciones++;
        } else {
            System.out.println("Error: El turno no tiene cupo disponible para más inscripciones.");
        }
    }



     public void setInstructor (Instructor instructor) {
        if (instructor != null) {
            this.instructor = instructor;
        } else {
            System.out.println("Error, no se puede asginar un instructor nulo al turno");
    
        }
    }

    public String descripcion () {
        String nombreInstructor = (instructor != null) ? instructor.getApellido() : "Sin asignar"; 
        return "Turno del " + fecha + " a las " + horario + " Hs | Instructor: " +  nombreInstructor + "  | Cupo: " + cupo;
    }
    

    


}