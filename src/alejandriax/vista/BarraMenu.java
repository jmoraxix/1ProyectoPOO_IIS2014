/** 
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Gabriel Ramirez
 * 201020244
 */
package alejandriax.vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import alejandriax.control.Coordinador;
import alejandriax.control.Lector;
import alejandriax.control.Ordenar;
import alejandriax.control.Principal;
import alejandriax.modelo.Persona;

/**
 * @author xDiegoxD 06/09/2014
 *
 * 
 */
public class BarraMenu extends JMenuBar{
	
	private JMenu archivo, prestamos, personas, registrarLibro;
	private JMenuItem mInfo, mSalir, mCargarLibros , mcrearPrestamo, mCargarPrestamos,
						mCrearPersona, mCrearLibro, mCargarEstudiantes, mCargarColegas, mCargarFamiliares;
	
	public final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 38);
	public final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 28);
	public final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);
	private JFrame frame;
	private Lector nuevoLector = new Lector();
	
	public BarraMenu(final JFrame frame){
		this.frame = frame;
		
		archivo = new JMenu("Archivo                         ");
		archivo.setMnemonic('A');
		this.add(archivo);
		
		mSalir = new JMenuItem("Salir");
		mSalir.setMnemonic('S');
		mSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		JMenuItem mntmAcercaDeNosotros = new JMenuItem("Acerca de...");
		mntmAcercaDeNosotros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coordinador.mostrarInformacionProyecto();
			}
		});
		
		mCargarLibros = new JMenuItem("Cargar Libros");
		mCargarLibros.setMnemonic('L');
		mCargarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				nuevoLector.cargarLibros();
			}
		});
		
		
		
		archivo.add(mntmAcercaDeNosotros);
		archivo.add(mSalir);
		
		
		
		prestamos = new JMenu("Pr\u00E9stamos                         ");
		prestamos.setMnemonic('P');
		this.add(prestamos);
		
		mcrearPrestamo = new JMenuItem("Crear Pr\u00E9stamo");
		mcrearPrestamo.setMnemonic('C');
		mcrearPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mCargarPrestamos = new JMenuItem("Cargar Pr�stamos");
		mCargarPrestamos.setMnemonic('S');
		mCargarPrestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				nuevoLector.cargarLibros();
			}
		});
		
		prestamos.add(mcrearPrestamo);
		prestamos.add(mCargarPrestamos);
		
		
		
		personas = new JMenu("Persona                         ");
		personas.setMnemonic('N');
		this.add(personas);
		
		mCrearPersona = new JMenuItem("Crear Persona");
		mCrearPersona.setMnemonic('P');
		mCrearPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coordinador.mostrarAgregarPersona();
				
			}
		});
		
		mCargarColegas = new JMenuItem("Cargar Colegas");
		mCargarColegas.setMnemonic('C');
		mCargarColegas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoLector.cargarColegas();
//				Ordenar.ordenarPersonaPrimerApellido(Principal.getColegas());
			}
		});
		
		mCargarEstudiantes = new JMenuItem("Cargar Estudiantes");
		mCargarEstudiantes.setMnemonic('E');
		mCargarEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoLector.cargarEstudiantes();
			}
		});
		
		mCargarFamiliares = new JMenuItem("Cargar Familiares");
		mCargarFamiliares.setMnemonic('F');
		mCargarFamiliares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoLector.cargarFamiliares();
			}
		});
		
		
		personas.add(mCrearPersona);
		personas.add(mCargarColegas);
		personas.add(mCargarEstudiantes);
		personas.add(mCargarFamiliares);
		
		
		
		
		registrarLibro =  new JMenu("Libro                         ");
		registrarLibro.setMnemonic('R');
		this.add(registrarLibro);
		
		mCrearLibro = new JMenuItem("Crear Libro");
		mCrearLibro.setMnemonic('L');
		mCrearLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		mCargarLibros = new JMenuItem("Cargar Libros");
		mCargarLibros.setMnemonic('B');
		mCargarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				nuevoLector.cargarLibros();
			}
		});
		registrarLibro.add(mCrearLibro);
		registrarLibro.add(mCargarLibros);
	}
	

}
