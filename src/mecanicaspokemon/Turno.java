package mecanicaspokemon;

public class Turno {

	private int contadorTurnos = 0;
	private Entrenador jugador;
	private Entrenador rival;

	public Turno() {
		super();
		this.contadorTurnos = 0;
		this.jugador = new Entrenador();
		this.rival = new Entrenador();
	}

	public Turno(int contadorTurnos, Entrenador jugador, Entrenador rival) {
		super();
		this.contadorTurnos = contadorTurnos;
		this.jugador = jugador;
		this.rival = rival;
	}

	public int getContadorTurnos() {
		return contadorTurnos;
	}

	public void setContadorTurnos(int contadorTurnos) {
		this.contadorTurnos = contadorTurnos;
	}

	public Entrenador getJugador() {
		return jugador;
	}

	public void setJugador(Entrenador jugador) {
		this.jugador = jugador;
	}

	public Entrenador getRival() {
		return rival;
	}

	public void setRival(Entrenador rival) {
		this.rival = rival;
	}

	public void generarTurno() {

		contadorTurnos++;

	}

}
