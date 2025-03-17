package modelo;

import java.time.LocalDateTime;

public class Cita {
    private String idCita;
    private Paciente paciente;
    private Doctor doctor;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private String estado;
    private double costoCita;

    public Cita(String idCita, Paciente paciente, Doctor doctor, LocalDateTime horaInicio, LocalDateTime horaFin, double costoCita) {
        this.idCita = idCita;
        this.paciente = paciente;
        this.doctor = doctor;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.costoCita = costoCita;
        this.estado = "Pendiente";
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

    // Método toString
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