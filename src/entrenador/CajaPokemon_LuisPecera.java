package entrenador;

import pokemon.Pokemon;

public class CajaPokemon_LuisPecera {

	private int numCajas;
	private Pokemon[][] cajas;

	public CajaPokemon_LuisPecera() {

		this.numCajas = 12;
		this.cajas = new Pokemon[5][6];
	}

	public int getNumCajas() {
		return numCajas;
	}

	public Pokemon[][] getCajas() {
		return cajas;
	}

	public void meterPokemonCaja(Pokemon pokemon, Entrenador jugador) {

	}

	public Pokemon sacarPokemonCaja(Pokemon pokemon) {

		return pokemon;
	}

	public void moverPokemonCaja(Pokemon pokemon) {

	}

}
