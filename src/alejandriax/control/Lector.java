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

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Lector {
	private String[] salida;
	FileNameExtensionFilter filtroTxt=new FileNameExtensionFilter(".txt","txt");
	
	public void cargarEstudiantes(){
		
		String linea = "";
		try{
			JFileChooser rutaArchivo = new JFileChooser();
			rutaArchivo.setFileFilter(filtroTxt);
			rutaArchivo.showOpenDialog(rutaArchivo);
			String path = rutaArchivo.getSelectedFile().getAbsolutePath();
			File nomArchivo = new File(path);
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Estudiante nueva = new Estudiante(salida[0], salida[1], salida[2], salida[3]);
				nueva.setTelefono(salida[4]);
				nueva.setCorreoElectronico(salida[5]);
				Boolean existe = false;
				for(Estudiante i : Principal.getEstudiantes()){
					if(i.getNumeroCedula().equals(nueva.getNumeroCedula())){
						existe = true;
					}
				}
				if(!existe){
					Principal.addEstudiante(nueva);
				}
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			if(!e.toString().equals("java.lang.NullPointerException")){
				JOptionPane.showMessageDialog(null, "Error en la lectura del archivo", 
				"Error en lectura", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void cargarFamiliares(){
		
		String linea = "";
		try{
			JFileChooser rutaArchivo = new JFileChooser();
			rutaArchivo.setFileFilter(filtroTxt);
			rutaArchivo.showOpenDialog(rutaArchivo);
			String path = rutaArchivo.getSelectedFile().getAbsolutePath();
			File nomArchivo = new File(path);
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Familiar nueva = new Familiar(salida[0], salida[1], salida[2], salida[3]);
				nueva.setTelefono(salida[4]);
				nueva.setCorreoElectronico(salida[5]);
				Boolean existe = false;
				for(Familiar i : Principal.getFamiliares()){
					if(i.getNumeroCedula().equals(nueva.getNumeroCedula())){
						existe = true;
					}
				}
				if(!existe){
					Principal.addFamiliar(nueva);
				}
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			if(!e.toString().equals("java.lang.NullPointerException")){
				JOptionPane.showMessageDialog(null, "Error en la lectura del archivo", 
				"Error en lectura", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void cargarColegas(){
		
		String linea = "";
		try{
			JFileChooser rutaArchivo = new JFileChooser();
			rutaArchivo.setFileFilter(filtroTxt);
			rutaArchivo.showOpenDialog(rutaArchivo);
			String path = rutaArchivo.getSelectedFile().getAbsolutePath();
			File nomArchivo = new File(path);
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Colega nueva = new Colega(salida[0], salida[1], salida[2], salida[3]);
				nueva.setTelefono(salida[4]);
				nueva.setCorreoElectronico(salida[5]);
				Boolean existe = false;
				for(Colega i : Principal.getColegas()){
					if(i.getNumeroCedula().equals(nueva.getNumeroCedula())){
						existe = true;
					}
				}
				if(!existe){
					Principal.addColega(nueva);
				}
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			if(!e.toString().equals("java.lang.NullPointerException")){
				JOptionPane.showMessageDialog(null, "Error en la lectura del archivo", 
				"Error en lectura", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void cargarLibros(){
		String linea = "";
		try{
			JFileChooser rutaArchivo = new JFileChooser();
			rutaArchivo.setFileFilter(filtroTxt);
			rutaArchivo.showOpenDialog(rutaArchivo);
			String path = rutaArchivo.getSelectedFile().getAbsolutePath();
			File nomArchivo = new File(path);
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Libro nueva = new Libro(salida[0], salida[1], salida[2], salida[3], salida[4]);
				nueva.setImagen(salida[5]);
				if(salida.length == 7){
					nueva.setEdicion(salida[6]);
				} else if(salida.length == 8){
					nueva.setEdicion(salida[6]);
					nueva.setIdioma(salida[7]);
				}
				Boolean existe = false;
				for(Libro i : Principal.getLibros()){
					if(i.getIdArticulo().equals(nueva.getIdArticulo())){
						existe = true;
					}
				}
				if(!existe){
					Principal.addLibro(nueva);
				}
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			if(!e.toString().equals("java.lang.NullPointerException")){
				JOptionPane.showMessageDialog(null, "Error en la lectura del archivo", 
				"Error en lectura", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
