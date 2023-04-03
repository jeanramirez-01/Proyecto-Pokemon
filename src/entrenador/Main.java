package entrenador;

import pokemon.*;

public class Main {

	public static void main(String[] args) {

		Objeto obj1 = new Objeto("Pluma");

		Pokemon pk1 = new Pokemon("Pokachu", obj1, 60, 60, 60, 60, 60);
		Pokemon pk2 = new Pokemon("Charmander", obj1, 60, 60, 60, 60, 60);
		Pokemon pk3 = new Pokemon("Squirtle", obj1, 60, 60, 60, 60, 60);
		Pokemon pk4 = new Pokemon("Bulbasur", obj1, 60, 60, 60, 60, 60);
		Pokemon pk5 = new Pokemon("Dragonite", obj1, 60, 60, 60, 60, 60);
		Pokemon pk6 = new Pokemon("Mew", obj1, 60, 60, 60, 60, 60);

		Pokemon[] equipo = new Pokemon[6];

		equipo[0] = pk1;
		equipo[1] = pk2;
		equipo[2] = pk3;
		equipo[3] = pk4;
		equipo[4] = pk5;

		Entrenador jugador = new Entrenador();

		jugador.setEquipo(equipo);

		pk1.aplicarObjeto(pk1);

		for (Pokemon pokemon : equipo) {
			if (pokemon != null) {
				System.out.println(pokemon.getNombre());
			}
		}

		System.out.println();

		jugador.moverEquipo(3, 0);

		System.out.println();
		for (Pokemon pokemon : equipo) {
			if (pokemon != null) {
				System.out.println(pokemon.getNombre());
			}
		}

	}

}
