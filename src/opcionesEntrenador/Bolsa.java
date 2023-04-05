package opcionesEntrenador;

import java.util.ArrayList;
import entrenador.Objeto;
import pokemon.Pokemon;

public class Bolsa {

	private int cantidadObjetos;
	private String nombre;
	private String descripcion;
	private ArrayList<Objeto> objeto;

	public Bolsa() {
		super();
		this.cantidadObjetos = 0;
		this.nombre = "";
		this.descripcion = "";
		this.objeto = new ArrayList<Objeto>();
	}

	public Bolsa(int cantidadObjetos, String nombre, String descripcion, ArrayList<Objeto> objeto) {
		super();
		this.cantidadObjetos = cantidadObjetos;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.objeto = objeto;
	}

	public int getCantidadObjetos() {
		return cantidadObjetos;
	}

	public void setCantidadObjetos(int cantidadObjetos) {
		this.cantidadObjetos = cantidadObjetos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Objeto> getObjeto() {
		return objeto;
	}
	
	// Métodos equipar y quitar Objeto.
	
	 public void agregarObjeto(Objeto objeto) {
	        this.objeto.add(objeto);
	    }
	
	
}
