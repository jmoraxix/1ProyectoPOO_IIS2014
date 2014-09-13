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
import javax.swing.JPanel;

import alejandriax.modelo.Libro;
import alejandriax.vista.VentanaEmergente;

/**
 * @author JoséDavid 13/09/2014
 */
public class VentanaLibro extends VentanaEmergente {

	private Libro libro;

	/**
	 * @param frame
	 * @param title
	 */
	public VentanaLibro(JFrame frame, String title, Libro libro, String fondo) {
		super(frame, title, fondo);
		this.libro = libro;
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(55, 58, 109, 149);
		getContentPane().add(panel);

		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(174, 58, 95, 27);
		getContentPane().add(lblTtulo);

		JLabel titulo = new JLabel("");
		titulo.setBounds(174, 85, 99, 27);
		getContentPane().add(titulo);
		inicializarPaneles();

	}

	private void inicializarPaneles() {
	}
}
