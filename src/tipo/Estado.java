package tipo;

import pokemon.Pokemon;

public class Estado extends Pokemon{

	public enum estadoPersistente {

		PARALIZADO, // 0.25 No atacar
		QUEMADO, ENVENENADO, 
		GRAVEMENTE_ENVENENADO, 
		DORMIDO, // No atacar
		CONGELADO, // 0.5 no atacar
		HELADO, 
//		SOMNOLIENTO,
		DEBILITADO,

	}

	public enum estadoTemporal {

		CONFUSO, 
//		ENAMORADO, 
//		ATRAPADO, 
//		MALDITO, 
		DRENADORAS, 
//		CANTO_MORTAL, 
//		CENTRO_DE_ATENCION, 
		AMEDRENTADO,

	}

	private Pokemon pokemon;
	private String mensaje;
	private int turnos; // Clase turnos.

	void EstadoPokemon(String mensaje, int turnos) {
		this.mensaje = mensaje;
		this.turnos = turnos;

	}

	public String getMensaje() {
		return mensaje;
	}

	public int getTurnos() {
		return turnos;
	}

	//ESTADOS PERSISTENTES
	
	public void paralizado(int ataque, int velocidad) {

		//0.25 de probabilidad de no atacar.

		this.velocidad = (int) (velocidad * 0.5);

	}

	public boolean quemado(int vitalidad, int ataque) {

		if (true) {

			this.ataque = (int) (ataque * 0.5);

			this.vitalidad = (int) (vitalidad - (vitalidad * 0.0625));
			
		}

		return false;

	}

	public boolean envenenado(int vitalidad) {

		if (true) {

			this.vitalidad = (int) (vitalidad - (vitalidad * 0.125));

		}

		return false;

	}

	public boolean gravementeEnvenenado(int vitalidad, int ataque) {

		if (true) {

			this.vitalidad = (int) (vitalidad - (vitalidad * 0.125));
			this.ataque = (int) (ataque + ataque * 0.0625);

		}

		return false;

	}

	public boolean helado(int vitalidad, int ataqueEspecial) {

		if (true) {

			this.ataqueEspecial = (int) (ataqueEspecial * 0.5);

			this.vitalidad = (int) (vitalidad - (vitalidad * 0.0625));

		}

		return false;

	}

	public boolean debilitado(int vitalidad) {

		if (true) {

			this.vitalidad = 0;

		}

		return false;

	}
	
	public boolean congelado(int defensa, int defensaEspecial) {
		
		if (true) {
			
			this.defensa = (int) (defensa - (defensa * 0.25));
			this.defensaEspecial = (int) (defensa - (defensa * 0.25));
			
		}
		
		return false;
		
		
	}
	
	public boolean dormido
	
	//ESTADOS TEMPORALES
	
	public boolean confuso
	
//	public boolean enamorado
	
//	public boolean atrapado
	
//	public boolean maldito (int vitalidad, String tipo) {
//		
//		
//		
//	}		
	
	public boolean drenadoras
	
//	public boolean cantoMortal
	
//	public boolean centroDeAtencion
	
	public boolean amedrentado
	
}