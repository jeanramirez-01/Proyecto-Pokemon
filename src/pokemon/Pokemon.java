package pokemon;

import combate.Estado;
import combate.Movimiento;
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
	private Movimiento[] movimiento;
	private int fertilidad;
	private char sexo;
	private Tipo[] tipos;
	private Estado estado;
	private Objeto objeto;
	private int experienciaActual;
	private int experienciaTotal;

	public Pokemon() {

		generarEstadisticas();
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
//		this.estado = new Estado();
//		this.objeto = new Objeto();
		this.experienciaActual = 1;

	}

	// Constructor de prueba para la clase main
	public Pokemon(String nombre, int nivel, Objeto objeto, int experienciaActual) {

		generarEstadisticas();
		this.vitalidadActual = this.vitalidadMaxima;
		this.nombre = nombre;
		this.nivel = nivel;
		this.objeto = objeto;
		this.experienciaActual = experienciaActual;

	}

	public Pokemon(String nombre, String mote, int vitalidadMaxima, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estaminaMaxima, int nivel, Movimiento[] movimiento, int fertilidad,
			char sexo, Tipo[] tipos, Estado estado, Objeto objeto, int experienciaActual) {
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
		this.movimiento = movimiento;
		this.fertilidad = fertilidad;
		this.sexo = sexo;
		this.tipos = tipos;
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
		return movimiento;
	}

	public void setMovimiento(Movimiento[] movimiento) {
		this.movimiento = movimiento;
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

	public Tipo[] getTipos() {
		return tipos;
	}

	public void setTipos(Tipo[] tipos) {
		this.tipos = tipos;
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

		if (this.experienciaActual >= getExperienciaTotal()) {

			System.out.println(this.nombre + " ha subido de nivel!");

			this.vitalidadMaxima = this.vitalidadMaxima + (int) (Math.random() * (5 - 1)) + 1;
			this.ataque = (int) (this.ataque + (Math.random() * (5 - 1)) + 1);
			this.defensa = this.defensa + (int) (Math.random() * (5 - 1)) + 1;
			this.ataqueEspecial = this.ataqueEspecial + (int) (Math.random() * (5 - 1)) + 1;
			this.defensaEspecial = this.defensaEspecial + (int) (Math.random() * (5 - 1)) + 1;
			this.velocidad = this.velocidad + (int) (Math.random() * (5 - 1)) + 1;

			if (this.experienciaActual >= getExperienciaTotal()) {

				this.experienciaActual = this.experienciaActual - getExperienciaTotal();
				System.out.println("La experiencia de " + this.nombre + " es de: " + getExperienciaActual());

			}

			this.nivel++;

		} else {
			System.out.println("Le queda " + (getExperienciaTotal() - getExperienciaActual())
					+ " puntos de experiencia para subir de nivel");
		}

	}

	public void generarEstadisticas() {

		this.vitalidadMaxima = (int) (Math.random() * (31 - 10)) + 10;
		this.ataque = (int) (Math.random() * (31 - 5)) + 5;
		this.defensa = (int) (Math.random() * (31 - 5)) + 5;
		this.ataqueEspecial = (int) (Math.random() * (31 - 5)) + 5;
		this.defensaEspecial = (int) (Math.random() * (31 - 5)) + 5;
		this.velocidad = (int) (Math.random() * (31 - 5)) + 5;
	}

	public void atacarPokemon() {

	}

	public void recuperarTotal() {

		this.vitalidadActual = this.vitalidadMaxima;
		this.estaminaActual = this.estaminaMaxima;

	}

	public void aprenderMovimiento() {

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
