import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Inscripcion {
    private Turno turno;
    private String fecha;
    private Tabla tabla;
    private boolean asistencia;

    public Inscripcion(Turno turno, Tabla tabla) {
        this.turno = turno;
        this.tabla = tabla;
        this.asistencia = false;
        DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha = fecha.format(new Date());
    }

    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    public Tabla getTabla() {
        return this.tabla;
    }

    public String getFecha() {
        return this.fecha;
    }

    public Turno getTurno() {
        return this.turno;
    }

    public boolean asistencia() {
        return this.asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String descripcion() {
        String estado;

        if (asistencia == true) {
            estado = "Asistio";
        } else {
            estado = "No asistio";
        }

        return "fecha: " + fecha + "Turno: " + turno.getHorario() + "Tabla: " + tabla.getCodigo() + "Asistencia: "
                + estado;
    }
}
