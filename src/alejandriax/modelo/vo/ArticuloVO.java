/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Aug 22, 2014
 */
package alejandriax.modelo.vo;

import java.awt.image.BufferedImage;

/**
 * @author Diego Aug 22, 2014
 *
 */
public class ArticuloVO {

	/**************Variables**************/
	
	private String tituloArticulo;
	private BufferedImage imagen;
	private CalificacionVO[] calificacion;
	private String idArticulo;
	private int cantidad;
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**************Getters/Setters**************/
	public String getTituloArticulo() {
		return tituloArticulo;
	}
	public void setTituloArticulo(String tituloArticulo) {
		this.tituloArticulo = tituloArticulo;
	}
	public BufferedImage getImagen() {
		return imagen;
	}
	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}
	public CalificacionVO[] getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(CalificacionVO[] calificacion) {
		this.calificacion = calificacion;
	}
	public String getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}
	
	
	
}
