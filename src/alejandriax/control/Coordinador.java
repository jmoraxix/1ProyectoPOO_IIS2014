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

package alejandriax.control;

import alejandriax.modelo.Logica;
import alejandriax.vista.cliente.VentanaPrincipal;

/**
 * @author JoséDavid 31/7/2014
 */
public class Coordinador {

	/**** DECLARACIÓN DE LA INSTANCIA COORDINADOR ****/
	private static final Coordinador INSTANCE = new Coordinador();

	public static Coordinador getINSTANCE() {
		return INSTANCE;
	}

	/**** DECLARACIÓN DE PANTALLAS ****/
	private static VentanaPrincipal ventanaPrincipal;
	// Declaración clase logica
	private static Logica logica;

	/**** GETTERS AND SETTERS ***/
	public static Logica getLogica() {
		return logica;
	}

	public static void setLogica(Logica logica) {
		Coordinador.logica = logica;
	}

	public static VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public static void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		Coordinador.ventanaPrincipal = ventanaPrincipal;
	}

	/**** FUNCIONES ENTRE CLASES ****/

	/** MOSTRAR VENTANAS **/
	public static void mostrarVentanaPrincipal() {
		ventanaPrincipal.setVisible(true);
	}

	/** OCULTAR VENTANAS **/
	public static void ocultarVentanaPrincipal() {
		ventanaPrincipal.setVisible(false);
	}

	/**** FUNCIONES DEL MODELO ****/
}
