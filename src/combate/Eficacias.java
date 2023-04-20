package combate;

public class Eficacias {

	public enum EficaciasPokemon {

		INMUNE ("INMUNE", 0),
		ES_POCO_EFICAZ("ES POCO EFICAZ", 0.25),
		NO_MUY_ES_EFICAZ ("NO ES MUY EFICAZ", 0.5),
		ES_NEUTRO ("NEUTRO", 1),
		ES_EFICAZ ("ES EFICAZ", 2),
		ES_MUY_EFICAZ("ES MUY EFICAZ", 4);

		private String mensaje;
		private double eficacia;

		private EficaciasPokemon(String mensaje, double eficacia) {
			this.mensaje = mensaje;
			this.eficacia = eficacia;

		}

		public String getMensaje () {
			return mensaje;
		}

		public double getEficacia () {
			return eficacia;
		}

	}

	/**
	 * Tabla de eficacias para el caso que el pokemon objetivo sea de un tipo
	 */
	public static final double [][] EFICACIAS = {

		// FILAS Y AGUA, BICHO, DRAGON, ELECTRICO, FANTASMA, FUEGO, HIELO, LUCHA, NORMAL, PLANTA, PSIQUICO, ROCA, TIERRA, VENENO, VOLADOR
	/**Agua**/     { 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 0.5, 1, 2, 2, 1, 1 },
	/**Bicho**/    { 1, 1, 1, 1, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 1, 0.5, 0.5 },
	/**Dragon**/   { 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	/**Electrico**/{ 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 1, 0, 1, 2 },
	/**Fantasma**/ { 1, 1, 1, 1, 2, 1, 1, 1, 0, 1, 2, 1, 1, 1, 1 },
	/**Fuego**/    { 0.5, 2, 0.5, 1, 1, 0.5, 2, 1, 1, 2, 1, 0.5, 1, 1, 1 },
	/**Hielo**/	   { 0.5, 1, 2, 1, 1, 1, 0.5, 1, 1, 2, 1, 1, 2, 1, 2 },
	/**Lucha**/	   { 1, 0.5, 1, 1, 0, 1, 2, 1, 2, 1, 0.5, 2, 1, 0.5, 0.5 },
	/**Normal**/   { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1 },
	/**Planta**/   { 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 0.5, 1, 2, 2, 0.5, 0.5 },
	/**Psiquico**/ { 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1 },
	/**Roca**/	   { 1, 2, 1, 1, 1, 2, 2, 0.5, 1, 1, 1, 1, 0.5, 1, 2 },
	/**Tierra**/   { 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 0.5, 1, 2, 1, 2, 0 },
	/**Veneno**/   { 1, 2, 1, 1, 0.5, 1, 1, 1, 1, 2, 1, 0.5, 0.5, 0.5, 1 },
	/**Volador**/  { 1, 2, 1, 0.5, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1 }

	};

	/**
	 * Tabla de eficacias para el caso que el pokemon objetivo sea de dos tipos
	 */
	public static final double[][] EFICACIAS_DOBLE= {


			//  AGUA, BICHO, DRAGON, ELECTRICO, FANTASMA, FUEGO, HIELO, LUCHA, NORMAL, PLANTA, PSIQUICO, ROCA, TIERRA, VENENO, VOLADOR

			/**PLANTA_VENENO**/    { 0.5, 1, 1, 0.5, 1, 2, 2, 0,5, 1, 0.25, 2, 1, 1, 1, 2 },
			/**FUEGO_VOLADOR**/    { 2, 0.25, 1, 2, 1, 0.5, 1, 0.5, 1, 0.25, 1, 4, 0, 1, 1 },
			/**BICHO_VOLADOR**/    { 1, 0.5, 1, 2, 1, 2, 2, 0.25, 1, 0.25, 1, 4, 0, 1, 2 },
			/**BICHO_VENENO**/     { 1, 0.5, 1, 1, 1, 2, 1, 0.25, 1, 0.25, 2, 2, 1, 0.5, 2 },
			/**NORMAL_VOLADOR**/   { 1, 0.5, 1, 2, 0, 1, 2, 1, 1, 0.5, 1, 2, 0, 1, 1 },
			/**VENENO_TIERRA**/    { 2, 0.5, 1, 0, 1, 1, 2, 0.5, 1, 1, 2, 0.5, 2, 0.25, 1 },
			/**VENENO_VOLADOR**/   { 1, 0.25, 1, 2, 1, 1, 2, 0.25, 1, 0.25, 2, 2, 0, 0.5, 1 },
			/**BICHO_PLANTA**/     { 0.5, 2, 1, 0.5, 1, 4, 2, 0.5, 1, 0.25, 1, 2, 0.25, 2, 4},
			/**AGUA_LUCHA**/       { 0.5, 0.5, 1, 2, 1, 0.5, 0.5, 1, 1, 2, 2, 0.5, 1, 1, 2 },
			/**AGUA_VENENO**/      { 0.5, 0.5, 1, 2, 1, 0.5, 0.5, 0.5, 1, 1, 2, 1, 2, 0.5, 1 },
			/**ROCA_TIERRA**/	   { 4, 1, 1, 0, 1, 0.5, 2, 2, 0.5, 4, 1, 0.5, 2, 0.25, 0.5 },
			/**AGUA_PSIQUICO**/    { 0.5, 2, 1, 2, 2, 0.5, 0.5, 0.5, 1, 2, 0.5, 1, 1, 1, 1 },
			/**AGUA_HIELO**/	   { 0.5, 1, 1, 2, 1, 1, 0.5, 2, 1, 2, 1, 2, 1, 1, 1 },
			/**FANTASMA_VENENO**/  { 1, 0.25, 1, 1, 2, 1, 1, 0, 0, 0.5, 2, 1, 0, 0.5, 1 },
			/**PLANTA_PSIQUICO**/  { 0.5, 4, 1, 0.5, 2, 2, 2, 0.5, 1, 0.5, 0.5, 1, 0.5, 2, 2 },
			/**TIERRA_ROCA**/	   { 4, 1, 1, 0, 1, 0.5, 2, 2, 0.5, 4, 1, 0.5, 2, 0.25, 0.5 },
			/**HIELO_PSIQUICO**/   { 1, 2, 1, 1, 2, 2, 0.5, 1, 1, 1, 0.5, 2, 1, 1, 1 },
			/**AGUA_VOLADOR**/	   { 0.5, 0.5, 1, 4, 1, 0.5, 1, 0.5, 1, 1, 1, 2, 0, 1, 1 },
			/**ROCA_AGUA**/		   { 1, 1, 1, 2, 1, 0.25, 0.5, 2, 0.5, 4, 1, 1, 2, 0.5, 0.5 },
			/**ROCA_VOLADOR**/	   { 2, 0.5, 1, 2, 1, 0.5, 2, 1, 0.5, 1, 1, 2, 0, 0.5, 0.5 },
			/**HIELO_VOLADOR**/	   { 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 0.5, 1, 4, 0, 1, 1 },
			/**ELECTRICO_VOLADOR**/{ 1, 0.5, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 2, 0, 1, 0.5 },
			/**DRAGON_VOLADOR**/   { 0.5, 0.5, 2, 1, 1, 0.5, 4, 0.5, 1, 0.25, 1, 2, 0, 1, 1 }

	};

}