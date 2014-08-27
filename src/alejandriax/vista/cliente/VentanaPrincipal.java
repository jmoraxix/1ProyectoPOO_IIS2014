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
 * 23/08/2014
 */
package alejandriax.vista.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import alejandriax.control.Coordinador;
import alejandriax.control.Principal;
import alejandriax.vista.PanelConFondo;
import alejandriax.vista.VentanaBase;

/**
 * @author Jos�David 23/08/2014
 */
public class VentanaPrincipal extends VentanaBase {

	/****Atributos****/
	private static Coordinador coordinador;
	private int posActual = 0; 

	/****Constructor****/
	public VentanaPrincipal() {
		inicializarBotones();
		mostrarContenidoPrestamos();
	}

	//Agrega los botones a la barra lateral
	private void inicializarBotones(){
		//Botón de prestamos
		PanelConFondo btnPrestamos = new PanelConFondo("boton_principal.png", false, "Préstamos");
		btnPrestamos.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarContenidoPrestamos();
			}
		});
		agregarBotonPanelLateral(btnPrestamos);

		//Botón de libros
		PanelConFondo btnLibros = new PanelConFondo("boton_principal.png", false, "Libros");
		btnLibros.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarContenidoLibros();
			}
		});
		agregarBotonPanelLateral(btnLibros);

		//Botón de personas
		PanelConFondo btnPersonas = new PanelConFondo("boton_principal.png", false, "Personas");
		btnPersonas.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarContenidoPersonas();
			}
		});
		agregarBotonPanelLateral(btnPersonas);
	}

	//Muestra el contenido del PanelPrestamos
	private void mostrarContenidoPrestamos(){
		ocultarBotonLateral(posActual);
		mostrarBotonLateral(0);
		posActual = 0;
	}
	private void mostrarContenidoLibros(){
		ocultarBotonLateral(posActual);
		mostrarBotonLateral(1);
		posActual = 1;
	}
	private void mostrarContenidoPersonas(){
		ocultarBotonLateral(posActual);
		mostrarBotonLateral(2);
		posActual = 2;
	}

	/****Getters&Setters****/
	public static Coordinador getCoordinador() {
		return coordinador;
	}

	public static void setCoordinador(Coordinador coordinador) {
		VentanaPrincipal.coordinador = coordinador;
	}

}
