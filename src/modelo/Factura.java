package modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Factura {
    private String idFactura;
    private Paciente paciente;
    private List<Cita> citas;
    private List<Tratamiento> tratamientos;
    private LocalDateTime fechaEmision;
    private double montoTotal;
    private String estadoPago;

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

    // Métodos adicionales
    public void generarFactura() {
        System.out.println("\n--- Factura ---");
        System.out.println("ID de la factura: " + idFactura);
        System.out.println("Paciente: " + paciente.getNombre() + " " + paciente.getApellido());
        System.out.println("Monto total: $" + montoTotal);
        System.out.println("Estado de pago: " + estadoPago);
    }

    public void calcularMontoTotal(Cita cita, Tratamiento tratamiento) {
        this.montoTotal = cita.getCostoCita() + tratamiento.getCosto();
    }

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