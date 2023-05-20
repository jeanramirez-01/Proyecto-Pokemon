package test;

import mecanicaspokemon.Objeto;
import mecanicaspokemon.Pokemon;
import mecanicaspokemon.TipoPokemon;
import mecanicaspokemon.Objeto.NombreObjeto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestPokemon {

	@Test
	void comprobarObjeto() {

		Pokemon p = new Pokemon();
		Objeto o = new Objeto(NombreObjeto.PESA);

		p.setObjeto(o);

		// Comprobar que tiene un objeto equipado
		Assertions.assertTrue(p.tieneObjeto());

	}

	@Test
	void aplicarEfectoObjeto() {

		Pokemon p = new Pokemon();
		p.setAtaqueMaxima(10);
		p.setDefensaMaxima(10);
		p.setAtaqueEspecialMaxima(10);
		p.setDefensaEspecialMaxima(10);
		p.setVelocidadMaxima(10);
		p.setEstaminaMaxima(10);
		p.recuperarTotal();

		Objeto pesa = new Objeto(NombreObjeto.PESA);
		Objeto pluma = new Objeto(NombreObjeto.PLUMA);
		Objeto chaleco = new Objeto(NombreObjeto.CHALECO);
		Objeto baston = new Objeto(NombreObjeto.BASTON);
		Objeto pilas = new Objeto(NombreObjeto.PILAS);

		// Comprobar que no tiene un objeto equipado
		Assertions.assertFalse(p.aplicarEfectoObjeto());

		// Nota: al momento de aplicar las estadisticas el valor lo convierto a entero,
		// entonces por eso redondea hacia abajo
		p.setObjeto(pesa);
		p.aplicarEfectoObjeto();

		// Le sube un 20% el ataque y defensa, pero le baja 15% la velocidad
		Assertions.assertEquals(12, p.getAtaqueActual());
		Assertions.assertEquals(12, p.getDefensaActual());
		Assertions.assertEquals(8, p.getVelocidadActual());
		p.recuperarTotal();
		p.setObjeto(null);

		p.setObjeto(pluma);
		p.aplicarEfectoObjeto();
		// Le sube la velocidad un 30% pero le baja un 20% la defensa y la defensa
		// especial
		Assertions.assertEquals(13, p.getVelocidadActual());
		Assertions.assertEquals(8, p.getDefensaActual());
		Assertions.assertEquals(8, p.getDefensaEspecialActual());
		p.recuperarTotal();
		p.setObjeto(null);

		p.setObjeto(chaleco);
		p.aplicarEfectoObjeto();
		// Le sube la defensa y defensa especial un 20% pero le baja un 15% el ataque y
		// la velocidad
		Assertions.assertEquals(12, p.getDefensaActual());
		Assertions.assertEquals(12, p.getDefensaEspecialActual());
		Assertions.assertEquals(8, p.getAtaqueActual());
		Assertions.assertEquals(8, p.getVelocidadActual());
		p.recuperarTotal();
		p.setObjeto(null);

		p.setObjeto(baston);
		p.aplicarEfectoObjeto();
		// Le sube la estamina actual un 20% pero le baja
		Assertions.assertEquals(12, p.getEstaminaActual());
		Assertions.assertEquals(8, p.getVelocidadActual());

		p.recuperarTotal();
		p.setObjeto(null);

		p.setObjeto(pilas);
		p.aplicarEfectoObjeto();
		// Le sube la estamina actual un 20% pero le baja
		Assertions.assertEquals(15, p.getEstaminaActual());
		Assertions.assertEquals(7, p.getDefensaEspecialActual());

	}

	@Test
	void subirNivel() {

		boolean comprobar = false;

		Pokemon p = new Pokemon();
		p.setExperienciaActual(1);

		// Sube 1 niveles
		p.subirNivel();
		Assertions.assertEquals(2, p.getNivel());

		int vt = p.getVitalidadMaxima();
		int at = p.getAtaqueMaxima();
		int df = p.getDefensaMaxima();
		int ate = p.getAtaqueEspecialMaxima();
		int dfe = p.getDefensaEspecialMaxima();
		int vl = p.getVelocidadMaxima();

		if (vt <= 5 && at <= 5 && df <= 5 && ate <= 5 && dfe <= 5 && vl <= 5) {
			comprobar = true;
		}
		Assertions.assertTrue(comprobar);

	}

	@Test
	void generarInfoCrianza() {

		Pokemon padre = new Pokemon();
		Pokemon madre = new Pokemon();
		Pokemon hijo = new Pokemon();
		padre.setFertilidad(0);
		madre.setFertilidad(0);

		Assertions.assertFalse(hijo.generarInfoCrianza(padre, madre));

		padre.setFertilidad(5);
		madre.setFertilidad(5);
		padre.setSexo('H');
		madre.setSexo('H');

		Assertions.assertFalse(hijo.generarInfoCrianza(padre, madre));

		madre.setSexo('F');
		TipoPokemon[] tipoP = { TipoPokemon.AGUA };
		TipoPokemon[] tipoM = { TipoPokemon.FUEGO };
		padre.setTipo(tipoP);
		madre.setTipo(tipoM);

		Assertions.assertFalse(hijo.generarInfoCrianza(padre, madre));

		TipoPokemon[] tipo3 = { TipoPokemon.NORMAL };
		padre.setTipo(tipo3);

		padre.setNombre("Nombre");
		madre.setNombre("Nombre");

		padre.setVitalidadMaxima(10);
		padre.setAtaqueMaxima(9);
		padre.setDefensaMaxima(10);
		padre.setAtaqueEspecialMaxima(9);
		padre.setDefensaEspecialMaxima(10);
		padre.setVelocidadMaxima(9);

		madre.setVitalidadMaxima(9);
		madre.setAtaqueMaxima(10);
		madre.setDefensaMaxima(9);
		madre.setAtaqueEspecialMaxima(10);
		madre.setDefensaEspecialMaxima(9);
		madre.setVelocidadMaxima(10);

		hijo.generarInfoCrianza(padre, madre);

		Assertions.assertEquals("NomNom", hijo.getNombre());
		Assertions.assertEquals(10, hijo.getVitalidadMaxima());
		Assertions.assertEquals(10, hijo.getAtaqueMaxima());
		Assertions.assertEquals(10, hijo.getDefensaMaxima());
		Assertions.assertEquals(10, hijo.getAtaqueEspecialMaxima());
		Assertions.assertEquals(10, hijo.getDefensaEspecialMaxima());
		Assertions.assertEquals(10, hijo.getVelocidadMaxima());

		Assertions.assertEquals(4, padre.getFertilidad());
		Assertions.assertEquals(4, padre.getFertilidad());
	}

	@Test
	void sacarEficacia() {
		Pokemon p = new Pokemon();

		TipoPokemon[] tip = { TipoPokemon.FUEGO };

		Assertions.assertEquals(2, p.sacarEficacia(TipoPokemon.AGUA, tip));

		TipoPokemon[] tip2 = { TipoPokemon.ROCA, TipoPokemon.TIERRA };

		Assertions.assertEquals(4, p.sacarEficacia(TipoPokemon.AGUA, tip2));
	}
}
