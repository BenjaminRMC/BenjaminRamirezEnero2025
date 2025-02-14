package com.anahuac.software.comportamiento.observer;

public class Driver {

	public static void main(String[] args) {
		Articulo articulo = new Articulo(100, 500);
		
		ObserverEmail email = new ObserverEmail(articulo, 100);
		
		articulo.setPrice(400);
		articulo.setPrice(90);
		
	}

}
