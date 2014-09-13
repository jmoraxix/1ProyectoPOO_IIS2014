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

import alejandriax.control.Coordinador;
import alejandriax.vista.PanelConFondo;
import alejandriax.vista.PanelLateral;
import alejandriax.vista.PanelPrincipal;
import alejandriax.vista.VentanaBase;
import alejandriax.vista.VentanaEmergente;

/**
 * @author Jos\u00E9 David 23/08/2014
 */
public class VentanaPrincipal extends VentanaBase {

	/**** Atributos ****/
	private static Coordinador coordinador;
	private int posActual = 0;
	private PanelLateral panelLateral;
	private PanelPrincipal panelPrincipal;

	/**** Constructor ****/
	public VentanaPrincipal() {
		panelLateral = getPanelLateral();
		panelPrincipal = getPanelPrincipal();
		inicializarBotones();
		mostrarContenidoPrestamos();
	}

	// Agrega los botones a la barra lateral
	private void inicializarBotones() {
		// Botón de prestamos
		PanelConFondo btnPrestamos = new PanelConFondo("boton_principal.png",
				false, "Pr\u00E9stamos");
		btnPrestamos.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getPosActual() != 0)
					mostrarContenidoPrestamos();
			}
		});
		panelLateral.agregarBoton(btnPrestamos);

		// Botón de libros
		PanelConFondo btnLibros = new PanelConFondo("boton_principal.png",
				false, "Libros");
		btnLibros.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getPosActual() != 1)
					mostrarContenidoLibros();
			}
		});
		panelLateral.agregarBoton(btnLibros);

		// Botón de personas
		PanelConFondo btnPersonas = new PanelConFondo("boton_principal.png",
				false, "Personas");
		btnPersonas.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (getPosActual() != 2)
					mostrarContenidoPersonas();
			}
		});
		panelLateral.agregarBoton(btnPersonas);
	}

	// Muestra el contenido del PanelPrestamos
	private void mostrarContenidoPrestamos() {
		panelPrincipal.limpiarPanel();
		panelLateral.ocultarBotonLateral(posActual);
		panelLateral.mostrarBotonLateral(0);
		posActual = 0;
		for (int i = 0; i < 5; i++)
			panelPrincipal.agregarContenido(new PanelConFondo(
					"error_libro.png", false));
	}

	private void mostrarContenidoLibros() {
		panelPrincipal.limpiarPanel();
		panelLateral.ocultarBotonLateral(posActual);
		panelLateral.mostrarBotonLateral(1);
		posActual = 1;
	}

	private void mostrarContenidoPersonas() {
		panelPrincipal.limpiarPanel();
		panelLateral.ocultarBotonLateral(posActual);
		panelLateral.mostrarBotonLateral(2);
		posActual = 2;
		new VentanaEmergente(this, "Hola").setVisible(true);
	}

	/**** Getters&Setters ****/
	public static Coordinador getCoordinador() {
		return coordinador;
	}

	public static void setCoordinador(Coordinador coordinador) {
		VentanaPrincipal.coordinador = coordinador;
	}

	private int getPosActual() {
		return posActual;
	}

	private void setPosActual(int posActual) {
		this.posActual = posActual;
	}

}
