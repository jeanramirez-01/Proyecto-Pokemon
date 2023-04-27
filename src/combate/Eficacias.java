package combate;

public class Eficacias {

	public enum EficaciasPokemon {

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
	 * 
	 * En el valor de i seria el tipo de movimiento que ataca
	 * En el valor de j seria el tipo del pokemon objetivo
	 */
	public static final double [][] EFICACIAS = {

		         // ACERO, AGUA, BICHO, DRAGON, ELECTRICO, FANTASMA, FUEGO, HIELO, LUCHA, NORMAL, PLANTA, PSIQUICO, ROCA, SINIESTRO TIERRA, VENENO, VOLADOR
	/**Acero**/	   { 0.5, 0.5, 1, 1, 0.5, 1, 0.5, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1 },
	/**Agua**/     { 1, 0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 0.5, 1, 2, 1, 2, 1, 1 },
	/**Bicho**/    { 0.5, 1, 1, 1, 1, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 2, 1, 0.5, 0.5 },
	/**Dragon**/   { 0.5, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	/**Electrico**/{ 1, 2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0, 1, 2 },
	/**Fantasma**/ { 1, 1, 1, 1, 1, 2, 1, 1, 1, 0, 1, 2, 1, 0.5, 1, 1, 1 },
	/**Fuego**/    { 2, 0.5, 2, 0.5, 1, 1, 0.5, 2, 1, 1, 2, 1, 0.5, 1, 1, 1, 1 },
	/**Hielo**/	   { 0.5, 0.5, 1, 2, 1, 1, 1, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 2 },
	/**Lucha**/	   { 2, 1, 0.5, 1, 1, 0, 1, 2, 1, 2, 1, 0.5, 2, 2, 1, 0.5, 0.5 },
	/**Normal**/   { 0.5, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1 },
	/**Planta**/   { 0.5, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 0.5, 1, 2, 1, 2, 0.5, 0.5 },
	/**Psiquico**/ { 0.5, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 0, 1, 2, 1 },
	/**Roca**/	   { 0.5, 1, 2, 1, 1, 1, 2, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 2 },
	/**Siniestro**/{ 1, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 1, 2, 1, 0.5, 0.5, 1, 1, 1},
	/**Tierra**/   { 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0 },
	/**Veneno**/   { 1, 2, 1, 1, 0.5, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1 },
	/**Volador**/  { 1, 2, 1, 0.5, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1 }
	
	

	};

	/**
	 * Tabla de eficacias para el caso que el pokemon objetivo sea de dos tipos
	 * 
	 * En el valor de j seria el tipo de movimiento que ataca
	 * En el valor de i seria el tipo del pokemon objetivo
	 */
	public static final double[][] EFICACIAS_DOBLE= {


			//  ACERO, AGUA, BICHO, DRAGON, ELECTRICO, FANTASMA, FUEGO, HIELO, LUCHA, NORMAL, PLANTA, PSIQUICO, ROCA, SINIESTRO, TIERRA, VENENO, VOLADOR

			//Primera generacion
			/**PLANTA_VENENO**/    { 1, 0.5, 1, 1, 0.5, 1, 2, 2, 0,5, 1, 0.25, 2, 1, 1, 1, 1, 2 },
			/**FUEGO_VOLADOR**/    { 0.5, 2, 0.25, 1, 2, 1, 0.5, 1, 0.5, 1, 0.25, 1, 4, 1, 0, 1, 1 },
			/**BICHO_VOLADOR**/    { 1, 1, 0.5, 1, 2, 1, 2, 2, 0.25, 1, 0.25, 1, 4, 1, 0, 1, 2 },
			/**BICHO_VENENO**/     { 1, 1, 0.5, 1, 1, 1, 2, 1, 0.25, 1, 0.25, 2, 2, 1, 1, 0.5, 2 },
			/**NORMAL_VOLADOR**/   { 1, 1, 0.5, 1, 2, 0, 1, 2, 1, 1, 0.5, 1, 2, 1, 0, 1, 1 },
			/**VENENO_TIERRA**/    { 1, 2, 0.5, 1, 0, 1, 1, 2, 0.5, 1, 1, 2, 0.5, 1, 2, 0.25, 1 },
			/**VENENO_VOLADOR**/   { 1, 1, 0.25, 1, 2, 1, 1, 2, 0.25, 1, 0.25, 2, 2, 1, 0, 0.5, 1 },
			/**BICHO_PLANTA**/     { 1, 0.5, 2, 1, 0.5, 1, 4, 2, 0.5, 1, 0.25, 1, 2, 1, 0.25, 2, 4},
			/**AGUA_LUCHA**/       { 0.5, 0.5, 0.5, 1, 2, 1, 0.5, 0.5, 1, 1, 2, 2, 0.5, 0.5, 1, 1, 2 },
			/**AGUA_VENENO**/      { 0.5, 0.5, 0.5, 1, 2, 1, 0.5, 0.5, 0.5, 1, 1, 2, 1, 1, 2, 0.5, 1 },
			/**ROCA_TIERRA**/	   { 2, 4, 1, 1, 0, 1, 0.5, 2, 2, 0.5, 4, 1, 0.5, 1, 2, 0.25, 0.5 },
			/**AGUA_PSIQUICO**/    { 0.5, 0.5, 2, 1, 2, 2, 0.5, 0.5, 0.5, 1, 2, 0.5, 1, 2, 1, 1, 1 },
			/**ACERO_ELECTRICO**/  { 0.25, 1, 0.5, 0.5, 0.5, 1, 2, 0.5, 2, 0.5, 0.5, 0.5, 0.5, 1, 4, 0, 0.25},
			/**AGUA_HIELO**/	   { 1, 0.5, 1, 1, 2, 1, 1, 0.5, 2, 1, 2, 1, 2, 1, 1, 1, 1 },
			/**FANTASMA_VENENO**/  { 1, 1, 0.25, 1, 1, 2, 1, 1, 0, 0, 0.5, 2, 1, 2, 0, 0.5, 1 },
			/**PLANTA_PSIQUICO**/  { 1, 0.5, 4, 1, 0.5, 2, 2, 2, 0.5, 1, 0.5, 0.5, 1, 2, 0.5, 2, 2 },
			/**TIERRA_ROCA**/	   { 2, 4, 1, 1, 0, 1, 0.5, 2, 2, 0.5, 4, 1, 0.5, 1, 2, 0.25, 0.5 },
			/**HIELO_PSIQUICO**/   { 2, 1, 2, 1, 1, 2, 2, 0.5, 1, 1, 1, 0.5, 2, 1, 1, 1 },
			/**AGUA_VOLADOR**/	   { 0.5, 0.5, 0.5, 1, 4, 1, 0.5, 1, 0.5, 1, 1, 1, 2, 1, 0, 1, 1 },
			/**ROCA_AGUA**/		   { 1, 1, 1, 1, 2, 1, 0.25, 0.5, 2, 0.5, 4, 1, 1, 1, 2, 0.5, 0.5 },
			/**ROCA_VOLADOR**/	   { 2, 2, 0.5, 1, 2, 1, 0.5, 2, 1, 0.5, 1, 1, 2, 1, 0, 0.5, 0.5 },
			/**HIELO_VOLADOR**/	   { 2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 0.5, 1, 4, 1, 0, 1, 1 },
			/**ELECTRICO_VOLADOR**/{ 0.5, 1, 0.5, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 2, 1, 0, 1, 0.5 },
			/**DRAGON_VOLADOR**/   { 1, 0.5, 0.5, 2, 1, 1, 0.5, 4, 0.5, 1, 0.25, 1, 2, 1, 0, 1, 1 },
			
		    //  ACERO, AGUA, BICHO, DRAGON, ELECTRICO, FANTASMA, FUEGO, HIELO, LUCHA, NORMAL, PLANTA, PSIQUICO, ROCA, SINIESTRO, TIERRA, VENENO, VOLADOR
			//Segunda Generacion
			/**AGUA_ELECTRICO**/   { 0.25, 0.5, 1, 1, 1, 1, 0.5, 0.5, 1, 1, 2, 1, 1, 1, 2, 1, 0.5 },
			/**PSIQUICO_VOLADOR**/ { 1, 1, 1, 1, 2, 2, 1, 2, 0.25, 1, 0.5, 0.5, 2, 2, 0, 1, 1 },
			/**PLANTA_VOLADOR**/   { 1, 0.5, 1, 1, 1, 1, 2, 4, 0.5, 1, 0.25, 1, 2, 1, 0, 2, 2 },
			/**AGUA_TIERA**/	   { 0.5, 1, 1, 1, 0, 1, 0.5, 1, 1, 1, 4, 1, 0.5, 1, 1, 0.5, 1 },
			/**SINIESTRO_VOLADOR**/{ 1, 1, 1, 1, 2, 0.5, 1, 2, 1, 1, 0.5, 0, 2, 0.5, 0, 1, 1 },
			/**NORMAL_PSIQUICO**/  { 1, 1, 2, 1, 1, 0, 1, 1, 1, 1, 1, 0.5, 1, 2, 1, 1, 1 },
			/**BICHO_ACERO**/      { 0.5, 1, 0.5, 0.5, 1, 1, 4, 0.5, 1, 0.5, 0.25, 0.5, 1, 1, 1, 0, 1 },
			/**TIERRA_VOLADOR**/   { 1, 2, 0.5, 1, 0, 1, 1, 4, 0.5, 1, 1, 1, 1, 1, 0, 0.5, 1 },
			/**ACERO_TIERRA**/     { 0.5, 2, 0.5, 0.5, 0, 1, 2, 1, 2, 0.5, 1, 0.5, 0.25, 1, 2, 0, 0.5 },
			/**BICHO_ACERO**/      { 0.5, 1, 0.5, 0.5, 1, 1, 4, 0.5, 1, 0.5, 0.25, 0.5, 1, 1, 1, 0, 1 },
			/**BICHO_ROCA**/       { 2, 2, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 2, 1, 1, 0.5, 1 },
			/**BICHO_LUCHA**/	   { 1, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 2, 1, 0.5, 0.5, 1, 4 },
			/**SINIESTRO_HIELO**/  { 2, 1, 2, 1, 1, 0.5, 2, 0.5, 4, 1, 1, 0, 2, 0.5, 1, 1, 1 },
			/**FUEGO_ROCA**/	   { 1, 4, 0.5, 1, 1, 1, 0.25, 0.5, 2, 0.5, 1, 1, 2, 1, 4, 0.5, 0.5 },
			/**HIELO_TIERRA**/     { 2, 2, 1, 1, 0, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 0.5, 1 },
			/**AGUA_VOLADOR**/     { 0.5, 0.5, 0.5, 1, 4, 1, 0.5, 1, 0.5, 1, 1, 1, 2, 1, 0, 1, 1 },
			/**ACERO_VOLADOR**/    { 0.5, 1, 0.25, 0.5, 2, 1, 2, 1, 1, 0.5, 0.25, 0.5, 1, 1, 0, 0, 0.5 },
			/**SINIESTRO_FUEGO**/  { 0.5, 2, 1, 1, 1, 0.5, 0.5, 0.5, 2, 1, 0.5, 0, 2, 0.5, 2, 1, 1 },
			/**AGUA_DRAGON**/      { 0.5, 0.25, 1, 2, 1, 1, 0.25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			/**ROCA_SINIESTRO**/   { 2, 2, 2, 1, 1, 0.5, 0.5, 1, 4, 0.5, 2, 0, 1, 0.5, 2, 0.5, 0.5 },
			/**PSIQUICO_VOLADOR**/ { 1, 1, 1, 1, 2, 2, 1, 2, 0.25, 1, 0.5, 0.5, 2, 2, 0, 1, 1 },
			/**PSIQUICO_PLANTA**/  { 1, 0.5, 4, 1, 0.5, 2, 1, 2, 0.5, 1, 0.5, 0.5, 1, 2, 0.5, 2, 2 }
			
	};

}