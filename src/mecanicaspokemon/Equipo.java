package mecanicaspokemon;

public class Equipo {

	private Pokemon[] equipoEntrenador;

	public Equipo() {
		super();
		this.equipoEntrenador = new Pokemon[6];
	}

	public Equipo(Pokemon[] equipoEntrenador) {
		super();
		this.equipoEntrenador = equipoEntrenador;
	}

	public Pokemon[] getEquipoEntrenador() {
		return equipoEntrenador;
	}

	public void setEquipoEntrenador(Pokemon[] equipoEntrenador) {
		this.equipoEntrenador = equipoEntrenador;
	}

	/**
	 * 
	 * 
	 */
	public void mostrarEquipo() {

		for (int i = 0; i < equipoEntrenador.length; i++) {
			if (equipoEntrenador[i] != null) {
				System.out.println(equipoEntrenador[i].getNombre() + "-Nv" + equipoEntrenador[i].getNivel() + " "
						+ equipoEntrenador[i].getSexo());
				System.out.println("PS: " + equipoEntrenador[i].getVitalidadActual() + "/"
						+ equipoEntrenador[i].getVitalidadMaxima() + " ST: " + equipoEntrenador[i].getEstaminaActual()
						+ "/" + equipoEntrenador[i].getEstaminaMaxima());

			}
		}

	}

	/**
	 * 
	 * @param pokemon
	 */
	public boolean agregarPokemon(Pokemon pokemon) {

		for (int i = 0; i < equipoEntrenador.length; i++) {

			if (equipoEntrenador[i] == null) {
				equipoEntrenador[i] = pokemon;
				return true;
			}

		}
		return false;
	}

	/**
	 * 
	 * Metodo de mover el equipo del entrenador con opcion del entrenador.
	 * 
	 * @param indiceOrigen  del pokemon que queremos mover
	 * @param indiceDestino de la posicion del pokemon donde vamos a mover el
	 *                      pokemon origen
	 */
	public void moverEquipoPokemon(int indiceOrigen, int indiceDestino) {

		// Verificar que el índice destino u el origen sea válido
		if ((indiceDestino < 0 || indiceDestino > this.equipoEntrenador.length)
				|| (indiceOrigen < 0 || indiceOrigen > this.equipoEntrenador.length)) {
			System.out.println("El índice de origen o destino no es válido.");
			return;
		} else if (this.equipoEntrenador[indiceOrigen] == null) { // Verificar que haya un pokemon en el índice de
																	// origen
			System.out.println("No hay un pokemon en el índice de origen.");
			return;
		} else if (this.equipoEntrenador[indiceDestino] == null) { // Verificar que haya un pokemon en el índice de
																	// destino
			System.out.println("No se puede mover un pokemon a un espacio nulo");
			return;
		} else if (indiceOrigen == indiceDestino) { // Verificar que el índice de origen y destino sean distintos
			System.out.println("El índice de origen y destino son iguales.");
			return;
		} else {
			Pokemon temp = this.equipoEntrenador[indiceDestino];
			this.equipoEntrenador[indiceDestino] = this.equipoEntrenador[indiceOrigen];
			this.equipoEntrenador[indiceOrigen] = temp;
		}

	}

	/**
	 * @param pokemonIndice
	 */
	public void mostrarHabilPokemon(Pokemon pokemonIndice) {

		if (pokemonIndice.getNivel() == 100) {
			System.out.println("\nHABIL. POKÉMON");
			System.out.println("\nNv." + pokemonIndice.getNivel() + " " + pokemonIndice.getNombre() + " "
					+ pokemonIndice.getSexo());
			System.out.println("PS: " + pokemonIndice.getVitalidadActual() + "/" + pokemonIndice.getVitalidadMaxima());
			System.out.println("ATAQUE: " + pokemonIndice.getAtaqueMaxima());
			System.out.println("DEFENSA: " + pokemonIndice.getDefensaMaxima());
			System.out.println("AT.ESP.: " + pokemonIndice.getAtaqueEspecialMaxima());
			System.out.println("DEF.ESP.: " + pokemonIndice.getDefensaEspecialMaxima());
			System.out.println("VELOCID.: " + pokemonIndice.getVelocidadMaxima());
			System.out.println("EXPERIENCIA PUNTOS EXP. " + pokemonIndice.getExperienciaTotal());
			System.out.println("SIG. NIVEL 0");
		} else {
			System.out.println("\nHABIL. POKÉMON");
			System.out.println("\nNv." + pokemonIndice.getNivel() + " " + pokemonIndice.getNombre() + " "
					+ pokemonIndice.getSexo());
			System.out.println("PS: " + pokemonIndice.getVitalidadActual() + "/" + pokemonIndice.getVitalidadMaxima());
			System.out.println("ATAQUE: " + pokemonIndice.getAtaqueMaxima());
			System.out.println("DEFENSA: " + pokemonIndice.getDefensaMaxima());
			System.out.println("AT.ESP.: " + pokemonIndice.getAtaqueEspecialMaxima());
			System.out.println("DEF.ESP.: " + pokemonIndice.getDefensaEspecialMaxima());
			System.out.println("VELOCID.: " + pokemonIndice.getVelocidadMaxima());
			System.out.println("EXPERIENCIA PUNTOS EXP. " + pokemonIndice.getExperienciaTotal());
			System.out.println(
					"SIG. NIVEL " + (pokemonIndice.getExperienciaTotal() - pokemonIndice.getExperienciaActual()));
		}

	}

	/**
	 * @param pokemonIndice
	 */
	public void mostrarMovConocidos(Pokemon pokemonIndice) {
		Movimiento[] tipo2 = pokemonIndice.getMovimientos();
		System.out.println("\nMOV. CONOCIDOS");
		System.out.println(
				"\nNv." + pokemonIndice.getNivel() + " " + pokemonIndice.getNombre() + " " + pokemonIndice.getSexo());
		for (int i = 0; i < tipo2.length; i++) {
			if (tipo2[i] != null) {
				TipoPokemon tipos = tipo2[i].getTipoMovimiento();
				System.out.println(
						tipos.getNombre() + " " + tipo2[i].getNombre() + " CS: " + tipo2[i].getCostoEstamina());
			}
		}
	}
}
