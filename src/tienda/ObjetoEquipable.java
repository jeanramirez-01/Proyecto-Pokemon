package tienda;

public class ObjetoEquipable {

	public enum TipoObjeto {

		PESA("Aumenta el ataque y la defensa un 20%, pero disminuye su velocidad un 20%"),
		PLUMA("Aumenta la velocidad un 30%, pero disminuye la defensa y la defensa especial en un 20%."),
		CHALECO("Aumenta la defensa y la defensa especial un 20%, pero disminuye la velocidad y el ataque un 15%."),
		BASTON("Aumenta la estamina un 20%, pero disminuye en un 15% la velocidad."),
		PILAS("Recupera la estamina actual en un 50% de la estamina maxima, pero disminuye la defensa especial un 30%.");

		private String descripcion;

		private TipoObjeto(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getDescripcion() {
			return descripcion;
		}

	}

	private TipoObjeto tipoObjeto;

	public ObjetoEquipable(TipoObjeto tipoObjeto) {
		super();
		this.tipoObjeto = tipoObjeto;
	}

	public TipoObjeto getTipoObjetoEquipable() {
		return tipoObjeto;
	}

	public TipoObjeto getTipoObjeto() {
		return tipoObjeto;
	}

}
