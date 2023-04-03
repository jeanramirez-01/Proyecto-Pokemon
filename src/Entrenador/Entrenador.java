package entrenador;

import java.util.ArrayList;
import pokemon.Pokemon;

public class Entrenador {

	private Pokemon[] equipo;
	private String nombre;
	private int pokedolares;
	ArrayList<Bolsa> bolsa;

	public Entrenador() {
		super();
		this.equipo = new Pokemon[6];
		this.nombre = "";
		this.pokedolares = (int) (Math.random() * 1000 - 800) + 800;
		this.bolsa = new ArrayList<Bolsa>();
	}

	public Entrenador(Pokemon[] equipo, String nombre, int pokedolares, ArrayList<Bolsa> bolsa) {
		super();
		this.equipo = equipo;
		this.nombre = nombre;
		this.pokedolares = pokedolares;
		this.bolsa = bolsa;
	}

	public Pokemon[] getEquipo() {
		return equipo;
	}

	public void setEquipo(Pokemon[] equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPokedolares() {
		return pokedolares;
	}

	public void setPokedolares(int pokedolares) {
		this.pokedolares = pokedolares;
	}

	public ArrayList<Bolsa> getBolsa() {
		return bolsa;
	}

	public void setBolsa(ArrayList<Bolsa> bolsa) {
		this.bolsa = bolsa;
	}

	public void moverEquipo(int indiceOrigen, int indiceDestino) {

		// Verificar que el índice destino sea válido
		if (indiceDestino < 0 || indiceDestino >= this.equipo.length) {
			System.out.println("El índice de destino es inválido.");
			return;
		}

		// Verificar que haya un pokemon en el índice de origen
		if (this.equipo[indiceOrigen] == null) {
			System.out.println("No hay un pokemon en el índice de origen.");
			return;
		}

		// Verificar que haya un pokemon en el índice de destino
		if (this.equipo[indiceDestino] == null) {
			System.out.println("No se puede mover un pokemon a un espacio nulo");
			return;
		}

		// Verificar que el índice de origen y destino sean distintos
		if (indiceOrigen == indiceDestino) {
			System.out.println("El índice de origen y destino son iguales.");
			return;
		}

		Pokemon temp = this.equipo[indiceDestino];
		this.equipo[indiceDestino] = this.equipo[indiceOrigen];
		this.equipo[indiceOrigen] = temp;

	}

}
