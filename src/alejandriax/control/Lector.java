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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import alejandriax.modelo.Articulo;
import alejandriax.modelo.Colega;
import alejandriax.modelo.Estudiante;
import alejandriax.modelo.Familiar;
import alejandriax.modelo.Libro;
import alejandriax.modelo.Persona;
import alejandriax.modelo.Prestamo;

public class Lector {
	private static String[] salida;
	private static String linea = "";
	FileNameExtensionFilter filtroTxt=new FileNameExtensionFilter(".txt","txt");
	
	public void cargarEstudiantes(){
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
	
	@SuppressWarnings("deprecation")
	public void cargarPrestamos(){
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
		
				Boolean existeArt = false;
				Articulo articulo = null;
				for(Libro i : Principal.getLibros()){
					if(i.getIdArticulo().equals(salida[5])){
						existeArt = true;
						articulo = i;
					}
				}
				
				Boolean existePer = false;
				Persona persona = null;
				for(Persona p : Principal.getPersonas()){
					if(p.getNumeroCedula().equals(salida[6])){
						Boolean existePrestamo = false;
						for(Prestamo prestamo : p.getPrestamos())
							if(prestamo.getCodigoPrestamo().equals(salida[0]))
								existePrestamo = true;
						if(!existePrestamo){
							existePer = true;
							persona = p;
						}
					}
				}
				
				if(existeArt && existePer){
					if (articulo.estaDisponible()) {
						Prestamo nueva = new Prestamo(salida[0], new Date(
								Integer.parseInt(salida[1]),
								Integer.parseInt(salida[2]),
								Integer.parseInt(salida[3])), salida[4],
								articulo);
						persona.addPrestamos(nueva);
					}
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
