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

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * @author jmora 27/8/2014 Declara el panel principal con su layout y métodos
 *         para manejarlo
 */
public class PanelPrincipal extends PanelConFondo {

	private int ancho, alto;
	private int items_x = 0, items_y = 0;
	private ArrayList<JPanel> items = new ArrayList<JPanel>();

	public PanelPrincipal(String urlImagen, int ancho, int alto) {
		// Inicializa el panel
		super(urlImagen);
		this.ancho = ancho;
		this.alto = alto;
		setSize(ancho, alto);

		// Crea el layout del panel
		GridBagLayout gbl_principal = new GridBagLayout();
		float anch = ancho / 6;
		float alt = alto / 5 - 23;
		gbl_principal.columnWidths = new int[] { (int) anch, (int) anch,
				(int) anch, (int) anch, (int) anch, (int) anch };
		gbl_principal.rowHeights = new int[] { (int) alt, (int) alt, (int) alt,
				(int) alt, (int) alt };
		gbl_principal.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, Double.MIN_VALUE };
		gbl_principal.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		setLayout(gbl_principal);
	}

	// Agrega un item al panel principal
	public void agregarContenido(JPanel panel) {
		if (items_x == 6) {
			items_x = 0;
			items_y++;
		}
		// Agrega boton al panel
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = items_x++;
		gbc.gridy = items_y;
		add(panel, gbc);
		// Se agrega a la lista de itemes
		items.add(panel);
	}

	public void limpiarPanel() {
		items_x = 0;
		items_y = 0;
		for (JPanel panel : items) {
			panel.setVisible(false);
			panel.setEnabled(false);
		}
		items.clear();
		
		System.gc();
	}

}
