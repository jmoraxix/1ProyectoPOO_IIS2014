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
import javax.swing.JRadioButton;

import alejandriax.control.Principal;

/**
 * @author xDiegoxD 13/09/2014
 *
 * 
 */
public class AñadirPersona extends VentanaEmergente{
	private TransparentTextField txtNombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * @param frame
	 * @param title
	 */
	public AñadirPersona(JFrame frame, String title) {
		super(frame, title, "Fondo_principal.png");
		setTitle("A\u00F1adir Persona");
		
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
		
		TransparentTextField txtPrimerApellido = new TransparentTextField("", 0);
		txtPrimerApellido.setBounds(27, 127, 179, 31);
		getContentPane().add(txtPrimerApellido);
		
		TransparentTextField txtSegundoApellido = new TransparentTextField("", 0);
		txtSegundoApellido.setBounds(384, 127, 179, 31);
		getContentPane().add(txtSegundoApellido);
		
		TransparentTextField txtCorreo = new TransparentTextField("", 0);
		txtCorreo.setBounds(26, 214, 179, 31);
		getContentPane().add(txtCorreo);
		
		TransparentTextField txtTelefono = new TransparentTextField("", 0);
		txtTelefono.setBounds(384, 214, 179, 31);
		getContentPane().add(txtTelefono);
		
		JLabel lblImagen = new JLabel("Imagen:");
		lblImagen.setForeground(Color.BLACK);
		lblImagen.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblImagen.setBounds(285, 11, 80, 33);
		getContentPane().add(lblImagen);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa:");
		lblCategora.setForeground(Color.BLACK);
		lblCategora.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblCategora.setBounds(179, 256, 109, 33);
		getContentPane().add(lblCategora);
		
		JRadioButton rbnEstudiante = new JRadioButton("Estudiante");
		buttonGroup.add(rbnEstudiante);
		rbnEstudiante.setOpaque(false);
		rbnEstudiante.setFont(Principal.getLetratexto2());
		rbnEstudiante.setBounds(44, 297, 133, 23);
		getContentPane().add(rbnEstudiante);
		
		JRadioButton rbnColega = new JRadioButton("Colega");
		buttonGroup.add(rbnColega);
		rbnColega.setFont(Principal.getLetratexto2());
		rbnColega.setBounds(179, 297, 98, 23);
		rbnColega.setOpaque(false);
		getContentPane().add(rbnColega);
		
		JRadioButton rbnFamiliar = new JRadioButton("Familiar");
		buttonGroup.add(rbnFamiliar);
		rbnFamiliar.setBounds(285, 297, 109, 23);
		rbnFamiliar.setFont(Principal.getLetratexto2());
		rbnFamiliar.setOpaque(false);
		getContentPane().add(rbnFamiliar);
		// TODO Auto-generated constructor stub
		
		PanelConFondo btnSeguir = new PanelConFondo("check.png", false);
		btnSeguir.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// new
			}
		});
		btnSeguir.setBounds(540, 269, 59, 51);
		getContentPane().add(btnSeguir);
	}
}
