package combate;

import pokemon.Pokemon;
import tipo.Estado;
import entrenador.Entrenador;

public class Turno extends Entrenador{
	
	protected int contadorTurnos = 0;
	protected  Entrenador pokemonEntrenador;
	protected Entrenador pokemonJugador;
	
	public static void contadorTurnos () {
		
		Pokemon[] pokemonEquipoJugador = new Pokemon [equipo];
		
		do {
			
//			(contadorTurnos < 500)
				contadorTurnos ++;
			
		} while (pokemonJugador.debilitado || pokemonEntrenador.debilitado) { //try/catch
			
			System.out.println(contadorTurnos)
		}
	}
	
	
}
