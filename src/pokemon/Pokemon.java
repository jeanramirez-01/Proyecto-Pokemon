package pokemon;

import java.util.Arrays;
import java.util.Random;
import combate.Eficacias;
import combate.Estado;
import combate.Estado.EstadoPersistente;
import combate.Estado.EstadoTemporal;
import combate.Estado.OtrosEstados;
import combate.Movimiento;
import combate.Movimiento.TipoAtaque;
import tienda.Objeto;

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
	private Movimiento[] movimientos = new Movimiento[4];
	private int fertilidad = 5;
	private char sexo;
	private TipoPokemon[] tipo;
	private Estado estado;
	private Objeto objeto;
	private int experienciaActual;
	private int experienciaTotal;

	// Constructor por defecto
	public Pokemon() {

		generarIVS();
		this.nombre = "Pikachu";
		this.mote = "Pulga";
		this.vitalidadActual = vitalidadMaxima;
		this.estaminaMaxima = 100;
		this.estaminaActual = estaminaMaxima;
		this.nivel = 1;
//		this.movimiento = new Movimiento[4];
		this.fertilidad = 5;
		this.sexo = 'M';
//		this.tipos = new Tipo[2];
		this.estado = null;
		this.objeto = null;
		this.experienciaActual = 1;

	}

	// Constructor de la lista random
	public Pokemon(String nombre) {

		generarIVS();
		this.nombre = nombre;
		this.tipo = new TipoPokemon[] { TipoPokemon.ROCA, TipoPokemon.TIERRA };
		this.vitalidadActual = 1000;
		this.estaminaMaxima = 150;
		this.nivel = 100;
		this.defensaMaxima = 450;
		this.sexo = 'M';
		this.defensaActual = defensaMaxima;

	}

	// Constructor de prueba para la clase main
	public Pokemon(String nombre, Objeto objeto) {
		generarIVS();
		this.vitalidadActual = vitalidadMaxima;
		this.idPokemon = 150;
		this.nombre = nombre;
		this.nivel = 5;
		this.objeto = objeto;
		this.tipo = new TipoPokemon[] { TipoPokemon.FUEGO };
		this.sexo = 'F';
		this.estaminaMaxima = 150;
		this.estaminaActual = estaminaMaxima;

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

	// Metodos de pokemon-----------------------------------------------------------

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

	public void aplicarEfectoObjeto() {

		if (tieneObjeto()) {

			switch (this.objeto.getTipoObjeto()) {
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

			}

		}

	}

	/**
	 * Ejemplo de metodo en el cual pone el estado del pokemon dependiendo del
	 * estado del movimiento del pokemon. En este caso primero declaramos
	 */

	public void ponerEstado() {

		EstadoPersistente persistente;
		EstadoTemporal temporal;

		boolean estaPersistente = this.estado.getPersistente() != null;
		if (estaPersistente && this.estado.getPersistente() != EstadoPersistente.NORMAL) {
			System.out.println("No se puede cambiar el estado de " + this.nombre + " dado que esta "
					+ this.estado.getPersistente().getMensaje());
			return;
		}

		for (Movimiento movimiento : movimientos) {
			if (this.estado.getTemporal() != null || this.estado.getOtros() == OtrosEstados.DEBILITADO) {
				EstadoPersistente estadoMovimiento = movimiento.getEstado().getPersistente();
				if (estadoMovimiento == EstadoPersistente.PARALIZADO || estadoMovimiento == EstadoPersistente.QUEMADO
						|| estadoMovimiento == EstadoPersistente.ENVENENADO
						|| estadoMovimiento == EstadoPersistente.GRAVEMENTE_ENVENENADO
						|| estadoMovimiento == EstadoPersistente.CONGELADO) {

					if (estaPersistente) {
						return;
					}

					persistente = estadoMovimiento;
					setEstado(new Estado(persistente));
					break;
				}
			}
			if (this.estado.getPersistente() != null || this.estado.getOtros() == OtrosEstados.DEBILITADO) {
				EstadoTemporal estadoMovimiento2 = movimiento.getEstado().getTemporal();
				if (estadoMovimiento2 == EstadoTemporal.CONFUSO || estadoMovimiento2 == EstadoTemporal.DORMIDO
						|| estadoMovimiento2 == EstadoTemporal.AMEDRENTADO
						|| estadoMovimiento2 == EstadoTemporal.DRENADORAS) {
					temporal = estadoMovimiento2;
					setEstado(new Estado(temporal));
					break;
				}
			}
		}

		if (this.vitalidadActual == 0) {
			setEstado(new Estado(OtrosEstados.DEBILITADO));
			System.out.println(this.nombre + " se ha debilitado.");
		}

	}

	/**
	 *
	 */

	public void aplicarEstado() {

		boolean estadoAplicado = false;
		int random = 0;

		switch (this.estado.getPersistente()) {
		case PARALIZADO:

			System.out.println(this.nombre + this.estado.getPersistente().getMensaje());

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
				setEstado(new Estado(EstadoPersistente.NORMAL));
			} else {
				System.out.println(this.nombre + " está congelado y no puede atacar");
				break;
			}

			break;
		default:

			break;

		}

		switch (this.estado.getTemporal()) {
		case CONFUSO:

			break;
		case DORMIDO:

			estadoAplicado = true;
			break;
		case AMEDRENTADO:

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

				this.vitalidadActual = this.vitalidadActual + 2;

			}

			this.vitalidadMaxima = this.vitalidadMaxima + (int) (Math.random() * (5 - 1)) + 1;
			this.ataqueMaxima = (int) (this.ataqueMaxima + (Math.random() * (5 - 1)) + 1);
			this.defensaMaxima = this.defensaMaxima + (int) (Math.random() * (5 - 1)) + 1;
			this.ataqueEspecialMaxima = this.ataqueEspecialMaxima + (int) (Math.random() * (5 - 1)) + 1;
			this.defensaEspecialMaxima = this.defensaEspecialMaxima + (int) (Math.random() * (5 - 1)) + 1;
			this.velocidadMaxima = this.velocidadMaxima + (int) (Math.random() * (5 - 1)) + 1;

			this.experienciaActual = this.experienciaActual - experienciaRequerida;
			this.nivel++;

			experienciaRequerida = getExperienciaTotal();

			System.out.println(this.nombre + " ha subido a nivel " + this.nivel);
		}

		System.out.println("Le queda a " + this.nombre + ", " + (experienciaRequerida - this.experienciaActual)
				+ " puntos de experiencia para subir de nivel.");

	}

	/**
	 * @param indiceAtaque
	 * @param rival
	 */

	public void atacarPokemon(int indiceAtaque, Pokemon rival) {

		if (this.estaminaActual < this.movimientos[indiceAtaque].getCostoEstamina()) {
			System.out.println(this.nombre + " no tiene suficiente estamina para atacar");
			return;
		} else {
			System.out.println("!" + this.nombre + " uso " + this.movimientos[indiceAtaque].getNombre() + "¡");

			this.estaminaActual = this.estaminaActual - this.movimientos[indiceAtaque].getCostoEstamina();

			int danio = formulaDanio(indiceAtaque, rival);

			if (danio >= rival.getVitalidadActual()) {
				rival.setVitalidadActual(0);
				rival.setEstado(new Estado(OtrosEstados.DEBILITADO));
				System.out.println(rival.getNombre() + " se ha debilitado");
			} else {
				rival.setVitalidadActual(rival.getVitalidadActual() - danio);
			}

			if (danio == 0) {
				System.out.println(rival.getNombre() + " no le afecta el ataque");
			} else {
				System.out.println("La vida de " + rival.getNombre() + " es de " + rival.getVitalidadActual());
			}

		}

	}

	/**
	 * Metodo de curar la vitalidad actual y estamina actual
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

		this.estaminaActual = this.estaminaMaxima;
	}

	/**
	 *
	 */
	public void recuperarEstadisticas() {

		this.ataqueActual = this.ataqueMaxima;
		this.defensaActual = this.defensaMaxima;
		this.ataqueEspecialActual = this.ataqueEspecialMaxima;
		this.defensaEspecialActual = this.defensaEspecialMaxima;
		this.velocidadActual = this.velocidadMaxima;

	}

	public void aprenderMovimiento() {

	}

	/**
	 * Metodo de generar las estadisticas base del pokemon al momento de la crianza
	 * o cuando creemos un pokemon por defecto, ya le pasamos directamente las
	 * estadisticas con el metodo
	 */
	private void generarIVS() {

//		this.vitalidadMaxima = (int) (Math.random() * (31 - 10)) + 10;
//		this.ataqueMaxima = (int) (Math.random() * (31 - 5)) + 5;
//		this.defensaMaxima = (int) (Math.random() * (31 - 5)) + 5;
//		this.ataqueEspecialMaxima = (int) (Math.random() * (31 - 5)) + 5;
//		this.defensaEspecialMaxima = (int) (Math.random() * (31 - 5)) + 5;
//		this.velocidadMaxima = (int) (Math.random() * (31 - 5)) + 5;

		// Cosas de prueba en la main
		int factor = (int) ((int) this.nivel * 2.5);
		this.vitalidadMaxima = (int) (Math.random() * ((31 - 10)) + 10) + factor;
		this.ataqueMaxima = (int) (Math.random() * ((31 - 5)) + 5) + factor;
		this.defensaMaxima = (int) (Math.random() * ((31 - 5)) + 5) + factor;
		this.ataqueEspecialMaxima = (int) (Math.random() * ((31 - 5)) + 5) + factor;
		this.defensaEspecialMaxima = (int) (Math.random() * ((31 - 5)) + 5) + factor;
		this.velocidadMaxima = (int) (Math.random() * ((31 - 5)) + 5) + factor;

		this.vitalidadActual = this.vitalidadMaxima;
		this.ataqueActual = this.ataqueMaxima;
		this.defensaActual = this.defensaMaxima;
		this.ataqueEspecialActual = this.ataqueEspecialMaxima;
		this.defensaEspecialActual = this.defensaEspecialMaxima;

	}

	/**
	 * Metodo de la formula de daño al momento del que pokemon del jugador utilice
	 * algun movimiento
	 * 
	 * B = Bonificación. Si el ataque es del mismo tipo que el Pokémon que lo lanza
	 * toma un valor de 1.5, si el ataque es de un tipo diferente al del Pokémon que
	 * lo lanza toma un valor de 1
	 * 
	 * E = Efectividad. Puede tomar los valores de 0, 0.25, 0.5, 1, 2 y 4.
	 * 
	 * V = Variación. Es una variable que comprende todos los valores discretos
	 * entre 85 y 100 (ambos incluidos).
	 * 
	 * N = Nivel del pokemon que ataca
	 * 
	 * A = Cantidad de ataque o ataque especial del Pokémon. Si el ataque que
	 * utiliza el Pokémon es físico se toma la cantidad de ataque y si es especial
	 * se toma la cantidad de ataque especial.
	 * 
	 * P = Poder del ataque, el potencial del ataque.
	 * 
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

	private int formulaDanio(int indiceMovimiento, Pokemon rival) {

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
	 * despues devolverla con un return
	 *
	 * @param tipoMovimientoAtacante es el tipo del pokemon atacante
	 * @param tipoObjetivo           es el tipo del pokemon objetivo
	 * @return nos devuelve el valor de la eficacia en double
	 */

	private double sacarEficacia(TipoPokemon tipoMovimientoAtacante, TipoPokemon[] tipoObjetivo) {

		int indiceAtacante = tipoMovimientoAtacante.getIndice();

		int indiceObjetivo = 0;
		int indiceObjetivoDoble = 0;
		double formula = 0;

		if (tipoObjetivo.length == 1) {
			indiceObjetivo = tipoObjetivo[0].getIndice();
			formula = Eficacias.EFICACIAS[indiceAtacante][indiceObjetivo];
		} else {
			indiceObjetivoDoble = sacarIndiceDoble(tipoObjetivo);
			formula = Eficacias.EFICACIAS_DOBLE[indiceObjetivoDoble][indiceAtacante];
		}

		return formula;
	}

	private int sacarIndiceDoble(TipoPokemon[] tipoDoble) {

		if (tipoDoble[0] == TipoPokemon.PLANTA && tipoDoble[1] == TipoPokemon.VENENO) {
			return 0;
		} else if (tipoDoble[0] == TipoPokemon.FUEGO && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 1;
		} else if (tipoDoble[0] == TipoPokemon.BICHO && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 2;
		} else if (tipoDoble[0] == TipoPokemon.BICHO && tipoDoble[1] == TipoPokemon.VENENO) {
			return 3;
		} else if (tipoDoble[0] == TipoPokemon.NORMAL && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 4;
		} else if (tipoDoble[0] == TipoPokemon.VENENO && tipoDoble[1] == TipoPokemon.TIERRA) {
			return 5;
		} else if (tipoDoble[0] == TipoPokemon.VENENO && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 6;
		} else if (tipoDoble[0] == TipoPokemon.BICHO && tipoDoble[1] == TipoPokemon.PLANTA) {
			return 7;
		} else if (tipoDoble[0] == TipoPokemon.AGUA && tipoDoble[1] == TipoPokemon.LUCHA) {
			return 8;
		} else if (tipoDoble[0] == TipoPokemon.AGUA && tipoDoble[1] == TipoPokemon.VENENO) {
			return 9;
		} else if (tipoDoble[0] == TipoPokemon.ROCA && tipoDoble[1] == TipoPokemon.TIERRA) {
			return 10;
		} else if (tipoDoble[0] == TipoPokemon.AGUA && tipoDoble[1] == TipoPokemon.PSIQUICO) {
			return 11;
		} else if (tipoDoble[0] == TipoPokemon.ACERO && tipoDoble[1] == TipoPokemon.ELECTRICO) {
			return 12;
		} else if (tipoDoble[0] == TipoPokemon.AGUA && tipoDoble[1] == TipoPokemon.HIELO) {
			return 13;
		} else if (tipoDoble[0] == TipoPokemon.FANTASMA && tipoDoble[1] == TipoPokemon.VENENO) {
			return 14;
		} else if (tipoDoble[0] == TipoPokemon.PLANTA && tipoDoble[1] == TipoPokemon.PSIQUICO) {
			return 15;
		} else if (tipoDoble[0] == TipoPokemon.TIERRA && tipoDoble[1] == TipoPokemon.ROCA) {
			return 16;
		} else if (tipoDoble[0] == TipoPokemon.HIELO && tipoDoble[1] == TipoPokemon.PSIQUICO) {
			return 17;
		} else if (tipoDoble[0] == TipoPokemon.AGUA && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 18;
		} else if (tipoDoble[0] == TipoPokemon.ROCA && tipoDoble[1] == TipoPokemon.AGUA) {
			return 19;
		} else if (tipoDoble[0] == TipoPokemon.ROCA && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 20;
		} else if (tipoDoble[0] == TipoPokemon.HIELO && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 21;
		} else if (tipoDoble[0] == TipoPokemon.ELECTRICO && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 22;
		} else if (tipoDoble[0] == TipoPokemon.DRAGON && tipoDoble[1] == TipoPokemon.VOLADOR) {
			return 23;
		}

		return 1;

	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", nivel=" + nivel + " ,tipo=" + Arrays.toString(getTipo())
				+ ", vitalidadActual=" + vitalidadActual + ", vitalidadMaxima=" + vitalidadMaxima + ", ataque="
				+ ataqueMaxima + ", defensa=" + defensaMaxima + ", ataqueEspecial=" + ataqueEspecialMaxima
				+ ", defensaEspecial=" + defensaEspecialMaxima + ", velocidad=" + velocidadMaxima + ", estaminaActual="
				+ estaminaActual + ", estaminaMaxima=" + estaminaMaxima + ", fertilidad=" + fertilidad + ", sexo="
				+ sexo + "]";
	}

}
