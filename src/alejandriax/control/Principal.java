/**
 * Primer Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 
 * Roger Villalobos
 *
 * 31/07/2014
 */
package alejandriax.control;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;

import alejandriax.modelo.Logica;

/**
 * @author JoséDavid 31/7/2014
 */
public class Principal {

	/****VARIABLES GLOBALES DEL SISTEMA****/
	private static final Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();    
	private final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 34);
	private final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 26);
	private final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 20);
	private final static Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);
	private static String SESION_USUARIO;

	/****DECLARACIÓN DE CONTROLADORES****/
	//Declaración clase coordinador
	private static Coordinador coordinador;
	//Declaración clase logica
	private static Logica logica;
	
	/****DECLARACIÓN DE PANTALLAS****/
	
	public static void main(String[] args) {
		System.gc();

		//LookAndFeel de la aplicacion
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception e){
		}

		inicializarVentanas();
	}

	/**
	 * Método creado para declarar todas la ventanas y establecer relaciones con el coordinador
	 */
	private static void inicializarVentanas() {
		/****INSTANCIACIÓN CLASES***/
		//Coordinador
		coordinador  = Coordinador.getINSTANCE();
		//Lógica
		logica = new Logica();
		
		/****RELACIONES ENTRE CLASES****/
		//Lógica
		logica.setCoordinador(coordinador);
		
		/****RELACIONES CON EL COORDINADOR****/
		//Lógica
		coordinador.setLogica(logica);
				
//		menuPrincipal_publico.setVisible(true);

	}

	/****GETTERS AND SETTERS****/
	public static Dimension getTamPantalla() {
		return tamPantalla;
	}
	public static Font getLetraTitulo1() {
		return letraTitulo1;
	}
	public static Font getLetraTexto1() {
		return letraTexto1;
	}
	public static Font getLetraTexto2() {
		return letraTexto2;
	}
	public static Font getLetraTexto3() {
		return letraTexto3;
	}
	public static String getSESION_USUARIO() {
		return SESION_USUARIO;
	}
	public static void setSESION_USUARIO(String sESION_USUARIO) {
		SESION_USUARIO = sESION_USUARIO;
	}
}
