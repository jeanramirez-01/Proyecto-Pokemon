package combate;


public class Eficacias {

	public enum EficaciasPokemon {
		
		NO_AFECTA ("NO AFECTA", 0),
		NO_ES_EFICAZ ("NO ES EFICAZ", 0.5),
		NEUTRO ("NEUTRO", 1),
		ES_EFICAZ ("ES EFICAZ", 2);

		private String mensaje;
		private double eficacia;

		EficaciasPokemon(String mensaje, double eficacia) {
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
		
	final public static double [][] EFICACIAS = {
		// FILAS Y COLUMNAS: AGUA, BICHO, DRAGON, ELECTRICO, FANTASMA, FUEGO, HIELO, LUCHA, NORMAL, PLANTA, PSIQUICO, ROCA, TIERRA, VENENO, VOLADOR
			{0.5, 1, 0.5, 1, 1, 2, 1, 1, 1, 0.5, 1, 2, 2, 1, 1},
			{1, 1, 1, 1, 0.5,0.5, 1, 0.5, 1, 2, 2, 1, 1, 2, 0.5},
			{1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{2, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 1, 0, 1, 2},
			{1, 1, 1, 1, 2, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
			{0.5, 2, 0.5, 1, 1, 0.5, 2, 1, 1, 2, 1, 0.5, 1, 1, 1},
			{0.5, 1, 2, 1, 1, 1, 0.5, 1, 1, 2, 1, 1, 2, 1, 2},
			{1, 0.5, 1, 1, 0, 1, 2, 1, 2, 1, 0.5, 2, 1, 0.5, 0.5},
			{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1},
			{2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1, 0.5, 1, 2, 2, 0.5, 0.5},
			{1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 0.5, 1, 1, 2, 1},
			{1, 2, 1, 1, 1, 2, 2, 0.5, 1, 1, 1, 1, 0.5, 1, 2},
			{1, 0.5, 1, 2, 1, 2, 1, 1, 1, 0.5, 1, 2, 1, 2, 0},
			{1, 2, 1, 1, 0.5, 1, 1, 1, 1, 2, 1, 0.5, 0.5, 0.5, 1},
			{1, 2, 1, 0.5, 1, 1, 1, 2, 1, 2, 1, 0.5, 1, 1, 1},
	};
	
	
	
}
