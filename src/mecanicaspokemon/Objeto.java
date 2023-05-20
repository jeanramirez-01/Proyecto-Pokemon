package mecanicaspokemon;

public class Objeto {

	public enum CategoriasBolsa {

		OBJETO, BOTIQUIN, POKEBALL;

	}

	public enum NombreObjeto {
		
		//Objeto nulo para luego actualizar el id_objeto del pokemon por si quiere cambiar de pokemon
		JOVANI_VAZQUEZ,
		// Objetos equipables
		PESA, PLUMA, CHALECO, BASTON, PILAS,
		// Objetos consumibles de vida
		POCION, SUPERPOCION, HIPERPOCION,
		// Objetos consumibles de estado
		ANTIDOTO, ANTIPARALIZADOR, DESPERTAR, ANTIQUEMAR, ANTIHIELO,
		// Tipos de pokeball
		POKE_BALL, SUPERBALL, ULTRABALL, MASTERBALL;

	}

	private NombreObjeto nombre;
	private int precio;
	private String descripcion;
	private CategoriasBolsa categoria;

	public Objeto(NombreObjeto nombre, int precio, String descripcion, CategoriasBolsa categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.categoria = categoria;
	}

	public Objeto(NombreObjeto pokeball) {
		this.nombre = pokeball;
	}

	public NombreObjeto getNombre() {
		return nombre;
	}

	public void setNombre(NombreObjeto nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public CategoriasBolsa getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriasBolsa categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", categoria="
				+ categoria + "]";
	}

}
