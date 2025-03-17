package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private int id;
    private String nombre;
    private String apellido;
    private String especialidad;
    private int telefono;
    private String correo;
    private List<Cita> citas;

    public Doctor(int id, String nombre, String apellido, String especialidad, int telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
        this.citas = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public List<Cita> getCitas() { return citas; }
    public void setCitas(List<Cita> citas) { this.citas = citas; }

    // Método para verificar disponibilidad
    public boolean estaDisponible(LocalDateTime horaInicio, LocalDateTime horaFin) {
        for (Cita cita : citas) {
            if (cita.getHoraInicio().isBefore(horaFin) && cita.getHoraFin().isAfter(horaInicio)) {
                return false; // El doctor tiene una cita en ese horario
            }
        }
        return true; // El doctor está disponible
    }

    // Método para consultar las citas del doctor
    public void consultarCitas() {
        System.out.println("\n--- Citas del Doctor " + nombre + " " + apellido + " ---");
        if (citas.isEmpty()) {
            System.out.println("El doctor no tiene citas agendadas.");
        } else {
            for (Cita cita : citas) {
                System.out.println("\nID de la cita: " + cita.getIdCita());
                System.out.println("Paciente: " + cita.getPaciente().getNombre() + " " + cita.getPaciente().getApellido());
                System.out.println("Hora de inicio: " + cita.getHoraInicio());
                System.out.println("Hora de fin: " + cita.getHoraFin());
                System.out.println("Costo: $" + cita.getCostoCita());
                System.out.println("Estado: " + cita.getEstado());
            }
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}';
    }
}