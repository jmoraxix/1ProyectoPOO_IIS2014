/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Aug 22, 2014
 */
package alejandriax.modelo;

import java.util.Date;

/**
 * @author Diego Aug 22, 2014
 * 
 */
public class Prestamo {

	/************** Variables **************/
	private String codigoPrestamo;
	private Date fechaPrestamo;
	private String estadoPrestamo;
	private Articulo articulo;

	/**** Constructor ****/
	public Prestamo(String codigoPrestamo, Date fechaPrestamo,
			String estadoPrestamo, Articulo articulo) {
		super();
		this.codigoPrestamo = codigoPrestamo;
		this.fechaPrestamo = fechaPrestamo;
		this.estadoPrestamo = estadoPrestamo;
		this.articulo = articulo;
		this.articulo.prestar();
	}

	/************** Getters/Setters **************/
	public String getCodigoPrestamo() {
		return codigoPrestamo;
	}

	public void setCodigoPrestamo(String codigoPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

	public Articulo getarticulo() {
		return articulo;
	}

	public void setarticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}
