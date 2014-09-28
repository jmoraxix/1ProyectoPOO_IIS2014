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

import alejandriax.InformacionProyecto;
import alejandriax.modelo.Logica;
import alejandriax.vista.AgregarLibro;
import alejandriax.vista.AgregarPersona;
import alejandriax.vista.cliente.VentanaPrincipal;

/**
 * @author Jos�David 31/7/2014
 */
public class Coordinador {

	/**** DECLARACI�N DE LA INSTANCIA COORDINADOR ****/
	private static final Coordinador INSTANCE = new Coordinador();

	public static Coordinador getINSTANCE() {
		return INSTANCE;
	}

	/**** DECLARACI�N DE PANTALLAS ****/
	private static VentanaPrincipal ventanaPrincipal;
	private static InformacionProyecto informacionProyecto;
	private static AgregarPersona agregarPersona;
	private static AgregarLibro agregarLibro;
	// Declaraci�n clase logica
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

	public static InformacionProyecto getInformacionProyecto() {
		return informacionProyecto;
	}

	public static void setInformacionProyecto(
			InformacionProyecto informacionProyecto) {
		Coordinador.informacionProyecto = informacionProyecto;
	}
	
	public static AgregarPersona getAgregarPersona() {
		return agregarPersona;
	}

	public static void setAgregarPersona(AgregarPersona agregarPersona) {
		Coordinador.agregarPersona = agregarPersona;
	}
	
	public static AgregarLibro getAgregarLibro() {
		return agregarLibro;
	}

	public static void setAgregarLibro(AgregarLibro agregarLibro) {
		Coordinador.agregarLibro = agregarLibro;
	}

	/** MOSTRAR VENTANAS **/
	public static void mostrarVentanaPrincipal() {
		ventanaPrincipal.setVisible(true);
	}
	public static void mostrarInformacionProyecto(){
		informacionProyecto.setVisible(true);
	}
	public static void mostrarAgregarPersona(){
		agregarPersona.setVisible(true);	
	}
	public static void mostrarAgregarLibro(){
		agregarLibro.setVisible(true);	
	}
	
	/** OCULTAR VENTANAS **/
	public static void ocultarVentanaPrincipal() {
		ventanaPrincipal.setVisible(false);
	}
	public static void ocultarInformacionProyecto(){
		informacionProyecto.setVisible(false);
	}
	public static void ocultarAgregarPersona(){
		agregarPersona.setVisible(false);
	}
	public static void ocultarAgregarLibro(){
		agregarLibro.setVisible(false);
	}


	
}
