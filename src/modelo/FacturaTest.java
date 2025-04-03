package modelo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FacturaTest {

    @Test
    public void testCalcularMontoTotal() {
        // 1. Configuración manual
        Paciente paciente = new Paciente("Ana", "López", 28, "98765432-1", 87654321, "ana@example.com");
        Doctor doctor = new Doctor(2000, "María", "Rodríguez", "Ortodoncia", 76543210, "maria@clinica.com");

        Cita cita = new Cita("C002", paciente, doctor,
                LocalDateTime.of(2025, 11, 15, 14, 0),
                LocalDateTime.of(2025, 11, 15, 15, 0), 120.0);

        Tratamiento tratamiento = new Tratamiento("T002", paciente, doctor, "Limpieza", 80.0, LocalDateTime.now(), "Completado");

        List<Cita> citas = new ArrayList<>();
        citas.add(cita);

        List<Tratamiento> tratamientos = new ArrayList<>();
        tratamientos.add(tratamiento);

        Factura factura = new Factura("F002", paciente, citas, tratamientos, LocalDateTime.now(), 0.0, "Pendiente");

        // 2. Ejecución
        factura.calcularMontoTotal(cita, tratamiento);

        // 3. Verificación
        assertEquals(200.0, factura.getMontoTotal(), 0.001); // 120 (cita) + 80 (tratamiento) = 200
    }

    @Test
    public void testGenerarFactura() {
        // Configuración
        Paciente paciente = new Paciente("Carlos", "Gómez", 35, "12345678-9", 12345678, "carlos@example.com");
        Doctor doctor = new Doctor(1000, "Juan", "Pérez", "Odontología", 87654321, "juan@clinica.com");

        Cita cita = new Cita("C003", paciente, doctor,
                LocalDateTime.of(2025, 12, 20, 10, 0),
                LocalDateTime.of(2025, 12, 20, 11, 0), 150.0);

        List<Cita> citas = new ArrayList<>();
        citas.add(cita);

        Factura factura = new Factura("F003", paciente, citas, new ArrayList<>(), LocalDateTime.now(), 150.0, "Pendiente");

        // Ejecución y verificación (que no lance excepciones)
        factura.generarFactura();
        assertNotNull(factura.toString()); // Verificación adicional
    }

    @Test
    public void testGetPaciente() {
        // Configuración
        Paciente paciente = new Paciente("Luisa", "Martínez", 40, "55555555-5", 55555555, "luisa@example.com");
        Factura factura = new Factura("F004", paciente, new ArrayList<>(), new ArrayList<>(), LocalDateTime.now(), 0.0, "Pagada");

        // Verificación
        assertEquals("Luisa Martínez", factura.getPaciente().getNombre() + " " + factura.getPaciente().getApellido());
    }

    @Test
    public void testEstadoPago() {
        // Configuración
        Factura factura = new Factura("F005",
                new Paciente("Pedro", "Sánchez", 50, "66666666-6", 66666666, "pedro@example.com"),
                new ArrayList<>(),
                new ArrayList<>(),
                LocalDateTime.now(),
                300.0,
                "Pendiente"
        );

        // Ejecución
        factura.setEstadoPago("Pagada");

        // Verificación
        assertEquals("Pagada", factura.getEstadoPago());
    }
}