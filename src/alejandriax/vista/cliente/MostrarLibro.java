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

import alejandriax.control.Coordinador;
import alejandriax.modelo.Libro;
import alejandriax.vista.VentanaEmergente;

/**
 * @author Jos�David 13/09/2014
 */
public class MostrarLibro extends VentanaEmergente {

	private Libro libro;
	private Coordinador coodinador;

	/**
	 * @param frame
	 * @param title
	 */
	public MostrarLibro(JFrame frame, String title, Libro libro) {
		super(frame, title, "fondo_emergente.png");
		this.libro = libro;
		inicializarVentana();

	}

	private void inicializarVentana() {
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(55, 58, 185, 204);
		getContentPane().add(panel);

		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(349, 58, 45, 27);
		getContentPane().add(lblTtulo);

		JLabel titulo = new JLabel("");
		titulo.setBounds(349, 110, 174, 27);
		getContentPane().add(titulo);
		
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(55, 269, 79, 27);
		getContentPane().add(lblCodigo);
		
		JLabel codigo = new JLabel("");
		codigo.setBounds(55, 297, 115, 27);
		getContentPane().add(codigo);
	}

	public Coordinador getCoodinador() {
		return coodinador;
	}

	public void setCoodinador(Coordinador coodinador) {
		this.coodinador = coodinador;
	}
}
