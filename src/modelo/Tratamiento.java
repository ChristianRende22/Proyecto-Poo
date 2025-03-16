package modelo;

import java.time.LocalDateTime;

public class Tratamiento {
    private String idTratamiento;
    private Paciente paciente;
    private Doctor doctor;
    private String descripcion;
    private double costo;
    private LocalDateTime fechaRealizacion;
    private String estado;

    public Tratamiento(String idTratamiento, Paciente paciente, Doctor doctor, String descripcion, double costo, LocalDateTime fechaRealizacion, String estado) {
        this.idTratamiento = idTratamiento;
        this.paciente = paciente;
        this.doctor = doctor;
        this.descripcion = descripcion;
        this.costo = costo;
        this.fechaRealizacion = fechaRealizacion;
        this.estado = estado;
    }

    // Getters y Setters
    public String getIdTratamiento() { return idTratamiento; }
    public void setIdTratamiento(String idTratamiento) { this.idTratamiento = idTratamiento; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public LocalDateTime getFechaRealizacion() { return fechaRealizacion; }
    public void setFechaRealizacion(LocalDateTime fechaRealizacion) { this.fechaRealizacion = fechaRealizacion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "idTratamiento='" + idTratamiento + '\'' +
                ", paciente=" + paciente.getNombre() + " " + paciente.getApellido() +
                ", doctor=" + doctor.getNombre() + " " + doctor.getApellido() +
                ", descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                ", fechaRealizacion=" + fechaRealizacion +
                ", estado='" + estado + '\'' +
                '}';
    }
}
