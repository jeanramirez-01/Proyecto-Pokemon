package entrenador;

import pokemon.Pokemon;

public class Objeto {

	private static final double PORCENTAJE_STATS_15 = 0.15;
	private static final double PORCENTAJE_STATS_20 = 0.20;
	private static final double PORCENTAJE_STATS_30 = 0.30;
	private static final double PORCENTAJE_STATS_50 = 0.50;

	private String nombreObjeto;

	// Constructor por defecto de objeto que solo es referencia de pokemon
	public Objeto() {
		this.nombreObjeto = "";
	}

	// Constructor para luego crear el nombre del Objeto
	public Objeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto.toUpperCase();
	}

	public String getNombreObjeto() {
		return nombreObjeto;
	}

	public void setNombreObjeto(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}

	// Metodos de aplicar estadisticas a los pokemon--------------------------------

	/**
	 * pesa: Aumenta el ataque y la defensa un 20%, pero disminuye su velocidad un
	 * 20%
	 * 
	 * @param pokemon
	 */
	public void aplicarPesa(Pokemon pokemon) {

		pokemon.setAtaque((int) (pokemon.getAtaque() + (pokemon.getAtaque() * PORCENTAJE_STATS_20)));
		pokemon.setDefensa((int) (pokemon.getDefensa() + (pokemon.getDefensa() * PORCENTAJE_STATS_20)));

		pokemon.setVelocidad((int) (pokemon.getVelocidad() - (pokemon.getVelocidad() * PORCENTAJE_STATS_20)));

	}

	/**
	 * pluma: Aumenta la velocidad un 30%, pero disminuye la defensa y la defensa
	 * especial en un 20%.
	 * 
	 * @param pokemon
	 */
	public void aplicarPluma(Pokemon pokemon) {

		pokemon.setVelocidad((int) (pokemon.getVelocidad() + (pokemon.getVelocidad() * PORCENTAJE_STATS_30)));

		pokemon.setDefensa((int) (pokemon.getDefensa() - (pokemon.getDefensa() * PORCENTAJE_STATS_20)));
		pokemon.setDefensaEspecial(
				(int) (pokemon.getDefensaEspecial() - (pokemon.getDefensaEspecial() * PORCENTAJE_STATS_20)));

	}

	/**
	 * chaleco: Aumenta la defensa y la defensa especial un 20%, pero disminuye la
	 * velocidad y el ataque un 15%.
	 * 
	 * @param pokemon
	 */
	public void aplicarChaleco(Pokemon pokemon) {

		pokemon.setDefensa((int) (pokemon.getDefensa() + (pokemon.getDefensa() * PORCENTAJE_STATS_20)));
		pokemon.setDefensaEspecial(
				(int) (pokemon.getDefensaEspecial() + (pokemon.getDefensaEspecial() * PORCENTAJE_STATS_20)));

		pokemon.setVelocidad((int) (pokemon.getVelocidad() - (pokemon.getVelocidad() * PORCENTAJE_STATS_15)));
		pokemon.setAtaque((int) (pokemon.getAtaque() - (pokemon.getAtaque() * PORCENTAJE_STATS_15)));
	}

	/**
	 * bastón: Aumenta la estamina un 20%, pero disminuye en un 15% la velocidad.
	 * 
	 * @param pokemon
	 */
	public void aplicarBaston(Pokemon pokemon) {

		pokemon.setEstaminaMaxima(
				(int) (pokemon.getEstaminaMaxima() + (pokemon.getEstaminaMaxima() * PORCENTAJE_STATS_20)));

		pokemon.setVelocidad((int) (pokemon.getVelocidad() - (pokemon.getVelocidad() * PORCENTAJE_STATS_15)));
	}

	/**
	 * pilas: Recupera la estamina actual en un 50% de la estamina maxima, pero
	 * disminuye la defensa especial un 30%.
	 * 
	 * @param pokemon
	 */

	public void consumirPilas(Pokemon pokemon) {

		pokemon.setEstaminaActual(
				(int) (pokemon.getEstaminaActual() + (pokemon.getEstaminaMaxima() * PORCENTAJE_STATS_50)));
		pokemon.setDefensaEspecial(
				(int) (pokemon.getDefensaEspecial() - (pokemon.getDefensaEspecial() * PORCENTAJE_STATS_30)));
	}

}
