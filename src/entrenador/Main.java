package entrenador;

import java.util.Scanner;

import combate.Movimiento;
import combate.Movimiento.TipoAtaque;
import opcionesEntrenador.*;
import pokemon.*;
import pokemon.Tipo.TipoPokemon;
import opcionesEntrenador.Entrenamiento.TipoEntrenamiento;
import tienda.ObjetoEquipable;
import tienda.ObjetoEquipable.TipoObjeto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ObjetoEquipable obj1 = new ObjetoEquipable(TipoObjeto.PESA);
		ObjetoEquipable obj2 = new ObjetoEquipable(TipoObjeto.PLUMA);
		ObjetoEquipable obj3 = new ObjetoEquipable(TipoObjeto.CHALECO);
		ObjetoEquipable obj4 = new ObjetoEquipable(TipoObjeto.BASTON);
		Entrenamiento pesao = new Entrenamiento(TipoEntrenamiento.PESADO);

		Tipo normal = new Tipo(TipoPokemon.NORMAL);
		TipoAtaque fisico = TipoAtaque.FISICO;

		Movimiento destructor = new Movimiento("Destructor", normal, fisico, 40);

		Movimiento[] setAtaques = new Movimiento[4];

		setAtaques[1] = destructor;
	

		Pokemon pk1 = new Pokemon("Pokachu", 1, obj1, 8000);
		Pokemon pk2 = new Pokemon("Charmander", 20, obj2, 8000);
		Pokemon pk3 = new Pokemon("Squirtle", 20, obj3, 8000);
		Pokemon pk4 = new Pokemon("Bulbasur", 20, obj4, 8000);
		Pokemon pk5 = new Pokemon("Dragonite", 100, null, 8000);
		Pokemon pk6 = new Pokemon("Mew", 40, obj1, 8000);

		Pokemon[] equipo = new Pokemon[6];

		equipo[0] = pk1;
		equipo[1] = pk2;
		equipo[2] = pk3;
		equipo[3] = pk4;
		equipo[4] = pk5;
		equipo[5] = pk6;

		pk1.setMovimientos(setAtaques);
		
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

		System.out.println(pk1.toString());
		System.out.println(pk2.toString());
		System.out.println(pk3.toString());
		System.out.println(pk4.toString());
		System.out.println(pk5.toString());
		System.out.println(pk6.toString());

		System.out.println();
		jugador.curarEquipo();

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

//		System.out.println(destructor.toString());

	}

}