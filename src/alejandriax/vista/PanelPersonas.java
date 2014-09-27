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
import alejandriax.vista.cliente.MostrarPersona;

@SuppressWarnings("serial")
public class PanelPersonas extends JPanel {
	
	private int contador = 0;
	private ArrayList<Component> componentes = new ArrayList<Component>();
	private JFrame ventana;
	private GridBagLayout gridBagLayout;
	
	public PanelPersonas(JFrame ventana) {
		//Declaracion básica
		setOpaque(false);
		this.ventana = ventana;

		int ancho = this.getWidth();
		int tamCol = ancho/10;
		
		//Declaración del layout
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{tamCol, tamCol, tamCol, tamCol*2, tamCol, tamCol/2, tamCol/3*2, tamCol};
		gridBagLayout.rowHeights = new int[]{0, 10};
		gridBagLayout.columnWeights = new double[]{1.0, 0.6, 0.6, 1.0, 0.3, 0.3, 0.1, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		//Agrega titulos
		JLabel titCedula = new JLabel("Cédula");
		GridBagConstraints gbc_titCedula = new GridBagConstraints();
		gbc_titCedula.insets = new Insets(0, 0, 5, 5);
		gbc_titCedula.gridx = 0;
		gbc_titCedula.gridy = 0;
		add(titCedula, gbc_titCedula);
		
		JLabel lblPrimerApellido = new JLabel("PrimerApellido");
		GridBagConstraints gbc_lblPrimerapellido = new GridBagConstraints();
		gbc_lblPrimerapellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimerapellido.gridx = 1;
		gbc_lblPrimerapellido.gridy = 0;
		add(lblPrimerApellido, gbc_lblPrimerapellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido");
		GridBagConstraints gbc_lblSegundoApellido = new GridBagConstraints();
		gbc_lblSegundoApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblSegundoApellido.gridx = 2;
		gbc_lblSegundoApellido.gridy = 0;
		add(lblSegundoApellido, gbc_lblSegundoApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 0;
		add(lblNombre, gbc_lblNombre);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 4;
		gbc_lblTelefono.gridy = 0;
		add(lblTelefono, gbc_lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo");
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 5;
		gbc_lblCorreo.gridy = 0;
		add(lblCorreo, gbc_lblCorreo);
		
		JLabel lblPrestamos = new JLabel("Préstamos");
		GridBagConstraints gbc_lblPrestamos = new GridBagConstraints();
		gbc_lblPrestamos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrestamos.gridx = 6;
		gbc_lblPrestamos.gridy = 0;
		add(lblPrestamos, gbc_lblPrestamos);
		
		JLabel lblVer = new JLabel("Ver ");
		GridBagConstraints gbc_lblVer = new GridBagConstraints();
		gbc_lblVer.insets = new Insets(0, 0, 5, 0);
		gbc_lblVer.gridx = 7;
		gbc_lblVer.gridy = 0;
		add(lblVer, gbc_lblVer);
	}

//	private String numeroCedula;
//	private String primerApellido;
//	private String segundoApellido;
//	private String nombre;
//	protected String telefono;
//	protected String correoElectronico;
//	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	public void agregarPersona(final Persona persona){
		//Incremente contador
		contador++;
		//Declara variables
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridy = contador;
		//Agrega cedula
		JLabel lblCed = new JLabel(persona.getNumeroCedula());
		componentes.add(lblCed);
		gbc.gridx = 0;
		add(lblCed, gbc);
		//Agrega primer apellido
		JLabel lblPrimAp = new JLabel(persona.getPrimerApellido());
		componentes.add(lblPrimAp);
		gbc.gridx = 1;
		add(lblPrimAp, gbc);
		//Agrega segundo apellido
		JLabel lblSegAp = new JLabel(persona.getSegundoApellido());
		componentes.add(lblSegAp);
		gbc.gridx = 2;
		add(lblSegAp, gbc);
		//Agrega nombre
		JLabel lblNom = new JLabel(persona.getNombre());
		componentes.add(lblNom);
		gbc.gridx = 3;
		add(lblNom, gbc);
		//Agrega telefono
		JLabel lblTel = new JLabel(persona.getTelefono());
		componentes.add(lblTel);
		gbc.gridx = 4;
		add(lblTel, gbc);
		//Agrega correo electronico
		JLabel lblCorreo = new JLabel(persona.getCorreoElectronico());
		componentes.add(lblCorreo);
		gbc.gridx = 5;
		add(lblCorreo, gbc);
		//Verifica si tiene préstamos
		JLabel lblPrest = new JLabel((persona.getPrestamos().isEmpty() ? "Si" : "No"));
		componentes.add(lblPrest);
		gbc.gridx = 6;
		add(lblPrest, gbc);
		//Agrega un botón para ver la persona
		JButton btn = new JButton("Ver persona");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MostrarPersona(ventana, persona);
			}
		});
		componentes.add(btn);
		gbc.gridx = 7;
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
