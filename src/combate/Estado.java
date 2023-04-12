package combate;

public class Estado {

	public enum EstadoPersistente {

		PARALIZADO, // 0.25 No atacar
		QUEMADO, 
		ENVENENADO, 
		GRAVEMENTE_ENVENENADO, 
		DORMIDO, // No atacar
		CONGELADO, // 0.5 no atacar
		HELADO,
//		SOMNOLIENTO,
		DEBILITADO,

	}

	public enum EstadoTemporal {

		CONFUSO,
//		ENAMORADO, 
//		ATRAPADO, 
//		MALDITO, 
		DRENADORAS,
//		CANTO_MORTAL, 
//		CENTRO_DE_ATENCION, 
		AMEDRENTADO,

	}

	private String mensaje;
	private Turno turnos; // Clase turnos.

	void EstadoPokemon(String mensaje, Turno turnos) {
		this.mensaje = mensaje;
		this.turnos = new Turno();

	}

	public String getMensaje() {
		return mensaje;
	}

	public Turno getTurnos() {
		return turnos;
	}

	// ESTADOS PERSISTENTES---------------------------------------------------

//	public void paralizado(Pokemon pokemon) {
//
//		// 0.25 de probabilidad de no atacar.
//
//		pokemon.setVelocidad((int) (pokemon.getVelocidad() * 0.5));
//
//	}
//
//	public boolean quemado(int vitalidad, int ataque) {
//
//		if (true) {
//
//			this.ataque = (int) (ataque * 0.5);
//
//			this.vitalidadActual = (int) (vitalidad - (vitalidad * 0.0625));
//
//		}
//
//		return false;
//
//	}
//
//	public boolean envenenado(int vitalidad) {
//
//		if (true) {
//
//			this.vitalidadActual = (int) (vitalidad - (vitalidad * 0.125));
//
//		}
//
//		return false;
//
//	}
//
//	public boolean gravementeEnvenenado(int vitalidad, int ataque) {
//
//		if (true) {
//
//			this.vitalidadActual = (int) (vitalidad - (vitalidad * 0.125));
//			this.ataque = (int) (ataque + ataque * 0.0625);
//
//		}
//
//		return false;
//
//	}
//
//	public boolean helado(int vitalidad, int ataqueEspecial) {
//
//		if (true) {
//
//			this.ataqueEspecial = (int) (ataqueEspecial * 0.5);
//
//			this.vitalidadActual = (int) (vitalidad - (vitalidad * 0.0625));
//
//		}
//
//		return false;
//
//	}
//
//	public boolean debilitado(int vitalidad) {
//
//		if (true) {
//
//			this.vitalidadActual = 0;
//
//		}
//
//		return false;
//
//	}
//
//	public boolean congelado(int defensa, int defensaEspecial) {
//
//		if (true) {
//
//			this.defensa = (int) (defensa - (defensa * 0.25));
//			this.defensaEspecial = (int) (defensa - (defensa * 0.25));
//
//		}
//
//		return false;
//
//	}
//
////	public boolean dormido
//
//	public boolean dormido() {
//
//		// 1 a 3 turnos dormido y sin atacar
//
//		return false;
//
//	}
//
//	// ESTADOS TEMPORALES---------------------------------------------------
//
////	public boolean confuso
//
//	public boolean confuso() {
//
//		// 0.33 de herirse a sí mismo
//
//		return false;
//
//	}
//
////	public boolean enamorado
//
////	public boolean atrapado
//
////	public boolean maldito (int vitalidad, String tipo) 		
//
////	public boolean drenadoras
//
//	public boolean drenadoras() {
//
//		// 1/8 de ps totales perdidos y recuperados por rival
//
//		return false;
//
//	}
//
////	public boolean cantoMortal
//
////	public boolean centroDeAtencion
//
////	public boolean amedrentado
//
//	public boolean amedrentado() {
//
//		// retrocede y no ataca
//
//		return false;
//
//	}

}