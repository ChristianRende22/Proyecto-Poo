package modelo;

import java.sql.Time;
import java.util.Date;

public class Horario {
    private String idHorario;
    private Date dia;
    private Time horaInicio;
    private Time horaFin;
    private boolean disponible;

    public Horario(String idHorario, Date dia, Time horaInicio, Time horaFin) {
        this.idHorario = idHorario;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponible = true;
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