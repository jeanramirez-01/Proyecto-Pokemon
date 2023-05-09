package mecanicaspokemon;

public class Estado {

	public enum TiposEstados{
		
		PERSISTENTE,
		TEMPORAL,
		OTROS_ESTADOS;
	}
	
	public enum Estados {

		PARALIZADO("Paralizado", TiposEstados.PERSISTENTE), 
		QUEMADO("Quemado",TiposEstados.PERSISTENTE), 
		ENVENENADO("Envenenador",TiposEstados.PERSISTENTE), 
		GRAVEMENTE_ENVENENADO("Gravemente envenedado", TiposEstados.PERSISTENTE),
		CONGELADO("Congelado", TiposEstados.PERSISTENTE),
		DORMIDO("Dormido", TiposEstados.TEMPORAL),
		CONFUSO("Confuso", TiposEstados.TEMPORAL),
		DRENADORAS("Drenadoras", TiposEstados.TEMPORAL),
		AMENDRENTADO("Amendrentado", TiposEstados.TEMPORAL),
		DEBILITADO("Debilidado", TiposEstados.OTROS_ESTADOS),
		NORMAL("Estado normal", TiposEstados.OTROS_ESTADOS); 

		private String mensaje;
		private TiposEstados tipoEstado;
		
		private Estados(String mensaje, TiposEstados tipoEstado) {
			this.mensaje = mensaje;
			this.tipoEstado = tipoEstado;
		}

		public String getMensaje() {
			return mensaje;
		}

		public TiposEstados getTipoEstado() {
			return tipoEstado;
		}

		
	}

	private Estados estado;
	
	public Estado(Estados estado) {
		super();
		this.estado = estado;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}
	
	
}