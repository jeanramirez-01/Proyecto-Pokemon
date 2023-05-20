package mecanicaspokemon;

import java.util.LinkedList;
import mecanicaspokemon.Objeto.NombreObjeto;

public class Entrenador {

	private int idEntrenador;
	private String nombre;
	private int edad;
	private char sexo;
	private int pokecuarto;
	private Equipo equipo;
	private Bolsa bolsa;
	private LinkedList<Pokemon> caja;

	public Entrenador() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = ' ';
		this.pokecuarto = 0;

	}

	public Entrenador(String nombre2) {
		this.nombre = nombre2;
		this.edad = 0;
		this.sexo = ' ';
		this.pokecuarto = 0;

	}

	public Entrenador(String name, int edad, String sexo, int pokedolares) {
		this.nombre = name;
		this.edad = edad;
		this.sexo = sexo.charAt(0);
		this.pokecuarto = pokedolares;

	}

	public Entrenador(int id, String nombre, int edad, String sexo, int pokecuarto, Equipo equipo, Bolsa bolsa,
			LinkedList<Pokemon> caja) {
		super();
		this.idEntrenador = id;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo.charAt(0);
		this.pokecuarto = pokecuarto;
		this.equipo = equipo;
		this.bolsa = bolsa;
		this.caja = caja;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getPokecuarto() {
		return pokecuarto;
	}

	public void setPokecuarto(int pokecuarto) {
		this.pokecuarto = pokecuarto;
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

	// Metodos de entrenador--------------------------------------------------------

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
	 * Metodo de curar el equipo pokemon del entrenador en la que recorre todo el
	 * equipo dependiendo del tamaño del equipo en la que llama al metodo
	 * recuperarTotal de pokemon
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
	 * Metodo de captura booleano en la que le pasamos dos parametros, el pokemon
	 * salvaje que se genera en la vista de captura y la pokeball que elige el
	 * entrenador. Lo primero generamos un numero random 0 a 255, luego lo primero
	 * que comprobamos es que si en el caso que la pokeball que utilize es la
	 * MASTERBALL, entonces el metodo devuelve true y se captura el pokemon; si no,
	 * se genera la siguiente excepcion en la que si el numero random que se genera
	 * al principio del metodo es menor o igual que la formula de captura entonces
	 * devuelve true y se captura el pokemon. Finalizando si no cuenta ninguna de
	 * las opciones del metodo entonces devuelve false.
	 * 
	 * @param aleatorio es el pokemon salvaje que se genera en la vista de captura
	 * @param pokeball  es la pokeball que escoge el entrenador al momento de abrir
	 *                  la bolsa en la vista de la captura
	 * 
	 * @return true si se captura o false si no
	 * 
	 */
	public boolean capturar(Pokemon aleatorio, Objeto pokeball) {
		int random1 = (int) (Math.random() * 255) + 1;

		if (pokeball.getNombre() == NombreObjeto.MASTERBALL) {
			return true;
		} else {
			if (random1 <= formulaCaptura(pokeball, aleatorio)) {
				return true;
			}
		}
		return false;

	}

	/**
	 * Metodo de la formula de captura, en la cual tenemos dos parametros como en el
	 * metodo de la captura general, en la que le pasamos el pokemon salvaje y la
	 * pokeball que utiliza el entrenador.
	 * 
	 * Creo un variable formula que sera el valor que retorne el metodo al finalizar
	 * 
	 * Luego creo un switch que el parametro es el nombre de la pokeball, dado que
	 * los nombres de los objetos en la clase objeto esta declarado como un enum.´
	 * 
	 * Entonces en el caso de la pokeball que utilize el entrenador se generara un
	 * numero aleatorio de 0 a 255 que sera el ratio de captura de la pokeballa para
	 * la formula general. La formula general es:
	 * 
	 * numRatioPokemon sera diferente en base a la pokeball que sea. Su valor sera
	 * 12 si es una pokeball, 8 si es una superball y 4 si es una ultraball.
	 * 
	 * formula = (PsMax.Pokemon * ratioPokeballCaptura * 4) / (PsActuales.Pokemon *
	 * numRatioPokemon)
	 * 
	 * Terminando la formula, si en el caso que el valor de la formula sea mayor a
	 * 255, entonces la formula pasara a ser 255 siempre
	 * 
	 * @param pokeball  que utiliza el entrenador para la captura
	 * @param aleatorio que es el pokemon salvaje que se genera en al vista de
	 *                  captura
	 * 
	 * @return el valor de la formula de captura
	 */
	private int formulaCaptura(Objeto pokeball, Pokemon aleatorio) {

		int formula = 0;

		switch (pokeball.getNombre()) {
		case POKE_BALL:
			final int ratioPokeball = (int) (Math.random() * 255) + 1;
			formula = (aleatorio.getVitalidadMaxima() * ratioPokeball * 4) / (aleatorio.getVitalidadActual() * 12);
			if (formula > 255) {
				formula = 255;
			}
			break;
		case SUPERBALL:
			final int ratioSuperball = (int) (Math.random() * 200) + 1;
			formula = (aleatorio.getVitalidadMaxima() * ratioSuperball * 4) / (aleatorio.getVitalidadActual() * 8);
			if (formula > 255) {
				formula = 255;
			}
			break;
		case ULTRABALL:
			final int ratioUltraball = (int) (Math.random() * 150) + 1;
			formula = (aleatorio.getVitalidadMaxima() * ratioUltraball * 4) / (aleatorio.getVitalidadActual() * 4);
			if (formula > 255) {
				formula = 255;
			}
			break;
		default:

			break;
		}

		return formula;

	}

	/**
	 * Metodo de la crianza pokemon en la que de parametros tenemos el pokemon padre
	 * y pokemon madre, en este caso estaba orientado para realizar una vista de
	 * crianza pero por falta de tiempo y compañero no se ha podido realizar. El
	 * metodo consiste en el que creamos un pokemon por defecto que sera el hijo de
	 * los padres en la que invocamos al metodo de generar la info de la crianza en
	 * la clase pokemon. Ahora luego de generar todas las estadisticas del pokemon
	 * tenemos una condicion en la que invocamos el metodo de agregar pokemon de la
	 * clase equipo pokemon que es un metodo booleano que si en el caso que en el
	 * equipo hay espacio, entonces se agregara al equipo del entrenador si no se
	 * agregara a la caja al primer espacio que encuentre null
	 * 
	 * @param padre pokemon
	 * @param madre pokemon
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

	/**
	 * Metodo de mostrar los pokemon disponibles dentro de la caja que le pertenece
	 * al entrenador, donde recorremos la caja y sacamos los espacios de la caja que
	 * no sean nulos. Mastar invocamos al metodo de mostrarStats que genera la
	 * informacion general del pokemon
	 * 
	 */
	public void mostrarPc() {

		for (int i = 0; i < caja.size(); i++) {
			if (caja.get(i) != null) {
				System.out.println(i + ".-" + caja.get(i).getMote());
				mostrarStats(caja.get(i));
			}

		}

	}

	/**
	 * Metodo de mostrar la informacion general del entrenador
	 * 
	 */
	public void mostrarTarjetaEntrenador() {

		System.out.println("N.º ID: " + idEntrenador);
		System.out.println("NOMBRE: " + nombre);

		System.out.println("\nDINERO: " + pokecuarto + " ¥");

		System.out.println("\nPOKÉDEX: " /*
											 * + pokedex.getPokemonCapturados() si hubiera tenido tiempo y compañero lo
											 * hubiera echo
											 */);

		System.out.println("\nT. JUEGO: ");
		System.out.println("COMIENZO AVENTURA: ");

	}

	/**
	 * 
	 * Metodo para mostrar la info general del pokemon
	 * 
	 * @param pk
	 */
	public void mostrarStats(Pokemon pk) {

		mostrarInfoPokemon(pk);
		equipo.mostrarHabilPokemon(pk);
		equipo.mostrarMovConocidos(pk);

	}

	/**
	 * Metodo de la info basica de un pokemon del entrenador, que se le pasa al
	 * metodo por parametro al metodo y genera por consola la info basica del
	 * pokemon
	 * 
	 * @param pkentrenador el pokemon que selecciona el entrenador para generar la info basica
	 */
	private void mostrarInfoPokemon(Pokemon pkentrenador) {

		TipoPokemon[] tipo = pkentrenador.getTipo();

		System.out.println();

		if (tipo.length == 1) {
			System.out.println("\nINFO. POKÉMON");
			System.out.println(
					"\nNv." + pkentrenador.getNivel() + " " + pkentrenador.getNombre() + " " + pkentrenador.getSexo());
			System.out.println("N.º :" + pkentrenador.getIdPokemon());
			System.out.println("NOMBRE: " + pkentrenador.getNombre());
			System.out.println("TIPO: " + tipo[0]);
			System.out.println("ENTRENADOR: " + this.nombre);
			System.out.println("N.ºID " + this.idEntrenador);
			if (pkentrenador.tieneObjeto()) {
				System.out.println("OBJETO: " + pkentrenador.getObjeto().getNombre());
			} else {
				System.out.println("OBJETO: ");
			}

		} else {
			System.out.println("\nINFO. POKÉMON");
			System.out.println(
					"\nNv." + pkentrenador.getNivel() + " " + pkentrenador.getNombre() + " " + pkentrenador.getSexo());
			System.out.println("N.º :" + pkentrenador.getIdPokemon());
			System.out.println("NOMBRE: " + pkentrenador.getNombre());
			System.out.println("TIPO: " + tipo[0] + "," + tipo[1]);
			System.out.println("ENTRENADOR: " + this.nombre);
			System.out.println("N.ºID " + this.idEntrenador);
			if (pkentrenador.tieneObjeto()) {
				System.out.println("OBJETO: " + pkentrenador.getObjeto().getNombre());
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
