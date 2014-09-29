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
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;

import alejandriax.Alejandriax;
import alejandriax.control.Principal;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Insets;

@SuppressWarnings("serial")
public class FotoPersona extends JPanel {

	private PanelConFondo panel;
	private JButton btn;

	public FotoPersona(String urlImagen, String ap1, String ap2, String nom) {
		this.setOpaque(false);
		Dimension tam = this.getSize();
		setForeground(SystemColor.controlHighlight);

		try {
			URL imagen = Alejandriax.class.getResource("vista/imagenes/" + urlImagen);
			BufferedImage img = ImageIO.read(imagen);
			BgBorder borde = new BgBorder( img );
			setBorder(borde);
		} catch (IOException e) {
			System.out.println("Error al cargar la imagen");
		}

		this.setOpaque(true);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{(int)tam.getWidth()};
		gridBagLayout.rowHeights = new int[]{0, (int)tam.getHeight()/3, (int)tam.getHeight()/3, (int)tam.getHeight()/3};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 0.0, 1.0};
		setLayout(gridBagLayout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);
		
		btn = new JButton(ap2);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		btn.setSize((int)tam.getWidth(), (int)tam.getHeight()/3);
		btn.setOpaque(false);
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);
		btn.setFont(Principal.getLetratexto2());
		GridBagConstraints gbc_btn = new GridBagConstraints();
		gbc_btn.insets = new Insets(0, 0, 5, 0);
		gbc_btn.anchor = GridBagConstraints.NORTHWEST;
		gbc_btn.gridx = 0;
		gbc_btn.gridy = 1;
		add(btn, gbc_btn);
		
		JButton btnUp = new JButton(ap1);
		btnUp.setHorizontalAlignment(SwingConstants.LEFT);
		btnUp.setSize((int)tam.getWidth(), (int)tam.getHeight()/3);
		btnUp.setOpaque(false);
		btnUp.setContentAreaFilled(false);
		btnUp.setBorderPainted(false);
		btnUp.setFont(Principal.getLetratexto2());
		GridBagConstraints gbc_btnUp = new GridBagConstraints();
		gbc_btnUp.insets = new Insets(0, 0, 5, 0);
		gbc_btnUp.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnUp.gridx = 0;
		gbc_btnUp.gridy = 2;
		add(btnUp, gbc_btnUp);
		
		JButton btnDown = new JButton(nom);
		btnDown.setHorizontalAlignment(SwingConstants.LEFT);
		btnDown.setVerticalAlignment(SwingConstants.TOP);
		btnDown.setSize((int)tam.getWidth(), (int)tam.getHeight()/3);
		btnDown.setOpaque(false);
		btnDown.setContentAreaFilled(false);
		btnDown.setBorderPainted(false);
		btnDown.setFont(Principal.getLetratexto2());
		GridBagConstraints gbc_btnDown = new GridBagConstraints();
		gbc_btnDown.fill = GridBagConstraints.BOTH;
		gbc_btnDown.gridx = 0;
		gbc_btnDown.gridy = 3;
		add(btnDown, gbc_btnDown);
	}

	public PanelConFondo getPanel() {
		return panel;
	}

	public void setPanel(PanelConFondo panel) {
		this.panel = panel;
	}

	public JButton getBtn() {
		return btn;
	}
}
