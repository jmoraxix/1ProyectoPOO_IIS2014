/**
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Gabriel Ramirez
 * 201020244
 * 23/05/2014
 */
package alejandriax.control;

import alejandriax.modelo.Logica;


/**
 * @author JoséDavid 31/7/2014
 */
public class Coordinador {

	/****DECLARACIÓN DE LA INSTANCIA COORDINADOR****/
	private static Coordinador INSTANCE = new Coordinador();
	public static Coordinador getINSTANCE() {
		return INSTANCE;
	}

	/****DECLARACIÓN DE PANTALLAS****/
	//Declaración clase logica
	private static Logica logica;
	

	/****GETTERS AND SETTERS***/
	public static Logica getLogica() {
		return logica;
	}
	public static void setLogica(Logica logica) {
		Coordinador.logica = logica;
	}
	
	/****FUNCIONES ENTRE CLASES****/
	
	
	/**MOSTRAR VENTANAS**/
	
	/**OCULTAR VENTANAS**/
	
	/****FUNCIONES DEL MODELO****/
	}
