package modelo;

import java.time.LocalDateTime;

/**
 * Clase que representa un tratamiento en la clínica dental.
 * Contiene información sobre el paciente, el doctor, la descripción y el costo del tratamiento.
 */
public class Tratamiento {
    private String idTratamiento;      // Identificador único del tratamiento
    private Paciente paciente;         // Paciente asociado al tratamiento
    private Doctor doctor;             // Doctor asociado al tratamiento
    private String descripcion;        // Descripción del tratamiento
    private double costo;              // Costo del tratamiento
    private LocalDateTime fechaRealizacion; // Fecha y hora de realización del tratamiento
    private String estado;             // Estado del tratamiento (Pendiente, Completado, etc.)

    /**
     * Constructor para crear un nuevo tratamiento.
     * @param idTratamiento Identificador único del tratamiento.
     * @param paciente Paciente asociado al tratamiento.
     * @param doctor Doctor asociado al tratamiento.
     * @param descripcion Descripción del tratamiento.
     * @param costo Costo del tratamiento.
     * @param fechaRealizacion Fecha y hora de realización del tratamiento.
     * @param estado Estado del tratamiento.
     */
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

    /**
     * Método para representar el tratamiento como una cadena de texto.
     * @return Cadena que representa el tratamiento.
     */
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
