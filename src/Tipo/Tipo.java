package Tipo;

public class Tipo {
	
	public enum TipoPokemon {
		
		AGUA (0),
		BICHO (1),
		DRAGON (2),
		ELECTRICO (3),
		FANTASMA (4),
		FUEGO (5),
		HADA (6),
		HIELO (7),
		LUCHA (8),
		NORMAL (9),
		PLANTA (10),
		PSIQUICO (11),
		ROCA (12),
		SINIESTRO (13),
		TIERRA (14),
		VENENO (15),
		VOLADOR (16);
		
		private int indice;
		
		private TipoPokemon (int indice) {
			this.indice = indice;
		}
		
		public int getIndice () {
			return indice;
		}
	}

}
