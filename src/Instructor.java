public class Instructor {
    private String nombre; 
    private String apellido; 
    private int numeroMatricula;
    private Turno turnos[]; 
    
    public Instructor (String nombre, String apellido, int numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido; 
        this.numeroMatricula = numeroMatricula; 
        

    }
    public String getNombre (){
        return this.nombre; 
    }

    public String getApellido (){
        return this.apellido;
    }

    public int getnumeroMatricula() {
        return this.numeroMatricula; 
    }




}