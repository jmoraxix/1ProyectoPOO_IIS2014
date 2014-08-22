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
public class Pelicula extends Articulo {
	
	/**************Variables***************/
	
	private int duracion;
	private String director;
	private int anio;
	private String[] protagonista;
	private String genero;
	
	
	
	/**************Getters/Setters***************/
	
	public int getDuracion() {
		return duracion;
	}
	public String[] getProtagonista() {
		return protagonista;
	}
	public void setProtagonista(String[] protagonista) {
		this.protagonista = protagonista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

}
