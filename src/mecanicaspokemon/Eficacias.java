package mecanicaspokemon;

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
	/**Siniestro**/{ 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1, 0.5, 1, 1, 1 },
	/**Tierra**/   { 2, 1, 0.5, 1, 2, 1, 2, 1, 1, 1, 0.5, 1, 2, 1, 1, 2, 0 },
	/**Veneno**/   { 0, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 1 },
	/**Volador**/  { 0.5, 1, 2, 1, 0.5, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1, 1 }
	
	

	};

}