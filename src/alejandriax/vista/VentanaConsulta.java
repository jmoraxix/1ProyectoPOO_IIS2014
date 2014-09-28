/**
 * Primer Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 31/07/2014
 */

package alejandriax.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * @author jmora 20/9/14
 * 
 */
public class VentanaConsulta extends VentanaEmergente {
	
	protected JScrollPane scrollPanelConsulta;
	protected JTextField txtParametro;
	protected JComboBox cmbOpciones;
	protected JButton btnBuscar;
	protected JLabel lblConsulta;

	public VentanaConsulta(JFrame frame, String titulo) {
		super(frame, titulo, "fondo_barra_lateral.png", 1150, 560);
				
		scrollPanelConsulta = new JScrollPane();
		scrollPanelConsulta.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPanelConsulta.setBounds(92, 129, 1000, 350);
		getContentPane().add(scrollPanelConsulta);

		cmbOpciones = new JComboBox();
		cmbOpciones.setBounds(92, 87, 205, 30);
		getContentPane().add(cmbOpciones);
		
		txtParametro = new JTextField();
		txtParametro.setBounds(309, 87, 218, 30);
		getContentPane().add(txtParametro);
		txtParametro.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(537, 87, 110, 30);
		getContentPane().add(btnBuscar);
		
		lblConsulta = new JLabel("Consulta");
		lblConsulta.setFont(new Font("Georgia", Font.PLAIN, 28));
		lblConsulta.setBounds(79, 25, 297, 44);
		getContentPane().add(lblConsulta);
	}

	protected JTextField getTxtParametro() {
		return txtParametro;
	}

	protected void setTxtParametro(JTextField txtParametro) {
		this.txtParametro = txtParametro;
	}

	protected JComboBox getCmbOpciones() {
		return cmbOpciones;
	}

	protected void setCmbOpciones(JComboBox cmbOpciones) {
		this.cmbOpciones = cmbOpciones;
	}

	protected JButton getBtnBuscar() {
		return btnBuscar;
	}

	protected void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	protected JLabel getLblConsulta() {
		return lblConsulta;
	}

	protected void setLblConsulta(JLabel lblConsulta) {
		this.lblConsulta = lblConsulta;
	}

	protected JScrollPane getScrollPanelConsulta() {
		return scrollPanelConsulta;
	}

	protected void setScrollPanelConsulta(JScrollPane scrollPanelConsulta) {
		this.scrollPanelConsulta = scrollPanelConsulta;
	}
}
