package controller;

import mecanicaspokemon.Entrenador;
import mecanicaspokemon.Objeto;

public final class Singleton {

	private static Singleton instance;
	private static Singleton instanced;
	public Entrenador value;
	public Objeto valued;

	private Singleton(Entrenador value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = value;
	}

	private Singleton(Objeto valued) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.valued = valued;
	}

	public static Singleton getInstanceTrainer(Entrenador value) {
		if (instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}

	public static Singleton getInstanceObjeto(Objeto value) {
		if (instanced == null) {
			instanced = new Singleton(value);
		}

		return instanced;

	}

	public static void liberarMemoriaObjeto() {

		if (instanced != null) {
			instanced.disposeObjeto();
			instanced = null;
		}
		return;
	}

	private void disposeObjeto() {
		valued = null;

	}
	
	public static void liberarMemoriaTrainer() {

		if (instance != null) {
			instance.disposeTrainer();
			instance = null;
		}
		return;
	}

	private void disposeTrainer() {
		value = null;

	}
}