package com.anahuac.software.comportamiento.observer;

public class ObserverEmail implements Observer {

	private boolean isOn;
	private Articulo articulo;
	
	public ObserverEmail (Articulo a, double targetPrice) {
		articulo = a;
		articulo.agregarObserver(this);
		articulo.setTargetPrice(targetPrice);
	}
	
	public void update(double price) {
		System.out.println("Enviando correo con notificacion de precio: " + price);

	}
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	

}
