package usuarios;
import usuarios.Usuario;

/**
 * Clase FuncionarioUTEC
 *
 * Descripción: Representa a funcionarios de UTEC como docentes o coordinadores, con acceso restringido.
 *
 * Relación: Hereda de la clase abstracta Usuario.
 *
 * Uso: Solo pueden visualizar información no confidencial de los estudiantes.
 * */

public class FuncionarioUTEC extends Usuario {

    public FuncionarioUTEC (String nombre, String apellido, String correoInstitucional, String cedula) {
        super (nombre, apellido, correoInstitucional, cedula, "Funcionario UTEC");
    }

    public void accederInformacion(){
        System.out.println("Solo puede visualizar información no confidencial");
    }
}
