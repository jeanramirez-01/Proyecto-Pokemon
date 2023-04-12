package pokemon;

import combate.Eficacias;
import combate.Eficacias.EficaciasPokemon;
import combate.Estado;
import combate.Movimiento;
import combate.Movimiento.TipoAtaque;
import combate.Movimiento.TipoAtaque;
import entrenador.Objeto;

public class Pokemon {

	private String nombre;
	private String mote;
	private int vitalidadMaxima;
	private int vitalidadActual;
	private int ataque;
	private int defensa;
	private int ataqueEspecial;
	private int defensaEspecial;
	private int velocidad;
	private int estaminaMaxima;
	private int estaminaActual;
	private int nivel;
	private Movimiento[] movimientos;
	private int fertilidad;
	private char sexo;
	private Tipo tipo;
	private Estado estado;
	private Objeto objeto;
	private int experienciaActual;
	private int experienciaTotal;

	// Constructor por defecto
	public Pokemon() {

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
		generarIVS();

	}

	// Constructor de prueba para la clase main
	public Pokemon(String nombre, int nivel, Objeto objeto, int experienciaActual, int vitalidadActual) {

		this.nombre = nombre;
		this.nivel = nivel;
		this.objeto = objeto;
		this.experienciaActual = experienciaActual;
		this.vitalidadActual = vitalidadActual;
		generarIVS();

	}

