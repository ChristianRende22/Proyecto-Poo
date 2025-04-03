package modelo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoctorTest {
    private Doctor doctor;
    private Paciente paciente;

    @BeforeEach  // Anotación de JUnit 5
    public void setUp() {
        doctor = new Doctor(1000, "Carlos", "García", "Odontología", 87654321, "carlos@clinica.com");
        paciente = new Paciente("Juan", "Pérez", 30, "12345678-9", 12345678, "juan@example.com");
    }

    @Test
    public void testEstaDisponible() {
        LocalDateTime inicio = LocalDateTime.of(2025, 10, 25, 10, 0);
        LocalDateTime fin = LocalDateTime.of(2025, 10, 25, 11, 0);
        assertTrue(doctor.estaDisponible(inicio, fin), "El doctor debería estar disponible");
    }
}