package usuarios;
import usuarios.Usuario;

/**
 * Clase LegalUTEC
 *
 * Descripción: Representa a abogados de UTEC que pueden acceder a toda la información de los estudiantes (no confidencial y confidencial).
 *
 * Relación: Hereda de la clase abstracta Usuario.
 *
 * Uso: Pueden consultar información completa de los estudiantes, pero no pueden ingresar, modificar o eliminar datos.
 * */

public class LegalUTEC extends Usuario {

    public LegalUTEC (String nombre, String apellido, String correoInstitucional, String cedula) {
        super (nombre, apellido, correoInstitucional, cedula, "Legal UTEC");
    }

    public void accederInformacion(){
        System.out.println("Solo puede visualizar información no confidencial y confidencial");
    }
}
