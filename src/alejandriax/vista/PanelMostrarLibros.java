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

import alejandriax.modelo.Libro;
import alejandriax.vista.cliente.MostrarLibro;

@SuppressWarnings("serial")
public class PanelMostrarLibros extends JPanel {
	
	private int contador = 0;
	private ArrayList<Component> componentes = new ArrayList<Component>();
	private JFrame ventana;
	private GridBagLayout gridBagLayout;
	
	public PanelMostrarLibros(JFrame ventana) {
		//Declaracion básica
		setOpaque(false);
		this.ventana = ventana;

		int ancho = this.getWidth();
		int tamCol = ancho/10;
		
		//Declaración del layout
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{tamCol, tamCol, tamCol, tamCol*2, tamCol, tamCol/2, tamCol/3*2, tamCol};
		gridBagLayout.rowHeights = new int[]{0, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.6, 0.6, 1.0, 0.3, 0.3, 0.1, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		//Agrega titulos
		JLabel lblCodigo = new JLabel("C\u00f3digo");
		GridBagConstraints gbc_lblCodigo = new GridBagConstraints();
		gbc_lblCodigo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigo.gridx = 0;
		gbc_lblCodigo.gridy = 0;
		add(lblCodigo, gbc_lblCodigo);
		
		JLabel lblTitulo = new JLabel("Título");
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		GridBagConstraints gbc_lblAutor = new GridBagConstraints();
		gbc_lblAutor.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutor.gridx = 2;
		gbc_lblAutor.gridy = 0;
		add(lblAutor, gbc_lblAutor);
		
		JLabel lblEditorial = new JLabel("Editorial");
		GridBagConstraints gbc_lblEditorial = new GridBagConstraints();
		gbc_lblEditorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblEditorial.gridx = 3;
		gbc_lblEditorial.gridy = 0;
		add(lblEditorial, gbc_lblEditorial);
		
		JLabel lblEdicion = new JLabel("Edici\u00f3n");
		GridBagConstraints gbc_lblEdicion = new GridBagConstraints();
		gbc_lblEdicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdicion.gridx = 4;
		gbc_lblEdicion.gridy = 0;
		add(lblEdicion, gbc_lblEdicion);
		
		JLabel lblIdioma = new JLabel("Idioma");
		GridBagConstraints gbc_lblIdioma = new GridBagConstraints();
		gbc_lblIdioma.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdioma.gridx = 5;
		gbc_lblIdioma.gridy = 0;
		add(lblIdioma, gbc_lblIdioma);
		
		JLabel lblGenero = new JLabel("G\u00e9nero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.insets = new Insets(0, 0, 5, 0);
		gbc_lblGenero.gridx = 6;
		gbc_lblGenero.gridy = 0;
		add(lblGenero, gbc_lblGenero);
		
		JLabel lblPrestado = new JLabel("Prestado");
		GridBagConstraints gbc_lblPrestado = new GridBagConstraints();
		gbc_lblPrestado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrestado.gridx = 7;
		gbc_lblPrestado.gridy = 0;
		add(lblPrestado, gbc_lblPrestado);
		
		JLabel lblVer = new JLabel("Ver");
		GridBagConstraints gbc_lblVer = new GridBagConstraints();
		gbc_lblVer.insets = new Insets(0, 0, 5, 0);
		gbc_lblVer.gridx = 8;
		gbc_lblVer.gridy = 0;
		add(lblVer, gbc_lblVer);
	}
	
	
//	JLabel lblCodigo = new JLabel("C\u00f3digo");
//	JLabel lblTitulo = new JLabel("Título");
//	JLabel lblAutor = new JLabel("Autor");
//	JLabel lblEditorial = new JLabel("Editorial");
//	JLabel lblEdicion = new JLabel("Edici\u00f3n");
//	JLabel lblIdioma = new JLabel("Idioma");
//	JLabel lblGenero = new JLabel("G\u00e9nero");
//	JLabel lblPrestado = new JLabel("Prestado");
//	JLabel lblVer = new JLabel("Ver");
	public void agregarLibro(final Libro libro){
		//Incremente contador
		contador++;
		//Declara variables
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridy = contador;
		//Agrega codigo
		JLabel lblCod = new JLabel(libro.getIdArticulo());
		componentes.add(lblCod);
		gbc.gridx = 0;
		add(lblCod, gbc);
		//Agrega titulo
		JLabel lblTitulo = new JLabel(libro.getTituloArticulo());
		componentes.add(lblTitulo);
		gbc.gridx = 1;
		add(lblTitulo, gbc);
		//Agrega autor
		JLabel lblAutor = new JLabel(libro.getAutor());
		componentes.add(lblAutor);
		gbc.gridx = 2;
		add(lblAutor, gbc);
		//Agrega editorial
		JLabel lblEditorial = new JLabel(libro.getEditorial());
		componentes.add(lblEditorial);
		gbc.gridx = 3;
		add(lblEditorial, gbc);
		//Agrega edicion
		JLabel lblEdicion = new JLabel(libro.getEdicion());
		componentes.add(lblEdicion);
		gbc.gridx = 4;
		add(lblEdicion, gbc);
		//Agrega idioma
		JLabel lblIdioma = new JLabel(libro.getIdioma());
		componentes.add(lblIdioma);
		gbc.gridx = 5;
		add(lblIdioma, gbc);
		//Agrega genero
		JLabel lblGenero = new JLabel(libro.getGenero());
		componentes.add(lblGenero);
		gbc.gridx = 6;
		add(lblGenero, gbc);
		//Verifica esta prestado el libro
		JLabel lblPrest = new JLabel(libro.estaDisponible() ? "S\u00ed" : "No");
		componentes.add(lblPrest);
		gbc.gridx = 7;
		add(lblPrest, gbc);
		//Agrega un botón para ver el libro
		JButton btn = new JButton("Ver libro");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MostrarLibro(ventana, libro).setVisible(true);
			}
		});
		componentes.add(btn);
		gbc.gridx = 8;
		add(btn, gbc);
	}
	
	public void limpiar(){
		//Eliminar todos los componentes guardados
		for(Component comp : componentes)
			gridBagLayout.removeLayoutComponent(comp);
		contador = 0;
		System.gc();
	}
}