	public Pokemon(String nombre, String mote, int vitalidadMaxima, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estaminaMaxima, int nivel, Movimiento[] movimiento, int fertilidad,
			char sexo, Tipo tipo, Estado estado, Objeto objeto, int experienciaActual) {
		super();
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidadMaxima = vitalidadMaxima;
		this.vitalidadActual = vitalidadMaxima;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataqueEspecial = ataqueEspecial;
		this.defensaEspecial = defensaEspecial;
		this.velocidad = velocidad;
		this.estaminaMaxima = estaminaMaxima;
		this.estaminaActual = estaminaMaxima;
		this.nivel = nivel;
		this.movimientos = movimiento;
		this.fertilidad = fertilidad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.estado = estado;
		this.objeto = objeto;
		this.experienciaActual = experienciaActual;
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

	public int getVitalidadActual() {
		return vitalidadActual;
	}

	public void setVitalidadActual(int vitalidadActual) {
		this.vitalidadActual = vitalidadActual;
	}

	public int getVitalidadMaxima() {
		return vitalidadMaxima;
	}

	public void setVitalidadMaxima(int vitalidadMaxima) {
		this.vitalidadMaxima = vitalidadMaxima;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public int getDefensaEspecial() {
		return defensaEspecial;
	}

	public void setDefensaEspecial(int defensaEspecial) {
		this.defensaEspecial = defensaEspecial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
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

	public Movimiento[] getMovimiento() {
		return movimientos;
	}

	public void setMovimiento(Movimiento[] movimiento) {
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
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
	 * 
	 */

	public void aplicarEfectoObjeto() {

		if (tieneObjeto()) {

			switch (this.objeto.getTipo()) {
			case PESA:

				this.ataque = (int) (this.ataque + (this.ataque * 0.20));
				this.defensa = (int) (this.defensa + (this.defensa * 0.20));

				this.velocidad = (int) (this.velocidad - (this.velocidad * 0.20));
				break;
			case PLUMA:

				this.velocidad = (int) (this.velocidad + (this.velocidad * 0.30));

				this.defensa = (int) (this.defensa - (this.defensa * 0.20));
				this.defensaEspecial = (int) (this.defensaEspecial - (this.defensaEspecial * 0.20));
				break;
			case CHALECO:

				this.defensa = (int) (this.defensa + (this.defensa * 0.20));
				this.defensaEspecial = (int) (this.defensaEspecial + (this.defensaEspecial * 0.20));

				this.ataque = (int) (this.ataque - (this.ataque * 0.15));
				this.velocidad = (int) (this.velocidad - (this.velocidad * 0.15));
				break;
			case BASTON:

				this.estaminaMaxima = (int) (this.estaminaMaxima + (this.estaminaMaxima * 0.20));

				this.velocidad = (int) (this.velocidad - (this.velocidad * 0.15));
				break;
			case PILAS:

				this.estaminaActual = (int) (this.estaminaActual + (this.estaminaMaxima * 0.50));

				this.defensaEspecial = (int) (this.defensaEspecial - (this.defensaEspecial * 0.30));
				break;
			}

		}

	}

	/**
	 * Metodo subir nivel en el cual, tenemos de condicion que si la experiencia
	 * actual del pokemon es mayor o igual que la experiencia total requirida para
	 * subir de nivel en la que le pasamos el total con el getExperienciaTotal(), en
	 * el mensaje nos mostrara la experiencia faltante para subir de nivel.
	 * 
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
		if (this.experienciaActual >= getExperienciaTotal()) {

			System.out.println(this.nombre + " ha subido de nivel!");

			this.vitalidadMaxima = this.vitalidadMaxima + (int) (Math.random() * (5 - 1)) + 1;
			this.ataque = (int) (this.ataque + (Math.random() * (5 - 1)) + 1);
			this.defensa = this.defensa + (int) (Math.random() * (5 - 1)) + 1;
			this.ataqueEspecial = this.ataqueEspecial + (int) (Math.random() * (5 - 1)) + 1;
			this.defensaEspecial = this.defensaEspecial + (int) (Math.random() * (5 - 1)) + 1;
			this.velocidad = this.velocidad + (int) (Math.random() * (5 - 1)) + 1;

			if (this.experienciaActual > getExperienciaTotal()) {

				this.experienciaActual = this.experienciaActual - getExperienciaTotal();
				System.out.println("La experiencia de " + this.nombre + " es : " + this.experienciaActual);

			}

			this.nivel++;

		} else {
			System.out.println("Le queda a " + this.nombre + ", " + (getExperienciaTotal() - this.experienciaActual)
					+ " puntos de experiencia para subir de nivel.");
		}

	}

	public void atacarPokemon() {

	}

	/**
	 * Metodo de curar la vitalidad actual y estamina actual
	 */
	
	public void recuperarTotal() {

		this.vitalidadActual = this.vitalidadMaxima;
		this.estaminaActual = this.estaminaMaxima;

	}

	public void aprenderMovimiento() {

	}

	/**
	 * Metodo de generar las estadisticas base del pokemon al momento de la crianza
	 * o cuando creemos un pokemon por defecto, ya le pasamos directamente las
	 * estadisticas con el metodo
	 * 
	 */
	private void generarIVS() {

		this.vitalidadMaxima = (int) (Math.random() * (31 - 10)) + 10;
		this.ataque = (int) (Math.random() * (31 - 5)) + 5;
		this.defensa = (int) (Math.random() * (31 - 5)) + 5;
		this.ataqueEspecial = (int) (Math.random() * (31 - 5)) + 5;
		this.defensaEspecial = (int) (Math.random() * (31 - 5)) + 5;
		this.velocidad = (int) (Math.random() * (31 - 5)) + 5;

		// Cosas de prueba en la main
//		int factor = (int) ((int) nivel * 2.5);
//		this.vitalidadMaxima = (int) (Math.random() * ((31 - 10)) + 10) + factor;
//		this.ataque = (int) (Math.random() * ((31 - 5)) + 5) + factor;
//		this.defensa = (int) (Math.random() * ((31 - 5)) + 5) + factor;
//		this.ataqueEspecial = (int) (Math.random() * ((31 - 5)) + 5) + factor;
//		this.defensaEspecial = (int) (Math.random() * ((31 - 5)) + 5) + factor;
//		this.velocidad = (int) (Math.random() * ((31 - 5)) + 5) + factor;
	}

	/**
	 * Metodo de la formula de daño al momento del que pokemon del jugador utilice
	 * algun movimiento
	 * 
	 * B = Bonificación. Si el ataque es del mismo tipo que el Pokémon que lo lanza
	 * toma un valor de 1.5, si el ataque es de un tipo diferente al del Pokémon que
	 * lo lanza toma un valor de 1
	 * 
	 * E = Efectividad. Puede tomar los valores de 0, 0.5, 1, 2 y 4.
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
	 * @param indiceMovimiento es el numero de movimiento, de los movimientos
	 *                         disponibles del pokemon del jugador
	 * @param jugador          le pasamos el pokemon que esta atacando
	 * @param rival            el pokemon rival al que vamos atacar
	 * 
	 * @return nos devuelve el ataque en base a las estadisticas de los dos pokemon
	 */

	private int formulaDanio(int indiceMovimiento, Pokemon jugador, Pokemon rival) {

		double B, E;
		int V, N, A, D, P;
//		E = calcularEfectividad(movimiento[indiceMovimiento].getTipoMovimiento(), rival.tipo);

		if (movimientos[indiceMovimiento].getTipoMovimiento() == this.tipo) {
			B = 1.5;
		} else {
			B = 1.0;
		}

		E = sacarEficacia(jugador.getTipo(), rival.getTipo());

		V = (int) (Math.random() * 100 - 85) + 85;

		N = this.nivel;

		P = movimientos[indiceMovimiento].getPotencia();

		if (movimientos[indiceMovimiento].getTipo() == TipoAtaque.FISICO) {
			A = this.ataque;
			D = rival.defensa;
		} else {
			A = this.ataqueEspecial;
			D = rival.defensaEspecial;
		}

		int formula = (int) ((0.01 * B * E * V) * (((0.2 * N + 1) * A * P) / (25 * D)) + 2);

		return formula;
	}

	/**
	 * Tenemos un metodo en el cual le pasamos por parametros los tipo del pokemon
	 * del jugador y del pokemon rival, para que luego con un switch tendremos todos
	 * los tipos posibles y en el caso que coincida con el tipo del rival, entonces
	 * nos devolveria el valor de efectividad para el calculo de la formula de daño
	 * 
	 * @param tipoMovimiento del pokemon del jugador
	 * @param tipoRival      de movimiento del pokemon rival
	 * @return nos devuelve el valor en double de la efectividad en base del pokemon
	 *         del jugador y del pokemon rival
	 */

	private double calcularEfectividad(Tipo tipoMovimiento, Tipo tipoRival) {

		// Cogemos de referencia la tabla de tipos de segunda generacion pero sin
		// utilizar los tipos acero y siniestro para la tabla

		double efectividad = 0;

		switch (tipoMovimiento.getTipo()) {
		case NORMAL:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.ROCA) {
				efectividad = 0.5;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.FANTASMA) {
				efectividad = 0.0;
			} else {
				efectividad = 1.0;
			}
			break;
		case FUEGO:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA || tipoRival.getTipo() == Tipo.TipoPokemon.HIELO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.BICHO) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.FUEGO || tipoRival.getTipo() == Tipo.TipoPokemon.AGUA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.ROCA || tipoRival.getTipo() == Tipo.TipoPokemon.DRAGON) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case AGUA:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.FUEGO || tipoRival.getTipo() == Tipo.TipoPokemon.TIERRA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.ROCA) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.AGUA || tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.DRAGON) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case PLANTA:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.AGUA || tipoRival.getTipo() == Tipo.TipoPokemon.TIERRA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.ROCA) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.FUEGO || tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.VOLADOR || tipoRival.getTipo() == Tipo.TipoPokemon.VENENO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.BICHO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.DRAGON) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case ELECTRICO:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.AGUA || tipoRival.getTipo() == Tipo.TipoPokemon.VOLADOR) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.ELECTRICO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.DRAGON) {
				efectividad = 0.5;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.TIERRA) {
				efectividad = 0.0;
			} else {
				efectividad = 1.0;
			}
			break;
		case HIELO:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA || tipoRival.getTipo() == Tipo.TipoPokemon.TIERRA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.VOLADOR
					|| tipoRival.getTipo() == Tipo.TipoPokemon.DRAGON) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.AGUA || tipoRival.getTipo() == Tipo.TipoPokemon.HIELO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.FUEGO) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case LUCHA:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.NORMAL || tipoRival.getTipo() == Tipo.TipoPokemon.HIELO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.ROCA) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.VENENO || tipoRival.getTipo() == Tipo.TipoPokemon.VOLADOR
					|| tipoRival.getTipo() == Tipo.TipoPokemon.PSIQUICO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.BICHO) {
				efectividad = 0.5;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.FANTASMA) {
				efectividad = 0.0;
			} else {
				efectividad = 1.0;
			}
			break;
		case VENENO:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.VENENO || tipoRival.getTipo() == Tipo.TipoPokemon.TIERRA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.ROCA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.FANTASMA) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case TIERRA:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.FUEGO || tipoRival.getTipo() == Tipo.TipoPokemon.ELECTRICO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.VENENO || tipoRival.getTipo() == Tipo.TipoPokemon.ROCA) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.BICHO) {
				efectividad = 0.5;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.VOLADOR) {
				efectividad = 0.0;
			} else {
				efectividad = 1.0;
			}
			break;
		case VOLADOR:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA || tipoRival.getTipo() == Tipo.TipoPokemon.LUCHA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.BICHO) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.ELECTRICO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.ROCA) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case PSIQUICO:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.LUCHA || tipoRival.getTipo() == Tipo.TipoPokemon.VENENO) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.PSIQUICO) {
				efectividad = 0.5;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.FANTASMA) {
				efectividad = 0.0;
			} else {
				efectividad = 1.0;
			}
			break;
		case BICHO:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.PLANTA || tipoRival.getTipo() == Tipo.TipoPokemon.PSIQUICO) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.FUEGO || tipoRival.getTipo() == Tipo.TipoPokemon.LUCHA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.VOLADOR
					|| tipoRival.getTipo() == Tipo.TipoPokemon.ROCA) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case ROCA:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.FUEGO || tipoRival.getTipo() == Tipo.TipoPokemon.HIELO
					|| tipoRival.getTipo() == Tipo.TipoPokemon.VOLADOR
					|| tipoRival.getTipo() == Tipo.TipoPokemon.BICHO) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.LUCHA
					|| tipoRival.getTipo() == Tipo.TipoPokemon.TIERRA) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}
			break;
		case FANTASMA:
			if (tipoRival.getTipo() == Tipo.TipoPokemon.PSIQUICO || tipoRival.getTipo() == Tipo.TipoPokemon.FANTASMA) {
				efectividad = 2.0;
			} else if (tipoRival.getTipo() == Tipo.TipoPokemon.NORMAL) {
				efectividad = 0.5;
			} else {
				efectividad = 1.0;
			}

		case DRAGON:

			if (tipoRival.getTipo() == Tipo.TipoPokemon.DRAGON) {
				efectividad = 2.0;
			} else {
				efectividad = 1.0;
			}

		}

		return efectividad;
	}

	/**
	 * En este metodo primero declaramos dos variables para guardar los indices de
	 * los pokemon, para que luego llamemos a una matriz donde se guarda la tabla de
	 * tipos pokemon, en el cual le pasamos el indice del atacante y del indice del
	 * objetivo para guardar el valor del matriz en una variable de tipo double y
	 * despues devolverla con un return
	 * 
	 * @param atacante es el tipo del pokemon atacante
	 * @param objetivo es el tipo del pokemon objetivo
	 * @return nos devuelve el valor de la efecacia en double
	 */

	private double sacarEficacia(Tipo atacante, Tipo objetivo) {
		int indiceAtacante = atacante.getTipo().getIndice();
		int indiceObjetivo = objetivo.getTipo().getIndice();
		double eficacia = Eficacias.EFICACIAS[indiceAtacante][indiceObjetivo];

		return eficacia;
	}

	

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", mote=" + mote + ", vitalidadActual=" + vitalidadActual
				+ ", vitalidadMaxima=" + vitalidadMaxima + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial + ", velocidad="
				+ velocidad + ", estaminaActual=" + estaminaActual + ", estaminaMaxima=" + estaminaMaxima + ", nivel="
				+ nivel + ", fertilidad=" + fertilidad + ", sexo=" + sexo + "]";
	}

}
