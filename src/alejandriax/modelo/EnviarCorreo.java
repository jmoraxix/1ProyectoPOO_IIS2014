/** 
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Gabriel Ramirez
 * 201020244
 */
package alejandriax.modelo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import alejandriax.vista.PanelConFondo;
import alejandriax.vista.TransparentTextField;
import alejandriax.vista.VentanaEmergente;



/**
 * @author xDiegoxD 06/09/2014
 *
 * 
 */
public class EnviarCorreo extends VentanaEmergente{
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * @param frame
	 * @param title
	 * @param fondo
	 */
	public EnviarCorreo(JFrame frame) {
		super(frame, "Enviar Correo", "fondo_barra_lateral.png");
		
		JLabel lblRecordatorio = new JLabel("Recordatorio Correo Electr\u00F3nico:");
		lblRecordatorio.setForeground(Color.BLACK);
		lblRecordatorio.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblRecordatorio.setBounds(36, 39, 295, 33);
		getContentPane().add(lblRecordatorio);
		
		JPanel panelAsunto = new JPanel();
		panelAsunto.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Asunto:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelAsunto.setFont(new Font("Georgia", Font.PLAIN, 20));
		panelAsunto.setBounds(36, 91, 191, 54);
		getContentPane().add(panelAsunto);
		panelAsunto.setLayout(null);
		
		TransparentTextField txtAsunto = new TransparentTextField("", 0);
		txtAsunto.setBounds(6, 16, 179, 31);
		panelAsunto.add(txtAsunto);
		
		JPanel panelMensaje = new JPanel();
		panelMensaje.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mensaje:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelMensaje.setBounds(36, 153, 547, 190);
		getContentPane().add(panelMensaje);
		panelMensaje.setLayout(null);
		
		TransparentTextField txtMensaje = new TransparentTextField();
		txtMensaje.setBounds(6, 16, 531, 161);
		panelMensaje.add(txtMensaje);
		
		JRadioButton rdb10dias = new JRadioButton("10 D\u00EDas");
		buttonGroup.add(rdb10dias);
		rdb10dias.setBounds(233, 122, 61, 23);
		getContentPane().add(rdb10dias);
		
		JRadioButton rdb15dias = new JRadioButton("15 D\u00EDas");
		buttonGroup.add(rdb15dias);
		rdb15dias.setBounds(296, 122, 61, 23);
		getContentPane().add(rdb15dias);
		
		JRadioButton rdbtnSobreFecha = new JRadioButton("Sobre Fecha");
		buttonGroup.add(rdbtnSobreFecha);
		rdbtnSobreFecha.setBounds(359, 122, 85, 23);
		getContentPane().add(rdbtnSobreFecha);
		

		PanelConFondo panelGmail = new PanelConFondo("gmailicon.png", false, "");
		panelGmail.setBounds(467, 91, 53, 54);
		getContentPane().add(panelGmail);
		
		PanelConFondo panelHotmail = new PanelConFondo("hotmailIcon.png", false, "");
		panelHotmail.setBounds(530, 91, 53, 54);
		getContentPane().add(panelHotmail);
		// TODO Auto-generated constructor stub
	}
}
	

