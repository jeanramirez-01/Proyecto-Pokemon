package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mecanicaspokemon.Entrenador;
import mecanicaspokemon.Entrenamiento;
import mecanicaspokemon.Entrenamiento.TipoEntrenamiento;
import mecanicaspokemon.Equipo;
import mecanicaspokemon.Objeto;
import mecanicaspokemon.Objeto.NombreObjeto;
import mecanicaspokemon.Pokemon;

class TestEntrenador {

	@Test
	public void testEntrenarPokemon() {
		Pokemon p = new Pokemon();
		p.setDefensaMaxima(10);
		p.setDefensaEspecialMaxima(10);
		p.setVitalidadMaxima(10);
		Entrenador t = new Entrenador();
		Entrenamiento entre = new Entrenamiento(TipoEntrenamiento.PESADO);
		int numEntrenamientoVeces = 3;

		Objeto o = new Objeto(NombreObjeto.CHALECO);
		p.setObjeto(o);
		Pokemon[] eq = new Pokemon[6];
		eq[0] = p;
		Equipo team = new Equipo(eq);
		t.setEquipo(team);
		// Comprueba si tiene un objeto equipado
		Assertions.assertFalse(t.entrenarPokemon(0, entre, numEntrenamientoVeces));
		p.setObjeto(null);
		// Comprueba el nivel minimo para entrenar que es 20
		p.setNivel(19);
		Assertions.assertFalse(t.entrenarPokemon(0, entre, numEntrenamientoVeces));
		// No puede entrar al pokemon porque no tiene dinero suficiente
		p.setNivel(30);
		t.setPokecuarto(100);
		Assertions.assertFalse(t.entrenarPokemon(0, entre, numEntrenamientoVeces));

		t.setPokecuarto(20000);
		t.entrenarPokemon(0, entre, numEntrenamientoVeces);
		Assertions.assertEquals(15, p.getDefensaMaxima());
		Assertions.assertEquals(15, p.getDefensaEspecialMaxima());
		Assertions.assertEquals(15, p.getVitalidadMaxima());

	}

	@Test
	void aplicarEfectoObjetoEquipo() {

		Entrenador t = new Entrenador();

		Pokemon p = new Pokemon();
		p.setAtaqueMaxima(10);
		p.setDefensaMaxima(10);
		p.setAtaqueEspecialMaxima(10);
		p.setDefensaEspecialMaxima(10);
		p.setVelocidadMaxima(10);
		p.setEstaminaMaxima(10);
		p.recuperarTotal();

		Objeto pesa = new Objeto(NombreObjeto.PESA);

		Pokemon p2 = new Pokemon();
		p2.setAtaqueMaxima(10);
		p2.setDefensaMaxima(10);
		p2.setAtaqueEspecialMaxima(10);
		p2.setDefensaEspecialMaxima(10);
		p2.setVelocidadMaxima(10);
		p2.setEstaminaMaxima(10);
		p2.recuperarTotal();

		Pokemon[] eq = new Pokemon[6];
		eq[0] = p;
		eq[1] = p2;
		p.setObjeto(pesa);
		p2.setObjeto(pesa);
		Equipo team = new Equipo(eq);
		t.setEquipo(team);

		t.aplicarEfectoObjetoEquipoPokemon();

		Assertions.assertEquals(12, p.getAtaqueActual());
		Assertions.assertEquals(12, p.getDefensaActual());
		Assertions.assertEquals(8, p.getVelocidadActual());

		Assertions.assertEquals(12, p2.getAtaqueActual());
		Assertions.assertEquals(12, p2.getDefensaActual());
		Assertions.assertEquals(8, p2.getVelocidadActual());
	}

	@Test
	void curarEquipo() {

		Entrenador t = new Entrenador();

		Pokemon p = new Pokemon();
		p.setVitalidadActual(0);
		p.setVitalidadMaxima(50);

		Pokemon p2 = new Pokemon();
		p2.setVitalidadActual(0);
		p2.setVitalidadMaxima(50);

		Pokemon[] eq = new Pokemon[6];
		eq[0] = p;
		eq[1] = p2;
		Equipo team = new Equipo(eq);
		t.setEquipo(team);
		
		t.curarEquipo();
		
		Assertions.assertEquals(50, p.getVitalidadActual());
		Assertions.assertEquals(50, p2.getVitalidadActual());

	}

}
