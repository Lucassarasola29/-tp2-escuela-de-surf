public class Alumno {
    private String nombre;
    private String apellido;
    private String DNI;
    private String nivel;
    private int numeroAlumno;
    private int cantInscripciones;
    private Inscripcion[] inscripciones;
    

    public Alumno(String nombre, String apellido, String DNI, String nivel){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nivel = nivel;
        this.cantInscripciones = 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public String getDNI(){
        return this.DNI;
    }

    public String getNivel(){
        return this.nivel;
    }

    public void setNivel(String nivel){
        this.nivel = nivel;
    }

    public void setNumeroAlumno(int numeroAlumno){
        this.numeroAlumno = numeroAlumno;
    }

    public int getNumeroAlumno(){
        return this.numeroAlumno;
    }
    
    public void inscribirse(Turno turno){

        if (turno != null) {
            this.inscripciones[cantInscripciones] = new Inscripcion(Turno);
        } else {
            System.out.println("Error, no se puede inscribirse a un turno inexistente");
    }

}