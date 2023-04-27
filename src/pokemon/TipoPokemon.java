package pokemon;

public enum TipoPokemon {

	ACERO("Acero", 0), 
	AGUA("Agua", 1), 
	BICHO("Bicho", 2), 
	DRAGON("Dragon", 3), 
	ELECTRICO("Electrico", 4),
	FANTASMA("Fantasma", 5), 
	FUEGO("Fuego", 6), 
	HIELO("Hielo", 7), 
	LUCHA("Lucha", 8), 
	NORMAL("Normal", 9),
	PLANTA("Planta", 10), 
	PSIQUICO("Psiquico", 11), 
	ROCA("Roca", 12), 
	SINIESTRO("Siniestro", 13), 
	TIERRA("Tierra", 14),
	VENENO("Veneno", 15), 
	VOLADOR("Volador", 16);

	private int indice;
	private String nombre;

	private TipoPokemon(String nombre, int indice) {
		this.nombre = nombre;
		this.indice = indice;
	}

	public String getNombre() {
		return nombre;
	}

	public int getIndice() {
		return indice;
	}

}
