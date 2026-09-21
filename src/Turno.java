public class Turno {
    public static final int CUPO_MAXIMO = 20;
    private String fecha; 
    private String horario; 
    private Instructor instructor;
    private int cupo = 0;  
    private Tabla tablas[];
    private Inscripcion[] inscripciones;
    
    public Turno (String fecha, String horario, int cupo) {
        this.fecha = fecha; 
        this.horario = horario;
        this.cupo = cupo; 
        this.tablas = new Tabla [CUPO_MAXIMO];
        this.inscripciones = new Inscripcion [CUPO_MAXIMO];
  


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


    public void setInstructor (Instructor instructor) {
        if (instructor != null) {
            this.instructor = instructor;
        } else {
            System.out.println("Error, no se puede asginar un instructor nulo al turno");
    
        }
    }

    public String descripcion () {
         return "Turno del " + fecha + " a las " + horario + " Hs | Instructor: " +  " | Cupo: " + cupo;
    }
    

    


}