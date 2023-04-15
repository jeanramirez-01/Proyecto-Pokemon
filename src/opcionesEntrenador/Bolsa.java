package opcionesEntrenador;

import java.util.ArrayList;
import tienda.ObjetoConsumible;
import tienda.ObjetoEquipable;

public class Bolsa {

	private int cantidadObjetos;
	private String nombre;
	private String descripcion;
	private ArrayList<ObjetoEquipable> objetoEquipable;
	private ArrayList<ObjetoConsumible> objetoConsumible;

	public Bolsa() {
		super();
		this.cantidadObjetos = 0;
		this.nombre = "";
		this.descripcion = "";
		this.objetoEquipable = new ArrayList<ObjetoEquipable>();
		this.objetoConsumible = new ArrayList<ObjetoConsumible>();
	}

	public Bolsa(int cantidadObjetos, String nombre, String descripcion, ArrayList<ObjetoEquipable> objetoEquipable,
			ArrayList<ObjetoConsumible> objetoConsumible) {
		super();
		this.cantidadObjetos = cantidadObjetos;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.objetoEquipable = objetoEquipable;
		this.objetoConsumible = objetoConsumible;
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

	public ArrayList<ObjetoEquipable> getObjetoEquipable() {
		return objetoEquipable;
	}

	public void setObjetoEquipable(ArrayList<ObjetoEquipable> objetoEquipable) {
		this.objetoEquipable = objetoEquipable;
	}

	public ArrayList<ObjetoConsumible> getObjetoConsumible() {
		return objetoConsumible;
	}

	public void setObjetoConsumible(ArrayList<ObjetoConsumible> objetoConsumible) {
		this.objetoConsumible = objetoConsumible;
	}

	// Métodos equipar y quitar Objeto.
	public void agregarObjeto(ObjetoEquipable objeto) {
		this.objetoEquipable.add(objeto);
	}

}
