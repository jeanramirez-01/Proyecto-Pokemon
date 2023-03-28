package tipo;


public class Eficacias {

	public enum EficaciasPokemon {
		
		NO_AFECTA ("NO AFECTA", 0),
		NO_ES_MUY_EFICAZ ("NO ES MUY EFICAZ", 0.25),
		NO_ES_EFICAZ ("NO ES EFICAZ", 0.5),
		NEUTRO ("NEUTRO", 1),
		ES_EFICAZ ("ES EFICAZ", 2),
		ES_MUY_EFICAZ ("ES MUY EFICAZ", 4);

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
			
}
