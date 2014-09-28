/** 
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Gabriel Ramirez
 * 201020244
 */
package alejandriax.vista.cliente;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import alejandriax.control.Coordinador;
import alejandriax.control.Principal;
import alejandriax.modelo.Libro;
import alejandriax.vista.PanelCalificacion;
import alejandriax.vista.PanelConFondo;
import alejandriax.vista.TransparentTextField;
import alejandriax.vista.VentanaEmergente;

/**
 * @author xDiegoxD 27/09/2014
 *
 * 
 */
public class AgregarLibro extends VentanaEmergente {
	private TransparentTextField txtTituloLibro, txtAutor, txtEditorial, txtEdicion, txtGenero; 
	private JLabel lblEdicion;
	private Libro libro;
	private JLabel lblCalificacion;
	private Coordinador coordinador;
	private JLabel lblGenero;

	/**
	 * @param frame
	 * @param title
	 * @param fondo
	 * @wbp.parser.constructor
	 */
	public AgregarLibro(JFrame frame) {
		super(frame,"Agregar Libro", "fondo_principal.png");
		this.libro = (Libro) libro;
		Libro libro = new Libro(null, null, null, null, null);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo: *");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(Principal.getLetratexto2());
		lblTitulo.setBounds(25, 24, 80, 33);
		getContentPane().add(lblTitulo);

		txtTituloLibro = new TransparentTextField("", 0);
		txtTituloLibro.setBounds(115, 28, 179, 31);
		getContentPane().add(txtTituloLibro);
		
		JLabel lblAutor = new JLabel("Autor: *");
		lblAutor.setForeground(Color.BLACK);
		lblAutor.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblAutor.setBounds(25, 118, 80, 33);
		getContentPane().add(lblAutor);
		
		txtAutor = new TransparentTextField("", 0);
		soloLetras(txtAutor);
		txtAutor.setBounds(115, 118, 179, 31);
		getContentPane().add(txtAutor);
		
		JLabel lblEditorial = new JLabel("Editorial: *");
		lblEditorial.setForeground(Color.BLACK);
		lblEditorial.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblEditorial.setBounds(10, 198, 101, 33);
		getContentPane().add(lblEditorial);
		
		txtEditorial = new TransparentTextField("", 0);
		txtEditorial.setBounds(115, 198, 179, 31);
		getContentPane().add(txtEditorial);
		
		txtEdicion = new TransparentTextField("", 0);
		txtEdicion.setBounds(434, 198, 179, 31);
		getContentPane().add(txtEdicion);
		
		txtGenero = new TransparentTextField("", 0);
		soloLetras(txtGenero);
		txtGenero.setBounds(434, 118, 179, 31);
		getContentPane().add(txtGenero);
		
		lblEdicion = new JLabel("Edici\u00F3n: *");
		lblEdicion.setForeground(Color.BLACK);
		lblEdicion.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblEdicion.setBounds(344, 198, 92, 33);
		getContentPane().add(lblEdicion);
		
		PanelCalificacion panelCalificacion = new PanelCalificacion(libro);
		panelCalificacion.setBounds(173, 284, 184, 28);
		getContentPane().add(panelCalificacion);
		
		lblCalificacion = new JLabel("Calificaci\u00F3n:");
		lblCalificacion.setForeground(Color.BLACK);
		lblCalificacion.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblCalificacion.setBounds(25, 279, 116, 33);
		getContentPane().add(lblCalificacion);
		

		lblGenero = new JLabel("G\u00E9nero: *");
		lblGenero.setForeground(Color.BLACK);
		lblGenero.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblGenero.setBounds(344, 118, 92, 33);
		getContentPane().add(lblGenero);
		
		
		PanelConFondo btnSeguir = new PanelConFondo("check.png", false, "");
		btnSeguir.getBtn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtAutor.getText().equals("")&&
						!txtEdicion.getText().equals("")&&
						!txtEditorial.getText().equals("")&&
						!txtTituloLibro.getText().equals("")&&
						!txtGenero.getText().equals(""))
				{
					// Verifica que la persona no exista
					boolean existe = false;
					for(Libro libro : Principal.getLibros())
						if(libro.getTituloArticulo().equals(txtTituloLibro.getText()))
								existe = true;
					//Crea la persona y la añade a las listas o envia msj de error
					if (!existe) {
							Libro libro = new Libro(
									"lib" + String.valueOf(Principal.getLibros().size()+1),
									txtTituloLibro.getText(),
									txtAutor.getText(),
									txtEditorial.getText(),
									txtGenero.getText());
							libro.setImagen("error_libro.png");
							System.out.println(libro.getTituloArticulo());
							Principal.addLibro(libro);
							
						}
					
					else 
						JOptionPane.showMessageDialog(coordinador.getVentanaPrincipal(), "La persona ya existe, ingrese otra cédula.", "Error", JOptionPane.ERROR_MESSAGE);
					
					// Oculta la ventana
					coordinador.ocultarAgregarLibro();	
				}
				else 
					JOptionPane.showMessageDialog(coordinador.getVentanaPrincipal(), "¡Hay un campo requerido vac\u00edo!", "Error", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		btnSeguir.setBounds(540, 269, 59, 51);
		getContentPane().add(btnSeguir);
		
		
		
		
		
	}
		
	

	public Coordinador getCoordinador() {
		return coordinador;
	}



	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}



	public void soloLetras(JTextField txt){
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if (Character.isDigit(c)) {
					e.consume();		
				}
			}
		});
	}

	public void soloNumeros(JTextField txt){
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();		
				}
			}
		});
	}
}
