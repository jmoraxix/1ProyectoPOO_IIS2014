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
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Portada extends JPanel {

	private PanelConFondo panel;
	private Dimension tam;

	public Portada(String urlImagen) {
		setLayout(new BorderLayout(0, 0));
		this.setOpaque(false);
		tam = this.getSize();
		
		inicializarPaneles();
		inicializarPanelInferiorSinColor();

		panel = new PanelConFondo("portadas/" + urlImagen, false, "");
		add(panel, BorderLayout.CENTER);
	}
	
	public Portada(String urlImagen, String color) {
		setLayout(new BorderLayout(0, 0));
		this.setOpaque(false);
		tam = this.getSize();
		
		inicializarPaneles();
		inicializarPanelInferiorConColor(color);

		panel = new PanelConFondo("portadas/" + urlImagen, false, "");
		add(panel, BorderLayout.CENTER);
	}

	private void inicializarPaneles(){
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
	}
	
	private void inicializarPanelInferiorSinColor(){
		JPanel panelInferior = new JPanel();
		panelInferior.setSize((int)tam.getWidth(), (int)tam.getHeight()/5);
		panelInferior.setOpaque(false);
		add(panelInferior, BorderLayout.SOUTH);
	}
	
	private void inicializarPanelInferiorConColor(String color){
		JPanel panelInferior = new JPanel();
		panelInferior.setSize((int)tam.getWidth(), (int)tam.getHeight()/5);
		if(color.equals("verde"))
			panelInferior.setBackground(Color.GREEN);
		else if(color.equals("amarillo"))
			panelInferior.setBackground(Color.YELLOW);
		else if(color.equals("rojo"))
			panelInferior.setBackground(Color.RED);
		add(panelInferior, BorderLayout.SOUTH);
	}

	public PanelConFondo getPanel() {
		return panel;
	}

	public void setPanel(PanelConFondo panel) {
		this.panel = panel;
	}

}
