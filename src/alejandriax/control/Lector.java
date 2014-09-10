package alejandriax.control;

import java.io.*;
import java.util.ArrayList;
import alejandriax.modelo.*;

import javax.swing.JOptionPane;

public class Lector {
	private String[] salida;
	
	public void cargarEstudiantes(ArrayList<Estudiante> pArray){
		
		String linea = "";
		try{
			File nomArchivo = new File("Documentacion/Datos/Estudiantes.txt");
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Estudiante nueva = new Estudiante(salida[0], salida[1], salida[2], salida[3]);
				pArray.add(nueva);
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Error en archivo", 
					"El archivo no existe", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void cargarLibros(ArrayList<Libro> pArray){
		String linea = "";
		try{
			File nomArchivo = new File("Documentacion/Datos/Libros.txt");
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Libro nueva = new Libro(salida[0], salida[1], Integer.parseInt(salida[2]), salida[3], salida[4], salida[5]);
				pArray.add(nueva);
				linea = bR.readLine();
			}
			fR.close();
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, "Error en archivo", 
					"El archivo no existe", JOptionPane.ERROR_MESSAGE);
		}
	}
}
