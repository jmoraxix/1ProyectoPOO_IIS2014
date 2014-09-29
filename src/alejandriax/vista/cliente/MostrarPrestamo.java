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
 * 13/09/2014
 */
package alejandriax.vista.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import alejandriax.control.Coordinador;
import alejandriax.control.Principal;
import alejandriax.modelo.Articulo;
import alejandriax.modelo.Libro;
import alejandriax.modelo.Persona;
import alejandriax.modelo.Prestamo;
import alejandriax.vista.PanelCalificacion;
import alejandriax.vista.PanelConFondo;
import alejandriax.vista.VentanaEmergente;

/**
 * @author Jos�David 13/09/2014
 */
@SuppressWarnings("serial")
public class MostrarPrestamo extends VentanaEmergente {

	private Persona persona;
	private Prestamo prestamo;
	private Libro libro;
	private Coordinador coodinador;

	public MostrarPrestamo(JFrame frame, Persona persona, Prestamo prestamo) {
		super(frame, prestamo.getArticulo().getTituloArticulo(), "fondo_emergente.png", 650, 495);
		this.persona = persona;
		this.prestamo = prestamo;
		this.libro = (Libro) prestamo.getArticulo();
		inicializarVentana();
	}

	public void inicializarVentana() {
		getContentPane().setLayout(null);

		PanelConFondo imagen = new PanelConFondo("portadas/" + libro.getImagen());
		imagen.setBounds(81, 43, 184, 256);
		getContentPane().add(imagen);

		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(350, 74, 45, 27);
		getContentPane().add(lblTtulo);

		JLabel titulo = new JLabel("");
		titulo.setText(libro.getTituloArticulo());
		titulo.setBounds(350, 102, 174, 27);
		getContentPane().add(titulo);

		JLabel lblCodigo = new JLabel("Código libro:");
		lblCodigo.setBounds(61, 340, 99, 27);
		getContentPane().add(lblCodigo);

		JLabel codigolibro = new JLabel("");
		codigolibro.setText(libro.getIdArticulo());
		codigolibro.setBounds(172, 340, 115, 27);
		getContentPane().add(codigolibro);

		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(350, 129, 45, 27);
		getContentPane().add(lblAutor);

		JLabel autor = new JLabel("");
		autor.setText(libro.getAutor());
		autor.setBounds(350, 157, 174, 27);
		getContentPane().add(autor);

		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setBounds(350, 240, 92, 27);
		getContentPane().add(lblEditorial);

		JLabel editorial = new JLabel("");
		editorial.setText(libro.getEditorial());
		editorial.setBounds(350, 268, 174, 27);
		getContentPane().add(editorial);

		JLabel genero = new JLabel("");
		genero.setText(libro.getGenero());
		genero.setBounds(350, 212, 174, 27);
		getContentPane().add(genero);

		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setBounds(350, 184, 73, 27);
		getContentPane().add(lblGenero);

		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(350, 356, 92, 27);
		getContentPane().add(lblIdioma);

		JLabel idioma = new JLabel("");
		idioma.setText(libro.getIdioma());
		idioma.setBounds(350, 384, 174, 27);
		getContentPane().add(idioma);

		JLabel edicion = new JLabel("");
		edicion.setText(libro.getEdicion());
		edicion.setBounds(350, 323, 174, 27);
		getContentPane().add(edicion);

		JLabel lblEdicion = new JLabel("Edici\u00F3n:");
		lblEdicion.setBounds(350, 295, 92, 27);
		getContentPane().add(lblEdicion);

		PanelCalificacion panelCalificacion = new PanelCalificacion(libro);
		panelCalificacion.setBounds(81, 307, 184, 28);
		if(libro.getCalificacion() != 0)
			panelCalificacion.setCalificacion(libro.getCalificacion());
		getContentPane().add(panelCalificacion);

		PanelConFondo btnEnviarCorreo = new PanelConFondo("boton_principal.png", false, "Enviar correo");
		btnEnviarCorreo.setBounds(458, 384, 158, 49);
		btnEnviarCorreo.getBtn().setFont(Principal.getLetratexto3());
		btnEnviarCorreo.getBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(Persona p : Principal.getPersonas()){
					for(Prestamo prestamo : p.getPrestamos())
						if(prestamo.getArticulo().getIdArticulo().equals(libro.getIdArticulo()))
							new EnviarCorreo(null, p.getCorreoElectronico()).setVisible(true);
				}
			}
		});
		getContentPane().add(btnEnviarCorreo);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo Pr\u00E9stamo:");
		lblCdigo.setBounds(61, 374, 126, 15);
		getContentPane().add(lblCdigo);
		
		JLabel lblEstado = new JLabel("Estado Préstamo:");
		lblEstado.setBounds(61, 402, 126, 15);
		getContentPane().add(lblEstado);
		
		JLabel codigoPrestamo = new JLabel(prestamo.getCodigoPrestamo());
		codigoPrestamo.setBounds(195, 374, 126, 15);
		getContentPane().add(codigoPrestamo);
		
		JLabel estadoPrestamo = new JLabel(prestamo.getEstadoPrestamo());
		estadoPrestamo.setBounds(195, 402, 126, 15);
		getContentPane().add(estadoPrestamo);
		
		JLabel lblPersona = new JLabel("Persona:");
		lblPersona.setBounds(350, 28, 92, 27);
		getContentPane().add(lblPersona);
		
		JLabel persona = new JLabel(this.persona.getNombre() + " " + this.persona.getPrimerApellido());
		persona.setBounds(350, 56, 174, 27);
		getContentPane().add(persona);
	}

	public Coordinador getCoodinador() {
		return coodinador;
	}

	public void setCoodinador(Coordinador coodinador) {
		this.coodinador = coodinador;
	}
}
