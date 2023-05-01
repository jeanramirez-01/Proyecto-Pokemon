package entrenador;

import java.util.ArrayList;
import java.util.Scanner;
import combate.Movimiento;
import combate.Movimiento.TipoAtaque;
import opcionesEntrenador.*;
import pokemon.*;
import pokemon.TipoPokemon;
import opcionesEntrenador.Entrenamiento.TipoEntrenamiento;
import tienda.Objeto;
import tienda.Objeto.TipoObjeto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Objeto obj1 = new Objeto(TipoObjeto.PESA);
		Objeto obj2 = new Objeto(TipoObjeto.PLUMA);
		Objeto obj3 = new Objeto(TipoObjeto.CHALECO);
		Objeto obj4 = new Objeto(TipoObjeto.BASTON);

		Objeto obj5 = new Objeto(TipoObjeto.ANTIHIELO);
		Objeto obj6 = new Objeto(TipoObjeto.POCION);

		Objeto obj7 = new Objeto(TipoObjeto.POKE_BALL);

		Entrenamiento pesao = new Entrenamiento(TipoEntrenamiento.PESADO);

		TipoAtaque fisico = TipoAtaque.FISICO;

		Movimiento destructor = new Movimiento("Destructor", TipoPokemon.NORMAL, TipoAtaque.FISICO, 40);

		Movimiento[] setAtaques = new Movimiento[4];

		setAtaques[0] = destructor;

		Pokemon pk1 = new Pokemon("Pokachu", obj1, 'M');
		Pokemon pk2 = new Pokemon("Charmander", null, 'F');
		Pokemon pk3 = new Pokemon("Squirtle", obj3, 'M');
		Pokemon pk4 = new Pokemon("Bulbasur", obj4, 'F');
		Pokemon pk5 = new Pokemon("Dragonite", null, 'M');
		Pokemon pk6 = new Pokemon("Mew", obj1, 'F');

		Pokemon[] equipo = new Pokemon[6];

		equipo[0] = pk1;
		equipo[1] = pk2;
		equipo[2] = pk3;
		equipo[3] = pk4;
		equipo[4] = pk5;
//		equipo[5] = pk6;

		pk1.setMovimientos(setAtaques);

		pk2.setMovimientos(setAtaques);

		Pokemon[] pc = new Pokemon[360];

		ArrayList<Objeto> objetos = new ArrayList<>();

		objetos.add(obj7);
		objetos.add(obj6);
		objetos.add(obj1);

		Bolsa bolsa = new Bolsa(objetos);

		Equipo team = new Equipo(equipo);

		Entrenador jugador = new Entrenador(46812, team, "JelooX", 3000, bolsa, pc, null);

//		System.out.println(pk1.toString());
//		System.out.println(pk2.toString());
//		System.out.println(pk3.toString());
//		System.out.println(pk4.toString());
//		System.out.println(pk5.toString());
//		System.out.println(jugador.getPokedolares());
		System.out.println("El objeto es de tipo " + obj1.getTipoObjeto() + " y su descripción es: "
				+ obj1.getTipoObjeto().getDescripcion());
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
//		System.out.println(pk5.toString());
//		
//		for (int i = 0; i < equipo.length; i++) {
//			System.out.println(i + ".-" + equipo[i]);
//		}
//		System.out.println("Seleccione un pokemon del equipo");
//		int seleccion = sc.nextInt();
//		jugador.entrenarPokemon(seleccion, pesao, 2);
//
//		System.out.println(pk5.toString());
//		System.out.println(jugador.getPokedolares());

		/*
		 * System.out.println(pk1.toString()); System.out.println(pk2.toString());
		 * System.out.println(pk3.toString()); System.out.println(pk4.toString());
		 * System.out.println(pk5.toString()); System.out.println(pk6.toString());
		 * 
		 * System.out.println(); jugador.curarEquipo();
		 * 
		 * pk1.subirNivel(); pk2.subirNivel(); pk3.subirNivel(); pk4.subirNivel();
		 * pk5.subirNivel(); pk6.subirNivel();
		 * 
		 * System.out.println(pk1.toString()); System.out.println(pk2.toString());
		 * System.out.println(pk3.toString()); System.out.println(pk4.toString());
		 * System.out.println(pk5.toString()); System.out.println(pk6.toString());
		 * 
		 * System.out.println(destructor.toString());
		 */

//		ListaPokemonRandom lista = new ListaPokemonRandom();
//		Pokemon pkk2 = lista.generarPokemonRandom();
//		System.out.println(pkk2.toString());
//
//		pk1.atacarPokemon(0, pkk2);
//
//		System.out.println(pk2.toString());
//
//		System.out.println(pkk2.toString());

//		bolsa.mostrarBolsa();
//
////		bolsa.ponerObjeto(equipo[0]);
//		
//		bolsa.quitarObjeto(pk6);
//		
//		System.out.println();
//		
//		bolsa.mostrarBolsa();

		jugador.menu(2);

		

		jugador.crianzaPokemon(pk4, pk5);

//		jugador.mostrarPc();
		System.out.println();
		
		jugador.menu(2);
		
//		jugador.mostrarStats(equipo[5]);

	}

}