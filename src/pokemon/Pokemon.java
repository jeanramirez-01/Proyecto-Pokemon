package pokemon;

import objeto.Objeto;

public class Pokemon {

	private String nombre;
	private String mote;
	private int vitalidad;
	private int ataque;
	private int defensa;
	private int ataqueEspecial;
	private int defensaEspecial;
	private int velocidad;
	private int estamina;
	private int nivel;
	// private Movimiento[] movimiento = new Movimiento[4]
	private int fertilidad;
	private char sexo;
	// private HashMap <Tipo> tipo = new HashMap <Tipo>();
	// private HashMap <Estado> estado = new HashMap <Estado>();
	private Objeto objeto;

	public int subirNivel(int nivel) {

		return nivel + 1;

	}
	
	

}
