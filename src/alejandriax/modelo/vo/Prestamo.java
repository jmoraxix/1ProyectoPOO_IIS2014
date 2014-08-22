/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Aug 22, 2014
 */
package alejandriax.modelo.vo;

import java.util.Date;

/**
 * @author Diego Aug 22, 2014
 *
 */
public class Prestamo {
	
	/**************Variables**************/

	private String codigoPrestamo;
	private Date fechaPrestamo;
	private String estadoPrestamo;
	private ArticuloVO idArticulo;
	
	
	/**************Getters/Setters**************/
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
	public ArticuloVO getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(ArticuloVO idArticulo) {
		this.idArticulo = idArticulo;
	}

	
	
	
}
