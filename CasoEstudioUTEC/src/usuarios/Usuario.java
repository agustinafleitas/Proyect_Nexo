package usuarios;

/**
 * Clase abstracta Usuario
 *
 *Descripción: Clase base que representa a cualquier usuario del sistema SIENEP,
 * Define los atributos comunes para todos los tipos de usuarios.
 *
 * Uso: Proporciona una estructura común para representar a todos los tipos de usuarios del sistema.
 * */

public class Usuario {
    private String nombre;
    private String apellido;
    private String correoInstitucional;
    private String cedula;
    private String rol;

    //Constructor para la clase usuario
    public Usuario(String nombre, String apellido, String correoInstitucional, String cedula, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoInstitucional = correoInstitucional;
        this.cedula = cedula;
        this.rol = rol;
    }
}


