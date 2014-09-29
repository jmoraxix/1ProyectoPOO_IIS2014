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

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.UIManager;

import alejandriax.InformacionProyecto;
import alejandriax.modelo.Colega;
import alejandriax.modelo.Estudiante;
import alejandriax.modelo.Familiar;
import alejandriax.modelo.Libro;
import alejandriax.modelo.Logica;
import alejandriax.modelo.Pelicula;
import alejandriax.modelo.Persona;
import alejandriax.modelo.Revista;
import alejandriax.vista.cliente.AgregarLibro;
import alejandriax.vista.cliente.AgregarPersona;
import alejandriax.vista.cliente.AgregarPrestamo;
import alejandriax.vista.cliente.ConsultaLibro;
import alejandriax.vista.cliente.ConsultaPersona;
import alejandriax.vista.cliente.ConsultaPrestamo;
import alejandriax.vista.cliente.VentanaPrincipal;

/**
 * @author Jos�David 31/7/2014
 */
public class Principal {

	/**** VARIABLES GLOBALES DEL SISTEMA ****/
	private final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 34);
	private final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 26);
	private final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 20);
	private final static Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);
	private static ArrayList<Libro> libros = new ArrayList<Libro>();
	private static ArrayList<Revista> revistas = new ArrayList<Revista>();
	private static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	private static ArrayList<Colega> colegas = new ArrayList<Colega>();
	private static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	private static ArrayList<Familiar> familiares = new ArrayList<Familiar>();
	private static String SESION_USUARIO;

	/**** DECLARACI�N DE CONTROLADORES ****/
	// Declaraci�n clase coordinador
	private static Coordinador coordinador;
	// Declaraci�n clase logica
	private static Logica logica;

	/**** DECLARACI�N DE PANTALLAS ****/
	private static VentanaPrincipal ventanaPrincipal;
	private static InformacionProyecto informacionProyecto;
	private static AgregarPersona agregarPersona;
	private static AgregarLibro agregarLibro;
	private static ConsultaPersona consultaPersona;
	private static ConsultaLibro consultaLibro;
	private static ConsultaPrestamo consultaPrestamo;
	private static AgregarPrestamo agregarPrestamo;
	
	public static void main(String[] args) {
		System.gc();

		// LookAndFeel de la aplicacion
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			System.out.println("Error al establecer el Look&Feel");
		}

		inicializarVentanas();
	}

	/**
	 * M�todo creado para declarar todas la ventanas y establecer relaciones
	 * con el coordinador
	 */
	@SuppressWarnings("static-access")
	private static void inicializarVentanas() {
		/**** INSTANCIACI�N CLASES ***/
		ventanaPrincipal = new VentanaPrincipal();
		informacionProyecto = new InformacionProyecto(ventanaPrincipal);
		agregarPersona = new AgregarPersona(ventanaPrincipal);
		agregarLibro = new AgregarLibro(ventanaPrincipal);
		consultaPersona = new ConsultaPersona(ventanaPrincipal);
		consultaLibro = new ConsultaLibro(ventanaPrincipal);
		consultaPrestamo = new ConsultaPrestamo(ventanaPrincipal);
		agregarPrestamo = new AgregarPrestamo(ventanaPrincipal);
		
		// Coordinador
		coordinador = Coordinador.getINSTANCE();
		// L�gica
		logica = new Logica();

		/**** RELACIONES ENTRE CLASES ****/
		ventanaPrincipal.setCoordinador(coordinador);
		informacionProyecto.setCoordinador(coordinador);
		agregarPersona.setCoordinador(coordinador);
		agregarLibro.setCoordinador(coordinador);
		consultaPersona.setCoordinador(coordinador);
		consultaLibro.setCoordinador(coordinador);
		consultaPrestamo.setCoordinador(coordinador);
		agregarPrestamo.setCoordinador(coordinador);
		// L�gica
		logica.setCoordinador(coordinador);

		/**** RELACIONES CON EL COORDINADOR ****/
		coordinador.setVentanaPrincipal(ventanaPrincipal);
		coordinador.setInformacionProyecto(informacionProyecto);
		coordinador.setAgregarPersona(agregarPersona);
		coordinador.setAgregarLibro(agregarLibro);
		coordinador.setConsultaPersona(consultaPersona);
		coordinador.setConsultaLibro(consultaLibro);
		coordinador.setConsultaPrestamo(consultaPrestamo);
		coordinador.setAgregarPrestamo(agregarPrestamo);
		// L�gica
		coordinador.setLogica(logica);

		coordinador.mostrarVentanaPrincipal();
	}

	/**** GETTERS AND SETTERS ****/
	public static String getSESION_USUARIO() {
		return SESION_USUARIO;
	}

	public static void setSESION_USUARIO(String sESION_USUARIO) {
		SESION_USUARIO = sESION_USUARIO;
	}

	public static ArrayList<Libro> getLibros() {
		Ordenar.ordenarLibroTitulo(libros);
		return libros;
	}

	public static void addLibro(Libro libro) {
		Principal.libros.add(libro);
	}

	public static ArrayList<Revista> getRevistas() {
		return revistas;
	}

	public static void addRevista(Revista revista) {
		Principal.revistas.add(revista);
	}

	public static ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public static void addPelicula(Pelicula pelicula) {
		Principal.peliculas.add(pelicula);
	}

	public static ArrayList<Colega> getColegas() {
		return colegas;
	}

	public static void addColega(Colega colega) {
		Principal.colegas.add(colega);
	}

	public static ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public static void addEstudiante(Estudiante estudiante) {
		Principal.estudiantes.add(estudiante);
	}

	public static ArrayList<Familiar> getFamiliares() {
		return familiares;
	}

	public static void addFamiliar(Familiar familiar) {
		Principal.familiares.add(familiar);
	}

	public static ArrayList<Persona> getPersonas() {
		ArrayList<Persona> array = new ArrayList<Persona>();
		array.addAll(colegas);
		array.addAll(familiares);
		array.addAll(estudiantes);
		Ordenar.ordenarPersonaPrimerApellido(array);
		return array;
	}

	public static ArrayList<Libro> getLibrosPrestados(){
		ArrayList<Libro> array = new ArrayList<Libro>();
		for(Libro libro : libros)
			if(!libro.estaDisponible())
				array.add(libro);
		return array;
	}

	public static ArrayList<Libro> getLibrosDisponibles(){
		ArrayList<Libro> array = new ArrayList<Libro>();
		for(Libro libro : libros)
			if(libro.estaDisponible())
				array.add(libro);
		return array;
	}
	
	public static Coordinador getCoordinador() {
		return coordinador;
	}

	public static void setCoordinador(Coordinador coordinador) {
		Principal.coordinador = coordinador;
	}

	public static Font getLetratitulo1() {
		return letraTitulo1;
	}

	public static Font getLetratexto1() {
		return letraTexto1;
	}

	public static Font getLetratexto2() {
		return letraTexto2;
	}

	public static Font getLetratexto3() {
		return letraTexto3;
	}
}
