/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Aug 22, 2014
 */

package alejandriax.modelo;

import java.util.ArrayList;

/**
 * @author Diego Aug 22, 2014
 * 
 */

public class Persona {

	/************** Variables **************/
	private String numeroCedula;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	protected String telefono;
	protected String correoElectronico;
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();

	/**** Constructor ****/
	public Persona(String numeroCedula, String nombre, String primerApellido,
			String segundoApellido) {
		this.numeroCedula = numeroCedula;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}

	/************** Getters/Setters **************/

	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void addPrestamos(Prestamo prestamo) {
		this.prestamos.add(prestamo);
	}

}
