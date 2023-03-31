package pokemon;

import objeto.Objeto;
import tipo.Estado;
import tipo.Tipo;
import combate.Movimiento;

import java.util.Arrays;

public class Pokemon {

	protected String nombre;
	protected String mote;
	protected int vitalidad;
	protected int ataque;
	protected int defensa;
	protected int ataqueEspecial;
	protected int defensaEspecial;
	protected int velocidad;
	protected int estamina;
	protected int nivel;
	protected Movimiento[] movimiento;
	protected int fertilidad;
	protected char sexo;
	protected Tipo[] tipos;
	protected Estado estado;
	protected Objeto objeto;

	public Pokemon() {
		super();
		this.nombre = "";
		this.mote = "";
		this.vitalidad = estadisticasNacimiento();
		this.ataque = estadisticasNacimiento();
		this.defensa = estadisticasNacimiento();
		this.ataqueEspecial = estadisticasNacimiento();
		this.defensaEspecial = estadisticasNacimiento();
		this.velocidad = estadisticasNacimiento();
		this.estamina = estadisticasNacimiento();
		this.nivel = 1;
		this.movimiento = new Movimiento[4];
		this.fertilidad = 5;
		this.sexo = ' ';
		this.tipos = new Tipo[2];
		this.estado = new Estado();
		this.objeto = new Objeto();
	}

	public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial,
			int defensaEspecial, int velocidad, int estamina, int nivel, Movimiento[] movimiento, int fertilidad,
			char sexo, Tipo[] tipos, Estado estado, Objeto objeto) {
		super();
		this.nombre = nombre;
		this.mote = mote;
		this.vitalidad = vitalidad;
		this.ataque = ataque;
		this.defensa = defensa;
		this.ataqueEspecial = ataqueEspecial;
		this.defensaEspecial = defensaEspecial;
		this.velocidad = velocidad;
		this.estamina = estamina;
		this.nivel = nivel;
		this.movimiento = movimiento;
		this.fertilidad = fertilidad;
		this.sexo = sexo;
		this.tipos = tipos;
		this.estado = estado;
		this.objeto = objeto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMote() {
		return mote;
	}

	public void setMote(String mote) {
		this.mote = mote;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public int getDefensaEspecial() {
		return defensaEspecial;
	}

	public void setDefensaEspecial(int defensaEspecial) {
		this.defensaEspecial = defensaEspecial;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getEstamina() {
		return estamina;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Movimiento[] getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimiento[] movimiento) {
		this.movimiento = movimiento;
	}

	public int getFertilidad() {
		return fertilidad;
	}

	public void setFertilidad(int fertilidad) {
		this.fertilidad = fertilidad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Tipo[] getTipos() {
		return tipos;
	}

	public void setTipos(Tipo[] tipos) {
		this.tipos = tipos;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	// Metodos de pokemon---------------------------------------------------------------------

	private int estadisticasNacimiento() {

		int stats = 0;

		return stats = (int) (Math.random() * 10) + 1;

	}

	private void aplicarObjeto() {

	}

	public int subirNivel(int nivel) {

		return nivel + 1;

	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", mote=" + mote + ", vitalidad=" + vitalidad + ", ataque=" + ataque
				+ ", defensa=" + defensa + ", ataqueEspecial=" + ataqueEspecial + ", defensaEspecial=" + defensaEspecial
				+ ", velocidad=" + velocidad + ", estamina=" + estamina + ", nivel=" + nivel + ", movimiento="
				+ Arrays.toString(movimiento) + ", fertilidad=" + fertilidad + ", sexo=" + sexo + ", tipos="
				+ Arrays.toString(tipos) + ", estado=" + estado + ", objeto=" + objeto + "]";
	}

}
