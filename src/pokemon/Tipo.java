package pokemon;


public class Tipo {
	
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
		SINIESTRO (12),
		TIERRA (13),
		VENENO (14),
		VOLADOR(15);

		private int indice;

		private TipoPokemon(int indice) {
			this.indice = indice;
		}

		public int getIndice() {
			return indice;
		}
	}
	
	private TipoPokemon tipo;

	public Tipo(TipoPokemon tipo) {
		super();
		this.tipo = tipo;
	}

	public TipoPokemon getTipo() {
		return tipo;
	}

}
