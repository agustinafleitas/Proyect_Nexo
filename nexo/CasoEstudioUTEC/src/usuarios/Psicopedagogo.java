package usuarios;
import usuarios.Usuario;

/**
 * Clase Psicopedagogo
 *
 * Descripción: Representa a un profesional autorizado a registrar, modificar y eliminar información de los estudiantes, incluyendo datos confidenciales.
 *
 * Relación: Hereda de la clase abstracta Usuario.
 *
 * Uso: Utilizado para realizar el seguimiento especializado de los estudiantes y gestionar informaión integral.
 * */

public class Psicopedagogo extends Usuario {
    public Psicopedagogo(String nombre, String apellido, String correoInstitucional, String cedula) {
        super (nombre, apellido, correoInstitucional, cedula, "Psicopedagogo");
    }

    public void modificarDatosEstudiante(){
        System.out.println("Crear, modificar o eliminar datos de estudiantes, dejando un registro");
    }
}
