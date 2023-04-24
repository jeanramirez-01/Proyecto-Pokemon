package combate;

public class Estado {

	public enum EstadoPersistente {

		PARALIZADO("Paralizado"), 
		QUEMADO("Quemado"), 
		ENVENENADO("Envenenador"), 
		GRAVEMENTE_ENVENENADO("Gravemente envenedado"),
		CONGELADO("Congelado"), 
		NORMAL("Estado normal"); 

		private String mensaje;

		private EstadoPersistente(String mensaje) {
			this.mensaje = mensaje;
		}

		public String getMensaje() {
			return mensaje;
		}

	}

	public enum EstadoTemporal {

		CONFUSO("Confuso", 4),
		DORMIDO("Dormido", 3),
		DRENADORAS("Drenadoras", 10), 
		AMEDRENTADO("Amedrentado", 1);

		private String mensaje;

		private int turno;

		private EstadoTemporal(String mensaje, int turno) {
			this.mensaje = mensaje;
			this.turno = turno;
		}

		public String getMensaje() {
			return mensaje;
		}

		public int getTurno() {
			return turno;
		}

	}

	public enum OtrosEstados {

		DEBILITADO("Debilitado");

		private String mensaje;

		private OtrosEstados(String mensaje) {
			this.mensaje = mensaje;
		}

		public String getMensaje() {
			return mensaje;
		}

	}

	private EstadoPersistente persistente;
	private EstadoTemporal temporal;
	private OtrosEstados otros;
	private Turno turnos; // Clase turnos.

	public Estado(EstadoPersistente persistente) {
		super();
		this.persistente = persistente;
	}

	public Estado(EstadoTemporal temporal) {
		super();
		this.temporal = temporal;
	}

	public Estado(OtrosEstados otros) {
		super();
		this.otros = otros;
	}

	public EstadoPersistente getPersistente() {
		return persistente;
	}

	public void setPersistente(EstadoPersistente persistente) {
		this.persistente = persistente;
	}

	public EstadoTemporal getTemporal() {
		return temporal;
	}

	public void setTemporal(EstadoTemporal temporal) {
		this.temporal = temporal;
	}

	public OtrosEstados getOtros() {
		return otros;
	}

	public void setOtros(OtrosEstados otros) {
		this.otros = otros;
	}

	public Turno getTurnos() {
		return turnos;
	}

	public void setTurnos(Turno turnos) {
		this.turnos = turnos;
	}

}