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

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

import alejandriax.control.Principal;

@SuppressWarnings("serial")
public class FotoPersona extends JPanel {

	private PanelConFondo panel;
	private Dimension tam;

	public FotoPersona(String urlImagen, String ap1, String ap2, String nom) {
		setLayout(null);
		this.setOpaque(false);
		tam = this.getSize();
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setSize((int)tam.getWidth(), (int)tam.getHeight()/3);
		panelSuperior.setOpaque(false);
		JButton btnUp = new JButton(ap1);
		btnUp.setOpaque(false);
		btnUp.setContentAreaFilled(false);
		btnUp.setBorderPainted(false);
		btnUp.setFont(Principal.getLetratexto2());
		panelSuperior.add(btnUp);
		add(panelSuperior);

		panel = new PanelConFondo(urlImagen, false, ap2);
		panel.setBounds(0, 0, (int) tam.getWidth(), tam.height);
		add(panel);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setSize((int)tam.getWidth(), (int)tam.getHeight()/3);
		panelInferior.setOpaque(false);
		JButton btnDown = new JButton(nom);
		btnDown.setOpaque(false);
		btnDown.setContentAreaFilled(false);
		btnDown.setBorderPainted(false);
		btnDown.setFont(Principal.getLetratexto2());
		panelInferior.add(btnDown);
		add(panelInferior);

	}

	public PanelConFondo getPanel() {
		return panel;
	}

	public void setPanel(PanelConFondo panel) {
		this.panel = panel;
	}

}
