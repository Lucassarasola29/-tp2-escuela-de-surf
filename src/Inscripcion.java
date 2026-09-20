public class Inscripcion {
    private Turno turno;
    private String fecha;
    private Tabla tabla;
    private boolean asistencia;

    public Inscripcion(Turno turno, String fecha) {
        this.turno = turno;
        this.fecha = fecha;
        this.asistencia = false;
    }

    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    public String getFecha(){
        return this.fecha;
    }

    public Turno getTurno(){
        return this.turno;
    }

    public boolean asistencia(){
        return this.asistencia;
    }

    public void setAsistencia(boolean asistencia){
        this.asistencia = asistencia;
    }

}

