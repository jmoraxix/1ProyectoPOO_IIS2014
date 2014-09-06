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

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import alejandriax.control.Coordinador;

/**
 * @author xDiegoxD 06/09/2014
 *
 * 
 */
public class BarraMenu extends JMenuBar{
	
	private JMenu archivo, prestamos, personas, registro;
	private JMenuItem mInfo, mSalir, mCargarLibros, mCargarPersonas , mcrearPrestamo,
						mCrearPersona, mCrearLibro;
	
	public final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 38);
	public final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 28);
	public final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);
	private JFrame frame;
	
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
		
		mCargarLibros = new JMenuItem("Cargar libros                         ");
		mCargarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		archivo.add(mntmAcercaDeNosotros);
		archivo.add(mCargarLibros);
		archivo.add(mSalir);
	}
	

}
