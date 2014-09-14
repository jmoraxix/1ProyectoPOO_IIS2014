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
 * 14/09/2014
 */
package alejandriax.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import alejandriax.modelo.Colega;
import alejandriax.modelo.Libro;
import alejandriax.modelo.Persona;

/**
 * @author David
 *
 */
public class Ordenar {

	/****METODOS PARA ORDENAR LIBROS****/
	public void ordenarLibroTitulo(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getTituloArticulo().compareTo(o2.getTituloArticulo());
			}
		});
	}
	
	public void ordenarLibroId(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getIdArticulo().compareTo(o2.getIdArticulo());
			}
		});
	}
	
	public void ordenarLibroAutor(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getAutor().compareTo(o2.getAutor());
			}
		});
	}
	
	public void ordenarLibroGenero(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getGenero().compareTo(o2.getGenero());
			}
		});
	}
	
	/****METODOS PARA ORDENAR PERSONAS****/
	public static void ordenarPersonaCedula(ArrayList<Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNumeroCedula().compareTo(o2.getNumeroCedula());
			}
		});
	}
	public static void ordenarPersonaNombre(ArrayList<Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
	}
	public static void ordenarPersonaPrimerApellido(ArrayList<Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getPrimerApellido().compareTo(o2.getPrimerApellido());
			}
		});
	}
	public static void ordenarPersonaSegundoApellido(ArrayList<Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getSegundoApellido().compareTo(o2.getSegundoApellido());
			}
		});
	}
}
