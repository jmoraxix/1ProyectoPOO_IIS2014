/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Aug 22, 2014
 */

package alejandriax.modelo;

/**
 * @author Diego Aug 22, 2014
 *
 */

public class Persona {


	
	/**************Variables**************/
	
	private String numeroCedula;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String telefono;
	private String correoElectronico;
	private String tipo;
	private Prestamo[] prestamos;
	
	
	
	

	/**************Getters/Setters**************/
	
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
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Prestamo[] getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(Prestamo[] prestamos) {
		this.prestamos = prestamos;
	}
	
	
	

}
