package usuarios;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase RegistroEstudiante
 *
 * Descripción: Clase para la creación de objetos Estudiante a través de distintos métodos de registro.
 *
 * Relación: Genera instancias de la clase Estudiante
 *
 * Uso: Proporciona métodos estáticos para registrar estudiantes según su tipo de inscripción: preeinscripción o por solicitud posterior
 * Encapsula la lógica de creación de estudiantes según el origen del registro
 * */

public class RegistroEstudiante {

    public static Estudiante registroEstudiantePorPreinscripcion (String nombre, String apellido, String correoInstitucional, String cedula, LocalDate fechaNacimiento, String direccion, String telefono, String grupo, String carrera, String sede, String sistemaSalud, String motivoDerivacion, List<String> enfermedades, List<String> medicaciones, List<String> discapacidades, List<String> tratamientos) {
        return new Estudiante(nombre, apellido, correoInstitucional, cedula, fechaNacimiento, direccion, telefono, grupo, carrera, sede, sistemaSalud, motivoDerivacion, "Preinscripción", enfermedades, medicaciones, discapacidades, tratamientos);
    }

    public static Estudiante registroEstudiantePorSolicitud (String nombre, String apellido, String correoInstitucional, String cedula, LocalDate fechaNacimiento, String direccion, String telefono, String grupo, String carrera, String sede, String sistemaSalud, String motivoDerivacion, List<String> enfermedades, List<String> medicaciones, List<String> discapacidades, List<String> tratamientos) {
        return new Estudiante(nombre, apellido, correoInstitucional, cedula, fechaNacimiento, direccion, telefono, grupo, carrera, sede, sistemaSalud, motivoDerivacion, "Solicitud posterior", enfermedades, medicaciones, discapacidades, tratamientos);
    }
}
