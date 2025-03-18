package modelo;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Clase que representa una factura en la clínica dental.
 * Contiene información sobre el paciente, las citas, los tratamientos y el monto total.
 */
public class Factura {
    private String idFactura;          // Identificador único de la factura
    private Paciente paciente;         // Paciente asociado a la factura
    private List<Cita> citas;          // Lista de citas asociadas a la factura
    private List<Tratamiento> tratamientos; // Lista de tratamientos asociados a la factura
    private LocalDateTime fechaEmision; // Fecha y hora de emisión de la factura
    private double montoTotal;         // Monto total de la factura
    private String estadoPago;         // Estado de pago de la factura (Pendiente, Pagada, etc.)

    /**
     * Constructor para crear una nueva factura.
     * @param idFactura Identificador único de la factura.
     * @param paciente Paciente asociado a la factura.
     * @param citas Lista de citas asociadas a la factura.
     * @param tratamientos Lista de tratamientos asociados a la factura.
     * @param fechaEmision Fecha y hora de emisión de la factura.
     * @param montoTotal Monto total de la factura.
     * @param estadoPago Estado de pago de la factura.
     */
    public Factura(String idFactura, Paciente paciente, List<Cita> citas, List<Tratamiento> tratamientos, LocalDateTime fechaEmision, double montoTotal, String estadoPago) {
        this.idFactura = idFactura;
        this.paciente = paciente;
        this.citas = citas;
        this.tratamientos = tratamientos;
        this.fechaEmision = fechaEmision;
        this.montoTotal = montoTotal;
        this.estadoPago = estadoPago;
    }

    // Getters y Setters
    public String getIdFactura() { return idFactura; }
    public void setIdFactura(String idFactura) { this.idFactura = idFactura; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public List<Cita> getCitas() { return citas; }
    public void setCitas(List<Cita> citas) { this.citas = citas; }

    public List<Tratamiento> getTratamientos() { return tratamientos; }
    public void setTratamientos(List<Tratamiento> tratamientos) { this.tratamientos = tratamientos; }

    public LocalDateTime getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(LocalDateTime fechaEmision) { this.fechaEmision = fechaEmision; }

    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }

    public String getEstadoPago() { return estadoPago; }
    public void setEstadoPago(String estadoPago) { this.estadoPago = estadoPago; }

    /**
     * Método para generar la factura y mostrar su información.
     */
    public void generarFactura() {
        System.out.println("\n--- Factura ---");
        System.out.println("ID de la factura: " + idFactura);
        System.out.println("Paciente: " + paciente.getNombre() + " " + paciente.getApellido());
        System.out.println("Monto total: $" + montoTotal);
        System.out.println("Estado de pago: " + estadoPago);
    }

    /**
     * Método para calcular el monto total de la factura.
     * @param cita Cita asociada a la factura.
     * @param tratamiento Tratamiento asociado a la factura.
     */
    public void calcularMontoTotal(Cita cita, Tratamiento tratamiento) {
        this.montoTotal = cita.getCostoCita() + tratamiento.getCosto();
    }

    /**
     * Método para representar la factura como una cadena de texto.
     * @return Cadena que representa la factura.
     */
    @Override
    public String toString() {
        return "Factura{" +
                "idFactura='" + idFactura + '\'' +
                ", paciente=" + paciente.getNombre() + " " + paciente.getApellido() +
                ", montoTotal=" + montoTotal +
                ", estadoPago='" + estadoPago + '\'' +
                '}';
    }
}