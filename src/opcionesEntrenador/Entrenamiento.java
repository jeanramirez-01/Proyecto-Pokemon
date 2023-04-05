package opcionesEntrenador;

public class Entrenamiento {

	public enum TipoEntrenamiento {

		PESADO("Se gastan 20*NIVEL pokédolares y se aumentan las estadísticas de defensa, defensa especial y vitalidad en 5 puntos."),
		FURIOSO("Se gastan 30*NIVEL pokédolares y se aumentan las estadísticas de ataque, ataque especial y velocidad en 5 puntos."),
		FUNCIONAL(
				"Se gastan 40*NIVEL pokédolares y se aumentan las estadísticas de velocidad, ataque, defensa y vitalidad en 5 puntos."),
		ONIRICO("Se gastan 40*NIVEL pokédolares y se aumentan las estadísticas de velocidad, ataque especial, defensa especial y vitalidad en 5 puntos.");

		private String descripcion;

		private TipoEntrenamiento(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getDescripcion() {
			return descripcion;
		}

	}

	private TipoEntrenamiento tipo;

	public Entrenamiento(TipoEntrenamiento tipo) {
		super();
		this.tipo = tipo;
	}

	public TipoEntrenamiento getTipo() {
		return tipo;
	}

}
