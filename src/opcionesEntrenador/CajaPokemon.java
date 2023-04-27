package opcionesEntrenador;

import pokemon.Pokemon;

public class CajaPokemon {

	private Pokemon[] caja;

	public CajaPokemon() {
		super();
		this.caja = new Pokemon[30];
	}

	public Pokemon[] getCaja() {
		return caja;
	}

	public void dejarPokemon(int indiceEquipo, Pokemon[] equipoEntrenador) {

		if (equipoEntrenador.length == 1) {
			System.out.println("No puedes dejar los espacios de tu equipo vacio");
			return;
		} else {
			Pokemon pokTrainer = equipoEntrenador[indiceEquipo];

			for (int i = 0; i < caja.length; i++) {
				if (caja[i] == null) {
					caja[i] = pokTrainer;
					break;
				}
			}
			equipoEntrenador[indiceEquipo] = null;
		}

	}

	public void sacarPokemon(int indiceCaja, Pokemon[] equipoEntrenador) {

		if (equipoEntrenador.length == 6) {
			System.out.println("El equipo esta completo!");
			return;
		} else if (caja[indiceCaja] == null) {
			System.out.println("El espacio seleccionado es incorrecto");
			return;
		} else {
			Pokemon salida = caja[indiceCaja];

			for (int i = 0; i < equipoEntrenador.length; i++) {
				if (equipoEntrenador[i] == null) {
					equipoEntrenador[i] = salida;
					break;
				}
			}
			caja[indiceCaja] = null;
		}

	}

	public void moverPokemonCaja(int indiceOrigen, int indiceDestino) {

		// Verificar que el índice destino u el origen sea válido
		if ((indiceDestino < 0 || indiceDestino > this.caja.length)
				|| (indiceOrigen < 0 || indiceOrigen > this.caja.length)) {
			System.out.println("El índice de origen o destino no es válido.");
			return;
		} else if (this.caja[indiceOrigen] == null) { // Verificar que haya un pokemon en el índice de origen
			System.out.println("No hay un pokemon en el índice de origen.");
			return;
		} else if (this.caja[indiceDestino] == null) { // Verificar que haya un pokemon en el índice de destino
			System.out.println("No se puede mover un pokemon a un espacio nulo");
			return;
		} else if (indiceOrigen == indiceDestino) { // Verificar que el índice de origen y destino sean distintos
			System.out.println("El índice de origen y destino son iguales.");
			return;
		} else {
			Pokemon temp = this.caja[indiceDestino];
			this.caja[indiceDestino] = this.caja[indiceOrigen];
			this.caja[indiceOrigen] = temp;
		}

	}

}
