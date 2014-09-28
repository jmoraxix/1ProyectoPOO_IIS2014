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
public class Articulo {

	/************** Variables **************/

	private String titulo;
	private String imagen;
	private int calificacion;
	private String ID;
	private boolean disponible = true;

	/**** Constructor ****/
	public Articulo(String tituloArticulo, String idArticulo) {
		this.titulo = tituloArticulo;
		this.ID = idArticulo;
	}

	/************** Getters/Setters **************/
	public String getTituloArticulo() {
		return titulo;
	}

	public void setTituloArticulo(String tituloArticulo) {
		this.titulo = tituloArticulo;
	}

	public String getIdArticulo() {
		return ID;
	}

	public void setIdArticulo(String idArticulo) {
		this.ID = idArticulo;
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
	
	public boolean estaDisponible(){
		return this.disponible;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

}
