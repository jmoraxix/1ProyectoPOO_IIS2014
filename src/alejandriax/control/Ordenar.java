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

import alejandriax.modelo.Libro;
import alejandriax.modelo.Persona;
import alejandriax.modelo.Prestamo;

/**
 * @author David
 *
 */
public class Ordenar {

	/****METODOS PARA ORDENAR LIBROS****/
	public static void ordenarLibroTitulo(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getTituloArticulo().compareTo(o2.getTituloArticulo());
			}
		});
	}
	
	public static void ordenarLibroCodigo(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getIdArticulo().compareTo(o2.getIdArticulo());
			}
		});
	}
	
	public static void ordenarLibroAutor(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getAutor().compareTo(o2.getAutor());
			}
		});
	}
	
	public static void ordenarLibroGenero(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getGenero().compareTo(o2.getGenero());
			}
		});
	}
	
	public static void ordenarLibroEditorial(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getEditorial().compareTo(o2.getEditorial());
			}
		});
	}
	
	public static void ordenarLibroEdicion(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getEdicion().compareTo(o2.getEdicion());
			}
		});
	}
	
	public static void ordenarLibroIdioma(ArrayList<Libro> pArray){
		Collections.sort(pArray, new Comparator<Libro>(){
			@Override
			public int compare(Libro o1, Libro o2) {
				return o1.getIdioma().compareTo(o2.getIdioma());
			}
		});
	}
	
	/****METODOS PARA ORDENAR PERSONAS****/
	public static void ordenarPersonaCedula(ArrayList<? extends Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNumeroCedula().compareTo(o2.getNumeroCedula());
			}
		});
	}
	public static void ordenarPersonaNombre(ArrayList<? extends Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
	}
	public static void ordenarPersonaPrimerApellido(ArrayList<? extends Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getPrimerApellido().compareTo(o2.getPrimerApellido());
			}
		});
	}
	public static void ordenarPersonaSegundoApellido(ArrayList<? extends Persona> pArray){
		Collections.sort(pArray, new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getSegundoApellido().compareTo(o2.getSegundoApellido());
			}
		});
	}
	/****METODOS PARA ORDENAR PRESTAMOS****/
	public static void ordenarPrestamoCodigo(ArrayList<? extends Prestamo> pArray){
		Collections.sort(pArray, new Comparator<Prestamo>(){
			@Override
			public int compare(Prestamo o1, Prestamo o2) {
				return o1.getCodigoPrestamo().compareTo(o2.getCodigoPrestamo());
			}
		});
	}
	public static void ordenarPrestamoFecha(ArrayList<? extends Prestamo> pArray){
		Collections.sort(pArray, new Comparator<Prestamo>(){
			@Override
			public int compare(Prestamo o1, Prestamo o2) {
				return o1.getFechaPrestamo().compareTo(o2.getFechaPrestamo());
			}
		});
	}
	public static void ordenarPrestamoEstado(ArrayList<? extends Prestamo> pArray){
		Collections.sort(pArray, new Comparator<Prestamo>(){
			@Override
			public int compare(Prestamo o1, Prestamo o2) {
				return o1.getEstadoPrestamo().compareTo(o2.getEstadoPrestamo());
			}
		});
	}
	public static void ordenarPrestamoNombreArticulo(ArrayList<? extends Prestamo> pArray){
		Collections.sort(pArray, new Comparator<Prestamo>(){
			@Override
			public int compare(Prestamo o1, Prestamo o2) {
				return o1.getArticulo().getTituloArticulo().compareTo(o2.getArticulo().getTituloArticulo());
			}
		});
	}
}
