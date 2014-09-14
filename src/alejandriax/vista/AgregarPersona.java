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

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import alejandriax.control.Coordinador;
import alejandriax.control.Principal;
import alejandriax.modelo.Colega;
import alejandriax.modelo.Estudiante;
import alejandriax.modelo.Familiar;
import alejandriax.modelo.Persona;

/**
 * @author xDiegoxD 13/09/2014
 *
 * 
 */
public class AgregarPersona extends VentanaEmergente{
	private TransparentTextField txtNombre, txtPrimerApellido, txtSegundoApellido, txtTelefono, txtCedula, txtCorreo ;
	private JRadioButton rbnColega, rbnFamiliar, rbnEstudiante;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Coordinador coordinador;

	/**
	 * @param frame
	 * @param title
	 */
	public AgregarPersona(JFrame frame) {
		super(frame, "Agregar Persona", "fondo_principal.png");

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(Principal.getLetratexto2());
		lblNombre.setBounds(26, 11, 80, 33);
		getContentPane().add(lblNombre);

		JLabel lblPrimerApellido = new JLabel("Primer Apellido:");
		lblPrimerApellido.setFont(Principal.getLetratexto2());
		lblPrimerApellido.setBounds(44, 98, 147, 33);
		getContentPane().add(lblPrimerApellido);

		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setFont(Principal.getLetratexto2());
		lblSegundoApellido.setBounds(384, 98, 162, 33);
		getContentPane().add(lblSegundoApellido);

		JLabel lblTelefono = new JLabel("N\u00FAmero de Tel\u00E9fono:");
		lblTelefono.setFont(Principal.getLetratexto2());
		lblTelefono.setBounds(380, 180, 244, 33);
		getContentPane().add(lblTelefono);

		JLabel lblCorreoElectronico = new JLabel("Correo Electr\u00F3nico:");
		lblCorreoElectronico.setFont(Principal.getLetratexto2());
		lblCorreoElectronico.setBounds(26, 180, 244, 33);
		getContentPane().add(lblCorreoElectronico);

		txtNombre = new TransparentTextField("", 0);
		txtNombre.setBounds(26, 42, 179, 31);

		getContentPane().add(txtNombre);

		txtPrimerApellido = new TransparentTextField("", 0);
		txtPrimerApellido.setBounds(27, 127, 179, 31);
		getContentPane().add(txtPrimerApellido);

		txtSegundoApellido = new TransparentTextField("", 0);
		txtSegundoApellido.setBounds(384, 127, 179, 31);
		getContentPane().add(txtSegundoApellido);

		txtCorreo = new TransparentTextField("", 0);
		txtCorreo.setBounds(26, 214, 179, 31);
		getContentPane().add(txtCorreo);

		txtTelefono = new TransparentTextField("", 0);
		txtTelefono.setBounds(384, 214, 179, 31);
		getContentPane().add(txtTelefono);

		JLabel lblImagen = new JLabel("Imagen:");
		lblImagen.setForeground(Color.BLACK);
		lblImagen.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblImagen.setBounds(483, 11, 80, 33);
		getContentPane().add(lblImagen);

		JLabel lblCategora = new JLabel("Categor\u00EDa:");
		lblCategora.setForeground(Color.BLACK);
		lblCategora.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblCategora.setBounds(179, 256, 109, 33);
		getContentPane().add(lblCategora);

		rbnEstudiante = new JRadioButton("Estudiante");
		buttonGroup.add(rbnEstudiante);
		rbnEstudiante.setOpaque(false);
		rbnEstudiante.setFont(Principal.getLetratexto2());
		rbnEstudiante.setBounds(44, 297, 133, 23);
		getContentPane().add(rbnEstudiante);

		rbnColega = new JRadioButton("Colega");
		buttonGroup.add(rbnColega);
		rbnColega.setFont(Principal.getLetratexto2());
		rbnColega.setBounds(179, 297, 98, 23);
		rbnColega.setOpaque(false);
		getContentPane().add(rbnColega);

		rbnFamiliar = new JRadioButton("Familiar");
		buttonGroup.add(rbnFamiliar);
		rbnFamiliar.setBounds(285, 297, 109, 23);
		rbnFamiliar.setFont(Principal.getLetratexto2());
		rbnFamiliar.setOpaque(false);
		getContentPane().add(rbnFamiliar);

		PanelConFondo btnSeguir = new PanelConFondo("check.png", false, "");
		btnSeguir.getBtn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!txtCorreo.getText().equals("")&&
						!txtNombre.getText().equals("")&&
						!txtPrimerApellido.getText().equals("")&&
						!txtSegundoApellido.getText().equals("")&&
						!txtCedula.getText().equals("")&&
						!txtTelefono.getText().equals("")&&
						(rbnFamiliar.isSelected() || rbnColega.isSelected() || rbnEstudiante.isSelected()))
				{
					// Verifica que la persona no exista
					boolean existe = false;
					for(Persona persona : Principal.getPersonas())
						if(persona.getNumeroCedula().equals(txtCedula.getText()))
								existe = true;
					//Crea la persona y la añade a las listas o envia msj de error
					if (!existe) {
						if (rbnFamiliar.isSelected()) {
							Familiar familiar = new Familiar(
									txtCedula.getText(), txtNombre.getText(),
									txtPrimerApellido.getText(),
									txtSegundoApellido.getText());
							familiar.setTelefono(txtTelefono.getText());
							Principal.addFamiliar(familiar);
						} else if (rbnColega.isSelected()) {
							Colega colega = new Colega(txtCedula.getText(),
									txtNombre.getText(),
									txtPrimerApellido.getText(),
									txtSegundoApellido.getText());
							colega.setTelefono(txtTelefono.getText());
							Principal.addColega(colega);
						}

						else if (rbnEstudiante.isSelected()) {
							Estudiante estudiante = new Estudiante(
									txtCedula.getText(), txtNombre.getText(),
									txtPrimerApellido.getText(),
									txtSegundoApellido.getText());
							estudiante.setTelefono(txtTelefono.getText());
							Principal.addEstudiante(estudiante);

						}
					}
					else 
						JOptionPane.showMessageDialog(coordinador.getVentanaPrincipal(), "La persona ya existe, ingrese otra cédula.", "Error", JOptionPane.ERROR_MESSAGE);
					
					// Oculta la ventana
					coordinador.ocultarAgregarPersona();	
				}
				else 
					JOptionPane.showMessageDialog(coordinador.getVentanaPrincipal(), "¡Hay un campo requerido vac\u00edo!", "Error", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		btnSeguir.setBounds(540, 269, 59, 51);
		getContentPane().add(btnSeguir);

		JLabel lblCedula = new JLabel("C\u00E9dula:");
		lblCedula.setForeground(Color.BLACK);
		lblCedula.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblCedula.setBounds(234, 11, 80, 33);
		getContentPane().add(lblCedula);


		txtCedula = new TransparentTextField("", 0);
		txtCedula.setBounds(234, 42, 179, 31);
		getContentPane().add(txtCedula);
	}


	/***Getters & Setters**/
	public Coordinador getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
}
