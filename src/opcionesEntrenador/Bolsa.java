package opcionesEntrenador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pokemon.Pokemon;
import tienda.Objeto;
import tienda.Objeto.CategoriasBolsa;
import tienda.Objeto.TipoObjeto;

public class Bolsa {

	private ArrayList<Objeto> listaObjetos;

	public Bolsa() {
		super();
		this.listaObjetos = new ArrayList<Objeto>();
	}

	public Bolsa(ArrayList<Objeto> listaObjetos) {
		super();
		this.listaObjetos = listaObjetos;
	}

	public ArrayList<Objeto> getListaObjetos() {
		return listaObjetos;
	}

	public void setListaObjetos(ArrayList<Objeto> listaObjetos) {
		this.listaObjetos = listaObjetos;
	}

	/**
	 * Metodo de mostrar la bolsa para el entrenador, muestra una lista de objetos
	 * que se encuentran en una bolsa. La bolsa es una lista de objetos que se
	 * almacena en una variable llamada listaObjetos. El método utiliza un mapa para
	 * contar el número de objetos por categoría y tipo de objeto. Luego, el método
	 * recorre el mapa y muestra los resultados por categoría y tipo de objeto en la
	 * consola.
	 * 
	 * El método comienza comprobando si la lista de objetos está vacía. Si está
	 * vacía, el método imprime "La mochila está vacía" y sale del método utilizando
	 * la declaración return.
	 * 
	 * Si la lista de objetos no está vacía, el método crea un mapa llamado
	 * conteoObjetos, que mapea cada categoría de bolsa a un mapa de tipos de
	 * objetos y su cantidad. El método recorre la lista de objetos y por cada
	 * objeto, determina su tipo y su categoría de bolsa. Luego, agrega el objeto al
	 * mapa conteoObjetos utilizando su categoría de bolsa como clave y su tipo de
	 * objeto como subclave. Si la categoría de bolsa aún no existe en el mapa, se
	 * crea una nueva entrada para ella.
	 * 
	 * Después de contar todos los objetos en la lista, el método recorre el mapa
	 * conteoObjetos e imprime cada categoría de bolsa y la cantidad de cada tipo de
	 * objeto que pertenece a esa categoría. Esto se hace recorriendo cada entrada
	 * en el mapa conteoObjetos utilizando el método entrySet(). Para cada entrada,
	 * el método imprime la categoría de bolsa y luego recorre el mapa de tipos de
	 * objeto y su cantidad utilizando el método entrySet() de nuevo. Para cada
	 * entrada en el mapa de tipos de objeto, el método imprime el nombre del tipo
	 * de objeto y su cantidad.
	 */
	public void mostrarBolsa() {

		if (listaObjetos.isEmpty()) {
			System.out.println("La mochila esta vacia");
			return;
		}

		Map<CategoriasBolsa, Map<TipoObjeto, Integer>> conteoObjetos = new HashMap<>();
		for (Objeto objeto : listaObjetos) {
			TipoObjeto tipoObjeto = objeto.getTipoObjeto();
			CategoriasBolsa categoria = tipoObjeto.getCategoria();
			if (!conteoObjetos.containsKey(categoria)) {
				conteoObjetos.put(categoria, new HashMap<>());
			}
			Map<TipoObjeto, Integer> conteoTipoObjeto = conteoObjetos.get(categoria);
			conteoTipoObjeto.put(tipoObjeto, conteoTipoObjeto.getOrDefault(tipoObjeto, 0) + 1);
		}

		// Mostramos la lista de objetos y su cantidad por categoría
		for (Map.Entry<CategoriasBolsa, Map<TipoObjeto, Integer>> entryCategoria : conteoObjetos.entrySet()) {
			CategoriasBolsa categoria = entryCategoria.getKey();
			System.out.println("CATEGORIA-" + categoria);
			Map<TipoObjeto, Integer> conteoTipoObjeto = entryCategoria.getValue();
			for (Map.Entry<TipoObjeto, Integer> entryTipoObjeto : conteoTipoObjeto.entrySet()) {
				TipoObjeto tipoObjeto = entryTipoObjeto.getKey();
				int cantidad = entryTipoObjeto.getValue();
				System.out.println(tipoObjeto.getNombre() + " x " + cantidad);
			}
		}

	}

	/**
	 * Tenemos un metodo en el cual que mientras que un pokemon tenga su espacio de
	 * objeto a null por el metodo tieneObjeto() de la clase pokemon, no podemos
	 * quitarle el objeto. Entonces si la condicion no se cumple entonces lo primero
	 * que hace el metodo es que el guardamos el objeto del pokemon que le pasamos
	 * en una variable temporal
	 * 
	 * @param equipoEntrenador sera el pokemon que nos pase usuario que le quiere
	 *                         quitar el objeto
	 */
	public void quitarObjeto(Pokemon equipoEntrenador) {

		if (!equipoEntrenador.tieneObjeto()) {
			System.out.println(equipoEntrenador.getNombre() + " no tiene ningun objeto puesto.");
			return;
		} else {
			Objeto objetoQuitar = equipoEntrenador.getObjeto();
			listaObjetos.add(objetoQuitar);
			System.out.println(equipoEntrenador.getNombre() + " se le ha quitado el objeto "
					+ equipoEntrenador.getObjeto().getTipoObjeto().getNombre());
			equipoEntrenador.setObjeto(null);

		}

	}

	/**
	 * 
	 * @param equipoEntrenador
	 * @param obj
	 */
	public void ponerObjeto(Pokemon equipoEntrenador, int indice) {

		if (equipoEntrenador.tieneObjeto()) {
			System.out.println(equipoEntrenador.getNombre() + " ya tiene un objeto puesto");
			return;
		}

		if (indice < 0 || indice >= listaObjetos.size()) {
			System.out.println("Índice inválido");
			return;
		}

		Objeto objeto = listaObjetos.get(indice);
		if (objeto == null) {
			System.out.println("No se encontró un objeto en la posición indicada");
			return;
		}

		equipoEntrenador.setObjeto(objeto);
		System.out.println(
				equipoEntrenador.getNombre() + " se le ha puesto el objeto " + objeto.getTipoObjeto().getNombre());
		listaObjetos.remove(indice);

	}

	/**
	 * @param objeto
	 */
	public void tirarObjeto(Objeto objeto) {

		listaObjetos.remove(objeto);

	}

}
