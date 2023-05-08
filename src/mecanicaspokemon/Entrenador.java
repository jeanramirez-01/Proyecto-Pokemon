package mecanicaspokemon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Entrenador {

	private int idEntrenador;
	private Equipo equipo;
	private String nombre;
	private int edad;
	private String sexo;
	private int pokecuarto;
	private Bolsa bolsa;
	private LinkedList<Pokemon> caja;
	private Pokedex pokedex;

	public Entrenador(String name, int edad, String sexo, int pokedolares) {
		this.nombre = name;
		this.edad = edad;
		this.sexo = sexo;
		this.pokecuarto = pokedolares;

	}

	public Entrenador(int id, Equipo equipo, String nombre, int pokedolares, Bolsa bolsa, LinkedList<Pokemon> caja,
			Pokedex pokedex) {
		super();
		this.idEntrenador = id;
		this.equipo = equipo;
		this.nombre = nombre;
		this.pokecuarto = pokedolares;
		this.bolsa = bolsa;
		this.caja = caja;
		this.pokedex = pokedex;
	}

	public int getIdEntrenador() {
		return idEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador = idEntrenador;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPokedolares() {
		return pokecuarto;
	}

	public void setPokedolares(int pokedolares) {
		this.pokecuarto = pokedolares;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}

	public LinkedList<Pokemon> getCaja() {
		return caja;
	}

	public void setCaja(LinkedList<Pokemon> caja) {
		this.caja = caja;
	}

	public Pokedex getPokedex() {
		return pokedex;
	}

	public void setPokedex(Pokedex pokedex) {
		this.pokedex = pokedex;
	}

	// Metodos de entrenador--------------------------------------------------------

	/**
	 *
	 * @param indice
	 */

	public void menu(int indice) {

		switch (indice) {
		case 1:
			pokedex.mostrarPokedex(); // Mostrar la pokedex
			break;
		case 2:
			equipo.mostrarEquipo(); // Mostrar el equipo
			break;
		case 3:
			bolsa.mostrarBolsa(); // Mostrar la bolsa
			break;
		case 4:
			mostrarTarjetaEntrenador(); // Mostrar la tarjeta del entrenador
			break;
		case 5: // Salir
			return;

		}

	}

	/**
	 * Metodo de aplicar el efecto del objeto de cada pokemon del equipo del
	 * entrenador, que mientras ningun pokemon del equipo sea nulo le aplicaria el
	 * afecto del pokemon
	 */

	public void aplicarEfectoObjetoEquipoPokemon() {

		for (int i = 0; i < this.equipo.getEquipoEntrenador().length; i++) {

			if (this.equipo.getEquipoEntrenador()[i] != null) {
				this.equipo.getEquipoEntrenador()[i].aplicarEfectoObjeto();
			}
		}

	}

	/**
	 * 
	 */

	public void curarEquipo() {

		for (int i = 0; i < equipo.getEquipoEntrenador().length; i++) {
			if (this.equipo.getEquipoEntrenador()[i] != null) {
				this.equipo.getEquipoEntrenador()[i].recuperarTotal();
			}
		}

	}

	/**
	 * Metodo de entrenar pokemon, que le pasamos 3 parametros en el cual de primera
	 * condicion si el pokemon tiene algun objeto equipado entonces no puede
	 * realizar el entranamiento. Seguido tenemos un bucle en el cual se repetira el
	 * entrenamiento el numero de x veces que el jugador nos pase
	 * 
	 * @param indicePokemon:       el numero del array del equipo pokemon del
	 *                             jugador
	 * @param tipoEntrenamiento:   sera el entrenamiento que nos pase
	 * @param numEntramientoVeces: el numero de entranamientos que quiere volver a
	 *                             realizar
	 */

	public void entrenarPokemon(int indicePokemon, Entrenamiento tipoEntrenamiento, int numEntramientoVeces) {

		int costoEntrenamiento = 0;
		int puntosAumento = 5;

		if (this.equipo.getEquipoEntrenador()[indicePokemon].tieneObjeto()) {
			System.out.println("No puedes entrenar a este Pokémon porque tiene un objeto equipado.");
			return;
		}

		// Bucle para repetir el numero de entrenamientos quiere el entrenador
		for (int i = 0; i < numEntramientoVeces; i++) {
			switch (tipoEntrenamiento.getTipo()) {
			case PESADO:
				// Verificamos que el pokemon tiene el nivel suficiente para el entrenamiento
				if (this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() < 20) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() * 20;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo.getEquipoEntrenador()[indicePokemon].setDefensaMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getDefensaMaxima() + puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setDefensaEspecialMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getDefensaEspecialMaxima()
										+ puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setVitalidadMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getVitalidadMaxima() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);

						this.equipo.getEquipoEntrenador()[indicePokemon].recuperarEstadisticas();
						break;
					}
				}
			case FURIOSO:
				if (this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() < 40) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() * 20;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo.getEquipoEntrenador()[indicePokemon].setAtaqueMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getAtaqueMaxima() + puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setAtaqueEspecialMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getAtaqueEspecialMaxima()
										+ puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setVelocidadMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getVelocidadMaxima() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);
						this.equipo.getEquipoEntrenador()[indicePokemon].recuperarEstadisticas();
						break;
					}
				}
			case FUNCIONAL:
				if (this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() < 60) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() * 40;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo.getEquipoEntrenador()[indicePokemon].setAtaqueMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getAtaqueMaxima() + puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setDefensaMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getDefensaMaxima() + puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setVitalidadMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getVitalidadMaxima() + puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setVelocidadMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getVelocidadMaxima() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);
						this.equipo.getEquipoEntrenador()[indicePokemon].recuperarEstadisticas();
						break;
					}
				}
			case ONIRICO:
				if (this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() < 60) {
					System.out.println("No se puede realizar el entrenamiento, tu pokemon todavia no esta preparado");
					return;
				} else {
					costoEntrenamiento = this.equipo.getEquipoEntrenador()[indicePokemon].getNivel() * 40;
					if (getPokedolares() < costoEntrenamiento) {
						System.out.println("No tienes suficientes Pokédolares para entrenar a este Pokémon.");
						return;
					} else {
						this.equipo.getEquipoEntrenador()[indicePokemon].setAtaqueEspecialMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getAtaqueEspecialMaxima()
										+ puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setDefensaEspecialMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getDefensaEspecialMaxima()
										+ puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setVitalidadMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getVitalidadMaxima() + puntosAumento);
						this.equipo.getEquipoEntrenador()[indicePokemon].setVelocidadMaxima(
								this.equipo.getEquipoEntrenador()[indicePokemon].getVelocidadMaxima() + puntosAumento);
						setPokedolares(getPokedolares() - costoEntrenamiento);
						this.equipo.getEquipoEntrenador()[indicePokemon].recuperarEstadisticas();
						break;
					}
				}
			default:
				System.out.println("Tipo de entrenamiento inválido.");
				return;
			}
		}

		System.out.println("Has gastado " + costoEntrenamiento * numEntramientoVeces + " Pokédolares para entrenar a "
				+ this.equipo.getEquipoEntrenador()[indicePokemon].getNombre() + ".");
		System.out.println(
				this.equipo.getEquipoEntrenador()[indicePokemon].getNombre() + " ha aumentado sus estadísticas.");
	}

	/**
	 * 
	 */
	public void capturar() {
		int indice = 0;
		bolsa.quitarObjeto(equipo.getEquipoEntrenador()[indice]);
	}

	/**
	 * 
	 * @param padre
	 * @param madre
	 */
	public void crianzaPokemon(Pokemon padre, Pokemon madre) {

		Pokemon crianza = new Pokemon();

		crianza.generarInfoCrianza(padre, madre);

		if (equipo.agregarPokemon(crianza)) {
			System.out.println(crianza.getNombre() + " se ha añadido al equipo.");
		} else {
			// Si el equipo del entrenador está lleno, agrega el Pokémon a la caja
			for (int j = 0; j < caja.size(); j++) {
				if (caja.get(j) == null) {
					caja.add(crianza);
					System.out.println("Su equipo está lleno, entonces se ha guardado el Pokémon " + crianza.getMote()
							+ " al PC.");
					return;
				}
			}
		}

	}

	public void mostrarPc() {

		for (int i = 0; i < caja.size(); i++) {
			if (caja.get(i) != null) {
				System.out.println(i + ".-" + caja.get(i).getMote());
				mostrarStats(caja.get(i));
			}

		}

	}

	/**
	 * 
	 */
	private void mostrarTarjetaEntrenador() {

		System.out.println("N.º ID: " + idEntrenador);
		System.out.println("NOMBRE: " + nombre);

		System.out.println("\nDINERO: " + pokecuarto + " ¥");

		System.out.println("\nPOKÉDEX: " /* + pokedex.getPokemonCapturados() */);

		System.out.println("\nT. JUEGO: ");
		System.out.println("COMIENZO AVENTURA: ");

	}

	/**
	 * @param pk
	 */
	public void mostrarStats(Pokemon pk) {

		mostrarInfoPokemon(pk);
		equipo.mostrarHabilPokemon(pk);
		equipo.mostrarMovConocidos(pk);

	}

	/**
	 * 
	 * 
	 * @param entrenador
	 */
	private void mostrarInfoPokemon(Pokemon entrenador) {

		TipoPokemon[] tipo = entrenador.getTipo();

		System.out.println();

		if (tipo.length == 1) {
			System.out.println("\nINFO. POKÉMON");
			System.out.println(
					"\nNv." + entrenador.getNivel() + " " + entrenador.getNombre() + " " + entrenador.getSexo());
			System.out.println("N.º :" + entrenador.getIdPokemon());
			System.out.println("NOMBRE: " + entrenador.getNombre());
			System.out.println("TIPO: " + tipo[0]);
			System.out.println("ENTRENADOR: " + this.nombre);
			System.out.println("N.ºID " + this.idEntrenador);
			if (entrenador.tieneObjeto()) {
				System.out.println("OBJETO: " + entrenador.getObjeto().getTipoObjeto().getNombre());
			} else {
				System.out.println("OBJETO: ");
			}

		} else {
			System.out.println("\nINFO. POKÉMON");
			System.out.println(
					"\nNv." + entrenador.getNivel() + " " + entrenador.getNombre() + " " + entrenador.getSexo());
			System.out.println("N.º :" + entrenador.getIdPokemon());
			System.out.println("NOMBRE: " + entrenador.getNombre());
			System.out.println("TIPO: " + tipo[0] + "," + tipo[1]);
			System.out.println("ENTRENADOR: " + this.nombre);
			System.out.println("N.ºID " + this.idEntrenador);
			if (entrenador.tieneObjeto()) {
				System.out.println("OBJETO: " + entrenador.getObjeto().getTipoObjeto().getNombre());
			} else {
				System.out.println("OBJETO: ");
			}

		}

	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", pokecuarto=" + pokecuarto
				+ "]";
	}

}
