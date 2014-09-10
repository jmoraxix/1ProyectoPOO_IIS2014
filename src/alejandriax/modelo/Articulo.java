/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Aug 22, 2014
 */
package alejandriax.modelo;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * @author Diego Aug 22, 2014
 * 
 */
public class Articulo {

	/************** Variables **************/

	private String tituloArticulo;
	private BufferedImage imagen;
	private Calificacion calificacion;
	private String idArticulo;
	protected int cantidad;
	private boolean disponible = true;

	/**** Constructor ****/
	public Articulo(String tituloArticulo, String idArticulo, int cantidad) {
		this.tituloArticulo = tituloArticulo;
		this.idArticulo = idArticulo;
	}

	/************** Getters/Setters **************/
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

	public String getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}

	public boolean getDisponibilidad() {
		return disponible;
	}

	public void prestar() {
		this.disponible = false;
	}
	
	public void dimitirPrestamo() {
		this.disponible = true;
	}

	public Calificacion getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Calificacion calificacion) {
		this.calificacion = calificacion;
	}

}
