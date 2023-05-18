package mecanicaspokemon;

public class Estado {

	public enum TiposEstados {

		PERSISTENTE, TEMPORAL, OTRO_ESTADO;
	}

	public enum NombreEstado {

		PARALIZADO, QUEMADO, ENVENENADO, GRAVEMENTE_ENVENENADO, CONGELADO, DORMIDO, CONFUSO, DRENADORAS, AMENDRENTADO,
		DEBILITADO, NORMAL;

	}

	private int id_estado;
	private NombreEstado nombre;
	private TiposEstados tipoEstado;

	public Estado(int id_estado, NombreEstado nombre, TiposEstados tipoEstado) {
		super();
		this.id_estado = id_estado;
		this.nombre = nombre;
		this.tipoEstado = tipoEstado;
	}

	public Estado(NombreEstado debilitado) {
		
	}

	public int getId_estado() {
		return id_estado;
	}

	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}

	public NombreEstado getNombre() {
		return nombre;
	}

	public void setNombre(NombreEstado nombre) {
		this.nombre = nombre;
	}

	public TiposEstados getTipoEstado() {
		return tipoEstado;
	}

	public void setTipoEstado(TiposEstados tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

}