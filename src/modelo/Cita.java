package modelo;

import java.time.LocalDateTime;

public class Cita {
    private String idCita;
    private Paciente paciente;
    private Doctor doctor;
    private LocalDateTime fecha;
    private String estado;
    private double costoCita;

    public Cita(String idCita, Paciente paciente, Doctor doctor, LocalDateTime fecha, double costoCita) {
        this.idCita = idCita;
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
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

    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getCostoCita() { return costoCita; }
    public void setCostoCita(double costoCita) { this.costoCita = costoCita; }

    // Métodos adicionales
    public void agregarCita() {
        this.estado = "Cita agendada";
        System.out.println("\n--- Cita Agendada ---");
        System.out.println("ID de la cita: " + idCita);
        System.out.println("Paciente: " + paciente.getNombre() + " " + paciente.getApellido());
        System.out.println("Doctor: " + doctor.getNombre() + " " + doctor.getApellido());
        System.out.println("Fecha y hora: " + fecha);
        System.out.println("Costo: $" + costoCita);
        System.out.println("Estado: " + estado);
    }

    @Override
    public String toString() {
        return "Cita{" +
                "idCita='" + idCita + '\'' +
                ", paciente=" + paciente.getNombre() + " " + paciente.getApellido() +
                ", doctor=" + doctor.getNombre() + " " + doctor.getApellido() +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", costoCita=" + costoCita +
                '}';
    }
}