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
import alejandriax.modelo.Persona;
import alejandriax.vista.PanelPersonas;
import alejandriax.vista.VentanaConsulta;

@SuppressWarnings("serial")
public class ConsultaPersona extends VentanaConsulta {

	private Coordinador coordinador;
	private PanelPersonas panel;
	private JFrame ventana;
	private ConsultaPersona instancia;

	public ConsultaPersona(JFrame frame) {
		super(frame, "Consulta personas");
		this.ventana = frame;
		this.instancia = this;
		getLblConsulta().setText("Consulta personas");

		getCmbOpciones().setModel(new DefaultComboBoxModel(new String[] {"-----Seleccione-----",
				"C\u00E9dula",
				"Nombre",
				"Primer apellido",
				"Segundo apellido",
				"Tipo",
		"Pr\u00E9stamos"}));

		getBtnBuscar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cmbOpciones.getSelectedIndex() != 0){
					ArrayList<Persona> personas = Principal.getPersonas();
					ArrayList<Persona> res = (ArrayList<Persona>) personas.clone();
					synchronized (ventana) {
						switch (cmbOpciones.getSelectedIndex()) {
						case 1:
							if (!getTxtParametro().getText().equals(""))
								for (Persona persona : personas)
									if (!persona.getNumeroCedula().equalsIgnoreCase(txtParametro.getText()))
										res.remove(persona);
							Ordenar.ordenarPersonaCedula(res);
							llenarPanel(res);
							break;
						case 2:
							if (!getTxtParametro().getText().equals("")) {
								for (Persona persona : personas)
									if(!persona.getNombre().equalsIgnoreCase(txtParametro.getText()))
										res.remove(persona);
							}
							Ordenar.ordenarPersonaNombre(res);
							llenarPanel(res);
							break;
						case 3:
							if (!getTxtParametro().getText().equals("")) {
								for (Persona persona : personas)
									if (!persona.getPrimerApellido().equalsIgnoreCase(txtParametro.getText()))
										res.remove(persona);
							}
							llenarPanel(res);
							break;
						case 4:
							if (!getTxtParametro().getText().equals("")) {
								for (Persona persona : personas)
									if (!persona.getSegundoApellido().equalsIgnoreCase(txtParametro.getText()))
										res.remove(persona);
							}
							Ordenar.ordenarPersonaSegundoApellido(res);
							llenarPanel(res);
							break;
						case 5:
							panel = new PanelPersonas(ventana);
							getScrollPanelConsulta().setViewportView(panel);
							
							if (!getTxtParametro().getText().equals("")) {
								if (txtParametro.getText().equalsIgnoreCase("colega")) {
									ArrayList<Colega> aux = Principal
											.getColegas();
									for (Persona persona : aux)
										panel.agregarPersona(persona);
								} else if (txtParametro.getText().equalsIgnoreCase("familia")) {
									ArrayList<Familiar> aux = Principal
											.getFamiliares();
									for (Persona persona : aux)
										panel.agregarPersona(persona);
								} else if (txtParametro.getText().equalsIgnoreCase("estudiante")) {
									ArrayList<Estudiante> aux = Principal
											.getEstudiantes();
									for (Persona persona : aux)
										panel.agregarPersona(persona);
								} else
									JOptionPane
											.showMessageDialog(
													null,
													"Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.",
													"Error",
													JOptionPane.ERROR_MESSAGE);

							} else
								JOptionPane.showMessageDialog(null,
										"Caja de texto vac\u00eda.", "Error",
										JOptionPane.ERROR_MESSAGE);
							break;
						case 6:
							if (!getTxtParametro().getText().equals("")) {
								for (Persona persona : personas)
									if(persona.getPrestamos().isEmpty())
										res.remove(persona);
							}
							llenarPanel(res);
							break;
						default:
							JOptionPane
									.showMessageDialog(
											null,
											"Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.",
											"Error", JOptionPane.ERROR_MESSAGE);
							break;
						}
					}  
				} else
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una opci\u00f3n de b\u00fasqueda v\u00e1lida.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});

		llenarPanel(Principal.getPersonas());

	}

	public void llenarPanel(ArrayList<Persona> personas){
		panel = new PanelPersonas(ventana);
		getScrollPanelConsulta().setViewportView(panel);

		for(Persona persona : personas){
			panel.agregarPersona(persona);
		}
	}

	public Coordinador getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Coordinador coordinar) {
		this.coordinador = coordinar;
	}

}
