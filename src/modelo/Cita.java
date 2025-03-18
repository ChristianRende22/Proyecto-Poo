package modelo;

import java.time.LocalDateTime;

/**
 * Clase que representa una cita en la clínica dental.
 * Contiene información sobre el paciente, el doctor, el horario y el estado de la cita.
 */
public class Cita {
    private String idCita;          // Identificador único de la cita
    private Paciente paciente;      // Paciente asociado a la cita
    private Doctor doctor;          // Doctor asociado a la cita
    private LocalDateTime horaInicio; // Fecha y hora de inicio de la cita
    private LocalDateTime horaFin;   // Fecha y hora de fin de la cita
    private String estado;          // Estado de la cita (Pendiente, Cancelada, etc.)
    private double costoCita;       // Costo de la cita

    /**
     * Constructor para crear una nueva cita.
     * @param idCita Identificador único de la cita.
     * @param paciente Paciente asociado a la cita.
     * @param doctor Doctor asociado a la cita.
     * @param horaInicio Fecha y hora de inicio de la cita.
     * @param horaFin Fecha y hora de fin de la cita.
     * @param costoCita Costo de la cita.
     */
    public Cita(String idCita, Paciente paciente, Doctor doctor, LocalDateTime horaInicio, LocalDateTime horaFin, double costoCita) {
        this.idCita = idCita;
        this.paciente = paciente;
        this.doctor = doctor;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.costoCita = costoCita;
        this.estado = "Pendiente"; // Por defecto, la cita está pendiente
    }

    // Getters y Setters
    public String getIdCita() { return idCita; }
    public void setIdCita(String idCita) { this.idCita = idCita; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }

    public LocalDateTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalDateTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalDateTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalDateTime horaFin) { this.horaFin = horaFin; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getCostoCita() { return costoCita; }
    public void setCostoCita(double costoCita) { this.costoCita = costoCita; }

    /**
     * Método para representar la cita como una cadena de texto.
     * @return Cadena que representa la cita.
     */
    @Override
    public String toString() {
        return "Cita{" +
                "idCita='" + idCita + '\'' +
                ", paciente=" + paciente.getNombre() + " " + paciente.getApellido() +
                ", doctor=" + doctor.getNombre() + " " + doctor.getApellido() +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", estado='" + estado + '\'' +
                ", costoCita=" + costoCita +
                '}';
    }
}