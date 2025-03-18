package modelo;

import java.sql.Time;
import java.util.Date;

/**
 * Clase que representa un horario en la clínica dental.
 * Contiene información sobre el día, la hora de inicio, la hora de fin y la disponibilidad.
 */
public class Horario {
    private String idHorario;       // Identificador único del horario
    private Date dia;               // Día del horario
    private Time horaInicio;        // Hora de inicio del horario
    private Time horaFin;           // Hora de fin del horario
    private boolean disponible;     // Indica si el horario está disponible

    /**
     * Constructor para crear un nuevo horario.
     * @param idHorario Identificador único del horario.
     * @param dia Día del horario.
     * @param horaInicio Hora de inicio del horario.
     * @param horaFin Hora de fin del horario.
     */
    public Horario(String idHorario, Date dia, Time horaInicio, Time horaFin) {
        this.idHorario = idHorario;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponible = true; // Por defecto, el horario está disponible
    }

    // Getters y Setters
    public String getIdHorario() { return idHorario; }
    public void setIdHorario(String idHorario) { this.idHorario = idHorario; }

    public Date getDia() { return dia; }
    public void setDia(Date dia) { this.dia = dia; }

    public Time getHoraInicio() { return horaInicio; }
    public void setHoraInicio(Time horaInicio) { this.horaInicio = horaInicio; }

    public Time getHoraFin() { return horaFin; }
    public void setHoraFin(Time horaFin) { this.horaFin = horaFin; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    /**
     * Método para representar el horario como una cadena de texto.
     * @return Cadena que representa el horario.
     */
    @Override
    public String toString() {
        return "Horario{" +
                "idHorario='" + idHorario + '\'' +
                ", dia=" + dia +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", disponible=" + disponible +
                '}';
    }
}