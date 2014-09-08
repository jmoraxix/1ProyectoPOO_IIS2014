/**
 * 
 */
package alejandriax.modelo;

/**
 * @author jmora
 *
 */
public class Estudiante extends Persona {

	/**
	 * @param numeroCedula
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 */
	public Estudiante(String numeroCedula, String nombre,String primerApellido,
			String segundoApellido) {
		super(numeroCedula, nombre, primerApellido, segundoApellido);
		setTelefono(telefono);
		setCorreoElectronico(correoElectronico);
	}

}
