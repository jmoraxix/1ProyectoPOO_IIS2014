package alejandriax.vista;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import alejandriax.modelo.Persona;
import alejandriax.modelo.Prestamo;
import alejandriax.vista.cliente.MostrarLibro;
import alejandriax.vista.cliente.MostrarPrestamo;

@SuppressWarnings("serial")
public class PanelMostrarPrestamos extends JPanel {
	
	private int contador = 0;
	private ArrayList<Component> componentes = new ArrayList<Component>();
	private JFrame ventana;
	private GridBagLayout gridBagLayout;
	
	public PanelMostrarPrestamos(JFrame ventana) {
		//Declaracion básica
		setOpaque(false);
		this.ventana = ventana;

		int ancho = this.getWidth();
		int tamCol = ancho/8;
		
		//Declaración del layout
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{tamCol, tamCol, tamCol, tamCol*2, tamCol*2, tamCol};
		gridBagLayout.rowHeights = new int[]{0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		//Agrega titulos
		JLabel lblCodigo = new JLabel("C\u00f3digo");
		GridBagConstraints gbc_lblCodigo = new GridBagConstraints();
		gbc_lblCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigo.gridx = 0;
		gbc_lblCodigo.gridy = 0;
		add(lblCodigo, gbc_lblCodigo);
		
		JLabel lblFecha = new JLabel("Fecha");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		add(lblFecha, gbc_lblTitulo);
		
		JLabel lblEstado = new JLabel("Estado");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 2;
		gbc_lblAutor.gridy = 0;
		add(lblEstado, gbc_lblAutor);
		
		JLabel lblPersona = new JLabel("Persona");
		GridBagConstraints gbc_lblEditorial = new GridBagConstraints();
		gbc_lblEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditorial.gridx = 3;
		gbc_lblEditorial.gridy = 0;
		add(lblPersona, gbc_lblEditorial);
		
		JLabel lblTitArticulo = new JLabel("T\u00edtulo del art\u00edculo");
		GridBagConstraints gbc_lblEdicion = new GridBagConstraints();
		gbc_lblEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdicion.gridx = 4;
		gbc_lblEdicion.gridy = 0;
		add(lblTitArticulo, gbc_lblEdicion);
		
		JLabel lblDimitir = new JLabel("Dimitir");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 5;
		gbc_lblIdioma.gridy = 0;
		add(lblDimitir, gbc_lblIdioma);
	}
	
	public void agregarPrestamos(final Persona persona){
		for(final Prestamo prestamo : persona.getPrestamos()) {
			//Incremente contador
			contador++;
			//Declara variables
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.insets = new Insets(0, 0, 5, 0);
			gbc.gridy = contador;
			//Agrega codigo
			JLabel lblCod = new JLabel(prestamo.getCodigoPrestamo());
			componentes.add(lblCod);
			gbc.gridx = 0;
			add(lblCod, gbc);
			//Agrega fecha
			JLabel lblFecha = new JLabel(prestamo.getFechaPrestamo().toString());
			componentes.add(lblFecha);
			gbc.gridx = 1;
			add(lblFecha, gbc);
			//Agrega estado
			JLabel lblEstado = new JLabel(prestamo.getEstadoPrestamo());
			componentes.add(lblEstado);
			gbc.gridx = 2;
			add(lblEstado, gbc);
			//Agrega Persona
			JLabel lblPersona = new JLabel(persona.getNombre() + " " + persona.getPrimerApellido());
			componentes.add(lblPersona);
			gbc.gridx = 3;
			add(lblPersona, gbc);
			//Agrega titulo
			JLabel lblEdicion = new JLabel(prestamo.getArticulo().getTituloArticulo());
			componentes.add(lblEdicion);
			gbc.gridx = 4;
			add(lblEdicion, gbc);
			//Agrega btnDimitir
			JButton btn = new JButton("Dimitir");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					persona.getPrestamos().remove(prestamo);
				}
			});
			componentes.add(btn);
			gbc.gridx = 5;
			add(btn, gbc);
		}
	}
	
	public void limpiar(){
		//Eliminar todos los componentes guardados
		for(Component comp : componentes)
			gridBagLayout.removeLayoutComponent(comp);
		contador = 0;
		System.gc();
	}
}
