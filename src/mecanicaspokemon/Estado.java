package mecanicaspokemon;

public class Estado {

	public enum TiposEstados {

		PARALIZADO("Paralizado"), 
		QUEMADO("Quemado"), 
		ENVENENADO("Envenenador"), 
		GRAVEMENTE_ENVENENADO("Gravemente envenedado"),
		CONGELADO("Congelado"),
		DORMIDO("Dormido"),
		CONFUSO("Confuso"),
		DRENADORAS("Drenadoras"),
		AMENDRENTADO("Amendrentado"),
		DEBILITADO("Debilidado"),
		NORMAL("Estado normal"); 

		private String mensaje;

		private TiposEstados(String mensaje) {
			this.mensaje = mensaje;
		}

		public String getMensaje() {
			return mensaje;
		}

	}

	private TiposEstados estado;

	public TiposEstados getEstado() {
		return estado;
	}

	public void setEstado(TiposEstados estado) {
		this.estado = estado;
	}
	
	
}