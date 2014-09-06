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
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import alejandriax.Alejandriax;

/**
 * @author jmora 31/7/14
 * 
 */
@SuppressWarnings("serial")
public class VentanaBase extends JFrame {

	private int ancho_lateral = 365, ancho_principal = 1024, alto = 768;
	private PanelLateral lateral;
	private PanelPrincipal principal;

	public VentanaBase() {
		// Declaracion basica de la venta
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(ancho_lateral + ancho_principal, alto);
		setTitle("ALEJANDRIAX");
		Image icon = Toolkit.getDefaultToolkit().getImage(Alejandriax.class.getResource("vista/imagenes/logo_principal_icono.png"));
		setIconImage(icon);

		// Inicializar ventana y paneles
		// Panel con el contenido principal
		JPanel contenido = new JPanel();
		this.setContentPane(contenido);
		GridBagLayout gbl_contenido = new GridBagLayout();
		gbl_contenido.columnWidths = new int[]{ancho_lateral, ancho_principal};
		gbl_contenido.rowHeights = new int[]{alto, alto};
		gbl_contenido.columnWeights = new double[]{1.0, 0.0};
		gbl_contenido.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contenido.setLayout(gbl_contenido);

		// Panel con la barra lateral
		lateral = new PanelLateral("fondo_barra_lateral.png", ancho_lateral, alto);
		//Añade la barra lateral al panel del contenido principal
		GridBagConstraints gbc_lateral = new GridBagConstraints();
		gbc_lateral.anchor = GridBagConstraints.WEST;
		gbc_lateral.fill = GridBagConstraints.BOTH;
		gbc_lateral.insets = new Insets(0, 0, 0, 5);
		gbc_lateral.gridx = 0;
		gbc_lateral.gridy = 0;
		contenido.add(lateral, gbc_lateral);

		// Panel con el contenido principal
		principal = new PanelPrincipal("fondo_principal.png", ancho_principal, alto);
		//Añade el panel principal del contenido 
		GridBagConstraints gbc_principal = new GridBagConstraints();
		gbc_principal.anchor = GridBagConstraints.WEST;
		gbc_principal.fill = GridBagConstraints.BOTH;
		gbc_principal.gridx = 1;
		gbc_principal.gridy = 0;
		contenido.add(principal, gbc_principal);

	}

	protected PanelLateral getPanelLateral() {
		return lateral;
	}

	protected PanelPrincipal getPanelPrincipal() {
		return principal;
	}
}
