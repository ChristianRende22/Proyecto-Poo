package modelo;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String apellido;
    private int edad;
    private String DUI;
    private int telefono;
    private String correo;
    private List<Tratamiento> historialMedico;
    private List<Cita> citas;
    private double saldoPendiente;

    public Paciente(String nombre, String apellido, int edad, String DUI, int telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DUI = DUI;
        this.telefono = telefono;
        this.correo = correo;
        this.historialMedico = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.saldoPendiente = 0.0;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDUI() { return DUI; }
    public void setDUI(String DUI) { this.DUI = DUI; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public List<Tratamiento> getHistorialMedico() { return historialMedico; }
    public void setHistorialMedico(List<Tratamiento> historialMedico) { this.historialMedico = historialMedico; }

    public List<Cita> getCitas() { return citas; }
    public void setCitas(List<Cita> citas) { this.citas = citas; }

    public double getSaldoPendiente() { return saldoPendiente; }
    public void setSaldoPendiente(double saldoPendiente) { this.saldoPendiente = saldoPendiente; }

    // Métodos adicionales
    public void agregarTratamiento(Tratamiento tratamiento) {
        historialMedico.add(tratamiento);
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void consultarHistorial() {
        System.out.println("\n--- Historial Médico de " + nombre + " " + apellido + " ---");

        // Mostrar tratamientos
        System.out.println("\n📋 **Tratamientos realizados**");
        if (historialMedico.isEmpty()) {
            System.out.println("   No hay tratamientos registrados.");
        } else {
            for (Tratamiento tratamiento : historialMedico) {
                System.out.println("   - ID: " + tratamiento.getIdTratamiento());
                System.out.println("     Descripción: " + tratamiento.getDescripcion());
                System.out.println("     Costo: $" + tratamiento.getCosto());
                System.out.println("     Fecha: " + tratamiento.getFechaRealizacion());
                System.out.println("     Estado: " + tratamiento.getEstado());
                System.out.println("     Doctor: " + tratamiento.getDoctor().getNombre() + " " + tratamiento.getDoctor().getApellido());
                System.out.println("     ------------------------------");
            }
        }

        // Mostrar citas
        System.out.println("\n📅 **Citas agendadas**");
        if (citas.isEmpty()) {
            System.out.println("   No hay citas registradas.");
        } else {
            for (Cita cita : citas) {
                System.out.println("   - ID: " + cita.getIdCita());
                System.out.println("     Fecha: " + cita.getFecha());
                System.out.println("     Costo: $" + cita.getCostoCita());
                System.out.println("     Estado: " + cita.getEstado());
                System.out.println("     Doctor: " + cita.getDoctor().getNombre() + " " + cita.getDoctor().getApellido());
                System.out.println("     ------------------------------");
            }
        }

        // Mostrar resumen
        System.out.println("\n📊 **Resumen**");
        System.out.println("   Total de tratamientos: " + historialMedico.size());
        System.out.println("   Total de citas: " + citas.size());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", DUI='" + DUI + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", saldoPendiente=" + saldoPendiente +
                '}';
    }
}