package pokemon;

import java.util.ArrayList;

import combate.Movimiento;
import combate.Movimiento.TipoAtaque;

public class ListaPokemonRandom {

	public Pokemon generarPokemonRandom() {

		ArrayList<Pokemon> listaPokemon = new ArrayList<>();
		int random = 0;

		TipoPokemon normal = TipoPokemon.NORMAL;
		TipoAtaque fisico = TipoAtaque.FISICO;

		Movimiento destructor = new Movimiento("Destructor", normal, fisico, 40);
		Movimiento placaje = new Movimiento("Placaje", normal, fisico, 60);

		Movimiento[] setAtaques = new Movimiento[4];

		setAtaques[0] = destructor;
		setAtaques[1] = placaje;

		Pokemon pk0 = new Pokemon("Bulbasur");
		Pokemon pk1 = new Pokemon("Ivysaur");
		Pokemon pk2 = new Pokemon("Venasaur");
		Pokemon pk3 = new Pokemon("Charmander");
		Pokemon pk4 = new Pokemon("Charmeleon");
		Pokemon pk5 = new Pokemon("Charizard");
		Pokemon pk6 = new Pokemon("Squirtle");
		Pokemon pk7 = new Pokemon("Wartortle");
		Pokemon pk8 = new Pokemon("Blastoise");
		Pokemon pk9 = new Pokemon("Caterpie");
		Pokemon pk10 = new Pokemon("Metapod");
		Pokemon pk11 = new Pokemon("Butterfree");
		Pokemon pk12 = new Pokemon("Weedle");
		Pokemon pk13 = new Pokemon("Kakuna");
		Pokemon pk14 = new Pokemon("Beedrill");
		Pokemon pk15 = new Pokemon("Pidgeotto");
		Pokemon pk16 = new Pokemon("Pidgeot");
		Pokemon pk17 = new Pokemon("Rattata");
		Pokemon pk18 = new Pokemon("Raticate");
		Pokemon pk19 = new Pokemon("Pikachu");

		pk0.setMovimientos(setAtaques);
		pk1.setMovimientos(setAtaques);
		pk2.setMovimientos(setAtaques);
		pk3.setMovimientos(setAtaques);
		pk4.setMovimientos(setAtaques);
		pk5.setMovimientos(setAtaques);
		pk6.setMovimientos(setAtaques);
		pk7.setMovimientos(setAtaques);
		pk8.setMovimientos(setAtaques);
		pk9.setMovimientos(setAtaques);
		pk10.setMovimientos(setAtaques);
		pk11.setMovimientos(setAtaques);
		pk12.setMovimientos(setAtaques);
		pk13.setMovimientos(setAtaques);
		pk14.setMovimientos(setAtaques);
		pk15.setMovimientos(setAtaques);
		pk16.setMovimientos(setAtaques);
		pk17.setMovimientos(setAtaques);
		pk18.setMovimientos(setAtaques);
		pk19.setMovimientos(setAtaques);

		listaPokemon.add(pk0);
		listaPokemon.add(pk1);
		listaPokemon.add(pk2);
		listaPokemon.add(pk3);
		listaPokemon.add(pk4);
		listaPokemon.add(pk5);
		listaPokemon.add(pk6);
		listaPokemon.add(pk7);
		listaPokemon.add(pk8);
		listaPokemon.add(pk9);
		listaPokemon.add(pk10);
		listaPokemon.add(pk11);
		listaPokemon.add(pk12);
		listaPokemon.add(pk13);
		listaPokemon.add(pk14);
		listaPokemon.add(pk15);
		listaPokemon.add(pk16);
		listaPokemon.add(pk17);
		listaPokemon.add(pk18);
		listaPokemon.add(pk19);

		for (int i = 0; i < 1; i++) {
			random = (int) (Math.random() * 20) + 1;
		}

		Pokemon pokemonRandom = listaPokemon.get(random);

		return pokemonRandom;

	}

}
