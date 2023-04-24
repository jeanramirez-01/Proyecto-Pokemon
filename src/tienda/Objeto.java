package tienda;

public class Objeto {

	public enum CategoriasBolsa {

		OBJETOS, BOTIQUIN, POKEBALLS;

	}

	public enum TipoObjeto {

		// Objetos equipables
		PESA("Pesa", "La PESA aumenta el ataque y la defensa un 20%, pero disminuye su velocidad un 20%", 5000, 6,
				CategoriasBolsa.OBJETOS),
		PLUMA("Pluma",
				"La PLUMA aumenta la velocidad un 30%, pero disminuye la defensa y la defensa especial en un 20%.",
				5000, 6, CategoriasBolsa.OBJETOS),
		CHALECO("Chaleco",
				"El chaleco aumenta la defensa y la defensa especial un 20%, pero disminuye la velocidad y el ataque un 15%.",
				5000, 6, CategoriasBolsa.OBJETOS),
		BASTON("Baston", "El baston aumenta la estamina un 20%, pero disminuye en un 15% la velocidad.", 5000, 6,
				CategoriasBolsa.OBJETOS),
		PILAS("Pilas",
				"Las pilas recupera la estamina actual en un 50% de la estamina maxima, pero disminuye la defensa especial un 30%.",
				5000, 6, CategoriasBolsa.OBJETOS),

		// Objetos consumibles de vida
		POCION("Pocion", "Medicina en spray, que cura heridas y restaura 20 PS de un POKÉMON.", 300, 99,
				CategoriasBolsa.BOTIQUIN),
		SUPERPOCION("Superpocion", "Medicina en spray, que cura heridas y restaura 50 PS de un POKÉMON.", 700, 99,
				CategoriasBolsa.BOTIQUIN),
		HIPERPOCION("Hiperpocion", "Medicina en spray, que cura heridas y restaura 200 PS de un POKÉMON.", 1500, 99,
				CategoriasBolsa.BOTIQUIN),

		// Objetos consumibles de estado
		ANTIDOTO("Antidoto", "Medicina en spray, que cura a un POKÉMON envenenado.", 100, 99, CategoriasBolsa.BOTIQUIN),
		ANTIPARALIZADOR("Pesa", "Medicina en spray, que cura a un POKÉMON paralizado.", 200, 99,
				CategoriasBolsa.BOTIQUIN),
		DESPERTAR("Despertar", "Medicina en spray, que despierta a un POKÉMON dormido.", 250, 99,
				CategoriasBolsa.BOTIQUIN),
		ANTIQUEMAR("Antiquemar", "Medicina en spray, que cura a un POKÉMON quemado.", 250, 99,
				CategoriasBolsa.BOTIQUIN),
		ANTIHIELO("Antihielo", "Medicina en spray, que descongela a un POKÉMON.", 250, 99, CategoriasBolsa.BOTIQUIN),

		// Tipos de pokeball
		POKE_BALL("Poke ball", "Sirve para atrapar POKÉMON salvajes. Parece una cápsula.", 200, 99,
				CategoriasBolsa.POKEBALLS),
		SUPERBALL("Superball", "Es buena. Tiene más índice de éxito que la POKÉ BALL.", 600, 99,
				CategoriasBolsa.POKEBALLS),
		ULTRABALL("Ultraball", "Es muy buena. Tiene más índice que la SUPERBALL.", 1200, 99, CategoriasBolsa.POKEBALLS),
		MASTERBALL("Masterball", "Es la mejor. Atrapa siempre al pokémon. No falla.", 50000, 99,
				CategoriasBolsa.POKEBALLS);

		private String nombre;
		private String descripcion;
		private int precio;
		private int cantidadVenta;
		private CategoriasBolsa categoria;

		private TipoObjeto(String nombre, String descripcion, int precio, int cantidadVenta,
				CategoriasBolsa categorias) {
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.precio = precio;
			this.cantidadVenta = cantidadVenta;
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

		public void setPrecio(int precio) {
			this.precio = precio;
		}

		public int getCantidadVenta() {
			return cantidadVenta;
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
