package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un doctor en la clínica dental.
 * Contiene información personal del doctor y las citas asociadas.
 */
public class Doctor {
    private int id;                 // Identificador único del doctor
    private String nombre;          // Nombre del doctor
    private String apellido;        // Apellido del doctor
    private String especialidad;    // Especialidad del doctor
    private int telefono;           // Teléfono del doctor
    private String correo;          // Correo electrónico del doctor
    private List<Cita> citas;       // Lista de citas asociadas al doctor

    /**
     * Constructor para crear un nuevo doctor.
     * @param id Identificador único del doctor.
     * @param nombre Nombre del doctor.
     * @param apellido Apellido del doctor.
     * @param especialidad Especialidad del doctor.
     * @param telefono Teléfono del doctor.
     * @param correo Correo electrónico del doctor.
     */
    public Doctor(int id, String nombre, String apellido, String especialidad, int telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
        this.citas = new ArrayList<>(); // Inicializa la lista de citas vacía
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

//    public List<Cita> getCitas() { return citas; }
//    public void setCitas(List<Cita> citas) { this.citas = citas; }


    public boolean estaDisponible(LocalDateTime horaInicio, LocalDateTime horaFin) {
        for (Cita cita : citas) {
            if (cita.getHoraInicio().isBefore(horaFin) && cita.getHoraFin().isAfter(horaInicio)) {
                return false; // El doctor tiene una cita en ese horario
            }
        }
        return true; // El doctor está disponible
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public List<Cita> getCitas() {
        return citas;
    }
    public void consultarCitas() {
        if (citas.isEmpty()) {
            System.out.println("❌ No hay citas registradas para este doctor.");
            return;
        }

        System.out.println("\n--- Citas del Doctor " + nombre + " " + apellido + " ---");
        System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
        System.out.println("| ID Cita             | Paciente            | Fecha Inicio        | Fecha Fin           | Estado              |");
        System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");

        for (Cita cita : citas) {
            System.out.printf(
                    "| %-20s| %-20s| %-20s| %-20s| %-20s|\n",
                    cita.getIdCita(),
                    cita.getPaciente().getNombre() + " " + cita.getPaciente().getApellido(),
                    cita.getHoraInicio(),
                    cita.getHoraFin(),
                    cita.getEstado()
            );
        }

        System.out.println("+---------------------+---------------------+---------------------+---------------------+---------------------+");
    }

    /**
     * Método para representar al doctor como una cadena de texto.
     * @return Cadena que representa al doctor.
     */
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
