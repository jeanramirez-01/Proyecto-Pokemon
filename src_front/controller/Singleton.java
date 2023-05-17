package controller;

import mecanicaspokemon.Entrenador;

public final class Singleton {

	private static Singleton instance;	
	public Entrenador value;

	private Singleton(Entrenador value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = value;
	}

	public static Singleton getInstance(Entrenador value) {
		if (instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
	
}