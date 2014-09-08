/**
 * Primer Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 23/8/2014
 */
package alejandriax.modelo;

/**
 * @author Róger
 *
 */
public class Colega extends Persona {

	/**
	 * @param numeroCedula
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 */
	public Colega(String numeroCedula, String nombre, String primerApellido,
			String segundoApellido) {
		super(numeroCedula, nombre, primerApellido, segundoApellido);
		setTelefono(telefono);
		setCorreoElectronico(correoElectronico);
	}

}
