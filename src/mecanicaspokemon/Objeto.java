package mecanicaspokemon;

public class Objeto {

	public enum CategoriasBolsa {

		OBJETO, BOTIQUIN, POKEBALL;

	}

	public enum TipoObjeto {

		// Objetos equipables
		PESA("Pesa", "Aumenta el ataque y la defensa un 20%, pero disminuye su velocidad un 20%", 5000,
				CategoriasBolsa.OBJETO),
		PLUMA("Pluma", "Aumenta la velocidad un 30%, pero disminuye la defensa y la defensa especial en un 20%.", 5000,
				CategoriasBolsa.OBJETO),
		CHALECO("Chaleco",
				"Aumenta la defensa y la defensa especial un 20%, pero disminuye la velocidad y el ataque un 15%.",
				5000, CategoriasBolsa.OBJETO),
		BASTON("Baston", "Aumenta la estamina un 20%, pero disminuye en un 15% la velocidad.", 5000,
				CategoriasBolsa.OBJETO),
		PILAS("Pilas",
				"Recupera la estamina actual en un 50% de la estamina maxima, pero disminuye la defensa especial un 30%.",
				5000, CategoriasBolsa.OBJETO),

		// Objetos consumibles de vida
		POCION("Pocion", "Medicina en spray, que cura heridas y restaura 20 PS de un POKÉMON.", 300,
				CategoriasBolsa.BOTIQUIN),
		SUPERPOCION("Superpocion", "Medicina en spray, que cura heridas y restaura 50 PS de un POKÉMON.", 700,
				CategoriasBolsa.BOTIQUIN),
		HIPERPOCION("Hiperpocion", "Medicina en spray, que cura heridas y restaura 200 PS de un POKÉMON.", 1500,
				CategoriasBolsa.BOTIQUIN),

		// Objetos consumibles de estado
		ANTIDOTO("Antidoto", "Medicina en spray, que cura a un POKÉMON envenenado.", 100, CategoriasBolsa.BOTIQUIN),
		ANTIPARALIZADOR("Pesa", "Medicina en spray, que cura a un POKÉMON paralizado.", 200, CategoriasBolsa.BOTIQUIN),
		DESPERTAR("Despertar", "Medicina en spray, que despierta a un POKÉMON dormido.", 250, CategoriasBolsa.BOTIQUIN),
		ANTIQUEMAR("Antiquemar", "Medicina en spray, que cura a un POKÉMON quemado.", 250, CategoriasBolsa.BOTIQUIN),
		ANTIHIELO("Antihielo", "Medicina en spray, que descongela a un POKÉMON.", 250, CategoriasBolsa.BOTIQUIN),

		// Tipos de pokeball
		POKE_BALL("Poke ball", "Sirve para atrapar POKÉMON salvajes. Parece una cápsula.", 200,
				CategoriasBolsa.POKEBALL),
		SUPERBALL("Superball", "Es buena. Tiene más índice de éxito que la POKÉ BALL.", 600, CategoriasBolsa.POKEBALL),
		ULTRABALL("Ultraball", "Es muy buena. Tiene más índice que la SUPERBALL.", 1200, CategoriasBolsa.POKEBALL),
		MASTERBALL("Masterball", "Es la mejor. Atrapa siempre al pokémon. No falla.", 50000, CategoriasBolsa.POKEBALL);

		private String nombre;
		private String descripcion;
		private int precio;
		private CategoriasBolsa categoria;

		private TipoObjeto(String nombre, String descripcion, int precio, CategoriasBolsa categorias) {
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.precio = precio;
			this.categoria = categorias;
		}

		public String getNombre() {
			return nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public int getPrecio() {
			return precio;
		}

		public CategoriasBolsa getCategoria() {
			return categoria;
		}

	}

	private TipoObjeto tipoObjeto;

	public Objeto(TipoObjeto tipoObjeto) {
		super();
		this.tipoObjeto = tipoObjeto;
	}

	public TipoObjeto getTipoObjeto() {
		return tipoObjeto;
	}

}
