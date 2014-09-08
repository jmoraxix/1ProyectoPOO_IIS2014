package alejandriax.control;

import java.io.*;
import java.util.ArrayList;
import alejandriax.modelo.*;

import javax.swing.JOptionPane;

public class Lector {
	private String[] salida;
	
	public void cargarPersonas(ArrayList<Persona> pArray){
		
		String linea = "";
		try{
			File nomArchivo = new File("Persona.txt");
			FileReader fR = new FileReader(nomArchivo);
			BufferedReader bR = new BufferedReader(fR);
			
			linea = bR.readLine();
			while(linea!=null){
				salida = linea.split(";");
				Persona nueva = new Persona(salida[0], salida[1], salida[2], salida[3]);
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
