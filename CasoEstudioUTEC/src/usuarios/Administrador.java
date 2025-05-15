package usuarios;
import usuarios.Usuario;

/**
 * Clase Administrador
 *
 * Descripción: Representa a un usuario con permisos totales dentro del sistema SIENEP
 * Incluye la gestión de usuarios
 *
 * Relación: Hereda de la clase abstracta Usuario.
 *
 * Uso: Permite crear, modificar y eliminar cualquier usuario del sistema. Tiene acceso totas a toda la información del sistema.
 * */

public class Administrador extends Usuario {
    public Administrador(String nombre, String apellido, String correoInstitucional, String cedula) {
        super (nombre, apellido, correoInstitucional, cedula, "Administrador");
    }

    public void gestionarUsuarios(){
        System.out.println("Crear, modificar o eliminar usuarios");
    }
}
