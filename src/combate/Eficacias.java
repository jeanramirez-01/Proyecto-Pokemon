package combate;

public class Eficacias {

	public enum EficaciasPokemon {
		
		NO_AFECTA ("NO AFECTA", 0),
		NO_ES_EFICAZ ("NO ES EFICAZ", 0.5),
		NEUTRO ("NEUTRO", 1),
		ES_EFICAZ ("ES EFICAZ", 2);

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
		
	public static final double [][] EFICACIAS = {
			
		// FILAS Y AGUA, BICHO, DRAGON, ELECTRICO, FANTASMA, FUEGO, HIELO, LUCHA, NORMAL, PLANTA, PSIQUICO, ROCA, TIERRA, VENENO, VOLADOR
	/**Agua**/     {0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 0.5, 1, 2, 2, 1, 1},
	/**Bicho**/    {1, 1, 1, 1, 0.5, 0.5, 1, 0.5, 1, 2, 2, 1, 1, 0.5, 0.5},
	/**Dragon**/   {1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
	/**Electrico**/{2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 1, 0, 1, 2},
	/**Fantasma**/ {1, 1, 1, 1, 2, 1, 1, 1, 0, 1, 2, 1, 1, 1, 1},
	/**Fuego**/    {0.5, 2, 0.5, 1, 1, 0.5, 2, 1, 1, 2, 1, 0.5, 1, 1, 1},
	/**Hielo**/	   {0.5, 1, 2, 1, 1, 1, 0.5, 1, 1, 2, 1, 1, 2, 1, 2},
	/**Lucha**/	   {1, 0.5, 1, 1, 0, 1, 2, 1, 2, 1, 0.5, 2, 1, 0.5, 0.5},
	/**Normal**/   {1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1},
	/**Planta**/   {2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 0.5, 1, 2, 2, 0.5, 0.5},
	/**Psiquico**/ {1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1},
	/**Roca**/	   {1, 2, 1, 1, 1, 2, 2, 0.5, 1, 1, 1, 1, 0.5, 1, 2},
	/**Tierra**/   {1, 0.5, 1, 2, 1, 2, 1, 1, 1, 0.5, 1, 2, 1, 2, 0},
	/**Veneno**/   {1, 2, 1, 1, 0.5, 1, 1, 1, 1, 2, 1, 0.5, 0.5, 0.5, 1},
	/**Volador**/  {1, 2, 1, 0.5, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1},
	
	};
	
	public static final double[][] EFICACIAS_DOBLE= {
			
			
	};
	
}