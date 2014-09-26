package alejandriax.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Portada extends JPanel {
	
	private PanelConFondo panel;
		
	public Portada(String urlImagen) {
		setLayout(new BorderLayout(0, 0));
		this.setOpaque(false);
		
		Dimension tam = this.getSize();
		
		JPanel panelIzquierda = new JPanel();
		panelIzquierda.setSize((int)tam.getWidth()/3, (int)tam.getHeight());
		panelIzquierda.setOpaque(false);
		add(panelIzquierda, BorderLayout.WEST);
		
		JPanel panelDerecha = new JPanel();
		panelDerecha.setSize((int)tam.getWidth()/3, (int)tam.getHeight());
		panelDerecha.setOpaque(false);
		add(panelDerecha, BorderLayout.EAST);
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setSize((int)tam.getWidth(), (int)tam.getHeight()/5);
		panelSuperior.setOpaque(false);
		add(panelSuperior, BorderLayout.NORTH);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setSize((int)tam.getWidth(), (int)tam.getHeight()/5);
		panelInferior.setOpaque(false);
		add(panelInferior, BorderLayout.SOUTH);
		
		panel = new PanelConFondo("portadas/" + urlImagen, false, "");
		add(panel, BorderLayout.CENTER);

	}

	public PanelConFondo getPanel() {
		return panel;
	}

	public void setPanel(PanelConFondo panel) {
		this.panel = panel;
	}

}
