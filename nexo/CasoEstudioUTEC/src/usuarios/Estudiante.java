package usuarios;

import usuarios.Usuario;
import java.time.LocalDate;
import java.util.List;

/**
 * Clase Estudiante
 *
 * Descripción: Representa a un estudiante registrado en el sistema SIENEP.
 * Contiene información personal, académinca y médica relevante para su seguimiento.
 *
 * Relación: Hereda de la clase abstracta Usuario.
 *
 * Uso: Es utilizado para almacenar y gestionar los datos de los estudiantes que necesitan acompañamiento personalizado.
 * */

public class Estudiante extends Usuario {
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String grupo;
    private String carrera;
    private String sede;
    private String sistemaSalud;
    private String motivoDerivacion;
    private String origenRegistro; //Preinscripción o Solicitud

    private List<String> enfermedades;
    private List<String> medicaciones;
    private List<String> discapacidades;
    private List<String> tratamientos;

    /**
     * Constructor para crear un nuevo estudiante */
    public Estudiante (String nombre, String apellido, String correoInstitucional, String cedula, LocalDate fechaNacimiento, String direccion, String telefono, String grupo, String carrera, String sede,
                       String sistemaSalud, String motivoDerivacion, String origenRegistro, List<String> enfermedades, List<String> medicaciones, List<String> discapacidades, List<String> tratamientos) {
        super (nombre, apellido, correoInstitucional, cedula, "Estudiante");
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.grupo = grupo;
        this.carrera = carrera;
        this.sede = sede;
        this.sistemaSalud = sistemaSalud;
        this.motivoDerivacion = motivoDerivacion;
        this.origenRegistro = origenRegistro;
        this.enfermedades = enfermedades;
        this.medicaciones = medicaciones;
        this.discapacidades = discapacidades;
        this.tratamientos = tratamientos;

    }

    //Getters
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getSede() {
        return sede;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public String getMotivoDerivacion() {
        return motivoDerivacion;
    }

    public String getOrigenRegistro() {
        return origenRegistro;
    }
}


