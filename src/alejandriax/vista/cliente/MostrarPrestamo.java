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

	private Libro libro;
	private Coordinador coodinador;

	public MostrarPrestamo(JFrame frame, Articulo libro) {
		super(frame, libro.getTituloArticulo(), "fondo_emergente.png");
		this.libro = (Libro) libro;
		inicializarVentana();
	}

	private void inicializarVentana() {
		getContentPane().setLayout(null);

		PanelConFondo imagen = new PanelConFondo("portadas/" + libro.getImagen());
		imagen.setBounds(81, 43, 184, 256);
		getContentPane().add(imagen);

		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setBounds(347, 58, 45, 27);
		getContentPane().add(lblTtulo);

		JLabel titulo = new JLabel("");
		titulo.setText(libro.getTituloArticulo());
		titulo.setBounds(347, 86, 174, 27);
		getContentPane().add(titulo);

		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(80, 368, 79, 27);
		getContentPane().add(lblCodigo);

		JLabel codigo = new JLabel("");
		codigo.setText(libro.getIdArticulo());
		codigo.setBounds(201, 368, 115, 27);
		getContentPane().add(codigo);

		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(347, 113, 45, 27);
		getContentPane().add(lblAutor);

		JLabel autor = new JLabel("");
		autor.setText(libro.getAutor());
		autor.setBounds(347, 141, 174, 27);
		getContentPane().add(autor);

		JLabel lblEditorial = new JLabel("Editorial:");
		lblEditorial.setBounds(347, 224, 92, 27);
		getContentPane().add(lblEditorial);

		JLabel editorial = new JLabel("");
		editorial.setText(libro.getEditorial());
		editorial.setBounds(347, 252, 174, 27);
		getContentPane().add(editorial);

		JLabel genero = new JLabel("");
		genero.setText(libro.getGenero());
		genero.setBounds(347, 196, 174, 27);
		getContentPane().add(genero);

		JLabel lblGenero = new JLabel("G\u00E9nero:");
		lblGenero.setBounds(347, 168, 73, 27);
		getContentPane().add(lblGenero);

		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(347, 340, 92, 27);
		getContentPane().add(lblIdioma);

		JLabel idioma = new JLabel("");
		idioma.setText(libro.getIdioma());
		idioma.setBounds(347, 368, 174, 27);
		getContentPane().add(idioma);

		JLabel edicion = new JLabel("");
		edicion.setText(libro.getEdicion());
		edicion.setBounds(347, 307, 174, 27);
		getContentPane().add(edicion);

		JLabel lblEdicion = new JLabel("Edici\u00F3n:");
		lblEdicion.setBounds(347, 279, 92, 27);
		getContentPane().add(lblEdicion);

		PanelCalificacion panelCalificacion = new PanelCalificacion(libro);
		panelCalificacion.setBounds(81, 320, 184, 28);
		if(libro.getCalificacion() != 0)
			panelCalificacion.setCalificacion(libro.getCalificacion());
		getContentPane().add(panelCalificacion);

		PanelConFondo btnEnviarCorreo = new PanelConFondo("boton_principal.png", false, "Enviar correo");
		btnEnviarCorreo.setBounds(455, 368, 158, 49);
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
		lblCdigo.setBounds(81, 403, 92, 14);
		getContentPane().add(lblCdigo);
		
		JLabel lblEstado = new JLabel("Estado Pr\u00E9stamo");
		lblEstado.setBounds(183, 406, 82, 11);
		getContentPane().add(lblEstado);
	}

	public Coordinador getCoodinador() {
		return coodinador;
	}

	public void setCoodinador(Coordinador coodinador) {
		this.coodinador = coodinador;
	}
}
