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

package alejandriax.control;

import java.io.*;
import java.util.ArrayList;

import alejandriax.modelo.*;

import javax.swing.JOptionPane;

public class Lector {
	private String[] salida;

	public void cargarEstudiantes(){
		
		String linea = "";
		try{
			File nomArchivo = new File("Documentacion/Datos/Estudiantes.txt");
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Estudiante nueva = new Estudiante(salida[0], salida[1], salida[2], salida[3]);
				Principal.addEstudiante(nueva);
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Error en archivo", 
					"El archivo no existe", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void cargarFamiliares(){
		
		String linea = "";
		try{
			File nomArchivo = new File("Documentacion/Datos/Familiares.txt");
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Familiar nueva = new Familiar(salida[0], salida[1], salida[2], salida[3]);
				Principal.addFamiliar(nueva);
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Error en archivo", 
					"El archivo no existe", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void cargarColegas(){
		
		String linea = "";
		try{
			File nomArchivo = new File("Documentacion/Datos/Colega.txt");
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Colega nueva = new Colega(salida[0], salida[1], salida[2], salida[3]);
				Principal.addColega(nueva);
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Error en archivo", 
					"El archivo no existe", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void cargarLibros(){
		String linea = "";
		try{
			File nomArchivo = new File("Documentacion/Datos/Libros.txt");
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Libro nueva = new Libro(salida[0], salida[1], Integer.parseInt(salida[2]), salida[3], salida[4], salida[5]);
				Principal.addLibro(nueva);
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Error en archivo", 
					"El archivo no existe", JOptionPane.ERROR_MESSAGE);
		}
	}
}
