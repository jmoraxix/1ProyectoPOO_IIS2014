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

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author jmora 31/7/14
 *
 */
@SuppressWarnings("serial")
public class VentanaBase extends JFrame {

	public VentanaBase(){
		//Declaracion basica de la venta
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(1270, 720);
		setTitle("ALEJANDRIAX");
//		setExtendedState(MAXIMIZED_BOTH);
//		Image icon = Toolkit.getDefaultToolkit().getImage(Funes.class.getResource("vista/imagenes/logo_principal_icono.png"));
//		setIconImage(icon);

		//Inicializar ventana
		JPanel principal = new PanelConFondo("vista/imagenes/fondo_principal.png");
		this.setContentPane(principal);
	}
}
