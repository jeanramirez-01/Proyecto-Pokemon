package entrenador;

import java.util.Arrays;
import opcionesEntrenador.Bolsa;
import opcionesEntrenador.Entrenamiento;
import opcionesEntrenador.PcPokemon;
import pokemon.Pokemon;

public class Entrenador {

	private Pokemon[] equipo;
	private String nombre;
	private int pokedolares;
	private Bolsa bolsa;
	private PcPokemon caja;

	public Entrenador() {
		super();
		this.equipo = new Pokemon[6];
		this.nombre = "";
		this.pokedolares = (int) (Math.random() * 1000 - 800) + 800;
		this.bolsa = new Bolsa();
	}

	public Entrenador(Pokemon[] equipo, String nombre, int pokedolares, Bolsa bolsa, PcPokemon caja) {
		super();
		this.equipo = equipo;
		this.nombre = nombre;
		this.pokedolares = pokedolares;
		this.bolsa = bolsa;
		this.caja = caja;
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

	public Bolsa getBolsa() {
		return bolsa;
	}

	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}

	public PcPokemon getCaja() {
		return caja;
	}

	public void setCaja(PcPokemon caja) {
		this.caja = caja;
	}

	@Override
	public String toString() {
		return "Entrenador [equipo=" + Arrays.toString(equipo) + ", nombre=" + nombre + ", pokedolares=" + pokedolares
				+ ", bolsa=" + bolsa + ", caja=" + caja + "]";
	}

	// Metodos de entrenador--------------------------------------------------------

	/**
	 * Metodo de aplicar el efecto del objeto de cada pokemon del equipo del
	 * entrenador, que mientras ningun pokemon del equipo sea nulo le aplicaria el
	 * afecto del pokemon
	 */

	public void aplicarEfectoObjetoEquipoPokemon() {

		for (int i = 0; i < this.equipo.length; i++) {

			if (this.equipo[i] != null) {
				this.equipo[i].aplicarEfectoObjeto();
			}
		}

	}
	
	public void curarEquipo() {
		
		for (int i = 0; i < equipo.length; i++) {
			if (this.equipo[i] != null) {
				this.equipo[i].recuperarTotal();;
			}
		}
		
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
		if ((indiceDestino < 0 || indiceDestino >= this.equipo.length)
				|| (indiceOrigen < 0 || indiceOrigen >= this.equipo.length)) {
			System.out.println("El índice de origen o destino no es inválido.");
			return;
		} else if (this.equipo[indiceOrigen] == null) { // Verificar que haya un pokemon en el índice de origen
			System.out.println("No hay un pokemon en el índice de origen.");
			return;
		} else if (this.equipo[indiceDestino] == null) { // Verificar que haya un pokemon en el índice de destino
			System.out.println("No se puede mover un pokemon a un espacio nulo");
			return;
		} else if (indiceOrigen == indiceDestino) { // Verificar que el índice de origen y destino sean distintos
			System.out.println("El índice de origen y destino son iguales.");
			return;
		} else {
			Pokemon temp = this.equipo[indiceDestino];
			this.equipo[indiceDestino] = this.equipo[indiceOrigen];
			this.equipo[indiceOrigen] = temp;
		}

	}

	public void meterPokemonCaja(int indicePokemon) {

		if (indicePokemon < 0 || indicePokemon >= this.equipo.length)
			System.out.println("El pokemon seleccionado no es valido");
//		}else if (condition) {
//			
//		}

	}

	public void sacarPokemonCaja(int indicePokemon) {

	}

	/**
	 * Metodo de entrenar pokemon, que le pasamos 3 parametros en el cual de primera
	 * condicion si el pokemon tiene algun objeto equipado entonces no puede
	 * realizar el entranamiento. Seguido tenemos un bucle en el cual se repetira el
	 * entrenamiento el numero de x veces que el jugador nos pase
	 * 
	 * @param indicePokemon:       el numero del array del equipo pokemon del
	 *                             jugador
	 * @param tipoEntrenamiento:   sera el entranamiento que nos pase
	 * @param numEntramientoVeces: el numero de entranamientos que quiere volver a
	 *                             realizar
	 */

	public void entrenarPokemon(int indicePokemon, Entrenamiento tipoEntrenamiento, int numEntramientoVeces) {

		int costoEntrenamiento = 0;
		int puntosAumento = 5;

		if (this.equipo[indicePokemon].tieneObjeto()) {
			System.out.println("No puedes entrenar a este Pokémon porque tiene un objeto equipado.");
			return;
		}

		// Bucle para repetir el numero de entrenamientos quiere el entrenador
		for (int i = 0; i < numEntramientoVeces; i++) {
			switch (tipoEntrenamiento.getTipo()) {
			case PESADO:
				// Verificamos que el pokemon tiene el nivel suficiente para el entrenamiento
				if (this.equipo[indicePokemon].getNivel() < 20) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo[indicePokemon].getNivel() * 20;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo[indicePokemon].setDefensa(this.equipo[indicePokemon].getDefensa() + puntosAumento);
						this.equipo[indicePokemon]
								.setDefensaEspecial(this.equipo[indicePokemon].getDefensaEspecial() + puntosAumento);
						this.equipo[indicePokemon]
								.setVitalidadMaxima(this.equipo[indicePokemon].getVitalidadMaxima() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);
						break;
					}
				}
			case FURIOSO:
				if (this.equipo[indicePokemon].getNivel() < 40) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo[indicePokemon].getNivel() * 20;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo[indicePokemon].setAtaque(this.equipo[indicePokemon].getAtaque() + puntosAumento);
						this.equipo[indicePokemon]
								.setAtaqueEspecial(this.equipo[indicePokemon].getAtaqueEspecial() + puntosAumento);
						this.equipo[indicePokemon]
								.setVelocidad(this.equipo[indicePokemon].getVelocidad() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);
						break;
					}
				}
			case FUNCIONAL:
				if (this.equipo[indicePokemon].getNivel() < 60) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo[indicePokemon].getNivel() * 40;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo[indicePokemon].setAtaque(this.equipo[indicePokemon].getAtaque() + puntosAumento);
						this.equipo[indicePokemon].setDefensa(this.equipo[indicePokemon].getDefensa() + puntosAumento);
						this.equipo[indicePokemon]
								.setVitalidadMaxima(this.equipo[indicePokemon].getVitalidadMaxima() + puntosAumento);
						this.equipo[indicePokemon]
								.setVelocidad(this.equipo[indicePokemon].getVelocidad() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);
						break;
					}
				}
			case ONIRICO:
				if (this.equipo[indicePokemon].getNivel() < 60) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo[indicePokemon].getNivel() * 40;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo[indicePokemon]
								.setAtaqueEspecial(this.equipo[indicePokemon].getAtaqueEspecial() + puntosAumento);
						this.equipo[indicePokemon]
								.setDefensaEspecial(this.equipo[indicePokemon].getDefensaEspecial() + puntosAumento);
						this.equipo[indicePokemon]
								.setVitalidadMaxima(this.equipo[indicePokemon].getVitalidadMaxima() + puntosAumento);
						this.equipo[indicePokemon]
								.setVelocidad(this.equipo[indicePokemon].getVelocidad() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);
						break;
					}
				}
			default:
				System.out.println("Tipo de entrenamiento inválido.");
				return;
			}
		}

		System.out.println("Has gastado " + costoEntrenamiento * numEntramientoVeces + " Pokédolares para entrenar a "
				+ this.equipo[indicePokemon].getNombre() + ".");
		System.out.println(this.equipo[indicePokemon].getNombre() + " ha aumentado sus estadísticas.");
	}

}
