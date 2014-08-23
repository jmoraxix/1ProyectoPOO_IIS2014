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
 * 31/07/2014
 */

package alejandriax.vista;

/**
 * @author jmora 31/7/141
 *
 */
import java.awt.Dialog;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import alejandriax.control.Principal;

@SuppressWarnings("serial")
public class VentanaEmergente extends JDialog {
	Dimension tamTotal = Principal.getTamPantalla();
	private JPanel panel;

	public VentanaEmergente(JFrame frame, String title, int largo, int alto) {
		super(frame, title, true);
		setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(frame);
		setSize(largo, alto);

		panel = new PanelConFondo("vista/imagenes/fondo_emergente.png");
		setContentPane(panel);
	}
}
