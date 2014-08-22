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
	private ArrayList<Calificacion> calificaciones;
	private String idArticulo;

	/**** Constructor ****/
	public Articulo(String tituloArticulo, String idArticulo) {
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

	public ArrayList<Calificacion> getCalificacion() {
		return calificaciones;
	}

	public void addCalificacion(Calificacion calificaciones) {
		this.calificaciones.add(calificaciones);
	}

	public String getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	}

}
