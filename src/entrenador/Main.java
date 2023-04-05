package entrenador;

import java.util.Scanner;
import entrenador.Objeto.TipoObjeto;
import opcionesEntrenador.*;
import opcionesEntrenador.Entrenamiento.TipoEntrenamiento;
import pokemon.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Objeto obj1 = new Objeto(TipoObjeto.PESA);
		Objeto obj2 = new Objeto(TipoObjeto.PLUMA);
		Objeto obj3 = new Objeto(TipoObjeto.CHALECO);
		Objeto obj4 = new Objeto(TipoObjeto.BASTON);

		Entrenamiento pesao = new Entrenamiento(TipoEntrenamiento.PESADO);

		Pokemon pk1 = new Pokemon("Pokachu", 20, obj1, 8001);
		Pokemon pk2 = new Pokemon("Charmander", 20, obj2, 8000);
		Pokemon pk3 = new Pokemon("Squirtle", 20, obj3, 8000);
		Pokemon pk4 = new Pokemon("Bulbasur", 20, obj4, 8000);
		Pokemon pk5 = new Pokemon("Dragonite", 60, null, 8000);
		Pokemon pk6 = new Pokemon("Mew", 40, obj1, 8000);

		Pokemon[] equipo = new Pokemon[6];

		equipo[0] = pk1;
		equipo[1] = pk2;
		equipo[2] = pk3;
		equipo[3] = pk4;
		equipo[4] = pk5;
		equipo[5] = pk6;

		Bolsa bolsa = new Bolsa();
		PcPokemon pc = new PcPokemon();

		Entrenador jugador = new Entrenador(equipo, "JelooX", 3000, bolsa, pc);
		jugador.setEquipo(equipo);

//		System.out.println(pk1.toString());
//		System.out.println(pk2.toString());
//		System.out.println(pk3.toString());
//		System.out.println(pk4.toString());
//		System.out.println(pk5.toString());
//		System.out.println(jugador.getPokedolares());
//		System.out.println(
//				"El objeto es de tipo " + obj1.getTipo() + " y su descripción es: " + obj1.getTipo().getDescripcion());
//
//		jugador.aplicarEfectoObjetoEquipoPokemon();
//		System.out.println(pk1.toString());
//		System.out.println(pk2.toString());
//		System.out.println(pk3.toString());
//		System.out.println(pk4.toString());
//		System.out.println(pk5.toString());
//
//		for (Pokemon pokemon : equipo) {
//			if (pokemon != null) {
//				System.out.println(pokemon.getNombre());
//			}
//		}
//
//		System.out.println();
//
//		jugador.moverEquipoPokemon(7, 3);
//
//		System.out.println();
//		for (Pokemon pokemon : equipo) {
//			if (pokemon != null) {
//				System.out.println(pokemon.getNombre());
//			}
//		}

//		System.out.println(jugador.getPokedolares());
//
//		for (int i = 0; i < equipo.length; i++) {
//			System.out.println(i + ".-" + equipo[i]);
//		}
//		System.out.println("Seleccione un pokemon del equipo");
//		int seleccion = sc.nextInt();
//		jugador.entrenarPokemon(seleccion, pesao, 2);
//
//		System.out.println(jugador.getPokedolares());

		System.out.println(pk1.toString());
		System.out.println(pk2.toString());
		System.out.println(pk3.toString());
		System.out.println(pk4.toString());
		System.out.println(pk5.toString());
		System.out.println(pk6.toString());

		pk1.subirNivel();
		pk2.subirNivel();
		pk3.subirNivel();
		pk4.subirNivel();
		pk5.subirNivel();
		pk6.subirNivel();

		System.out.println(pk1.toString());
		System.out.println(pk2.toString());
		System.out.println(pk3.toString());
		System.out.println(pk4.toString());
		System.out.println(pk5.toString());
		System.out.println(pk6.toString());

	}

}
