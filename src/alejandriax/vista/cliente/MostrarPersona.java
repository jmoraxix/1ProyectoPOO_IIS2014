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

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;

import alejandriax.control.Coordinador;
import alejandriax.control.Principal;
import alejandriax.modelo.Persona;
import alejandriax.vista.VentanaEmergente;

/**
 * @author xDiegoxD 13/09/2014
 *
 * 
 */
public class MostrarPersona extends VentanaEmergente{
	private JLabel txtNombre, txtPrimerApellido, txtSegundoApellido, txtTelefono, txtCedula, txtCorreo, lblCategoria;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Coordinador coordinador;
	private Persona persona;

	/**
	 * @param frame
	 * @param title
	 */
	public MostrarPersona(JFrame frame, Persona persona) {
		super(frame, "Agregar Persona", "fondo_principal.png");
		this.persona = persona;

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(Principal.getLetratexto2());
		lblNombre.setBounds(380, 11, 80, 33);
		getContentPane().add(lblNombre);

		JLabel lblPrimerApellido = new JLabel("Primer Apellido:");
		lblPrimerApellido.setFont(Principal.getLetratexto2());
		lblPrimerApellido.setBounds(44, 98, 147, 33);
		getContentPane().add(lblPrimerApellido);

		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setFont(Principal.getLetratexto2());
		lblSegundoApellido.setBounds(380, 98, 162, 33);
		getContentPane().add(lblSegundoApellido);

		JLabel lblTelefono = new JLabel("N\u00FAmero de Tel\u00E9fono:");
		lblTelefono.setFont(Principal.getLetratexto2());
		lblTelefono.setBounds(380, 180, 244, 33);
		getContentPane().add(lblTelefono);

		JLabel lblCorreoElectronico = new JLabel("Correo Electr\u00F3nico:");
		lblCorreoElectronico.setFont(Principal.getLetratexto2());
		lblCorreoElectronico.setBounds(44, 180, 179, 33);
		getContentPane().add(lblCorreoElectronico);

		txtNombre = new JLabel("", 0);
		txtNombre.setText(persona.getNombre());
		txtNombre.setFont(Principal.getLetratexto3());
		txtNombre.setBounds(390, 42, 179, 31);

		getContentPane().add(txtNombre);

		txtPrimerApellido = new JLabel("", 0);
		txtPrimerApellido.setText(persona.getPrimerApellido());
		txtPrimerApellido.setFont(Principal.getLetratexto3());
		txtPrimerApellido.setBounds(27, 127, 179, 31);
		getContentPane().add(txtPrimerApellido);

		txtSegundoApellido = new JLabel("", 0);
		txtSegundoApellido.setText(persona.getSegundoApellido());
		txtSegundoApellido.setFont(Principal.getLetratexto3());
		txtSegundoApellido.setBounds(384, 127, 179, 31);
		getContentPane().add(txtSegundoApellido);

		txtCorreo = new JLabel("", 0);
		txtCorreo.setText(persona.getCorreoElectronico());
		txtCorreo.setFont(Principal.getLetratexto3());
		txtCorreo.setBounds(26, 214, 179, 31);
		getContentPane().add(txtCorreo);

		txtTelefono = new JLabel("", 0);
		txtTelefono.setText(persona.getTelefono());
		txtTelefono.setFont(Principal.getLetratexto3());
		txtTelefono.setBounds(384, 214, 179, 31);
		getContentPane().add(txtTelefono);

//		JLabel lblCategora = new JLabel("Categor\u00EDa:");
//		lblCategora.setForeground(Color.BLACK);
//		lblCategora.setFont(new Font("Georgia", Font.PLAIN, 20));
//		lblCategora.setBounds(26, 256, 109, 33);
//		getContentPane().add(lblCategora);

		JLabel lblCedula = new JLabel("C\u00E9dula:");
		lblCedula.setForeground(Color.BLACK);
		lblCedula.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblCedula.setBounds(44, 11, 80, 33);
		getContentPane().add(lblCedula);


		txtCedula = new JLabel("", 0);
		txtCedula.setText(persona.getNumeroCedula());
		txtCedula.setFont(Principal.getLetratexto3());
		txtCedula.setBounds(26, 42, 179, 31);
		getContentPane().add(txtCedula);
		
//		lblCategoria = new JLabel("", SwingConstants.CENTER);
//		//lblCategoria.setText(persona.get());
//		lblCategoria.setFont(Principal.getLetratexto3());
//		lblCategoria.setBounds(26, 287, 179, 31);
//		getContentPane().add(lblCategoria);
	}


	/***Getters & Setters**/
	public Coordinador getCoordinador() {
		return coordinador;
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador = coordinador;
	}
}
