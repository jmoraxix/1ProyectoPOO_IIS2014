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
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import alejandriax.control.Coordinador;
import alejandriax.control.Principal;
import alejandriax.modelo.Libro;
import alejandriax.modelo.Persona;
import alejandriax.vista.PanelConFondo;
import alejandriax.vista.VentanaEmergente;

/**
 * @author xDiegoxD 28/09/2014
 *
 * 
 */
public class AgregarPrestamo extends VentanaEmergente{

	private JComboBox<String> cboxPersonas;
	private JComboBox cboxLibro;
	private Coordinador coordinador;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbMasDeTresSemanas, rdbUnaSemana, rdbDosSemanas;

	public AgregarPrestamo(JFrame frame) {
		super(frame, "Agregar Persona", "fondo_barra_lateral.png");


		cboxPersonas = new JComboBox();
		ArrayList<Persona> personas = Principal.getPersonas();
		String[] opPersonas = new String[personas.size()+1];
		opPersonas[0] = "-----Seleccione-----";
		for (int i = 1; i < personas.size(); i++) {
			opPersonas[i] = personas.get(i).getPrimerApellido() + " " + personas.get(i).getSegundoApellido()
					+ " " + personas.get(i).getNombre();
		}

		cboxPersonas.setModel(new DefaultComboBoxModel<>(opPersonas));
		cboxPersonas.setBounds(156, 115, 120, 30);
		getContentPane().add(cboxPersonas);

		cboxLibro = new JComboBox();
		ArrayList<Libro> libros = Principal.getLibros();
		String[] opLibros = new String[libros.size()+1];
		opLibros[0] = "-----Seleccione-----";
		for (int i = 1; i < libros.size(); i++) {
			opLibros[i] = libros.get(i).getTituloArticulo() + " " + libros.get(i).getAutor();
		}

		cboxLibro.setModel(new DefaultComboBoxModel<>(opLibros));


		cboxLibro.setBounds(399, 115, 120, 30);
		getContentPane().add(cboxLibro);

		JLabel lblAgregarPrestamo = new JLabel("Agregar Pr\u00E9stamo:");
		lblAgregarPrestamo.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblAgregarPrestamo.setBounds(44, 42, 172, 33);
		getContentPane().add(lblAgregarPrestamo);

		JLabel lblPersona = new JLabel("Persona:");
		lblPersona.setForeground(Color.BLACK);
		lblPersona.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPersona.setBounds(57, 115, 78, 24);
		getContentPane().add(lblPersona);

		JLabel lblLibro = new JLabel("Libro:");
		lblLibro.setForeground(Color.BLACK);
		lblLibro.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblLibro.setBounds(311, 115, 54, 24);
		getContentPane().add(lblLibro);


		PanelConFondo btnSeguir = new PanelConFondo("check.png", false, "");
		btnSeguir.getBtn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cboxPersonas.getSelectedIndex() != 0 && 
					cboxLibro.getSelectedIndex() != 0 &&
					(rdbDosSemanas.isSelected() || rdbMasDeTresSemanas.isSelected() || rdbUnaSemana.isSelected())) {
					if(Principal.getLibros().get(cboxLibro.getSelectedIndex()-1 ).estaDisponible()){

						// Oculta la ventana
						coordinador.ocultarAgregarPrestamo();
					}
					else 
						JOptionPane.showMessageDialog(coordinador.getAgregarPrestamo(), "El libro ya está prestado", "Error", JOptionPane.ERROR_MESSAGE);
	
				}
				else 
					JOptionPane.showMessageDialog(coordinador.getAgregarPrestamo(), "Seleccione ambas opciones", "Error", JOptionPane.ERROR_MESSAGE);

			}
		});
		btnSeguir.setBounds(540, 269, 59, 51);
		getContentPane().add(btnSeguir);
		
		rdbUnaSemana = new JRadioButton("7 d\u00EDas");
		buttonGroup.add(rdbUnaSemana);
		rdbUnaSemana.setBounds(57, 180, 109, 23);
		getContentPane().add(rdbUnaSemana);
		
		rdbDosSemanas = new JRadioButton("15 d\u00EDas");
		buttonGroup.add(rdbDosSemanas);
		rdbDosSemanas.setBounds(168, 180, 109, 23);
		getContentPane().add(rdbDosSemanas);
		
		rdbMasDeTresSemanas = new JRadioButton("22 o m\u00E1s D\u00EDas");
		buttonGroup.add(rdbMasDeTresSemanas);
		rdbMasDeTresSemanas.setBounds(279, 180, 109, 23);
		getContentPane().add(rdbMasDeTresSemanas);


	}

	public Coordinador getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
}
