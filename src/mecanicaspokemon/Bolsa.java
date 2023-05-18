package mecanicaspokemon;

import java.util.LinkedList;


public class Bolsa {

	private LinkedList<Objeto> listaObjetos;

	public Bolsa() {
		super();
		this.listaObjetos = new LinkedList<Objeto>();
	}

	public Bolsa(LinkedList<Objeto> listaObjetos) {
		super();
		this.listaObjetos = listaObjetos;
	}

	public LinkedList<Objeto> getListaObjetos() {
		return listaObjetos;
	}

	public void setListaObjetos(LinkedList<Objeto> listaObjetos) {
		this.listaObjetos = listaObjetos;
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
					+ equipoEntrenador.getObjeto().getNombre());
			equipoEntrenador.setObjeto(null);

		}

	}

	/**
	 * Metodo de poner objeto, en el cual lo primero que comprueba es que si el
	 * pokemon tiene un objeto entonces hay un return. Si en el caso el indice del
	 * objeto que se busca no es correcto, entonces hay un return que termina el
	 * metodo. Si en el caso que las condiciones no se cumplan, entonces lo primero
	 * que hacemos que llamamos al indice del objeto dentro del arralyst de la bolsa
	 * y entonces lo guardamos en una variable temporal, luego de eso llamamos al
	 * pokemon del entrenador y le equipamos el objeto temporal. Finalizando
	 * mostramos un mensaje con el nombre del pokemon y el nombre del objeto a que
	 * les has equipado un objeto. Al final de todo, llamamos a la arraylyst de la
	 * bolsa y borramos el objeto del indice en el cual le hemos pasado el objeto
	 * 
	 * @param equipoEntrenador el pokemon que le quiere poner un objeto el
	 *                         entrenador
	 * @param indice           es el indice del objeto dentro del arraylist de la
	 *                         bolsa
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
		System.out.println(equipoEntrenador.getNombre() + " se le ha puesto el objeto " + objeto.getNombre());
		listaObjetos.remove(indice);

	}

	/**
	 * Es el metodo de tirar un objeto en el cual le pasamos el objeto que queremos
	 * tirar
	 * 
	 * @param objeto que pasa el juga
	 */
	public void tirarObjeto(Objeto objeto) {

		listaObjetos.remove(objeto);

	}

}
