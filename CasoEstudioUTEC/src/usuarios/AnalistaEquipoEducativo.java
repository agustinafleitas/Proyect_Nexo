package usuarios;
import usuarios.Usuario;

/**
 * Clase AnalistaEquipoEducativo
 *
 * Descripción: Representa a un integrante del equipo educativo con acceso limitado a funcionalidades y con acceso a la información no confidencial.
 *
 * Relación: Hereda de la clase abstracta Usuario.
 *
 * Uso: Puede ingresar neuvos datos no confidenciales de los estudiantes, y modificar/eliminar datos ingresados personalmente.
 * */

public class AnalistaEquipoEducativo extends Usuario {
    public AnalistaEquipoEducativo (String nombre, String apellido, String correoInstitucional, String cedula) {
        super (nombre, apellido, correoInstitucional, cedula, "Analista Equipo Educativo");
    }

    public void ModificarDatosPropios(){
        System.out.println("Solo puede modificar datos que ingresó");
    }
}
