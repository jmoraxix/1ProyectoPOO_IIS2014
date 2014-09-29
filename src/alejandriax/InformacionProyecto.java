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

package alejandriax;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import alejandriax.control.Coordinador;
import alejandriax.vista.VentanaEmergente;

/**
 * @author Jos�David 31/07/2014
 */
@SuppressWarnings("serial")
public class InformacionProyecto extends VentanaEmergente {
	private static Coordinador coordinador;

	public InformacionProyecto(JFrame padre) {
		super(padre, "Informaci\u00f3n proyecto","fondo_emergente.png" );
		setSize(880, 561);
		getContentPane().setLayout(null);
																				
																						JLabel NomProyecto = new JLabel("Biblioteca Alejandriax");
																						NomProyecto.setBounds(125, 239, 220, 22);
																						getContentPane().add(NomProyecto);
																						NomProyecto.setHorizontalAlignment(SwingConstants.CENTER);
																						NomProyecto.setFont(new Font("Consolas", Font.BOLD, 18));
																						
																								JLabel Tec = new JLabel("Instituto Tecnol\u00f3gico de Costa Rica");
																								Tec.setBounds(56, 462, 350, 22);
																								getContentPane().add(Tec);
																								Tec.setHorizontalAlignment(SwingConstants.CENTER);
																								Tec.setFont(new Font("Consolas", Font.BOLD, 18));
																								
																										JLabel Carrera = new JLabel("Ingenier\u00eda en Computaci\u00f3n");
																										Carrera.setBounds(108, 435, 250, 22);
																										getContentPane().add(Carrera);
																										Carrera.setHorizontalAlignment(SwingConstants.CENTER);
																										Carrera.setFont(new Font("Consolas", Font.BOLD, 18));
																										
																												JLabel Curso = new JLabel("Programaci\u00f3n Orientada a Objetos");
																												Curso.setBounds(71, 75, 320, 22);
																												getContentPane().add(Curso);
																												Curso.setHorizontalAlignment(SwingConstants.CENTER);
																												Curso.setFont(new Font("Consolas", Font.BOLD, 18));
																												
																														JLabel PrimProyecto = new JLabel("Primer Proyecto");
																														PrimProyecto.setBounds(159, 99, 150, 22);
																														getContentPane().add(PrimProyecto);
																														PrimProyecto.setHorizontalAlignment(SwingConstants.CENTER);
																														PrimProyecto.setFont(new Font("Consolas", Font.BOLD, 18));
																														
																																JLabel lblDiegoDelgado = new JLabel("Diego Delgado Cerdas");
																																lblDiegoDelgado.setBounds(544, 217, 200, 22);
																																getContentPane().add(lblDiegoDelgado);
																																lblDiegoDelgado.setHorizontalAlignment(SwingConstants.CENTER);
																																lblDiegoDelgado.setFont(new Font("Consolas", Font.BOLD, 18));
																																
																																		JLabel lblRogerVillalobos = new JLabel("R\u00f3ger Villalobos Rodr\u00edguez");
																																		lblRogerVillalobos.setBounds(510, 289, 260, 22);
																																		getContentPane().add(lblRogerVillalobos);
																																		lblRogerVillalobos.setHorizontalAlignment(SwingConstants.CENTER);
																																		lblRogerVillalobos.setFont(new Font("Consolas", Font.BOLD, 18));
																																		
																																				JLabel lblJosDavidMora = new JLabel("Jos\u00e9 David Mora Lor\u00eda");
																																				lblJosDavidMora.setBounds(536, 240, 210, 22);
																																				getContentPane().add(lblJosDavidMora);
																																				lblJosDavidMora.setHorizontalAlignment(SwingConstants.CENTER);
																																				lblJosDavidMora.setFont(new Font("Consolas", Font.BOLD, 18));
																																				
																																				JLabel lblDavidDiaz = new JLabel("David D\u00EDaz Aguilar");
																																				lblDavidDiaz.setBounds(549, 264, 180, 22);
																																				getContentPane().add(lblDavidDiaz);
																																				lblDavidDiaz.setHorizontalAlignment(SwingConstants.CENTER);
																																				lblDavidDiaz.setFont(new Font("Consolas", Font.BOLD, 18));
																																				
																																						JLabel Anno = new JLabel("2014");
																																						Anno.setBounds(623, 458, 40, 22);
																																						getContentPane().add(Anno);
																																						Anno.setHorizontalAlignment(SwingConstants.CENTER);
																																						Anno.setFont(new Font("Consolas", Font.BOLD, 18));
	}

	public static void setCoordinador(Coordinador coordinador) {
		InformacionProyecto.coordinador = coordinador;
	}

	public static Coordinador getCoordinador() {
		return coordinador;
	}
}