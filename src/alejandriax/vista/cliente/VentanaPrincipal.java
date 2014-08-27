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

import javax.swing.JButton;
import javax.swing.JFrame;

import alejandriax.control.Coordinador;
import alejandriax.vista.VentanaBase;

/**
 * @author Jos�David 23/08/2014
 */
public class VentanaPrincipal extends VentanaBase {
	
	/****Atributos****/
	private static Coordinador coordinador;
//	private JButton btn_
	
	/****Constructor****/
	public VentanaPrincipal() {
		
	}

	/****Getters&Setters****/
	public static Coordinador getCoordinador() {
		return coordinador;
	}

	public static void setCoordinador(Coordinador coordinador) {
		VentanaPrincipal.coordinador = coordinador;
	}

}
