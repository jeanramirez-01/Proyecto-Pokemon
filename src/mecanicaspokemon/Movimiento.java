package mecanicaspokemon;

public class Movimiento {

	public enum TipoAtaque {

		FISICO, ESPECIAL, ESTADO, MEJORA;

	}

	public enum Mejora {
		VITALIDAD, ATAQUE, DEFENSA, ATAQUE_ESPECIAL, DEFENSA_ESPECIAL, VELOCIDAD;
	}

	private TipoAtaque tipoAtaque;
	private String nombre;
	private TipoPokemon tipoMovimiento;
	private int potencia;
	private Estado estado;
	private int duracionEstado;
	private Mejora mejora;
	private int duracionMejora;
	private int costoEstamina;

	public Movimiento(TipoAtaque tipo) {
		this.tipoAtaque = tipo;
	}

	// Constructor para movimientos de tipo Fisico o Especial
	public Movimiento(String nombre, TipoPokemon tipoMovimiento, TipoAtaque tipoAtaque, int potenciaAtaque) {
		this.nombre = nombre;
		this.tipoMovimiento = tipoMovimiento;
		this.tipoAtaque = tipoAtaque;
		this.potencia = potenciaAtaque;
		this.costoEstamina = potenciaAtaque / 2;

	}

	// Constructor para movimientos de Estado persistente
	public Movimiento(String nombre, TipoPokemon tipoMovimiento, TipoAtaque tipoAtaque, Estado estado) {
		this.nombre = nombre;
		this.tipoMovimiento = tipoMovimiento;
		this.tipoAtaque = tipoAtaque;
		this.estado = estado;
		this.costoEstamina = 30;
	}

	// Constructor para movimientos de Estado temporal
	public Movimiento(String nombre, TipoPokemon tipoMovimiento, TipoAtaque tipoAtaque, Estado estado,
			int duracionEstado) {
		this.nombre = nombre;
		this.tipoMovimiento = tipoMovimiento;
		this.tipoAtaque = tipoAtaque;
		this.estado = estado;
		this.duracionEstado = duracionEstado;
		this.costoEstamina = duracionEstado * 10;
	}

	// Constructor para movimientos de Mejora
	public Movimiento(String nombre, TipoPokemon tipoMovimiento, TipoAtaque tipoAtaque, Mejora mejora,
			int duracionMejora) {
		this.nombre = nombre;
		this.tipoMovimiento = tipoMovimiento;
		this.tipoAtaque = tipoAtaque;
		this.mejora = mejora;
		this.duracionMejora = duracionMejora;
		this.costoEstamina = duracionMejora * 10;
	}

	public TipoAtaque getTipo() {
		return tipoAtaque;
	}

	public void setTipo(TipoAtaque tipo) {
		this.tipoAtaque = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoPokemon getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoPokemon tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getDuracionEstado() {
		return duracionEstado;
	}

	public void setDuracionEstado(int duracionEstado) {
		this.duracionEstado = duracionEstado;
	}

	public Mejora getMejora() {
		return mejora;
	}

	public void setMejora(Mejora mejora) {
		this.mejora = mejora;
	}

	public int getDuracionMejora() {
		return duracionMejora;
	}

	public void setDuracionMejora(int duracionMejora) {
		this.duracionMejora = duracionMejora;
	}

	public int getCostoEstamina() {
		return costoEstamina;
	}

	public void setCostoEstamina(int costoEstamina) {
		this.costoEstamina = costoEstamina;
	}

	
	
}
