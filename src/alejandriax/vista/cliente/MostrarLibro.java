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
 * 13/09/2014
 */
package alejandriax.vista.cliente;

import javax.swing.JFrame;
import javax.swing.JLabel;

import alejandriax.control.Coordinador;
import alejandriax.modelo.Articulo;
import alejandriax.modelo.Libro;
import alejandriax.vista.PanelCalificacion;
import alejandriax.vista.PanelConFondo;
import alejandriax.vista.VentanaEmergente;

/**
 * @author Josï¿½David 13/09/2014
 */
public class MostrarLibro extends VentanaEmergente {

	private Libro libro;
	private Coordinador coodinador;

	/**
	 * @param frame
	 * @param title
	 */
	public MostrarLibro(JFrame frame, Articulo libro) {
		super(frame, libro.getTituloArticulo(), "fondo_emergente.png");
		this.libro = (Libro) libro;
		inicializarVentana();
	}

	private void inicializarVentana() {
		getContentPane().setLayout(null);

		PanelConFondo imagen = new PanelConFondo("portadas/" + libro.getImagen());
		imagen.setBounds(81, 58, 184, 256);
		getContentPane().add(imagen);

		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(347, 58, 45, 27);
		getContentPane().add(lblTtulo);

		JLabel titulo = new JLabel("");
		titulo.setText(libro.getTituloArticulo());
		titulo.setBounds(347, 86, 174, 27);
		getContentPane().add(titulo);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(55, 368, 79, 27);
		getContentPane().add(lblCodigo);
		
		JLabel codigo = new JLabel("");
		codigo.setText(libro.getIdArticulo());
		codigo.setBounds(125, 368, 115, 27);
		getContentPane().add(codigo);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(347, 125, 45, 27);
		getContentPane().add(lblAutor);
		
		JLabel autor = new JLabel("");
		autor.setText(libro.getAutor());
		autor.setBounds(347, 153, 174, 27);
		getContentPane().add(autor);
		
		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setBounds(347, 259, 92, 27);
		getContentPane().add(lblEditorial);
		
		JLabel editorial = new JLabel("");
		editorial.setText(libro.getEditorial());
		editorial.setBounds(347, 287, 174, 27);
		getContentPane().add(editorial);
		
		JLabel genero = new JLabel("");
		genero.setText(libro.getGenero());
		genero.setBounds(347, 220, 174, 27);
		getContentPane().add(genero);
		
		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setBounds(347, 192, 73, 27);
		getContentPane().add(lblGenero);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(347, 393, 92, 27);
		getContentPane().add(lblIdioma);
		
		JLabel idioma = new JLabel("");
		idioma.setText(libro.getIdioma());
		idioma.setBounds(347, 421, 174, 27);
		getContentPane().add(idioma);
		
		JLabel edicion = new JLabel("");
		edicion.setText(libro.getEdicion());
		edicion.setBounds(347, 354, 174, 27);
		getContentPane().add(edicion);
		
		JLabel lblEdicion = new JLabel("Edición:");
		lblEdicion.setBounds(347, 326, 92, 27);
		getContentPane().add(lblEdicion);
		
		PanelCalificacion panelCalificacion = new PanelCalificacion(libro);
		panelCalificacion.setBounds(81, 328, 184, 28);
		if(libro.getCalificacion() != 0)
			panelCalificacion.setCalificacion(libro.getCalificacion());
		getContentPane().add(panelCalificacion);
	}

	public Coordinador getCoodinador() {
		return coodinador;
	}

	public void setCoodinador(Coordinador coodinador) {
		this.coodinador = coodinador;
	}
}
