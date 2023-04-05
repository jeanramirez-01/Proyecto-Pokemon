package opcionesEntrenador;

import pokemon.Pokemon;

public class PcPokemon {

	private CajaPokemon[] cajas;

	public PcPokemon() {
		this.cajas = new CajaPokemon[12];
		for (int i = 0; i < 12; i++) {
			this.cajas[i] = new CajaPokemon(30);
		}
	}

	public CajaPokemon[] getCajas() {
		return cajas;
	}

	public void moverPokemonCaja(int cajaOrigen, int posicionOrigen, int cajaDestino, int posicionDestino) {

		Pokemon pokemon = this.cajas[cajaOrigen].obtenerPokemon(posicionOrigen);
		this.cajas[cajaOrigen].eliminarPokemon(posicionOrigen);
		this.cajas[cajaDestino].agregarPokemon(pokemon, posicionDestino);
	}

}
