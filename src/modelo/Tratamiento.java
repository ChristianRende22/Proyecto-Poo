package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un paciente en la clínica dental.
 * Contiene información personal del paciente, su historial médico y citas.
 */
public class Paciente {
    private String nombre;              // Nombre del paciente
    private String apellido;            // Apellido del paciente
    private int edad;                  // Edad del paciente
    private String DUI;                // Documento único de identidad del paciente
    private int telefono;              // Teléfono del paciente
    private String correo;             // Correo electrónico del paciente
    private List<Tratamiento> historialMedico; // Historial médico del paciente
    private List<Cita> citas;          // Lista de citas del paciente
    private double saldoPendiente;     // Saldo pendiente del paciente

    /**
     * Constructor para crear un nuevo paciente.
     * @param nombre Nombre del paciente.
     * @param apellido Apellido del paciente.
     * @param edad Edad del paciente.
     * @param DUI Documento único de identidad del paciente.
     * @param telefono Teléfono del paciente.
     * @param correo Correo electrónico del paciente.
     */
    public Paciente(String nombre, String apellido, int edad, String DUI, int telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DUI = DUI;
        this.telefono = telefono;
        this.correo = correo;
        this.historialMedico = new ArrayList<>(); // Inicializa el historial médico vacío
        this.citas = new ArrayList<>();          // Inicializa la lista de citas vacía
        this.saldoPendiente = 0.0;              // Inicializa el saldo pendiente en 0
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

//    public List<Cita> getCitas() { return citas; }
//    public void setCitas(List<Cita> citas) { this.citas = citas; }

    public double getSaldoPendiente() { return saldoPendiente; }
    public void setSaldoPendiente(double saldoPendiente) { this.saldoPendiente = saldoPendiente; }

    /**
     * Método para agregar un tratamiento al historial médico del paciente.
     * @param tratamiento Tratamiento a agregar.
     */
    public void agregarTratamiento(Tratamiento tratamiento) {
        historialMedico.add(tratamiento);
    }

    /**
     * Método para agregar una cita al paciente.
     * @param cita Cita a agregar.
     */
    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> getCitas() {
        return citas;
    }


    /**
     * Método para consultar el historial médico del paciente.
     */
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

// Mostrar citas agendadas
        System.out.println("\n📅 **Citas agendadas**");
        if (citas.isEmpty()) {
            System.out.println("   No hay citas registradas.");
        } else {
            for (Cita cita : citas) {
                System.out.println("   - ID: " + cita.getIdCita());  // Mostrar el ID de la cita
                System.out.println("     Fecha y hora de inicio: " + cita.getHoraInicio());  // Mostrar la fecha y hora de inicio
                System.out.println("     Fecha y hora de fin: " + cita.getHoraFin());  // Mostrar la fecha y hora de fin
                System.out.println("     Costo: $" + cita.getCostoCita());  // Mostrar el costo de la cita
                System.out.println("     Estado: " + cita.getEstado());  // Mostrar el estado de la cita
                System.out.println("     Doctor: " + cita.getDoctor().getNombre() + " " + cita.getDoctor().getApellido());  // Mostrar el nombre del doctor
                System.out.println("     ------------------------------");  // Separador visual
            }
        }
        // Mostrar resumen
        System.out.println("\n📊 **Resumen**");
        System.out.println("   Total de tratamientos: " + historialMedico.size());
        System.out.println("   Total de citas: " + citas.size());
    }

    /**
     * Método para representar al paciente como una cadena de texto.
     * @return Cadena que representa al paciente.
     */
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
