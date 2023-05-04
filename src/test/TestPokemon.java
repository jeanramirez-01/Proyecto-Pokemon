package test;

import mecanicaspokemon.Pokemon;
import mecanicaspokemon.TipoPokemon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class TestPokemon {

    private static Pokemon pktest;

    @Test
    void subirNivel() {

    }

    @Test
    void sacarEficacia() {
        TipoPokemon[] tipo = {TipoPokemon.LUCHA};
        double ef = Pokemon.sacarEficacia(TipoPokemon.AGUA, tipo);
        Assertions.assertEquals( 1, ef);
    }

    @Test
    void suma() {
        int a = 1;
        int b = 3;
        int suma = a + b;
        Assertions.assertEquals(4, suma);
    }

    @BeforeAll
    static void start() {
        String word = "a";
        String wd = "a";

        Assertions.assertEquals(word, wd);
    }
}
