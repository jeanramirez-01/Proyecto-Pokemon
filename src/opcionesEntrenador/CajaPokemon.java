package opcionesEntrenador;

import pokemon.Pokemon;

public class CajaPokemon {

	private String nombre;
	private Pokemon[] caja;

	public CajaPokemon() {
		super();
		this.nombre = "";
		this.caja = new Pokemon[30];
	}

	public CajaPokemon(String nombre, Pokemon[] caja) {
		super();
		this.nombre = nombre;
		this.caja = caja;
	}

	public CajaPokemon(int capacidad) {
		this.caja = new Pokemon[capacidad];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pokemon[] getCaja() {
		return caja;
	}

	public void setCaja(Pokemon[] caja) {
		this.caja = caja;
	}

	public Pokemon obtenerPokemon(int posicion) {
		return this.caja[posicion];
	}

	public void agregarPokemon(Pokemon pokemon, int posicion) {
		this.caja[posicion] = pokemon;
	}

	public void eliminarPokemon(int posicion) {
		this.caja[posicion] = null;
	}

	
	
}
