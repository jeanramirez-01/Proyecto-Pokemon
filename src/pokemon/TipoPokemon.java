package pokemon;

public enum TipoPokemon {
		
		AGUA (0),
		BICHO (1),
		DRAGON (2),
		ELECTRICO (3),
		FANTASMA (4),
		FUEGO (5),
		HIELO (6),
		LUCHA (7),
		NORMAL (8),
		PLANTA (9),
		PSIQUICO (10),
		ROCA (11),
		TIERRA (12),
		VENENO (13),
		VOLADOR(14);

		private final int indice;

		private TipoPokemon(int indice) {
			this.indice = indice;
		}

		public int getIndice() {
			return indice;
		}

}

