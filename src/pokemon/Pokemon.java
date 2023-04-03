package pokemon;

import combate.Movimiento;
import entrenador.Objeto;

public class Pokemon {

	protected String nombre;
	protected String mote;
	protected int vitalidadMaxima;
	protected int vitalidadActual;
	protected int ataque;
	protected int defensa;
	protected int ataqueEspecial;
	protected int defensaEspecial;
	protected int velocidad;
	protected int estaminaMaxima;
	protected int estaminaActual;
	protected int nivel;
	protected Movimiento[] movimiento;
	protected int fertilidad;
	protected char sexo;
	protected Tipo[] tipos;
	protected Estado estado;
	protected Objeto objeto;
	protected int experiencia;

	public Pokemon() {

		generarEstadisticas();
		this.nombre = "";
		this.mote = "";
		this.vitalidadActual = vitalidadMaxima;
		this.estaminaMaxima = 100;
		this.estaminaActual = estaminaMaxima;
		this.nivel = 1;
//		this.movimiento = new Movimiento[4];
		this.fertilidad = 5;
		this.sexo = ' ';
//		this.tipos = new Tipo[2];
//		this.estado = new Estado();
//		this.objeto = new Objeto();
		this.experiencia = 0;

	}

	// Constructor de prueba para la clase main
	public Pokemon(String nombre, Objeto objeto, int ataque, int defensa, int ataqueEspecial, int defensaEspecial,
			int velocidad) {
		this.nombre = nombre;
		this.objeto = objeto;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataqueEspecial = ataqueEspecial;
		this.defensaEspecial = defensaEspecial;
		this.velocidad = velocidad;

	}

	public Pokemon(String nombre, String mote, int vitalidadActual, int vitalidadMaxima, int ataque, int defensa,
			int ataqueEspecial, int defensaEspecial, int velocidad, int estaminaActual, int estaminaMaxima, int nivel,
			Movimiento[] movimiento, int fertilidad, char sexo, Tipo[] tipos, Estado estado, Objeto objeto,
			int experiencia) {
		super();
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidadMaxima = vitalidadMaxima;
		this.vitalidadActual = vitalidadActual;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataqueEspecial = ataqueEspecial;
		this.defensaEspecial = defensaEspecial;
		this.velocidad = velocidad;
		this.estaminaMaxima = estaminaMaxima;
		this.estaminaActual = estaminaActual;
		this.nivel = nivel;
		this.movimiento = movimiento;
		this.fertilidad = fertilidad;
		this.sexo = sexo;
		this.tipos = tipos;
		this.estado = estado;
		this.objeto = objeto;
		this.experiencia = experiencia;
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

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	// Metodos de pokemon-----------------------------------------------------------

	/**
	 * Es el metodo de aplicar el objeto. Le pasamos el nombre del objeto de tipo
	 * string para que cada caso del switch analize que objeto tiene el pokemon
	 * 
	 * @param pokemon
	 */
	public void aplicarObjeto(Pokemon pokemon) {

		switch (this.objeto.getNombreObjeto()) {
		case "PESA":
			this.objeto.aplicarPesa(pokemon);
			break;
		case "PLUMA":
			this.objeto.aplicarPluma(pokemon);
			break;
		case "CHALECO":
			this.objeto.aplicarChaleco(pokemon);
			break;
		case "BASTON":
			this.objeto.aplicarBaston(pokemon);
			break;
		case "PILAS":
			this.objeto.consumirPilas(pokemon);
			break;
		}
	}

	/**
	 * Metodo de subir nivel en el cual si la experiencia del pokemon es al nivel
	 * del pokemon * 10, entonces lo primero sube de nivel y luego aplica a todas
	 * las estadisticas un aumento de 1 entre 5
	 * 
	 */
	public void subirNivel() {

		if (this.experiencia == this.nivel * 10) {

			this.nivel++;
			this.vitalidadMaxima = (int) (Math.random() * (5 - 1)) + 1;
			this.ataque = (int) (Math.random() * (5 - 1)) + 1;
			this.defensa = (int) (Math.random() * (5 - 1)) + 1;
			this.ataqueEspecial = (int) (Math.random() * (5 - 1)) + 1;
			this.defensaEspecial = (int) (Math.random() * (5 - 1)) + 1;
			this.velocidad = (int) (Math.random() * (5 - 1)) + 1;
		} else {
			int experienciatotal = this.nivel * 10;
			int experienciarestante = this.experiencia - experienciatotal;
			System.out.println("Le queda " + experienciarestante + " para subir de nivel");
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
