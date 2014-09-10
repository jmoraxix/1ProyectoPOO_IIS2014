/**
 * Primer Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 22/08/2014
 */
package alejandriax.modelo;

/**
 * @author JoséDavid 22/08/2014
 */
public class Revista extends Articulo {

	/**** Variables ****/
	private String autor;
	private String editorial;
	private String edicion;
	private String idioma;
	private String genero;

	/**** Constructor ****/
	public Revista(String tituloArticulo, String idArticulo, int cantidad,
			String autor,String editorial, String edicion, 
			String idioma, String genero) {
		super(tituloArticulo, idArticulo, cantidad);
		this.autor = autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.idioma = idioma;
		this.genero = genero;
	}

	/**** GettersAndSetters ****/
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
