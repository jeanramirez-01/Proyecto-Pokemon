package mecanicaspokemon;

import java.util.Arrays;
import java.util.Random;
import mecanicaspokemon.Movimiento.TipoAtaque;

public class Pokemon {

	private int idPokemon;
	private String nombre;
	private String mote;
	private int vitalidadMaxima;
	private int vitalidadActual;
	private int ataqueMaxima;
	private int ataqueActual;
	private int defensaMaxima;
	private int defensaActual;
	private int ataqueEspecialMaxima;
	private int ataqueEspecialActual;
	private int defensaEspecialMaxima;
	private int defensaEspecialActual;
	private int velocidadMaxima;
	private int velocidadActual;
	private int estaminaMaxima;
	private int estaminaActual;
	private int nivel;
	private Movimiento[] movimientos;
	private int fertilidad = 5;
	private char sexo;
	private TipoPokemon[] tipo;
	private Estado estado;
	private Objeto objeto;
	private int experienciaActual;
	private int experienciaTotal;
	private String descripcion;

	public Pokemon() {

		this.nombre = "Pikachu";
		this.mote = "Pulga";
		this.vitalidadActual = vitalidadMaxima;
		this.estaminaMaxima = 100;
		this.estaminaActual = estaminaMaxima;
		this.nivel = 1;
		this.movimientos = new Movimiento[4];
		this.fertilidad = 5;
		this.sexo = 'M';
		this.tipo = new TipoPokemon[2];
		this.estado = null;
		this.objeto = null;
		this.experienciaActual = 1;

	}

	public Pokemon(String nombre) {
		this.nombre = nombre;
	}

	public Pokemon(int id, String name, TipoPokemon[] tipoPokemon, String descripcion) {
		this.idPokemon = id;
		this.nombre = name;
		this.tipo = tipoPokemon;
		this.descripcion = descripcion;

	}

	public Pokemon(int id, String name, TipoPokemon[] tipoPokemon, String descripcion, int vt) {
		this.idPokemon = id;
		this.nombre = name;
		this.tipo = tipoPokemon;
		this.descripcion = descripcion;
		this.vitalidadMaxima = vt;
		recuperarTotal();
	}

	public Pokemon(String name, TipoPokemon[] tipo, String descripcion) {
		this.nombre = name;
		this.tipo = tipo;
		this.descripcion = descripcion;

	}

	public Pokemon(int num_pokedex, int vtBS, int atBS, int dfBS, int atEBS, int dfEBS, int vlBS) {
		this.idPokemon = num_pokedex;
		this.vitalidadMaxima = vtBS;
		this.ataqueMaxima = atBS;
		this.defensaMaxima = dfBS;
		this.ataqueEspecialMaxima = atEBS;
		this.defensaEspecialMaxima = dfEBS;
		this.velocidadMaxima = vlBS;
	}

	// Constructor para cargar las stats del pokemon
	public Pokemon(String mote2, int vt, int at, int df, int atE, int dfE, int vl, int st, int nv, String sexo2,
			int exp, Movimiento[] mov) {
		this.mote = mote2;
		this.vitalidadMaxima = vt;
		this.ataqueMaxima = at;
		this.defensaMaxima = df;
		this.ataqueEspecialMaxima = atE;
		this.defensaEspecialMaxima = dfE;
		this.velocidadMaxima = vl;
		this.estaminaMaxima = st;
		this.nivel = nv;
		this.sexo = sexo2.charAt(0);
		this.movimientos = mov;
		recuperarTotal();
	}

	// Constructor para cargar el pokemon en el equipo del entrenador
	public Pokemon(int id, String nom, TipoPokemon[] tip1, String mote2, int vt, int at, int df, int atE, int dfE,
			int vl, int st, int nv, String sexo2, Objeto obj, Estado est, int exp, Movimiento[] mov, String desc) {
		this.idPokemon = id;
		this.nombre = nom;
		this.mote = mote2;
		this.vitalidadMaxima = vt;
		this.ataqueMaxima = at;
		this.defensaMaxima = df;
		this.ataqueEspecialMaxima = atE;
		this.defensaEspecialMaxima = dfE;
		this.velocidadMaxima = vl;
		this.estaminaMaxima = st;
		this.nivel = nv;
		this.movimientos = mov;
		this.sexo = sexo2.charAt(0);
		this.objeto = obj;
		this.estado = est;
		this.tipo = tip1;
		this.experienciaTotal = exp;
		this.descripcion = desc;
		recuperarTotal();
	}

