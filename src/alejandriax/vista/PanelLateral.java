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

/**
 * @author jmora 27/8/2014
 * Declara el panel lateral con su layout y métodos para manejarlo
 */
@SuppressWarnings("serial")
public class PanelLateral extends PanelConFondo {

	private int ancho, alto;
	private int items_lateral = 0;
	private ArrayList<PanelConFondo> botonesPosicion = new ArrayList<PanelConFondo>();
	
	public PanelLateral(String urlImagen, int ancho, int alto) {
		//Inicializa el panel
		super(urlImagen);
		this.ancho = ancho;
		this.alto = alto;
		setSize(ancho, alto);
		
		//Define el layout del panel
		GridBagLayout gbl_lateral = new GridBagLayout();
		float alt = alto/10;
		gbl_lateral.columnWidths = new int[]{15, ancho-80, 65};
		gbl_lateral.rowHeights = new int[]{(int)alt, (int)alt, (int)alt, (int)alt, (int)alt, (int)alt, (int)alt, (int)alt*2};
		gbl_lateral.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_lateral.rowWeights = new double[]{1.0, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75};
		setLayout(gbl_lateral);
	}

	//Agrega un botón al panel lateral
	public void agregarBoton(PanelConFondo panel){
		//Agrega boton al panel
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = items_lateral;
		add(panel, gbc);

		//Agregar boton que muestra posición actual del panel principal y lo crea invisible
		gbc.gridx = 2;
		botonesPosicion.add(new PanelConFondo("panel_actual.png", false));
		botonesPosicion.get(items_lateral).setVisible(false);
		add(botonesPosicion.get(items_lateral), gbc);

		//Incrementa el número de botones
		items_lateral++;
	}

	//Muestra el botón en la posición actual del menú
	public void mostrarBotonLateral(int pos){
		botonesPosicion.get(pos).setVisible(true);
	}	
	
	//Oculta el botón en la posición actual del menú
	public void ocultarBotonLateral(int pos){
		botonesPosicion.get(pos).setVisible(false);
	}



}
