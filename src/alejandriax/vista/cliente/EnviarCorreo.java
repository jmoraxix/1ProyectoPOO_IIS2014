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
import javax.swing.JTextArea;

/**
 * @author xDiegoxD 06/09/2014
 * 
 */
public class EnviarCorreo extends VentanaEmergente implements ActionListener{
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton  rdb10dias, rdb15dias, rdbSobreFecha;
	private TransparentTextField txtAsunto;
	private JTextArea txtMensaje;

	public EnviarCorreo(JFrame frame, String correoReceptor) {
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
		
		txtAsunto = new TransparentTextField("", 0);
		txtAsunto.setBounds(6, 16, 179, 31);
		panelAsunto.add(txtAsunto);
		
		JPanel panelMensaje = new JPanel();
		panelMensaje.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mensaje:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelMensaje.setBounds(36, 153, 547, 190);
		getContentPane().add(panelMensaje);
		panelMensaje.setLayout(null);
		
		txtMensaje = new JTextArea();
		txtMensaje.setBounds(6, 16, 531, 161);
		panelMensaje.add(txtMensaje);
		
		rdb10dias = new JRadioButton("10 D\u00EDas");
		rdb10dias.addActionListener(this);
		rdb10dias.setSelected(true);
		rdb10dias.setOpaque(false);
		buttonGroup.add(rdb10dias);
		rdb10dias.setBounds(233, 122, 61, 23);
		getContentPane().add(rdb10dias);
		
		rdb15dias = new JRadioButton("15 D\u00EDas");
		rdb15dias.addActionListener(this);
		rdb15dias.setOpaque(false);
		buttonGroup.add(rdb15dias);
		rdb15dias.setBounds(296, 122, 61, 23);
		getContentPane().add(rdb15dias);
		
		rdbSobreFecha = new JRadioButton("Sobre Fecha");
		rdbSobreFecha.addActionListener(this);
		rdbSobreFecha.setOpaque(false);
		buttonGroup.add(rdbSobreFecha);
		rdbSobreFecha.setBounds(359, 122, 85, 23);
		getContentPane().add(rdbSobreFecha);
		

		PanelConFondo panelGmail = new PanelConFondo("gmailicon.png", false, "");
		panelGmail.setBounds(467, 91, 53, 54);
		getContentPane().add(panelGmail);
		
		PanelConFondo panelHotmail = new PanelConFondo("hotmailIcon.png", false, "");
		panelHotmail.setBounds(530, 91, 53, 54);
		getContentPane().add(panelHotmail);
		// TODO Auto-generated constructor stub
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(rdb10dias.isSelected()){
	    	txtAsunto.setText("Recordatorio primeros 10 dias");
			txtMensaje.setText(" Este mensaje es para recordarle que el libro prestado cumple con 10 dias \n " 
					+ "Este es un mensaje autogenerado."
					+ "Por favor no responda este mensaje"
					+ "Gracias");
		} else if(rdb15dias.isSelected()){
			txtAsunto.setText("Recordatorio primeros 10 dias");
			txtMensaje.setText(" Este mensaje es para recordarle que el libro prestado cumple con 10 dias \n " 
					+ "Este es un mensaje autogenerado."
					+ "Por favor no responda este mensaje"
					+ "Gracias");
		} else if(rdbSobreFecha.isSelected()){
			txtAsunto.setText("Recordatorio primeros 10 dias");
			txtMensaje.setText(" Este mensaje es para recordarle que el libro prestado cumple con 10 dias \n " 
					+ "Este es un mensaje autogenerado."
					+ "Por favor no responda este mensaje"
					+ "Gracias");
		}
		
		
	}
}
	

