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
public class Pelicula extends Articulo {

	/************** Variables ***************/
	private int duracion;
	private String director;
	private int anio;
	private ArrayList<String> protagonista;
	private String genero;

	/**** Constructor ****/
	public Pelicula(String tituloArticulo, String idArticulo, int duracion,
			String director, int anio, String genero) {
		super(tituloArticulo, idArticulo);
		this.duracion = duracion;
		this.director = director;
		this.anio = anio;
		this.genero = genero;
	}

	/************** Getters/Setters ***************/
	public int getDuracion() {
		return duracion;
	}

	public ArrayList<String> getProtagonista() {
		return protagonista;
	}

	public void addProtagonista(String protagonista) {
		this.protagonista.add(protagonista);
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