	public int getIdPokemon() {
		return idPokemon;
	}

	public void setIdPokemon(int idPokemon) {
		this.idPokemon = idPokemon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public int getVitalidadMaxima() {
		return vitalidadMaxima;
	}

	public void setVitalidadMaxima(int vitalidadMaxima) {
		this.vitalidadMaxima = vitalidadMaxima;
	}

	public int getVitalidadActual() {
		return vitalidadActual;
	}

	public void setVitalidadActual(int vitalidadActual) {
		this.vitalidadActual = vitalidadActual;
	}

	public int getAtaqueMaxima() {
		return ataqueMaxima;
	}

	public void setAtaqueMaxima(int ataqueMaxima) {
		this.ataqueMaxima = ataqueMaxima;
	}

	public int getAtaqueActual() {
		return ataqueActual;
	}

	public void setAtaqueActual(int ataqueActual) {
		this.ataqueActual = ataqueActual;
	}

	public int getDefensaMaxima() {
		return defensaMaxima;
	}

	public void setDefensaMaxima(int defensaMaxima) {
		this.defensaMaxima = defensaMaxima;
	}

	public int getDefensaActual() {
		return defensaActual;
	}

	public void setDefensaActual(int defensaActual) {
		this.defensaActual = defensaActual;
	}

	public int getAtaqueEspecialMaxima() {
		return ataqueEspecialMaxima;
	}

	public void setAtaqueEspecialMaxima(int ataqueEspecialMaxima) {
		this.ataqueEspecialMaxima = ataqueEspecialMaxima;
	}

	public int getAtaqueEspecialActual() {
		return ataqueEspecialActual;
	}

	public void setAtaqueEspecialActual(int ataqueEspecialActual) {
		this.ataqueEspecialActual = ataqueEspecialActual;
	}

	public int getDefensaEspecialMaxima() {
		return defensaEspecialMaxima;
	}

	public void setDefensaEspecialMaxima(int defensaEspecialMaxima) {
		this.defensaEspecialMaxima = defensaEspecialMaxima;
	}

	public int getDefensaEspecialActual() {
		return defensaEspecialActual;
	}

	public void setDefensaEspecialActual(int defensaEspecialActual) {
		this.defensaEspecialActual = defensaEspecialActual;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getEstaminaActual() {
		return estaminaActual;
	}

	public void setEstaminaActual(int estaminaActual) {
		this.estaminaActual = estaminaActual;
	}

	public int getEstaminaMaxima() {
		return estaminaMaxima;
	}

	public void setEstaminaMaxima(int estaminaMaxima) {
		this.estaminaMaxima = estaminaMaxima;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Movimiento[] getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(Movimiento[] movimiento) {
		this.movimientos = movimiento;
	}

	public int getFertilidad() {
		return fertilidad;
	}

	public void setFertilidad(int fertilidad) {
		this.fertilidad = fertilidad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public TipoPokemon[] getTipo() {
		return tipo;
	}

	public void setTipo(TipoPokemon[] tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public int getExperienciaActual() {
		return experienciaActual;
	}

	public void setExperienciaActual(int experienciaActual) {
		this.experienciaActual = experienciaActual;
	}

	public int getExperienciaTotal() {
		return experienciaTotal + (int) Math.pow(this.nivel, 3);
	}

	public void setExperienciaTotal(int experienciaTotal) {
		this.experienciaTotal = experienciaTotal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Metodos de pokemon-----------------------------------------------------------

	/**
	 * Metodo de mostrar la la info mas basica del pokemon
	 */
	public void mostrarStats() {

		System.out.println("INFO. POKÉMON");
		System.out.println("Nv." + this.nivel + " " + this.nombre + " " + this.sexo);
		System.out.println("Nº. :" + this.idPokemon);
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("TIPO: " + this.tipo);

	}

	/**
	 * Metodo en el que comprobamos que el pokemon tiene un objeto
	 *
	 * @return que mientras el pokemon no tenga un objeto, devuelve true y si no
	 *         false
	 */

	public boolean tieneObjeto() {
		return this.objeto != null;
	}

	/**
	 * Es el metodo de aplicar el efecto del objeto. Cada vez que llamemos a un
	 * objeto de tipo pokemon, le pasariamos este metodo y en el switch si es que
	 * tiene un objeto entonces, buscaria que objeto tendria y le aplicaria el
	 * cambio de estadisticas
	 */

	public boolean aplicarEfectoObjeto() {

		if (tieneObjeto()) {

			switch (this.objeto.getNombre()) {
			case PESA:

				this.ataqueActual = (int) (this.ataqueActual + (this.ataqueActual * 0.20));
				this.defensaActual = (int) (this.defensaActual + (this.defensaActual * 0.20));

				this.velocidadActual = (int) (this.velocidadActual - (this.velocidadActual * 0.20));
				break;
			case PLUMA:

				this.velocidadActual = (int) (this.velocidadActual + (this.velocidadActual * 0.30));

				this.defensaActual = (int) (this.defensaActual - (this.defensaActual * 0.20));
				this.defensaEspecialActual = (int) (this.defensaEspecialActual - (this.defensaEspecialActual * 0.20));
				break;
			case CHALECO:

				this.defensaActual = (int) (this.defensaActual + (this.defensaActual * 0.20));
				this.defensaEspecialActual = (int) (this.defensaEspecialActual + (this.defensaEspecialActual * 0.20));

				this.ataqueActual = (int) (this.ataqueActual - (this.ataqueActual * 0.15));
				this.velocidadActual = (int) (this.velocidadActual - (this.velocidadActual * 0.15));
				break;
			case BASTON:

				this.estaminaActual = (int) (this.estaminaActual + (this.estaminaActual * 0.20));
				this.velocidadActual = (int) (this.velocidadActual - (this.velocidadActual * 0.15));
				break;
			case PILAS:

				this.estaminaActual = (int) (this.estaminaActual + (this.estaminaMaxima * 0.50));

				this.defensaEspecialActual = (int) (this.defensaEspecialActual - (this.defensaEspecialActual * 0.30));
				break;
			default:
				break;

			}

		}
		return false;
	}

	/**
	 * Ejemplo de lo que hubiera sido un metodo de poner estado al pokemon al
	 * momento de atacar, pero al cambiar la clase de estado entonces el metodo ya
	 * no funciona y entonces por eso esta comentado entero el metodo. Si hubiera
	 * tenido tiempo y compañero lo hubiera echo
	 * 
	 */

//	public void ponerEstado() {
//
//		Estados persistente;
//		Estados temporal;
//
//		this.estado.getEstado().getTipoEstado();
//		boolean estaPersistente = TiposEstados.PERSISTENTE != null;
//		if (estaPersistente && this.estado.getEstado().getTipoEstado().PERSISTENTE != Estados.NORMAL) {
//			System.out.println("No se puede cambiar el estado de " + this.nombre + " dado que esta "
//					+ this.estado.getEstado().getMensaje());
//			return;
//		}
//
//		for (Movimiento movimiento : movimientos) {
//			if (this.estado.getTipoEstado() != null || this.estado.getOtros() == OtrosEstados.DEBILITADO) {
//				Estados estadoMovimiento = movimiento.getEstado().getPersistente();
//				if (estadoMovimiento == Estados.PARALIZADO || estadoMovimiento == Estados.QUEMADO
//						|| estadoMovimiento == Estados.ENVENENADO
//						|| estadoMovimiento == Estados.GRAVEMENTE_ENVENENADO
//						|| estadoMovimiento == Estados.CONGELADO) {
//
//					if (estaPersistente) {
//						return;
//					}
//
//					persistente = estadoMovimiento;
//					setEstado(new Estado(persistente));
//					break;
//				}
//			}
//			if (this.estado.getPersistente() != null || this.estado.getOtros() == OtrosEstados.DEBILITADO) {
//				EstadoTemporal estadoMovimiento2 = movimiento.getEstado().getTipoEstado();
//				if (estadoMovimiento2 == EstadoTemporal.CONFUSO || estadoMovimiento2 == EstadoTemporal.DORMIDO
//						|| estadoMovimiento2 == EstadoTemporal.AMEDRENTADO
//						|| estadoMovimiento2 == EstadoTemporal.DRENADORAS) {
//					temporal = estadoMovimiento2;
//					setEstado(new Estado(temporal));
//					break;
//				}
//			}
//		}
//
//		if (this.vitalidadActual == 0) {
//			setEstado(new Estado(Estados.DEBILITADO));
//			System.out.println(this.nombre + " se ha debilitado.");
//		}
//
//	}

	/**
	 * Metodo de aplicar el estado al pokemon cada turno dependiendo del tipo de
	 * estado. Esto esta sin acabar dado que si hubiera tenido tiempo y compañero lo
	 * habria terminado. En terminos generales lo que deberia hacer es que en el
	 * switch coge el estado del pokemon y si en el caso que hubiera tenido alguno
	 * de los estados disponibles en la clase enum
	 */

	public void aplicarEstado() {

		boolean estadoAplicado = false;
		int random = 0;

		switch (this.estado.getNombre()) {
		case PARALIZADO:

			boolean paralizado = false;
			for (int i = 0; i < 1; i++) {
				paralizado = (int) (Math.random() * 5 + 1) == 0;
			}
			if (paralizado) {
				System.out.println(this.nombre + " no puede atacar, esta paralizado");
				break;
			}

			if (!estadoAplicado) {
				this.velocidadActual = (int) this.velocidadActual - (this.velocidadActual / 2);
				estadoAplicado = true;
			}
			break;

		case QUEMADO:

			System.out.println(this.nombre + " se ha quemado");

			if (!estadoAplicado) {
				this.ataqueMaxima = this.ataqueMaxima - (this.ataqueMaxima / 2);
				estadoAplicado = true;
			}

			for (int i = 0; i < 1; i++) {
				random = (int) (Math.random() * 16 - 1) + 1;
			}

			System.out.println(this.nombre + " se ha quemado");
			this.vitalidadActual = this.vitalidadActual - random;

			break;

		case ENVENENADO:

			System.out.println(this.nombre + " se ha envenenado");

			for (int i = 0; i < 1; i++) {
				random = (int) (Math.random() * 8 - 1) + 1;
			}

			this.vitalidadActual = this.vitalidadActual - random;

			break;

		case GRAVEMENTE_ENVENENADO:

			System.out.println(this.nombre + " se ha envenenado gravemente");

			int valor = 0;
			for (int i = 0; i < 1; i++) {
				random = (int) (Math.random() * 8 - 1) + 1;
				valor++;
			}
			if (!estadoAplicado) {
				this.vitalidadActual = this.vitalidadActual - random;
				estadoAplicado = true;
			}

			int danio = (int) (this.vitalidadMaxima / 8.0 + (this.vitalidadMaxima / 16.0) * (valor - 1));

			for (int i = 0; i < 1; i++) {
				this.vitalidadActual -= danio;

			}
			break;

		case CONGELADO:

			boolean descongelado = false;
			for (int i = 0; i < 1; i++) {
				descongelado = (int) (Math.random() * 5 + 1) == 0;
			}

			if (descongelado) {
				System.out.println(this.nombre + " se ha descongelado");
				setEstado(new Estado(Estado.NombreEstado.NORMAL));
			} else {
				System.out.println(this.nombre + " está congelado y no puede atacar");
				break;
			}

			break;
		default:

			break;

		}

		switch (this.estado.getNombre()) {
		case CONFUSO:

			break;
		case DORMIDO:

			estadoAplicado = true;
			break;
		case AMENDRENTADO:

			break;

		case DRENADORAS:

			break;
		default:
			break;
		}

	}

	/**
	 * Metodo subir nivel en el cual, tenemos de condicion que si la experiencia
	 * actual del pokemon es mayor o igual que la experiencia total requirida para
	 * subir de nivel en la que le pasamos el total con el getExperienciaTotal(), en
	 * el mensaje nos mostrara la experiencia faltante para subir de nivel.
	 * <p>
	 * Si es que cumple la condicion entonces nos mostrara no un mensaje con el
	 * nombre del pokemon que ha subido de nivel y nos sumara las estadisticas con
	 * un numero aleatorio de 1 entre 5 y en el caso que si la experiencia actual es
	 * mayor que la experiencia requerida para subir de nivel, entonces se hara el
	 * calculo del resto de la experiencia actual a la experiencia total y nos
	 * mostrara la experiencia que tiene el pokemon
	 */

	public void subirNivel() {

		if (this.nivel == 100) {
			return;
		}
		int experienciaRequerida = getExperienciaTotal();

		while (this.experienciaActual >= experienciaRequerida) {

			if (this.vitalidadActual < vitalidadMaxima) {

				this.vitalidadActual += +2;

			}

			this.vitalidadMaxima += (int) (Math.random() * (5 - 1)) + 1;
			this.estaminaMaxima += 5;
			this.ataqueMaxima += (int) (Math.random() * (5 - 1)) + 1;
			this.defensaMaxima += (int) (Math.random() * (5 - 1)) + 1;
			this.ataqueEspecialMaxima += (int) (Math.random() * (5 - 1)) + 1;
			this.defensaEspecialMaxima += (int) (Math.random() * (5 - 1)) + 1;
			this.velocidadMaxima += (int) (Math.random() * (5 - 1)) + 1;

			this.experienciaActual -= experienciaRequerida;
			this.nivel++;

			experienciaRequerida = getExperienciaTotal();

		}

	}

	/**
	 * Metodo de atacar a un pokemon en el cual le pasamos dos parametros, el indice
	 * del movimiento disponible del pokemon y el pokemon al que se le dirije el
	 * ataque. El metodo en si mismo funciona en terminos generales pero no funciona
	 * el poner estado aqui, dado que si hubiera tenido tiempo y compañero lo
	 * hubiera echo.
	 * 
	 * En lo general lo primero que hace es que comprueba la estamina actual del
	 * pokemon que si es menor al coste de estamina del movimiento entonces no podra
	 * atacar, pero si no, le resta a la estamina actual el costo de la estamina del
	 * movimiento. Procedemos en el metodo y entonces invocamos al metodo de la
	 * formula de daño y guardaremos el daño realizado en una variable danio,
	 * entonces en el caso que si el daño de la formula es mayor que la vitalidad
	 * actual del pokemon rival entonces pone la vitalidad actual del pokemon rival
	 * a 0, de estado del pokemon se pone a debilitado, pero si no se cumple la
	 * condicion entonces el calculo de la formula del daño se le restara a la
	 * vitalidad actual del pokemon rival.
	 * 
	 * Tenemos de ultima condicion que si el calculo de la formula de daño es igual
	 * a 0, entonces significa que el ataque no le afecta al rival
	 * 
	 * @param indiceAtaque hace referencia a uno de los movimientos disponibles del
	 *                     pokemon dentro del array de movimientos
	 * 
	 * @param rival        es el pokemon al que se le ataca
	 */

	public void atacarPokemon(int indiceAtaque, Pokemon rival) {

		if (this.estaminaActual < this.movimientos[indiceAtaque].getCostoEstamina()) {
			return;
		} else {
			this.estaminaActual = this.estaminaActual - this.movimientos[indiceAtaque].getCostoEstamina();
			int danio = formulaDanio(indiceAtaque, rival);
			if (danio == 0) {
				return;
			} else if (danio >= rival.getVitalidadActual()) {
				rival.setVitalidadActual(0);
				rival.setEstado(new Estado(Estado.NombreEstado.DEBILITADO));
			} else {
				rival.setVitalidadActual(rival.getVitalidadActual() - danio);
			}

		}

	}

	/**
	 * Metodo de curar la vitalidad actual y estamina actual, ademas de restaurar
	 * todas las estadisticas del pokemon por el metodo recuperarEstadisticas()
	 * 
	 */

	public void recuperarTotal() {

		this.vitalidadActual = this.vitalidadMaxima;
		this.estaminaActual = this.estaminaMaxima;
		recuperarEstadisticas();
	}

	/*
	 * Metodo de recuperar la estamina en el combate, pero cuesta un turno
	 */
	public void recuperarEstamina() {
		int nuevaEstamina = this.estaminaActual + (this.estaminaMaxima / 2);
		if (nuevaEstamina > this.estaminaMaxima) {
			this.estaminaActual = this.estaminaMaxima;
		} else {
			this.estaminaActual = nuevaEstamina;
		}
	}

	/**
	 * Metodo de recuperar estadisticas que devuelve las estadisticas actuales del
	 * pokemon a las estadisticas maxima
	 */
	public void recuperarEstadisticas() {

		this.vitalidadActual = this.vitalidadMaxima;
		this.ataqueActual = this.ataqueMaxima;
		this.defensaActual = this.defensaMaxima;
		this.ataqueEspecialActual = this.ataqueEspecialMaxima;
		this.defensaEspecialActual = this.defensaEspecialMaxima;
		this.velocidadActual = this.velocidadMaxima;

	}

	/**
	 * Lo que hubiera sido el metodo de aprender movimiento si hubiera tenido tiempo
	 * y compañero para hacerlo
	 */
	public void aprenderMovimiento() {

	}

	/**
	 * Metodo de generar las estadisticas base del pokemon al momento de la crianza
	 * o cuando creemos un pokemon por defecto, ya le pasamos directamente las
	 * estadisticas con el metodo
	 */
	public void generarIVS() {

		this.vitalidadMaxima = (int) (Math.random() * (31 - 10)) + 10;
		this.ataqueMaxima = (int) (Math.random() * (31 - 5)) + 5;
		this.defensaMaxima = (int) (Math.random() * (31 - 5)) + 5;
		this.ataqueEspecialMaxima = (int) (Math.random() * (31 - 5)) + 5;
		this.defensaEspecialMaxima = (int) (Math.random() * (31 - 5)) + 5;
		this.velocidadMaxima = (int) (Math.random() * (31 - 5)) + 5;

		recuperarEstadisticas();

	}

	/**
	 * Metodo de generar la info y las estadisticas del pokemon al momento de criar
	 * entre dos pokemon.
	 * 
	 * Lo primero tenemos dos parametros que seran los pokemon padres que le pasara
	 * el entrenador.
	 * 
	 * -Lo primero que se comprueba en el metodo es la fertilidad que tenga
	 * disponibles para la crianza
	 * 
	 * -Lo segundo que se comprueba es que si el genero del pokemon del padre y la
	 * madre son iguales entonces no se puede criar un pokemon
	 * 
	 * -Lo tercero es que sacamos es el indice del pokemon padre y madre y luego
	 * comprobamos la compatibilidad de los padres mediante la matriz de eficacias
	 * en la clase eficacias que si la compatibilidad es igual o mayor a 2, entonces
	 * no el pokemon no se puede criar
	 * 
	 * -Luego de las comprobaciones primero sacamos lo que sera el nombre y el mote
	 * del pokemon de crianza, que sera la mitad del nombre del padre y de la madre.
	 * Luego generamos un numero aleatorio 0 a 10 y que si el numero generado es
	 * menor a 5, entonces el sexo del hijo sera del padre y si no sera de la madre.
	 * Luego se le setea el mote y el nombre del hijo y ahora, al momento de poner
	 * las estadisticas se le aplicaran las estadisitcas que sean mejores de cada
	 * padre y al final del todo se le restara un punto de fertilidad a los padres.
	 * 
	 * Falta la parte de aprender movimiento de los padres por falta de tiempo y
	 * compañero
	 * 
	 * @param padre es el pokemon padre
	 * @param madre es el pokemon madre
	 */

	public boolean generarInfoCrianza(Pokemon padre, Pokemon madre) {

		if (padre.getFertilidad() == 0 || madre.getFertilidad() == 0) {
			return false;
		}

		if (padre.getSexo() == madre.getSexo()) {
			return false;
		}

		int padreIndice = padre.getTipo()[0].getIndice();
		int madreIndice = madre.getTipo()[0].getIndice();

		double compatibilidad1 = Eficacias.EFICACIAS[padreIndice][madreIndice];
		double compatibilidad2 = Eficacias.EFICACIAS[madreIndice][padreIndice];
		double compa = 0;
		if (compatibilidad1 > compatibilidad2) {
			compa = compatibilidad1;
		} else {
			compa = compatibilidad2;
		}
		if (compa >= 2.0) {
			return false;
		} else {
			String primeraMitadPadre = padre.getNombre().substring(0, padre.getNombre().length() / 2);
			String primeraMitadMadre = madre.getNombre().substring(0, madre.getNombre().length() / 2);

			Random rand = new Random();
			int numeroAleatorio = rand.nextInt(10) + 1;

			if (numeroAleatorio < 5) {
				this.setTipo(padre.getTipo());
				this.setSexo(padre.getSexo());
				this.setIdPokemon(padre.getIdPokemon());
			} else {
				this.setTipo(madre.getTipo());
				this.setSexo(madre.getSexo());
				this.setIdPokemon(madre.getIdPokemon());
			}

			this.setMote(primeraMitadPadre + primeraMitadMadre);
			this.setNombre(this.getMote());
			this.setNivel(1);

			if (padre.getVitalidadMaxima() > madre.getVitalidadMaxima()) {
				this.setVitalidadMaxima(padre.getVitalidadMaxima());
				this.setVitalidadActual(padre.getVitalidadMaxima());
			} else {
				this.setVitalidadMaxima(madre.getVitalidadMaxima());
				this.setVitalidadActual(madre.getVitalidadMaxima());
			}
			if (padre.getAtaqueMaxima() > madre.getAtaqueMaxima()) {
				this.setAtaqueMaxima(padre.getAtaqueMaxima());
			} else {
				this.setAtaqueMaxima(madre.getAtaqueMaxima());
			}
			if (padre.getDefensaMaxima() > madre.getDefensaMaxima()) {
				this.setDefensaMaxima(padre.getDefensaMaxima());
			} else {
				this.setDefensaMaxima(madre.getDefensaMaxima());
			}
			if (padre.getAtaqueEspecialMaxima() > madre.getAtaqueEspecialMaxima()) {
				this.setAtaqueEspecialMaxima(padre.getAtaqueEspecialMaxima());
			} else {
				this.setAtaqueEspecialMaxima(madre.getAtaqueEspecialMaxima());
			}
			if (padre.getDefensaEspecialMaxima() > madre.getDefensaEspecialMaxima()) {
				this.setDefensaEspecialMaxima(padre.getDefensaEspecialMaxima());
			} else {
				this.setDefensaEspecialMaxima(madre.getDefensaEspecialMaxima());
			}
			if (padre.getVelocidadMaxima() > madre.getVelocidadMaxima()) {
				this.setVelocidadMaxima(padre.getVelocidadMaxima());
			} else {
				this.setVelocidadMaxima(madre.getVelocidadMaxima());
			}

			this.recuperarEstadisticas();

			padre.setFertilidad(padre.getFertilidad() - 1);
			madre.setFertilidad(madre.getFertilidad() - 1);

			return true;
		}

	}

	/**
	 * Metodo de la formula de daño al momento del que pokemon del jugador utilice
	 * algun movimiento
	 * <p>
	 * B = Bonificación. Si el ataque es del mismo tipo que el Pokémon que lo lanza
	 * toma un valor de 1.5, si el ataque es de un tipo diferente al del Pokémon que
	 * lo lanza toma un valor de 1
	 * <p>
	 * E = Efectividad. Puede tomar los valores de 0, 0.25, 0.5, 1, 2 y 4.
	 * <p>
	 * V = Variación. Es una variable que comprende todos los valores discretos
	 * entre 85 y 100 (ambos incluidos).
	 * <p>
	 * N = Nivel del pokemon que ataca
	 * <p>
	 * A = Cantidad de ataque o ataque especial del Pokémon. Si el ataque que
	 * utiliza el Pokémon es físico se toma la cantidad de ataque y si es especial
	 * se toma la cantidad de ataque especial.
	 * <p>
	 * P = Poder del ataque, el potencial del ataque.
	 * <p>
	 * D = Cantidad de defensa del Pokémon rival. Si el ataque que hemos utilizado
	 * es físico cogeremos la cantidad de defensa del Pokémon rival, si el ataque
	 * que hemos utilizado es especial, se coge la cantidad de defensa especial del
	 * Pokémon rival.
	 *
	 * @param indiceMovimiento es el indice del movimiento disponible del pokemon
	 *                         del jugador
	 * @param rival            el pokemon rival al que vamos atacar
	 * @return nos devuelve el ataque en base a la s estadisticas de los dos pokemon
	 */

	public int formulaDanio(int indiceMovimiento, Pokemon rival) {

		Random random = new Random();

		Eficacias.EficaciasPokemon[] ef = new Eficacias.EficaciasPokemon[] { Eficacias.EficaciasPokemon.ES_POCO_EFICAZ,
				Eficacias.EficaciasPokemon.NO_MUY_ES_EFICAZ, Eficacias.EficaciasPokemon.ES_NEUTRO,
				Eficacias.EficaciasPokemon.ES_EFICAZ, Eficacias.EficaciasPokemon.ES_MUY_EFICAZ };

		double B = 0, E;
		int V, N, A, D, P;

		V = random.nextInt(16) + 85;

		for (int i = 0; i < tipo.length; i++) {
			if (movimientos[indiceMovimiento].getTipoMovimiento() == this.tipo[i]) {
				B = 1.5;
				break;
			} else {
				B = 1.0;
			}
		}

		E = sacarEficacia(movimientos[indiceMovimiento].getTipoMovimiento(), rival.getTipo());

		for (int i = 0; i < ef.length; i++) {
			if (E == ef[i].getEficacia()) {
				System.out.println(this.movimientos[indiceMovimiento].getNombre() + " " + ef[i].getMensaje());
				break;
			}
		}

		N = this.nivel;

		P = this.movimientos[indiceMovimiento].getPotencia();

		if (movimientos[indiceMovimiento].getTipo() == TipoAtaque.FISICO) {
			A = this.ataqueActual;
			D = rival.defensaActual;
		} else {
			A = this.ataqueEspecialActual;
			D = rival.defensaEspecialActual;
		}

		return (int) (0.01 * B * E * V * (((0.2 * N + 1) * A * P / (25 * D)) + 2));
	}

	/**
	 * En este metodo primero declaramos dos variables para guardar los indices de
	 * los pokemon, para que luego llamemos a una matriz donde se guarda la tabla de
	 * tipos pokemon, en el cual le pasamos el indice del atacante y del indice del
	 * objetivo para guardar el valor del matriz en una variable de tipo double y
	 * despues devolverla con un return. En el caso que si el pokemon objetivo tiene
	 * dos tipos entonces coge los dos tipos y llama a sus respectivos indices de la
	 * clase tipo pokemon, y cada indice se guarda en dos variables para entonces
	 * crear dos variables en la cual llamaremos a la matriz de las eficacias para
	 * sacar la eficacia de cada tipo y el valor de la formula sera la
	 * multiplicacion de ambas eficacias y se devolvera el valor en el return
	 *
	 * @param tipoMovimientoAtacante es el tipo del pokemon atacante
	 * @param tipoObjetivo           es el tipo del pokemon objetivo
	 * 
	 * @return nos devuelve el valor de la eficacia en double
	 */

	public double sacarEficacia(TipoPokemon tipoMovimientoAtacante, TipoPokemon[] tipoObjetivo) {

		int indiceAtacante = tipoMovimientoAtacante.getIndice();
		int indiceObjetivo = 0;
		int indiceObjetivoDoble = 0;
		double formula = 0;

		if (tipoObjetivo.length == 1) {
			indiceObjetivo = tipoObjetivo[0].getIndice();
			formula = Eficacias.EFICACIAS[indiceAtacante][indiceObjetivo];
		} else {
			indiceObjetivo = tipoObjetivo[0].getIndice();
			indiceObjetivoDoble = tipoObjetivo[1].getIndice();
			double uno = Eficacias.EFICACIAS[indiceAtacante][indiceObjetivo];
			double dos = Eficacias.EFICACIAS[indiceAtacante][indiceObjetivoDoble];
			formula = uno * dos;
		}

		return formula;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", mote=" + mote + ", vitalidadMaxima=" + vitalidadMaxima
				+ ", ataqueMaxima=" + ataqueMaxima + ", defensaMaxima=" + defensaMaxima + ", ataqueEspecialMaxima="
				+ ataqueEspecialMaxima + ", defensaEspecialMaxima=" + defensaEspecialMaxima + ", velocidadMaxima="
				+ velocidadMaxima + ", estaminaMaxima=" + estaminaMaxima + ", nivel=" + nivel + ", sexo=" + sexo
				+ ", tipo=" + Arrays.toString(tipo) + ", experienciaTotal=" + experienciaTotal + ", descripcion="
				+ descripcion + "]";
	}

}
