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
	private JPanel lateral, principal;
	private int items_lateral = 0;
	private ArrayList<PanelConFondo> botonesPosicion = new ArrayList<PanelConFondo>();

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
		lateral = new PanelConFondo("fondo_barra_lateral.png");
		lateral.setSize(ancho_lateral, alto);
		//Inicializa layout de la barra lateral
		inicializarBarraLateral();
		//Añade la barra lateral al panel del contenido principal
		GridBagConstraints gbc_lateral = new GridBagConstraints();
		gbc_lateral.anchor = GridBagConstraints.WEST;
		gbc_lateral.fill = GridBagConstraints.BOTH;
		gbc_lateral.insets = new Insets(0, 0, 0, 5);
		gbc_lateral.gridx = 0;
		gbc_lateral.gridy = 0;
		contenido.add(lateral, gbc_lateral);

		// Panel con el contenido principal
		principal = new PanelConFondo("fondo_principal.png");
		principal.setSize(ancho_principal, alto);
		//Inicializa layout del panel principal
		inicializarPanelPrincipal();
		//Añade el panel principal del contenido 
		GridBagConstraints gbc_principal = new GridBagConstraints();
		gbc_principal.anchor = GridBagConstraints.WEST;
		gbc_principal.fill = GridBagConstraints.BOTH;
		gbc_principal.gridx = 1;
		gbc_principal.gridy = 0;
		contenido.add(principal, gbc_principal);

	}

	//Inicializa layout de la barra lateral
	private void inicializarBarraLateral(){
		GridBagLayout gbl_lateral = new GridBagLayout();
		float alt = alto/10;
		gbl_lateral.columnWidths = new int[]{15, ancho_lateral-80, 65};
		gbl_lateral.rowHeights = new int[]{(int)alt, (int)alt, (int)alt, (int)alt, (int)alt, (int)alt, (int)alt, (int)alt*2};
		gbl_lateral.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_lateral.rowWeights = new double[]{1.0, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75};
		lateral.setLayout(gbl_lateral);
	}

	private void inicializarPanelPrincipal(){
		//Inicializa panel
		GridBagLayout gbl_principal = new GridBagLayout();
		float anch = ancho_principal/6;
		float alt = alto/5-23;
		gbl_principal.columnWidths = new int[] {(int)anch, (int)anch, (int)anch, (int)anch, (int)anch, (int)anch};
		gbl_principal.rowHeights = new int[] {(int)alt, (int)alt, (int)alt, (int)alt, (int)alt};
		gbl_principal.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_principal.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		principal.setLayout(gbl_principal);
	}

	//Agrega un botón al panel lateral
	protected void agregarBotonPanelLateral(PanelConFondo panel){
		//Agrega boton al panel
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = items_lateral;
		lateral.add(panel, gbc);

		//Agregar boton que muestra posición actual del panel principal y lo crea invisible
		gbc.gridx = 2;
		botonesPosicion.add(new PanelConFondo("panel_actual.png", false));
		botonesPosicion.get(items_lateral).setVisible(false);
		lateral.add(botonesPosicion.get(items_lateral), gbc);

		//Incrementa el número de botones
		items_lateral++;
	}

	//Muestra el botón en la posición actual del menú
	protected void mostrarBotonLateral(int pos){
		botonesPosicion.get(pos).setVisible(true);
	}	
	
	//Oculta el botón en la posición actual del menú
	protected void ocultarBotonLateral(int pos){
		botonesPosicion.get(pos).setVisible(false);
	}

	//Agrega un item al panel principal
	protected void agregarContenidoPanelPrincipal(PanelConFondo panel){
//		//Agrega boton al panel
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.anchor = GridBagConstraints.WEST;
//		gbc.fill = GridBagConstraints.BOTH;
//		gbc.gridx = 1;
//		gbc.gridy = items_lateral;
//		lateral.add(panel, gbc);
//
//		//Incrementa el número de botones
//		items_lateral++;
	}

	protected JPanel getPanelLateral() {
		return lateral;
	}

	protected JPanel getPanelPrincipal() {
		return principal;
	}
}
