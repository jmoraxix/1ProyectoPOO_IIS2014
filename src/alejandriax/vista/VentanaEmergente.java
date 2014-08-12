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
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JPanel;

import alejandriax.control.Principal;

@SuppressWarnings("serial")
public class VentanaEmergente extends JDialog 
{
	Dimension tamTotal = Principal.getTamPantalla();
	private JPanel panel;

	public VentanaEmergente(Frame frame, String title, boolean modal) {
		super(frame, title, modal);
	    setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
	    setLocationRelativeTo(frame);

		panel = new PanelConFondo("vista/imagenes/fondo_emergente.png");
		setContentPane(panel);
	}
}
