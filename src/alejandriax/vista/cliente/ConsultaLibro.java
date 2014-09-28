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
import alejandriax.modelo.Colega;
import alejandriax.modelo.Estudiante;
import alejandriax.modelo.Familiar;
import alejandriax.modelo.Libro;
import alejandriax.vista.PanelLibros;
import alejandriax.vista.VentanaConsulta;

@SuppressWarnings("serial")
public class ConsultaLibro extends VentanaConsulta {

	private Coordinador coordinador;
	private PanelLibros panel;

	public ConsultaLibro(JFrame frame) {
		super(frame, "Consulta libros");
		getLblConsulta().setText("Consulta libros");

		getCmbOpciones().setModel(new DefaultComboBoxModel(new String[] {"-----Seleccione-----",
				"C\u00f3digo",
				"Título",
				"Autor",
				"Editorial",
				"Edici\u00f3n",
				"Idioma",
		"G\u00e9nero"}));

		getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cmbOpciones.getSelectedIndex() != 0){
//					ArrayList<Libro> libros = Principal.getLibros();
//					ArrayList<Libro> res = (ArrayList<Libro>) libros.clone();
//					synchronized (coordinador.getConsultaLibro()) {
//						switch (cmbOpciones.getSelectedIndex()) {
//						case 1:
//							if (!getTxtParametro().getText().equals(""))
//								for (Libro libro : libros)
//									if (!libro.getNumeroCedula().equalsIgnoreCase(txtParametro.getText()))
//										res.remove(libro);
//							Ordenar.ordenarPersonaCedula(res);
//							llenarPanel(res);
//							break;
//						case 2:
//							if (!getTxtParametro().getText().equals("")) {
//								for (Libro libro : libros)
//									if(!libro.getNombre().equalsIgnoreCase(txtParametro.getText()))
//										res.remove(libro);
//							}
//							Ordenar.ordenarPersonaNombre(res);
//							llenarPanel(res);
//							break;
//						case 3:
//							if (!getTxtParametro().getText().equals("")) {
//								for (Libro libro : libros)
//									if (!libro.getPrimerApellido().equalsIgnoreCase(txtParametro.getText()))
//										res.remove(libro);
//							}
//							llenarPanel(res);
//							break;
//						case 4:
//							if (!getTxtParametro().getText().equals("")) {
//								for (Libro libro : libros)
//									if (!libro.getSegundoApellido().equalsIgnoreCase(txtParametro.getText()))
//										res.remove(libro);
//							}
//							Ordenar.ordenarPersonaSegundoApellido(res);
//							llenarPanel(res);
//							break;
//						case 5:
//							panel = new PanelLibros(coordinador.getVentanaPrincipal());
//							getScrollPanelConsulta().setViewportView(panel);
//
//							if (!getTxtParametro().getText().equals("")) {
//								if (txtParametro.getText().equalsIgnoreCase("colega")) {
//									ArrayList<Colega> aux = Principal
//											.getColegas();
//									for (libro libro : aux)
//										panel.agregarLibro(libro);
//								} else if (txtParametro.getText().equalsIgnoreCase("familia")) {
//									ArrayList<Familiar> aux = Principal
//											.getFamiliares();
//									for (libro libro : aux)
//										panel.agregarLibro(libro);
//								} else if (txtParametro.getText().equalsIgnoreCase("estudiante")) {
//									ArrayList<Estudiante> aux = Principal
//											.getEstudiantes();
//									for (libro libro : aux)
//										panel.agregarLibro(libro);
//								} else 
//									JOptionPane
//									.showMessageDialog(
//											coordinador.getConsultaLibro(),
//											"Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.",
//											"Error",
//											JOptionPane.ERROR_MESSAGE);
//
//							} else
//								JOptionPane.showMessageDialog(coordinador.getConsultaLibro(),
//										"Caja de texto vac\u00eda.", "Error",
//										JOptionPane.ERROR_MESSAGE);
//							break;
//						case 6:
//							if (!getTxtParametro().getText().equals("")) {
//								for (Libro libro : libros)
//									if(libro.getPrestamos().isEmpty())
//										res.remove(libro);
//							}
//							llenarPanel(res);
//							break;
//						default:
//							JOptionPane
//							.showMessageDialog(
//									coordinador.getConsultaLibro(),
//									"Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.",
//									"Error", JOptionPane.ERROR_MESSAGE);
//							break;
//						}
//					}  
				} else
					JOptionPane.showMessageDialog(coordinador.getConsultaLibro(), 
							"Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.", 
							"Error", JOptionPane.ERROR_MESSAGE);
			}
		});

		llenarPanel(Principal.getLibros());

	}

	public void llenarPanel(ArrayList<Libro> libros){
		panel = new PanelLibros(coordinador.getVentanaPrincipal());
		getScrollPanelConsulta().setViewportView(panel);

		for(Libro libro : libros){
			panel.agregarLibro(libro);
		}
	}

	public Coordinador getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
}
