package modelo;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String nombre;
    private String apellido;
    private String especialidad;
    private int telefono;
    private String correo;
    private List<Horario> horarios;

    public Doctor(String nombre, String apellido, String especialidad, int telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
        this.horarios = new ArrayList<>();
    }

    // Getters y Setters
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

    public List<Horario> getHorarios() { return horarios; }
    public void setHorarios(List<Horario> horarios) { this.horarios = horarios; }

    // Métodos adicionales
    public void consultarCitas(List<Cita> citas) {
        System.out.println("\n--- Citas del Doctor " + nombre + " " + apellido + " ---");
        boolean tieneCitas = false;

        for (Cita cita : citas) {
            if (cita.getDoctor().equals(this)) {
                System.out.println("\nID de la cita: " + cita.getIdCita());
                System.out.println("Paciente: " + cita.getPaciente().getNombre() + " " + cita.getPaciente().getApellido());
                System.out.println("Fecha y hora: " + cita.getFecha());
                System.out.println("Costo: $" + cita.getCostoCita());
                System.out.println("Estado: " + cita.getEstado());
                tieneCitas = true;
            }
        }

        if (!tieneCitas) {
            System.out.println("El doctor no tiene citas agendadas.");
        }
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}';
    }
}