package alejandriax.vista.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import alejandriax.control.Coordinador;
import alejandriax.control.Ordenar;
import alejandriax.control.Principal;
import alejandriax.modelo.Libro;
import alejandriax.modelo.Persona;
import alejandriax.vista.PanelMostrarPrestamos;
import alejandriax.vista.VentanaConsulta;

@SuppressWarnings("serial")
public class ConsultaPrestamo extends VentanaConsulta {

	private Coordinador coordinador;
	private PanelMostrarPrestamos panel;
	
	public ConsultaPrestamo(JFrame frame) {
		super(frame, "Consulta pr\u00e9stamos");
		getLblConsulta().setText("Consulta pr\u00e9stamos");
		
		getCmbOpciones().setModel(new DefaultComboBoxModel(new String[] {"-----Seleccione-----",
				"C\u00f3digo",
				"Fecha",
				"Estado",
				"Persona",
				"T\u00edtulo del art\u00edculo",
		"Dimitir"}));

		getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cmbOpciones.getSelectedIndex() != 0){
					ArrayList<Libro> libros = new ArrayList<Libro>();
					ArrayList<Libro> res = (ArrayList<Libro>) libros.clone();
					synchronized (coordinador.getConsultaLibro()) {
						switch (cmbOpciones.getSelectedIndex()) {
						case 1:
							if (!getTxtParametro().getText().equals(""))
								for (Libro libro : libros)
									if (!libro.getIdArticulo().equalsIgnoreCase(txtParametro.getText()))
										res.remove(libro);
							Ordenar.ordenarLibroCodigo(res);
//							llenarPanel(res);
							break;
						case 2:
							if (!getTxtParametro().getText().equals("")) 
								for (Libro libro : libros)
									if(!libro.getTituloArticulo().equalsIgnoreCase(txtParametro.getText()))
										res.remove(libro);
//							llenarPanel(res);
							break;
						case 3:
							if (!getTxtParametro().getText().equals(""))
								for (Libro libro : libros)
									if (!libro.getAutor().equalsIgnoreCase(txtParametro.getText()))
										res.remove(libro);
							Ordenar.ordenarLibroAutor(res);
//							llenarPanel(res);
							break;
						case 4:
							if (!getTxtParametro().getText().equals("")) {
								for (Libro libro : libros)
									if (!libro.getEditorial().equalsIgnoreCase(txtParametro.getText()))
										res.remove(libro);
							}
							Ordenar.ordenarLibroEditorial(res);
//							llenarPanel(res);
							break;
						case 5:
							if (!getTxtParametro().getText().equals("")) {
								for (Libro libro : libros)
									if (!libro.getEdicion().equalsIgnoreCase(txtParametro.getText()))
										res.remove(libro);
							}
							Ordenar.ordenarLibroEdicion(res);
//							llenarPanel(res);
							break;
						default:
							JOptionPane
							.showMessageDialog(
									coordinador.getConsultaPrestamo(),
									"Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.",
									"Error", JOptionPane.ERROR_MESSAGE);
							break;
						}
					}  
				} else
					JOptionPane.showMessageDialog(coordinador.getConsultaPrestamo(), 
							"Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.", 
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});

		
		llenarPanel(Principal.getPersonas());

	}

	public void llenarPanel(ArrayList<Persona> personas){
		panel = new PanelMostrarPrestamos(coordinador.getVentanaPrincipal());
		getScrollPanelConsulta().setViewportView(panel);

		for(Persona persona : personas){
			panel.agregarPrestamos(persona);
		}
	}

	public Coordinador getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
}
